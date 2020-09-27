package me.mooy1.mooyaddon.Items;

import me.mooy1.mooyaddon.MooyAddon;
import me.mooy1.mooyaddon.MooyItems;
import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

public class VoidDustResource implements GEOResource {

    private final NamespacedKey key = new NamespacedKey(MooyAddon.getInstance(), "VoidDust");

    @Override
    public int getDefaultSupply(World.Environment environment, Biome biome) {
        if (environment == World.Environment.THE_END) {
            return 20;
        } else {
            return 0;
        }
    }

    @Override
    public NamespacedKey getKey() {
        return key;
    }

    @Override
    public int getMaxDeviation() {
        return 1;
    }

    @Override
    public String getName() {
        return "Void Dust";
    }

    @Override
    public ItemStack getItem() {
        return MooyItems.VOID_DUST.clone();
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }
}