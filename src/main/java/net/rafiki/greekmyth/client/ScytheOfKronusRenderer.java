package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.minecraft.world.item.ScaffoldingBlockItem;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.ScytheOfKronusItem;

public class ScytheOfKronusRenderer extends GeoItemRenderer<ScytheOfKronusItem> {
    public ScytheOfKronusRenderer() {
        super(new ScytheOfKronusModel());
    }
}