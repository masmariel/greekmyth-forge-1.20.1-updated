package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.BronzeArmor;

public class BronzeArmorRenderer extends GeoArmorRenderer<BronzeArmor> {
    public BronzeArmorRenderer() {
        super(new BronzeArmorModel());
    }
}
