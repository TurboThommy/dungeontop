package de.prog2.dungeontop.resources;

import java.util.UUID;

public interface WorldConstants
{
    /**
     * Jeder Raum ist ROOM_SIZExROOM_SIZE gross.
     */
    int ROOM_SIZE = 3;
    int HELL_SIZE = 7;
    int LOWEST_COORDINATE = 0;
    int RANDOMIZER_LIMIT = 6;

    public interface RoomAssetIds
    {
        UUID WALL_ASSET_ID = UUID.randomUUID();
        UUID WALL_CORNER_ASSET_ID = UUID.randomUUID();
        UUID PASSAGE_ASSET_ID = UUID.randomUUID();
        UUID ROOM_CENTER_ASSET_ID = UUID.randomUUID();
    }
}
