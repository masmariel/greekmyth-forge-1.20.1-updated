package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.LotusStaffOfPersephoneItem;

public class LotusStaffOfPersephoneRenderer extends GeoItemRenderer<LotusStaffOfPersephoneItem> {
    public LotusStaffOfPersephoneRenderer() {
        super(new LotusStaffOfPersephoneModel());
    }
}