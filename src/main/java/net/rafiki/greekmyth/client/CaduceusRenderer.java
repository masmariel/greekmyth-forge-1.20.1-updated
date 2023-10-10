package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.CaduceusItem;
import net.rafiki.greekmyth.item.custom.SwordOfAresItem;

public class CaduceusRenderer extends GeoItemRenderer<CaduceusItem> {
    public CaduceusRenderer() {
        super(new CaduceusModel());
    }
}