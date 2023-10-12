package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.SwordOfDamasenItem;

public class SwordOfDamasenRenderer extends GeoItemRenderer<SwordOfDamasenItem> {
    public SwordOfDamasenRenderer() {
        super(new SwordOfDamasenModel());
    }
}