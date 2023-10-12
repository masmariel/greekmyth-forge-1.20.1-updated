package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.LyreOfOrpheusItem;

public class LyreOfOrpheusRenderer extends GeoItemRenderer<LyreOfOrpheusItem> {
    public LyreOfOrpheusRenderer() {
        super(new LyreOfOrpheusModel());
    }
}