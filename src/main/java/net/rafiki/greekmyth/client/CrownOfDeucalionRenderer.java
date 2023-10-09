package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.BrokenWingedSandalsItem;
import net.rafiki.greekmyth.item.custom.CrownOfDeucalionItem;

public class CrownOfDeucalionRenderer extends GeoArmorRenderer<CrownOfDeucalionItem> {
    public CrownOfDeucalionRenderer() {
        super(new CrownOfDeucalionModel());
    }
}
