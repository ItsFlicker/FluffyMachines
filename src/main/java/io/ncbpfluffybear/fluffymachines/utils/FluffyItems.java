package io.ncbpfluffybear.fluffymachines.utils;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import io.ncbpfluffybear.fluffymachines.FluffyMachines;
import io.ncbpfluffybear.fluffymachines.items.Barrel;
import io.ncbpfluffybear.fluffymachines.items.FireproofRune;
import io.ncbpfluffybear.fluffymachines.items.tools.PortableCharger;
import io.ncbpfluffybear.fluffymachines.machines.AutoAncientAltar;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import io.ncbpfluffybear.fluffymachines.machines.AutoCraftingTable;
import io.ncbpfluffybear.fluffymachines.machines.AutoTableSaw;
import io.ncbpfluffybear.fluffymachines.machines.BackpackLoader;
import io.ncbpfluffybear.fluffymachines.machines.BackpackUnloader;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustFabricator;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustRecycler;
import io.ncbpfluffybear.fluffymachines.machines.WaterSprinkler;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;


public class FluffyItems {

    private FluffyItems() {
    }

    // Category
    public static final Category fluffymachines = new Category(new NamespacedKey(FluffyMachines.getInstance(),
        "fluffymachines"),
        new CustomItem(Material.SMOKER, "&6蓬松机器")
    );

    public static final Category fluffybarrels = new Category(new NamespacedKey(FluffyMachines.getInstance(),
        "fluffybarrels"),
        new CustomItem(Material.BARREL, "&6次元箱子")
    );

    public static final SlimefunItemStack FLUFFYMACHINES_INFO = new SlimefunItemStack("FLUFFYMACHINES_INFO",
        Material.ORANGE_WOOL,
        "&6&l蓬松机器(Fluffy Machines)信息",
        "",
        "&e" + FluffyMachines.getInstance().getName() + " " + FluffyMachines.getInstance().getPluginVersion(),
        "",
        "&e左击 &7以得到wiki链接",
        "&e右击 &7以得到bug反馈链接",
        "&2FlickerCraft &b魔改版"
    );

    // Barrels
    public static final SlimefunItemStack SMALL_FLUFFY_BARREL = new SlimefunItemStack("SMALL_FLUFFY_BARREL",
        Material.BEEHIVE,
        "&e一阶次元箱子",
        "",
        "&7存储很多同一种类的物品",
        "&c不要使用爆炸工具破坏...",
        "&c除非你想丢失里面所有的物品",
        "",
        "&b存储量: &e" + Barrel.SMALL_BARREL_SIZE + " 物品"
    );

    public static final SlimefunItemStack MEDIUM_FLUFFY_BARREL = new SlimefunItemStack("MEDIUM_FLUFFY_BARREL",
        Material.BARREL,
        "&6二阶次元箱子",
        "",
        "&7存储很多同一种类的物品",
        "&c不要使用爆炸工具破坏...",
        "&c除非你想丢失里面所有的物品",
        "",
        "&b存储量: &e" + Barrel.MEDIUM_BARREL_SIZE + " 物品"
    );

    public static final SlimefunItemStack BIG_FLUFFY_BARREL = new SlimefunItemStack("BIG_FLUFFY_BARREL",
        Material.SMOKER,
        "&b三阶次元箱子",
        "",
        "&7存储很多同一种类的物品",
        "&c不要使用爆炸工具破坏...",
        "&c除非你想丢失里面所有的物品",
        "",
        "&b存储量: &e" + Barrel.BIG_BARREL_SIZE + " 物品"
    );

    public static final SlimefunItemStack LARGE_FLUFFY_BARREL = new SlimefunItemStack("LARGE_FLUFFY_BARREL",
        Material.LODESTONE,
        "&a四阶次元箱子",
        "",
        "&7存储很多同一种类的物品",
        "&c不要使用爆炸工具破坏...",
        "&c除非你想丢失里面所有的物品",
        "",
        "&b存储量: &e" + Barrel.LARGE_BARREL_SIZE + " 物品"
    );

