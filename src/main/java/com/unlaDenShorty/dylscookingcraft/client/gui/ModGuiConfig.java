package com.unlaDenShorty.dylscookingcraft.client.gui;

import com.unlaDenShorty.dylscookingcraft.handler.ConfigurationHandler;
import com.unlaDenShorty.dylscookingcraft.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;


public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen parentScreen) {
        super(parentScreen, new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
