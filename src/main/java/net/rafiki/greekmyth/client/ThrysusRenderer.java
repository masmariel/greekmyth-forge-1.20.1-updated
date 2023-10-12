package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.ThrysusItem;

public class ThrysusRenderer extends GeoItemRenderer<ThrysusItem> {
    public ThrysusRenderer() {
        super(new ThrysusModel());
    }
}