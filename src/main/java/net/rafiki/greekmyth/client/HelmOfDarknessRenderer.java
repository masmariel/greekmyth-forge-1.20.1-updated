package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.HelmOfDarknessItem;

public class HelmOfDarknessRenderer extends GeoArmorRenderer<HelmOfDarknessItem> {
    public HelmOfDarknessRenderer() {
        super(new HelmOfDarknessModel());
    }
}
