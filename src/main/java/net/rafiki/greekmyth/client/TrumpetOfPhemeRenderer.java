package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AolusItem;
import net.rafiki.greekmyth.item.custom.TrumpetOfPhemeItem;

public class TrumpetOfPhemeRenderer extends GeoItemRenderer<TrumpetOfPhemeItem> {
    public TrumpetOfPhemeRenderer() {
        super(new TrumpetOfPhemeModel());
    }
}