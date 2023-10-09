package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.CrownOfDeucalionItem;
import net.rafiki.greekmyth.item.custom.CrownOfDionysusItem;

public class CrownOfDionysusRenderer extends GeoArmorRenderer<CrownOfDionysusItem> {
    public CrownOfDionysusRenderer() {
        super(new CrownOfDionysusModel());
    }
}
