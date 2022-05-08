package de.prog2.dungeontop.control.controller;

import de.prog2.dungeontop.control.manager.PlayerManager;
import de.prog2.dungeontop.model.defaultvalues.LoggerStringValues;
import de.prog2.dungeontop.model.exceptions.customexceptions.CardAlreadyMaxRankException;
import de.prog2.dungeontop.model.exceptions.customexceptions.CardNotFoundException;
import de.prog2.dungeontop.model.exceptions.customexceptions.ItemNotFoundException;
import de.prog2.dungeontop.model.exceptions.customexceptions.NotEnoughGoldException;
import de.prog2.dungeontop.model.game.Card;
import de.prog2.dungeontop.model.game.Player;
import de.prog2.dungeontop.model.items.Item;
import de.prog2.dungeontop.model.items.Valuable;
import de.prog2.dungeontop.utils.GlobalLogger;

public class NpcController {

    /**
     * Method to buy an upgrade for the rank of the specified card.
     *
     * @param card Card which shall be upgraded.
     * @param price Cost of the upgrade.
     * @throws CardAlreadyMaxRankException Thrown if the card already reached the maximum defined level.
     * @throws NotEnoughGoldException Thrown if the player doesn't own enough gold for the upgrade.
     */
    public void upgradeCard (Card card, int price) throws CardAlreadyMaxRankException, NotEnoughGoldException {
        PlayerManager playerManager = PlayerManager.getInstance();
        Player player = playerManager.getPlayer();

        if(card.getMaxRank() > card.getRank()){
            if( player.getGoldValue() >= price){
                card.increaseRank();
                playerManager.removeGold(price);

                GlobalLogger.log(LoggerStringValues.CARD_RANK_INCREASED);

                return;
            }
            throw new NotEnoughGoldException();
        }
        throw new CardAlreadyMaxRankException();
    }

    /**
     * Removes a specified card from the player's card deck.
     *
     * @param card Card which shall be removed from the player's card deck
     * @param price Cost for removing the specified card from the player's deck.
     * @throws CardNotFoundException Thrown if the player's deck doesn't contain the specified card.
     * @throws NotEnoughGoldException Thrown if the player doesn't own enough gold to remove the card from his deck.
     */
    public void removeCard (Card card, int price) throws CardNotFoundException, NotEnoughGoldException {
        PlayerManager playerManager = PlayerManager.getInstance();
        Player player = playerManager.getPlayer();

        if(player.getGoldValue() >= price){
            playerManager.removeCard(card);
            playerManager.removeGold(price);

            GlobalLogger.log(LoggerStringValues.CARD_REMOVED_FROM_DECK);

            return;
        }
        throw new NotEnoughGoldException();
    }

    /**
     * Sells a valuable item from the player's possession.
     *
     * @param item Item or Card which shall be sold.
     * @throws CardNotFoundException Thrown if the specified item is a card which the player's deck doesn't contain.
     * @throws ItemNotFoundException Thrown if the specified item is an item which the player doesn't possess.
     */
    public void sellItem (Valuable item) throws CardNotFoundException, ItemNotFoundException{
        PlayerManager playerManager = PlayerManager.getInstance();
        Player player = playerManager.getPlayer();

        if(item instanceof Card){
            if(player.getDeck().contains(item)){
                playerManager.addGold(item.getValue());
                playerManager.removeCard(item);

                GlobalLogger.log(LoggerStringValues.CARD_FROM_DECK_SOLD);

                return;
            }
            throw new CardNotFoundException();
        } else if (item instanceof Item) {
            if(player.getItems().contains(item)){
                playerManager.addGold(item.getValue());
                playerManager.removeItem(item);

                GlobalLogger.log(LoggerStringValues.ITEM_SOLD);

                return;
            }
            throw new ItemNotFoundException();
        }
    }
}
