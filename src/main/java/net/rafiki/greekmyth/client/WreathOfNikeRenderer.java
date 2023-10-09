package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.HelmOfDarknessItem;
import net.rafiki.greekmyth.item.custom.WreathOfNikeItem;

public class WreathOfNikeRenderer extends GeoArmorRenderer<WreathOfNikeItem> {
    public WreathOfNikeRenderer() {
        super(new WreathOfNikeModel());
    }
}
