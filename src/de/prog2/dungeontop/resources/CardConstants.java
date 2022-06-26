package de.prog2.dungeontop.resources;

public interface CardConstants
{
    int ENTITY_NAME_FONT_SIZE = 28;
    double CARD_BASE_HEIGHT = 866;
    double CARD_BASE_WIDTH = 489;
    // Shop
    int SHOP_COLUMN_COUNT = 4;
    int SHOP_SELL_BUTTON_HEIGHT_MULTIPLIER = 5;
    double SHOP_CARD_SCALE = 0.9;
    // EntityCard
    double ENTITY_IMAGE_SCALE = 0.25;
    double ENTITY_IMAGE_WIDTH = 884 * ENTITY_IMAGE_SCALE;
    double ENTITY_IMAGE_HEIGHT = 849 * ENTITY_IMAGE_SCALE;
    // Icon Size
    double ICON_SIZE = 55d;
    double ICON_OFFSET = ICON_SIZE / 2d;
    // Card Anchors
    double SUMMON_COST_TOP_ANCHOR = 25 + ICON_OFFSET;
    double SUMMON_COST_LEFT_ANCHOR = 225 + ICON_OFFSET;

    double HP_TOP_ANCHOR = 460 + ICON_OFFSET;
    double HP_LEFT_ANCHOR = 334 + ICON_OFFSET;

    double ATTACK_TOP_ANCHOR = 460 + ICON_OFFSET;
    double ATTACK_LEFT_ANCHOR = 100 + ICON_OFFSET;

    double MOVEMENT_TOP_ANCHOR = 460 + ICON_OFFSET;
    double MOVEMENT_LEFT_ANCHOR = 209 + ICON_OFFSET;

    double RANK_TOP_ANCHOR = 791 + ICON_OFFSET;
    double RANK_LEFT_ANCHOR = 225 + ICON_OFFSET;

    double NAME_OFFSET_Y = ENTITY_NAME_FONT_SIZE/2d;
    double NAME_TOP_ANCHOR = 125 + NAME_OFFSET_Y;
    String NAME_FONT_SIZE_STYLE = "-fx-font-size: %d px;";
    double ENTITY_IMAGE_OFFSET_Y = ENTITY_IMAGE_HEIGHT/2d;
    double ENTITY_IMAGE_TOP_ANCHOR = 100 + ENTITY_IMAGE_HEIGHT;
}
