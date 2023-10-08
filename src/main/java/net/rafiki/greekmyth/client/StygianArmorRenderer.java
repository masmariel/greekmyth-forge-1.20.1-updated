package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.StygianArmor;

public class StygianArmorRenderer extends GeoArmorRenderer<StygianArmor> {
    public StygianArmorRenderer() {
        super(new StygianArmorModel());
    }
}
