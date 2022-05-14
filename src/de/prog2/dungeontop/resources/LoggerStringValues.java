package de.prog2.dungeontop.resources;

public interface LoggerStringValues {
    String CARD_RANK_INCREASED = "Rank of a Card increased.";
    String SHOPMANAGER_CREATED = "ShopManager erstellt.";
    String SHOPMANAGER_GET = "ShopManager abgefragt.";
    String CARD_UNLOCKED = "Karte wurde freigeschaltet";
    String PRESSED = " gedrueckt.";
    String RELEASED = " losgelassen.";
    String CARD_REMOVED_FROM_DECK = "Eine Karte wurde aus dem Deck entfernt.";
    String CARD_FROM_DECK_SOLD = "Eine Karte aus dem Deck wurde verkauft.";
    String ITEM_SOLD = "Ein Gegenstand wurde verkauft.";
    String PLAYERSOULS_GET = "Playersouls abgefragt.";
    String SET = " gesetzt.";
    String PLAYERSOULS_SET = "Playersouls wurden auf ";

    String ADD_ROOM_ERROR = "ERROR: Out of bounds or overlapping with an already existing room.";
    String ADDED_ROOM_TO_GRID = "Added room to hellgrid.";
    String ADDED_TOP_ROOM = "Added new top side room to the current room.";
    String ADDED_BOTTOM_ROOM = "Added new bottom side room to the current room.";
    String ADDED_LEFT_ROOM = "Added new left room to the current room.";
    String ADDED_RIGHT_ROOM = "Added new right room to the current room.";
    String HAS_TOP_ROOM = "Room hat top room abgefragt.";
    String HAS_BOTTOM_ROOM = "Room hat bottom room abgefragt.";
    String HAS_LEFT_ROOM = "Room hat left room abgefragt.";
    String HAS_RIGHT_ROOM = "Room hat right room abgefragt.";
    String TOP_AVAILABLE = "Abgefragt ob top room verfuegbar ist.";
    String BOTTOM_AVAILABLE = "Abgefragt ob bottom room verfuegbar ist.";
    String LEFT_AVAILABLE = "Abgefragt ob left room verfuegbar ist.";
    String RIGHT_AVAILABLE = "Abgefragt ob right room verfuegbar ist.";
    String ROOM_RNG_FAILURE = "ERROR: Room RNG delivered a value that is either too high or too low.";
    String ROOM_RNG_ROLL = "Room RNG rolled: ";
    String TOP_ROOM_RECURSION_BEGUN = "Top room Rekursion beginnt.";
    String BOTTOM_ROOM_RECURSION_BEGUN = "Bottom room Rekursion beginnt.";
    String LEFT_ROOM_RECURSION_BEGUN = "Left room Rekursion beginnt.";
    String RIGHT_ROOM_RECURSION_BEGUN = "Right room Rekursion beginnt.";
    String TOP_ROOM_RECURSION_ENDED = "Top room Rekursion hat geendet.";
    String BOTTOM_ROOM_RECURSION_ENDED = "Bottom room Rekursion hat geendet.";
    String LEFT_ROOM_RECURSION_ENDED = "Left room Rekursion hat geendet.";
    String RIGHT_ROOM_RECURSION_ENDED = "Right room Rekursion hat geendet.";
    String START_ROOM_CREATED = "Starting room wurde erstellt und dem Raumgrid hinzugefuegt.";
    String START_ROOM_NEIGHBORS = "Starting room neighbors wurden gesetzt.";
    String INIT_HELL_COMPONENT_HASH_MAP_START = "Starting to convert RoomHashMap to HellComponentHashMap.";
    String INIT_HELL_COMPONENT_HASH_MAP_END = "Finished converting RoomHashMap to HellComponentHashMap.";
    String ADDED_HELL_TO_WORLD = "Created Hell Nr ";
    String TOP_ROOM_REPLACED = "Top room wurde durch einen neuen Raum ersetzt.";
    String BOTTOM_ROOM_REPLACED = "Bottom room wurde durch einen neuen Raum ersetzt.";
    String LEFT_ROOM_REPLACED = "Left room wurde durch einen neuen Raum ersetzt.";
    String RIGHT_ROOM_REPLACED = "Right room wurde durch einen neuen Raum ersetzt.";
    String NEIGHBORS_QUERIED = "Nachbar rooms wurden abgefragt.";
    String TOP_NEIGHBOR_ADDED = "Top Nachbar wurde hinzugefuegt.";
    String BOTTOM_NEIGHBOR_ADDED = "Bottom Nachbar wurde hinzugefuegt.";
    String LEFT_NEIGHBOR_ADDED = "Left Nachbar wurde hinzugefuegt.";
    String RIGHT_NEIGHBOR_ADDED = "Right Nachbar wurde hinzugefuegt.";
    String NEIGHBOR_CONTAINS_NPC_START = "Abfrage zum pruefen ob ein Nachbar room ein NPC room ist gestartet. ";
    String NEIGHBOR_CONTAINS_NPC = "NPC room in einem Nachbar room gefunden!";
    String NEIGHBORS_NO_NPC = "Kein NPC room als Nachbar room gefunden!";
    String NO_VALID_ROOMTYPE = "Es wurde kein gueltiger Raumtyp uebergeben.";
    String FORGE_ROOM_ADDED = "Neuer Forge room hinzugefuegt.";
    String LAVA_POND_ROOM_ADDED = "Neuer Lava Pond room hinzugefuegt.";
    String BOSS_ROOM_ADDED = "Neuer Bossraum wurde hinzugefuegt.";
    String MONSTER_ROOM_ADDED = "Neuer Monsterraum wurde hinzugefuegt.";
    String RANDOM_EVENT_ROOM_ADDED = "Neuer random event Raum wurde hinzugefuegt.";
    String ROOM_COUNT_OUT_OF_RANGE = "Keine passende Anzahl an Raeumen, RoomMap wurde zurueckgesetzt.";
    String SUITABLE_HELL = "Passende Hell wurde generiert.";
    String HELL_GENERATION_START = "Generieren einer Hell startet.";
    String GOT_NEXT_BATTLEPHASE = "Battlemanager got new phase";
    String TRY_TO_GET_PHASE_AFTER_END = "battlemanager tried to get battlephase after end";
    String START_BATTLE = "Starting an arenaBattle";
    String PLAYER_CAN_CHOOSE_WHO_IS_FIRST = "Der Spieler darf aussuchen wer zuerst im duell Zieht";
    String DM_CAN_CHOOSE_WHO_IS_FIRST = "Der DM darf aussucher wer zuerst im duell Zieht";

    String MOVE_UP_SUCCESS = "Player moved into the room above.";
    String MOVE_UP_FAIL = "Player couldn't move into the room above.";
    String MOVE_DOWN_SUCCESS = "Player moved into the room below.";
    String MOVE_DOWN_FAIL = "Player couldn't move into the room below.";
    String MOVE_LEFT_SUCCESS = "Player moved into the room on the left.";
    String MOVE_LEFT_FAIL = "Player couldn't move into the room on the left.";
    String MOVE_RIGHT_SUCCESS = "Player moved into the room on the right.";
    String MOVE_RIGHT_FAIL = "Player couldn't move into the room on the right.";
}
