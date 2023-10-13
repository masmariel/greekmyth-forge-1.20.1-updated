package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AolusItem;
import net.rafiki.greekmyth.item.custom.WingsOfIcarusItem;

public class WingsOfIcarusRenderer extends GeoArmorRenderer<WingsOfIcarusItem> {
    public WingsOfIcarusRenderer() {
        super(new WingsOfIcarusModel());
    }
}