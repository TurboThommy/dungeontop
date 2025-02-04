package de.prog2.dungeontop.resources;

public interface LoggerStringValues
{
    String CARD_RANK_INCREASED = "Rank of a Card increased.";
    String SHOPMANAGER_CREATED = "ShopManager erstellt.";
    String SHOPMANAGER_GET = "ShopManager abgefragt.";
    String CARD_UNLOCKED = "Karte wurde freigeschaltet";
    String CARD_REMOVED_FROM_DECK = "Eine Karte wurde aus dem Deck entfernt.";
    String CARD_FROM_DECK_SOLD = "Eine Karte aus dem Deck wurde verkauft.";
    String ITEM_SOLD = "Ein Gegenstand wurde verkauft.";
    String PLAYERSOULS_GET = "Playersouls abgefragt.";
    String SET = " gesetzt.";
    String PLAYERSOULS_SET = "Playersouls wurden auf ";
    String PLAYERSOULS_PROPERTY_GET = "Playersouls Property abgefragt.";
    String PLAYERHP_GET = "PlayerHP abgefragt.";
    String PLAYERHP_SET = "PlayerHP wurden auf ";
    String PLAYERHP_PROPERTY_GET = "PlayerHP Property abgefragt.";


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
    String FILE_NOT_FOUND = "The specified file could not be found.";
    String TILE_DRAWN = "Tile drawn on coordinate (";
    String COMMA = ", ";
    String CLOSING_BRACKET = ")";
    String GC_ROTATED = "GraphicsContext rotated by ";
    String HELLVIEW_INIT = "Initialized a HellView.";
    String CAM_INIT_START = "Initialization of the player camera started.";
    String CAM_INIT_END = "Initialization of the player camera ended.";
    String MOVED_PLAYER = "Moved player ";
    String BACKGROUND_CREATED = "Hell Background has been created.";
    String CLAMPING_FAILURE = "CLAMPING: Min Value bigger than Max Value.";
    String DRAW_ROOM_TYPES_IMAGE_NOT_FOUND = "The image for the room you try to draw cannot be found.";
    String HELL_ALREADY_INITIALIZED = "Die uebergeben Hell wurde bereits initialisiert!";
    String START_BATTLE_HANDLER = "Handler: startBattle()";
    String RANDOM_EVENT_HANDLER = "Handler: startRandomEvent()";
    String OPEN_FORGE_HANDLER = "Handler: openForge()";
    String OPEN_LAVAPOND_HANDLER = "Handler: openLavaPond()";

    String MOVE_UP_SUCCESS = "Player moved into the room above.";
    String MOVE_UP_FAIL = "Player couldn't move into the room above.";
    String MOVE_DOWN_SUCCESS = "Player moved into the room below.";
    String MOVE_DOWN_FAIL = "Player couldn't move into the room below.";
    String MOVE_LEFT_SUCCESS = "Player moved into the room on the left.";
    String MOVE_LEFT_FAIL = "Player couldn't move into the room on the left.";
    String MOVE_RIGHT_SUCCESS = "Player moved into the room on the right.";
    String MOVE_RIGHT_FAIL = "Player couldn't move into the room on the right.";
    String CARD_MANAGER_CREATED = "CardManager wurde erstellt.";
    String INDEX_OUT_OF_BOUND = "Der spezifizierte Index liegt ausserhalb der definierten Reichweite.";
    String ENTITY_HAS_RANGE_TO_ATTACK = "Attacking entity can attack target!";
    String ENTIT_DOES_NOT_HAVE_TARGET_IN_RANGE = "Target is not in Range!";
    String ENTITY_CAN_MOVE = "This Entity can move this round!";
    String ENTITY_CANT_MOVE = "This Entity cant move this round!";
    String PLAYER_GOES_FIRST = "Player goes first";
    String DM_GOES_FIRST = "DM goes first";
    String DUELL_HAS_ENDED_IN_DEFEAT = "Player lost Battle";
    String DUELL_HAS_ENDED_VICTORIOUS = "Player won Battle";

