package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.TheMasterBoltItem;

public class TheMasterBoltRenderer extends GeoItemRenderer<TheMasterBoltItem> {
    public TheMasterBoltRenderer() {
        super(new TheMasterBoltModel());
    }
}