    public static final SlimefunItemStack MASSIVE_FLUFFY_BARREL = new SlimefunItemStack("MASSIVE_FLUFFY_BARREL",
        Material.CRYING_OBSIDIAN,
        "&5五阶次元箱子",
        "",
        "&7存储很多同一种类的物品",
        "&c不要使用爆炸工具破坏...",
        "&c除非你想丢失里面所有的物品",
        "",
        "&b存储量: &e" + Barrel.MASSIVE_BARREL_SIZE + " 物品"
    );

    public static final SlimefunItemStack BOTTOMLESS_FLUFFY_BARREL = new SlimefunItemStack("BOTTOMLESS_FLUFFY_BARREL",
        Material.RESPAWN_ANCHOR,
        "&c六阶次元箱子",
        "",
        "&7存储很多同一种类的物品",
        "&c不要使用爆炸工具破坏...",
        "&c除非你想丢失里面所有的物品",
        "",
        "&b存储量: &e" + Barrel.BOTTOMLESS_BARREL_SIZE + " 物品"
    );

    // Portable Chargers
    public static final SlimefunItemStack SMALL_PORTABLE_CHARGER = new SlimefunItemStack("SMALL_PORTABLE_CHARGER",
        Material.BRICK,
        "&e小型便携充电器",
        "",
        "&7一个存储着很多电量的便携充电器",
        "",
        "&e充能速度: &7" + PortableCharger.Type.SMALL.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.SMALL.chargeCapacity)
    );

    public static final SlimefunItemStack MEDIUM_PORTABLE_CHARGER = new SlimefunItemStack("MEDIUM_PORTABLE_CHARGER",
        Material.IRON_INGOT,
        "&6中型便携充电器",
        "",
        "&7一个存储着很多电量的便携充电器",
        "",
        "&e充能速度: &7" + PortableCharger.Type.MEDIUM.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.MEDIUM.chargeCapacity)
    );

    public static final SlimefunItemStack BIG_PORTABLE_CHARGER = new SlimefunItemStack("BIG_PORTABLE_CHARGER",
        Material.GOLD_INGOT,
        "&a大型便携充电器",
        "",
        "&7一个存储着很多电量的便携充电器",
        "",
        "&e充能速度: &7" + PortableCharger.Type.BIG.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.BIG.chargeCapacity)
    );

    public static final SlimefunItemStack LARGE_PORTABLE_CHARGER = new SlimefunItemStack("LARGE_PORTABLE_CHARGER",
        Material.NETHER_BRICK,
        "&2超大型便携充电器",
        "",
        "&7一个存储着很多电量的便携充电器",
        "",
        "&e充能速度: &7" + PortableCharger.Type.LARGE.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.LARGE.chargeCapacity)
    );

    public static final SlimefunItemStack CARBONADO_PORTABLE_CHARGER = new SlimefunItemStack(
        "CARBONADO_PORTABLE_CHARGER",
        Material.NETHERITE_INGOT,
        "&4黑金刚石镶边便携充电器",
        "",
        "&7一个存储着很多电量的便携充电器",
        "",
        "&e充能速度: &7" + PortableCharger.Type.CARBONADO.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.CARBONADO.chargeCapacity)
    );

    // Items
    public static final SlimefunItemStack HELICOPTER_HAT = new SlimefunItemStack("HELICOPTER_HAT",
        Material.LEATHER_HELMET, Color.AQUA,
        "&1飞机帽",
        "",
        "&7WryyyyyyyyyyyyYYYyyyY",
        "",
        "&e潜行 &7使用"
    );
    public static final SlimefunItemStack WATERING_CAN = new SlimefunItemStack("WATERING_CAN",
        new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
        "&b洒水壶",
        "",
        "&f灌溉植物",
        "",
        "&7> &e右键 &7水以装满你的洒水壶",
        "&7> &e右键 &7植物以加速生长",
        "&7> &e右键 &7玩家来让他们减速",
        "",
        "&a剩余使用次数: &e0"
    );
    // Machines
    public static final SlimefunItemStack AUTO_CRAFTING_TABLE = new SlimefunItemStack("AUTO_CRAFTING_TABLE",
        Material.CRAFTING_TABLE,
        "&6自动合成台",
        "",
        "&7自动合成 &f原版 &7配方",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCraftingTable.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoCraftingTable.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ANCIENT_ALTAR = new SlimefunItemStack("AUTO_ANCIENT_ALTAR",
        Material.ENCHANTING_TABLE,
        "&5自动古代祭坛",
        "",
        "&7自动合成 &5古代祭坛 &7配方",
        "",
        LoreBuilderDynamic.powerBuffer(AutoAncientAltar.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoAncientAltar.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_TABLE_SAW = new SlimefunItemStack("AUTO_TABLE_SAW",
        Material.STONECUTTER,
        "&6自动切石机",
        "",
        "&7自动合成 &6切石级 &7配方",
        "",
        LoreBuilderDynamic.powerBuffer(AutoTableSaw.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoTableSaw.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack WATER_SPRINKER = new SlimefunItemStack("WATER_SPRINKLER",
        new CustomItem(SkullItem.fromHash("d6b13d69d1929dcf8edf99f3901415217c6a567d3a6ead12f75a4de3ed835e85"),
            "洒水器"),
        "&b洒水器",
        "",
        "&7Sprinkly sprinkly &8(拟声词)",
        "",
        LoreBuilderDynamic.powerBuffer(WaterSprinkler.CAPACITY),
        LoreBuilderDynamic.powerPerTick(WaterSprinkler.ENERGY_CONSUMPTION) + " 每个作物"
    );
    public static final SlimefunItemStack ITEM_OVERSTACKER = new SlimefunItemStack("ITEM_OVERSTACKER",
        Material.PISTON,
        "&eItem Overstacker",
        "",
        "&7Compresses nonstackable items"
    );
    public static final SlimefunItemStack GENERATOR_CORE = new SlimefunItemStack("GENERATOR_CORE",
        Material.BLAST_FURNACE,
        "&7发电机核心",
        "",
        "&7Multiblock component of generators"
    );
    public static final SlimefunItemStack CRANK_GENERATOR = new SlimefunItemStack("CRANK_GENERATOR",
        Material.BLAST_FURNACE,
        "&7手摇发电机",
        "",
        "&e右键 &7拉杆发电",
        "",
        Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack FOUNDRY = new SlimefunItemStack("FOUNDRY",
        Material.BLAST_FURNACE,
        "&c冶炼厂",
        "",
        "&e熔炼并存储粉和锭",
        "&7存储 138,240 个矿粉 (40 个大箱子)",
        "",
        Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack BACKPACK_UNLOADER = new SlimefunItemStack("BACKPACK_UNLOADER",
        Material.BROWN_STAINED_GLASS,
        "&e背包卸载器",
        "",
        "&7清空背包中的物品",
        "",
        LoreBuilderDynamic.powerBuffer(BackpackUnloader.CAPACITY),
        LoreBuilderDynamic.powerPerTick(BackpackUnloader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack BACKPACK_LOADER = new SlimefunItemStack("BACKPACK_LOADER",
        Material.ORANGE_STAINED_GLASS,
        "&e背包装载器",
        "",
        "&7把物品转移到背包中",
        "",
        LoreBuilderDynamic.powerBuffer(BackpackLoader.CAPACITY),
        LoreBuilderDynamic.powerPerTick(BackpackLoader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_PICKAXE = new SlimefunItemStack(
        "UPGRADED_EXPLOSIVE_PICKAXE",
        Material.DIAMOND_PICKAXE,
        "&e&lUpgraded Explosive Pickaxe",
        "",
        "&7Breaks all mineable blocks in a 5x5 radius"
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_SHOVEL = new SlimefunItemStack("UPGRADED_EXPLOSIVE_SHOVEL",
        Material.DIAMOND_SHOVEL,
        "&e&lUpgraded Explosive Shovel",
        "",
        "&7Breaks all shovelable blocks in a 5x5 radius"
    );
    public static final SlimefunItemStack FIREPROOF_RUNE = new SlimefunItemStack(
        "FIREPROOF_RUNE",
        new ColoredFireworkStar(Color.fromRGB(255, 165, 0),
            "&7古代符文 &8&l[&c&l防火&8&l]",
            "",
            "&e把这个符文丢向一个物品",
            "&e使它 &c防火",
            ""
        ));
    public static final SlimefunItemStack SUPERHEATED_FURNACE = new SlimefunItemStack("SUPERHEATED_FURNACE",
        Material.BLAST_FURNACE,
        "&c超级加热高炉",
        "",
        "&7多方块铸造厂的部件",
        "&c必须在铸造厂中使用",
        "&c&l不要使用爆炸工具破坏!"
    );
    public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH = new SlimefunItemStack("AUTO_MAGIC_WORKBENCH",
        Material.BOOKSHELF,
        "&6自动魔法工作台",
        "",
        "&7自动合成 &6魔法工作台 &7配方",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ARMOR_FORGE = new SlimefunItemStack("AUTO_ARMOR_FORGE",
        Material.SMITHING_TABLE,
        "&7自动盔甲锻造台",
        "",
        "&7自动合成盔甲锻造台配方",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack SCYTHE = new SlimefunItemStack("SCYTHE",
        Material.IRON_HOE,
        "&e镰刀",
        "",
        "&7一次破坏5个作物"
    );
    public static final SlimefunItemStack UPGRADED_LUMBER_AXE = new SlimefunItemStack("UPGRADED_LUMBER_AXE",
        Material.DIAMOND_AXE,
        "&6&lUpgraded Lumber Axe",
        "",
        "&7Chops down an entire tree at once",
        "&72 block reach and works on diagonal blocks too"
    );
    public static final SlimefunItemStack DOLLY = new SlimefunItemStack("DOLLY",
        Material.MINECART,
        "&b搬箱器",
        "",
        "&7右键一个箱子把它搬起",
        "",
        "&7ID: <ID>"
    );

    public static final SlimefunItemStack WARP_PAD = new SlimefunItemStack("WARP_PAD",
        Material.SMOKER,
        "&6传送平台",
        "",
        "&7在这个方块上 &e潜行",
        "&7传送到连接的终点平台",
        "",
        "&7使用传送平台配置器来连接传送平台"
    );

    public static final SlimefunItemStack WARP_PAD_CONFIGURATOR = new SlimefunItemStack("WARP_PAD_CONFIGURATOR",
        Material.BLAZE_ROD,
        "&6传送平台配置器",
        "",
        "&e潜行并右键 &7一个传送平台设置终点",
        "&e右键 &7一个传送平台设置起点",
        "",
        "&e连接的坐标: &7无"
    );

    public static final SlimefunItemStack ELECTRIC_DUST_FABRICATOR = new SlimefunItemStack("ELECTRIC_DUST_FABRICATOR",
        Material.BLAST_FURNACE,
        "&6电动矿粉工厂",
        "",
        "&7碎矿、筛矿、洗矿一体机",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(10),
        LoreBuilderDynamic.powerBuffer(ElectricDustFabricator.CAPACITY),
        LoreBuilderDynamic.powerPerTick(ElectricDustFabricator.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ELECTRIC_DUST_RECYCLER = new SlimefunItemStack("ELECTRIC_DUST_RECYCLER",
        Material.IRON_BLOCK,
        "&f电动矿粉回收机",
        "",
        "&7将矿粉循环利用",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilderDynamic.powerBuffer(ElectricDustRecycler.CAPACITY),
        LoreBuilderDynamic.powerPerTick(ElectricDustRecycler.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack FLUFFY_WRENCH = new SlimefunItemStack("FLUFFY_WRENCH",
        Material.GOLDEN_AXE,
        "&6蓬松扳手",
        "",
        "&7用于快速移除货运节点",
        "&7和电力机器",
        "",
        "&e左键&7/&e右键 &7一个兼容的方块破坏它"
    );

    public static final SlimefunItemStack PAXEL = new SlimefunItemStack("PAXEL",
        Material.DIAMOND_PICKAXE,
        "&b全能工具",
        "",
        "&7镐、斧、铲合三为一"
    );

    private static final Enchantment glowEnchant = Enchantment.getByKey(Constants.GLOW_ENCHANT);

    static {
        FireproofRune.setFireproof(FIREPROOF_RUNE);
        SMALL_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        MEDIUM_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        BIG_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        LARGE_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        CARBONADO_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
    }
}
