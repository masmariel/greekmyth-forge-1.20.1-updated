package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AolusItem;
import net.rafiki.greekmyth.item.custom.JarOfSoulsItem;

public class JarOfSoulsRenderer extends GeoItemRenderer<JarOfSoulsItem> {
    public JarOfSoulsRenderer() {
        super(new JarOfSoulsModel());
    }
}