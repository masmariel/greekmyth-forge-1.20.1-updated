package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.SwordOfAtalantaItem;

public class SwordOfAtalantaRenderer extends GeoItemRenderer<SwordOfAtalantaItem> {
    public SwordOfAtalantaRenderer() {
        super(new SwordOfAtalantaModel());
    }
}