package net.rafiki.greekmyth.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class FuelItem extends Item {
    private int burnTime = 0;
    public FuelItem(Properties pProperties, int burnTime) {
        super(pProperties);
this.burnTime = burnTime;
    }

    public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
        return this.burnTime;
    }
}