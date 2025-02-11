package gg.codie.spritecaster.texturepacks;

public enum TexturePackTexture {
    PACK("pack.png"),
    TERRAIN("terrain.png"),
    ITEMS("gui/items.png"),
    CHAINMAIL_ARMOUR_UPPER("armor/chain_1.png"),
    CHAINMAIL_ARMOUR_LOWER("armor/chain_2.png"),
    CLOTH_ARMOUR_UPPER("armor/cloth_1.png"),
    CLOTH_ARMOUR_LOWER("armor/cloth_2.png"),
    DIAMOND_ARMOUR_UPPER("armor/diamond_1.png"),
    DIAMOND_ARMOUR_LOWER("armor/diamond_2.png"),
    GOLDEN_ARMOUR_UPPER("armor/gold_1.png"),
    GOLDEN_ARMOUR_LOWER("armor/gold_2.png"),
    IRON_ARMOUR_UPPER("armor/iron_1.png"),
    IRON_ARMOUR_LOWER("armor/iron_2.png"),
    CREEPER_CHARGE("armor/power.png"),
    PAINTINGS("art/kz.png"),
    CLOUDS("environment/clouds.png"),
    RAIN("environment/rain.png"),
    SNOW("environment/snow.png"),
    FONT("font/default.png"),
    GUI_BACKGROUND("gui/background.png"),
    GUI_CONTAINER("gui/container.png"),
    GUI_CRAFTING("gui/crafting.png"),
    GUI_FURNACE("gui/furnace.png"),
    GUI_WIDGETS("gui/gui.png"),
    GUI_ICONS("gui/icons.png"),
    GUI_INVENTORY("gui/inventory.png"),
    GUI_LOGO("gui/logo.png"),
    GUI_PARTICLES("gui/particles.png"),
    GUI_SLOT("gui/slot.png"),
    GUI_DISPENSER("gui/trap.png"),
    UNKNOWN_PACK("gui/unknown_pack.png"),
    ITEM_ARROWS("item/arrows.png"),
    ITEM_BOAT("item/boat.png"),
    ITEM_CART("item/cart.png"),
    ITEM_SIGN("item/sign.png"),
    CLOCK_DIAL("misc/dial.png"),
    FOLIAGE_COLOR("misc/foliagecolor.png"),
    GRASS_COLOR("misc/grasscolor.png"),
    MAP_BG("misc/mapbg.png"),
    MAP_ICONS("misc/mapicons.png"),
    PUMPKIN_BLUR("misc/pumpkinblur.png"),
    SHADOW("misc/shadow.png"),
    VIGNETTE("misc/vignette"),
    WATER_BLUR("misc/water.png"),
    WATER_COLOR("misc/watercolor.png"),
    STEVE("mob/char.png"),
    CHICKEN("mob/chicken.png"),
    COW("mob/cow.png"),
    CREEPER("mob/creeper.png"),
    GHAST_FIRE("mob/ghast_fire.png"),
    GHAST("mob/ghast.png"),
    PIG("mob/pig.png"),
    PIGZOMBIE("mob/pigzombie.png"),
    PIG_SADDLE("mob/saddle.png"),
    SHEEP_FUR("mob/sheep_fur.png"),
    SHEEP("mob/sheep.png"),
    SKELETON("mob/skeleton.png"),
    SLIME("mob/slime.png"),
    SPIDER_EYES("mob/spider_eyes.png"),
    SPIDER("mob/spider.png"),
    SQUID("mob/squid.png"),
    WOLF_ANGRY("mob/wolf_angry.png"),
    DOGGY("mob/wolf_tame.png"),
    WOLF("mob/wolf.png"),
    ZOMBIE("mob/zombie.png"),
    PARTICLES("particles.png"),
    MOON("terrain/moon.png"),
    SUN("terrain/sun.png"),
    BLACK("title/black.png"),
    MCLOGO("title/mclogo.png"),
    MOJANG("title/mojang.png"),
    WATER_FLOWING("custom_water_flowing.png"),
    WATER_STILL("custom_water_still.png"),
    LAVA_FLOWING("custom_lava_flowing.png"),
    LAVA_STILL("custom_lava_still.png");

    private String path;
    TexturePackTexture(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
