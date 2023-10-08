package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.BronzeArmor;
import net.rafiki.greekmyth.item.custom.ImperialArmor;

public class ImperialGoldArmorRenderer extends GeoArmorRenderer<ImperialArmor> {
    public ImperialGoldArmorRenderer() {
        super(new ImperialGoldArmorModel());
    }
}