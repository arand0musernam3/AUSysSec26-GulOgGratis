package h7;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.RenderNode;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q1 {
    public static /* synthetic */ BlendModeColorFilter a(int i11, BlendMode blendMode) {
        return new BlendModeColorFilter(i11, blendMode);
    }

    public static /* synthetic */ RenderNode b() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ WindowInsets.Builder c() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder d(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void e() {
    }
}
