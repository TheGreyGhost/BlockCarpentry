package mod.pianomanu.blockcarpentry.setup;

import mod.pianomanu.blockcarpentry.BlockCarpentryMain;
import mod.pianomanu.blockcarpentry.model.FrameModelLoader;
import mod.pianomanu.blockcarpentry.model.SlabFrameBottomModelLoader;
import mod.pianomanu.blockcarpentry.model.SlabFrameTopModelLoader;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BlockCarpentryMain.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    @SubscribeEvent
    public static void init(final FMLClientSetupEvent event) {
        ModelLoaderRegistry.registerLoader(new ResourceLocation(BlockCarpentryMain.MOD_ID, "frameloader"), new FrameModelLoader());
        ModelLoaderRegistry.registerLoader(new ResourceLocation(BlockCarpentryMain.MOD_ID, "frame_slab_bottom_loader"), new SlabFrameBottomModelLoader());
        ModelLoaderRegistry.registerLoader(new ResourceLocation(BlockCarpentryMain.MOD_ID, "frame_slab_top_loader"), new SlabFrameTopModelLoader());

        //SlabFrameBottomRenderer.register();
    }
}