    String LOADING_CARDS = "Die Karten werden geladen";
    String INIT_ASSET_FILE_READER = "Die Assets werden geladen.";
    String INIT_FILE_READER_FINISHED = "Alle Assets wurden geladen.";
    String ASSET_FILE_NAME = "Die Datei %s wurde geladen.";
    String CARDS_LOADING = "Die Karten werden geladen.";
    String LOAD_CARD = "Die Karte %s wurde geladen.";
    String CARDS_LOADED = "Alle Karten wurden geladen.";
    String LOAD_CONFIG = "Die Config-Datei wird geladen.";
    String CONFIG_LOADED = "Die Config-Datei wurde geladen";
    String CONFIG_LOAD_ERROR = "Die Config-Datei konnte nicht geladen werden.";
    String CONFIG_KEY_DOES_NOT_EXISTS = "Die Config-Datei beinhaltet einen solchen Key nicht";
    // AudioManager
    String PLAY_SOUND = "Spielt den  %d";
    //AssetsManager
    String STARTED_GET_ASSET_BY_ID = "Macht neue Anfrage für das Asset mit der id %d.";
    String ASSET_FOUND = "Das Asset mit der id %d wurde gefunden.";
    String ASSET_NOT_FOUND = "Das Asset mit der id %d wurde nicht gefunden.";
    String STARTED_GET_ID_BY_ASSET = "Macht neue Anfrage für die id des assets %s.";
    String ASSET_ID_FOUND = "Die ID des Assets %s wurde gefunden.";
    String BATTLE_HAS_ENDED = "Das Duell wurde Beendet";
    String CARD_REMOVED_FROM_HAND = "Eine Karte aus der Hand genommen";
    String REDUCED_EGOPOINTS = "Es wurden Egopunkte vom Spieler abgezogen: ";
    String NO_EGO_TO_REDUCE = "Es konnten keine EgoPunkte abgezogen werden";

