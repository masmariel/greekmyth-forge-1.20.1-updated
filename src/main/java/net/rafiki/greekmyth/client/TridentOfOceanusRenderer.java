package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.TridentOfOceanusItem;
import net.rafiki.greekmyth.item.custom.TridentOfPoseidonItem;

public class TridentOfOceanusRenderer extends GeoItemRenderer<TridentOfOceanusItem> {
    public TridentOfOceanusRenderer() {
        super(new TridentOfOceanusModel());
    }
}