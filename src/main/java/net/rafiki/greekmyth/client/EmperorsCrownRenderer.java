package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.CrownOfDeucalionItem;
import net.rafiki.greekmyth.item.custom.EmperorsCrownItem;

public class EmperorsCrownRenderer extends GeoArmorRenderer<EmperorsCrownItem> {
    public EmperorsCrownRenderer() {
        super(new EmperorsCrownModel());
    }
}
