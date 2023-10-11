package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AxeOfPerdixItem;
import net.rafiki.greekmyth.item.custom.TridentOfPoseidonItem;

public class TridentOfPoseidonRenderer extends GeoItemRenderer<TridentOfPoseidonItem> {
    public TridentOfPoseidonRenderer() {
        super(new TridentOfPoseidonModel());
    }
}