package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.BrokenWingedSandalsItem;
import net.rafiki.greekmyth.item.custom.StymphalianBirdWingsItem;

public class StymphalianBirdWingsRenderer extends GeoArmorRenderer<StymphalianBirdWingsItem> {
    public StymphalianBirdWingsRenderer() {
        super(new StymphalianBirdWingsModel());
    }
}
