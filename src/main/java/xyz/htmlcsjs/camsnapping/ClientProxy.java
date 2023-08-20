package xyz.htmlcsjs.camsnapping;

import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy {
    @SubscribeEvent
    public static void keypressEvent(InputEvent.KeyInputEvent event) {
        if (CamSnapping.horizontalBind.isPressed()) {
            CamSnapping.LOGGER.info("KEY PRESSED");
            CamSnapping.horizontalBind.
        }

    }
}
