package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.LyreOfApolloItem;

public class LyreOfApolloRenderer extends GeoItemRenderer<LyreOfApolloItem> {
    public LyreOfApolloRenderer() {
        super(new LyreOfApolloModel());
    }
}