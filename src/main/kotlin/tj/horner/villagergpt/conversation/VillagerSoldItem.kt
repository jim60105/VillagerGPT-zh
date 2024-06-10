package tj.horner.villagergpt.conversation

enum class VillagerSoldItem {
    ARMORER {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "chainmail_helmet",
                        "iron_helmet",
                        "diamond_helmet",
                        "chainmail_chestplate",
                        "iron_chestplate",
                        "diamond_chestplate",
                        "chainmail_leggings",
                        "iron_leggings",
                        "diamond_leggings",
                        "chainmail_boots",
                        "iron_boots",
                        "diamond_boots",
                        "bell",
                        "shield"
                )
    },
    BUTCHER {
        override fun SoldItemList(): Collection<String> =
                listOf("rabbit_stew", "cooked_porkchop", "cooked_chicken")
    },
    CARTOGRAPHER {
        override fun SoldItemList(): Collection<String> =
                listOf("map", "item_frame", "(Any colored)_banner", "globe_banner_pattern")
    },
    CLERIC {
        override fun SoldItemList(): Collection<String> =
                listOf("redstone", "lapis_lazuli", "glowstone", "ender_pearl", "experience_bottle")
    },
    FARMER {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "bread",
                        "pumpkin_pie",
                        "apple",
                        "cookie",
                        "cake",
                        "golden_carrot",
                        "glistering_melon_slice"
                )
    },
    FISHERMAN {
        override fun SoldItemList(): Collection<String> =
                listOf("cooked_cod", "cod_bucket", "cooked_salmon", "campfire", "fishing_rod")
    },
    FLETCHER {
        override fun SoldItemList(): Collection<String> =
                listOf("arrow", "flint", "bow", "crossbow")
    },
    LEATHERWORKER {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "leather_leggings",
                        "leather_chestplate",
                        "leather_helmet",
                        "leather_boots",
                        "leather_horse_armor",
                        "saddle"
                )
    },
    LIBRARIAN {
        override fun SoldItemList(): Collection<String> =
                listOf("book", "bookshelf", "lantern", "glass", "clock", "compass", "name_tag")
    },
    MASON {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "brick",
                        "chiseled_stone_bricks",
                        "polished_andesite",
                        "polished_granite",
                        "polished_diorite",
                        "dripstone_block",
                        "terracotta",
                        "(Any colored)_terracotta",
                        "(Any colored)_glazed_terracotta",
                        "quartz_pillar",
                        "quartz_block"
                )
    },
    SHEPHERD {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "(Any colored)_wool",
                        "(Any colored)_Carpet",
                        "(Any colored)_bed",
                        "(Any colored)_banner",
                        "painting"
                )
    },
    TOOLSMITH {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "stone_axe",
                        "iron_axe",
                        "diamond_axe",
                        "stone_shovel",
                        "iron_shovel",
                        "diamond_shovel",
                        "stone_pickaxe",
                        "iron_pickaxe",
                        "diamond_pickaxe",
                        "stone_hoe",
                        "iron_hoe",
                        "diamond_hoe",
                        "bell"
                )
    },
    WEAPONSMITH {
        override fun SoldItemList(): Collection<String> =
                listOf("iron_axe", "diamond_axe", "iron_sword", "diamond_sword", "bell")
    };

    abstract fun SoldItemList(): Collection<String>
}
