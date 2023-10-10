package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.SwordOfAresItem;

public class SwordOfAresRenderer extends GeoItemRenderer<SwordOfAresItem> {
    public SwordOfAresRenderer() {
        super(new SwordOfAresModel());
    }
}