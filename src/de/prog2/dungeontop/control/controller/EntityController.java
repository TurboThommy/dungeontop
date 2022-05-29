package de.prog2.dungeontop.control.controller;

import de.prog2.dungeontop.model.entities.Entity;
import de.prog2.dungeontop.model.game.MoveDirection;
import de.prog2.dungeontop.model.world.Coordinate;
import de.prog2.dungeontop.model.world.arena.Arena;
import de.prog2.dungeontop.model.world.arena.ArenaComponent;
import de.prog2.dungeontop.resources.LoggerStringValues;
import de.prog2.dungeontop.utils.CoordinateUtils;
import de.prog2.dungeontop.utils.GlobalLogger;

import java.util.ArrayList;

public class EntityController
{
    /**
     * Initiates the movement towards the selected direction
     * @return returns if the move was successful
     */
    public static boolean tryMoveTowards(Arena arena, Entity entity, MoveDirection direction)
    {
        ArenaComponent currentAC = arena.getArenaComponent(entity.getPosition());

        Coordinate newCoord = CoordinateUtils.getCoordinateFromMoveDirection(entity.getPosition(), direction);
        ArenaComponent nextAC = arena.getArenaComponent(newCoord);

        if(!isValidMove(arena, entity, direction))
        {
            GlobalLogger.log(LoggerStringValues.MOVE_UP_FAIL);
            return false;
        }

        currentAC.deleteOccupant();
        nextAC.setOccupant(entity);
        entity.setPosition(newCoord);
        setCanMove(entity, false);
        GlobalLogger.log(LoggerStringValues.MOVE_UP_SUCCESS);
        return true;
    }

    /**
     * @param arena current arena
     * @param entity moving entity
     * @param direction the desired direction
     * @return returns if nextPosition doesn't exist or is already occupied
     */
    public static boolean isValidMove(Arena arena, Entity entity, MoveDirection direction)
    {
        Coordinate newCoord = CoordinateUtils.getCoordinateFromMoveDirection(entity.getPosition(), direction);
        ArenaComponent nextAC = arena.getArenaComponent(newCoord);
        return nextAC != null && !nextAC.isOccupied() && canMove(entity);
    }
    public static boolean canMove(Entity entity)
    {
        return entity.canMove();
    }
    public static void setCanMove(Entity entity, boolean value)
    {
        entity.setCanMove(value);
    }
    public static MoveDirection[] getValidMoveDirections (Arena arena, Entity entity)
    {
        var results = new ArrayList<MoveDirection>();
        for (MoveDirection direction :
                MoveDirection.values())
        {
            if (isValidMove(arena, entity, direction))
            {
                    results.add(direction);
            }
        }
        MoveDirection[] ar = new MoveDirection[results.size()];
        return results.toArray(ar);
    }

    /**
     * Ueberprueft ob eine Entity eine andere angreifen darf
     * @param attacker Die Attackierende Entity
     * @param attacked Die angegriffene Entity
     * @return
     */
    @Deprecated
    public static boolean isInRangeToAttack (Entity attacker, Entity attacked)
    {
        if (attacker.getPosition().getX() != attacked.getPosition().getX()
                && attacker.getPosition().getY() != attacked.getPosition().getY())
        {
            GlobalLogger.log(LoggerStringValues.ENTITY_OUT_OF_RANGE);
            return false; //falls das Ziel nicht Horizontal oder Vertikal zu dem attacker steht.
        }
        //Wenn sie in der gleicen Spalte stehen und x weniger als attackrange ist.
        if (Math.abs(attacker.getPosition().getX() - attacked.getPosition().getX()) <= 1/*attacker.getAttackRange()*/
                && attacker.getPosition().getY() == attacked.getPosition().getY())
        {
                GlobalLogger.log(LoggerStringValues.ENTITY_IS_IN_RANGE);
                return true;
        }
        //Wenn sie in der gleicen Zeile stehen und y weniger als attackrange ist.
        if (Math.abs(attacker.getPosition().getY() - attacked.getPosition().getY()) <= 1/*attacker.getAttackRange()*/
                && attacker.getPosition().getX() == attacked.getPosition().getX())
        {
            GlobalLogger.log(LoggerStringValues.ENTITY_IS_IN_RANGE);
            return true;
        }
        GlobalLogger.warning(LoggerStringValues.RANGE_PROBLEM);
        return false;
    }

    public static Arena attack (Entity attacker, Coordinate position, Arena arena)
    {
        return attacker.attackAction(position, arena);
    }
}
