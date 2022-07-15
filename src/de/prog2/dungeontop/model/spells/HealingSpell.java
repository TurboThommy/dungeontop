package de.prog2.dungeontop.model.spells;

import de.prog2.dungeontop.control.controller.EntityController;
import de.prog2.dungeontop.model.world.Coordinate;
import de.prog2.dungeontop.model.world.arena.Arena;

public class HealingSpell extends Spell
{
    private final int heal;
    private final int radius;

    public HealingSpell(String name, String description, int assetId, int heal, int radius)
    {
        super(name, description, assetId);
        this.heal = heal;
        this.radius = radius;
    }

    @Override
    public void cast(Arena arena, Coordinate coordinate)
    {
        for (int x = coordinate.getX() - radius; x <= coordinate.getX() + radius; x++)
        {
            for (int y = coordinate.getY() - radius; y <= coordinate.getY() + radius; y++)
            {
                Coordinate c = new Coordinate(x, y);
                EntityController.applyHeal(arena.getFriendly().get(c), heal);
            }
        }
    }

    public int getHeal()
    {
        return heal;
    }

    public int getRadius()
    {
        return radius;
    }
}
