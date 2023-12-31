package xyz.htmlcsjs.camsnapping;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]", clientSideOnly = true)
public class CamSnapping {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);
    @SideOnly(Side.CLIENT)
    public static final KeyBinding horizontalBind = new KeyBinding("camsnapping.keybind.snap_horizontal", KeyConflictContext.IN_GAME, KeyModifier.SHIFT, Keyboard.KEY_0, "Cam Snapping");
    @SideOnly(Side.CLIENT)
    public static final KeyBinding verticalBind = new KeyBinding("camsnapping.keybind.snap_vertical", KeyConflictContext.IN_GAME, KeyModifier.SHIFT, Keyboard.KEY_9, "Cam Snapping");
    @SideOnly(Side.CLIENT)
    public static final KeyBinding rotateLeft = new KeyBinding("camsnapping.keybind.rotate_left", KeyConflictContext.IN_GAME, KeyModifier.SHIFT, Keyboard.KEY_LEFT, "Cam Snapping");
    @SideOnly(Side.CLIENT)
    public static final KeyBinding rotateRight = new KeyBinding("camsnapping.keybind.rotate_right", KeyConflictContext.IN_GAME, KeyModifier.SHIFT, Keyboard.KEY_RIGHT, "Cam Snapping");

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {
        if (event.getSide() == Side.CLIENT) {
            ClientRegistry.registerKeyBinding(horizontalBind);
            ClientRegistry.registerKeyBinding(verticalBind);
            ClientRegistry.registerKeyBinding(rotateLeft);
            ClientRegistry.registerKeyBinding(rotateRight);
        }
    }
}
