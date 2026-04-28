package l4;

import android.view.RenderNode;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i11) {
        renderNode.setAmbientShadowColor(i11);
    }

    public static void d(RenderNode renderNode, int i11) {
        renderNode.setSpotShadowColor(i11);
    }
}