    String DREW_NEW_HAND = "Neue Hand gezogen!";
    String BATTLEMANAGER_GET = "Got instance of Battlemanager";
    String ENTITY_OUT_OF_RANGE = "Entity ist nicht in der Reichweite!";
    String ENTITY_IS_IN_RANGE = "Entity ist in der Reichweite!";
    String RANGE_PROBLEM = "Something went wrong when checking if Entity has enough Range! in EntityController";
    String SPELLCARD_CREATED = "Eine Spellcard wurde erstellt";
    String PLAYER_CREATED = "Ein Spieler wurder erstellt!";
    String ENTITYCARD_CREATED = "Eine EntityCard wurde erstellt!";
    String DECK_CREATED = "Ein Deck wurde erstellt!";
    String CARD_PUSHED_TO_DECK = "Eine Karte wurde zum Deck gepusht!";
    String CARD_POPPED = "Eine Karte wurde vom Deck gepoppt!";
    String CARD_CONTAIN_IN_DECK = "Es wurde gesucht ob eine Karte im Deck ist!:";
    String CARD_CREATED = "Es wurde eine Card erstellt!";
    String MINION_CREATED = "Ein Minion wurde erstellt";
    //<editor-fold defaultstate="collapsed" desc="Items">
    String ITEM_CREATED = "Ein Item wurde erstellt. Name: %s, Description: %s, AssetID = %d.";
    String INVENTORY_CREATED = "Inventar wurde erstellt.";
    String ITEM_ADDED = "%s wurde ins Inventar hinzugefuegt.";
    //</editor-fold>
    String RANK_ONE_SAMIRA_BEING_CREATED = "a one Star Samira is being created";
    String RANK_TWO_SAMIRA_BEING_CREATED = "a two Star Samira is being created";
    String RANK_THREE_SAMIRA_BEING_CREATED = "a three Star Samira is being created";
    String SPECIFY_RANK = "no stars were Specified";
    String PLACED_CARD_IN_ARENA = "Placed entity in arena from battlemanager";
    String NOT_ENOUGH_EGOPOINTS = "Duellist does not have neough egopoints to play this minion";
    String ALREADY_OCCUPIED = "This position is already occupied";
    //<editor-fold defaultstate="collapsed" desc="Battlefield">
    String RETURN_NODE_ON_BATTLEFIELD = "return the node: ";
    String COULD_NOT_FIND_NODE_ON_BATTLEFIELD = "could not find the node on the battlefield with x: %d and y: %d.";
    String CURRENTPHASE_IS_NOW = "Phase wurde geaendert auf: ";
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Shop View">
    String SHOP_VIEW_STARTED_ADDING_CARDS = "ShopView started adding cards.";
    String SHOP_VIEW_ADDED_CARD = "ShopView added card: ";
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="CardViewController">
    String CARD_VIEW_CONTROLLER_CREATED_CARD = "CardViewController created a card with a scale of %1.1f.";
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="EntityViewController">
    String ENTITY_VIEW_CONTROLLER_CREATED_ENTITY = "EntityViewController created an entity with a scale of %1.1f.";
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="HellController">
    String HELL_CONTROLLER_WARNING_ROOM_INSIDE_BOUNDS = "HellController warning: Room inside bounds == %b";
    String HELL_CONTROLLER_WARNING_ROOM_COORDINATES = "HellController warning: Room coordinates are: x: %d, y: %d";
    String ADDING_CELL_TO_VIEW_BATTLFIELD = "Adding battlefield cell to gridpane";
    String GOT_NODE_ON_BATTLEFIELD = "got node on battlefield";
    String REMOVING_CELL_FROM_VIEW_BATTLFIELD = "removed everything on a stackpanenode on the battlefield";
    //    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="FXMLLoader">
    String FXML_LOAD_ERROR = "Failed to load FXML File!";
    //</editor-fold>
    // SelectHeroView
    String NO_CHAR_SELECTED = "No character to play with has been selected!";
    String ARENA_TILE_HAS_BEEN_CLICKED = "ClickEvent detected";
    String ARENA_TILE_PRESSED_MESSAGE = "Mouse Pressed event on tile detected";
    String ARENA_TILE_RELEASED_MESSAGE = "Mouse released event on tile detected";
    String ARENA_TILE_UNHANDLEDEVENT = "TileEventHandler detected event that is not handled, yet.";
    String CURRENT_ACTIVE_PLAYER_ONE = "Player One is currently active";
    String CURRENT_ACTIVE_PLAYER_TWO = "Player Two is currently active";
    String NOT_YOUR_UNIT = "This is not your unit!";
    String NO_UNIT_SELECTED = "No unit selected!";
    String THERE_IS_NO_UNIT_HERE = "There is no unit here!";
    String UNIT_ALREADY_SELECTED = "A unit is already selected while trying to select another one";
    String NO_UNIT_ON_TILE = "There is no unit on this tile!";
    String SELECTED_UNIT_FOUND = "Selected unit found!";
    String NEXT_ROUND_BOTH_PLAYERS_GET_EGOPOINTS = "Both players get egopoints for the next round";
    String BATTLEMANAGER_SELECT_A_UNIT = "Select a unit in battlemanager";
    String UNIT_SELECTED = "Unit selected";
    String ARENA_ENTITY_INSERTED_MESSAGE = "Entity inserted into arena";
    String REMOVING_CHILDREN_OF_BATTLEFIELD = "Removing children of battlefieldPane on Coordinates: x: %d, y: %d";
    String WAS_SELECTED = " was selected";
    String ENTITY_MOVE_SUCCESSFUL = "Entity moved successfully";
    String ENTITY_MOVE_FAILED = "Entity move failed";
    String INVALID_EVENT_ID = " is not a valid ID for an event.";
    String DELETED_ALL_MINIONS_FROM_ARENA_VIEW = "Deleted all minions from arena view";
    String DREW_NEW_CARD = "Drew new card";
    String HERO_DIED_GAME_OVER = "Hero died, game over";
    String SET_EGOPOINTS = "Set egopoints";
    String SET_EGOPOINTS_TO_MAX = "Set egopoints to max";
    String PLAYER_WON_BATTLE = "Player won battle";
    String PLAYER_LOST_BATTLE = "Player lost battle";
}
