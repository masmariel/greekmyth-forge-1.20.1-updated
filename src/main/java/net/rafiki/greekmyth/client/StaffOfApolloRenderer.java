package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.StaffOfApolloItem;

public class StaffOfApolloRenderer extends GeoItemRenderer<StaffOfApolloItem> {
    public StaffOfApolloRenderer() {
        super(new StaffOfApolloModel());
    }
}