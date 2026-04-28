package m1;

import android.os.Build;
import android.view.SurfaceControl;
import android.view.SurfaceView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static g a(SurfaceView surfaceView) {
        surfaceView.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            return f.f28703a;
        }
        SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
        surfaceControl.getClass();
        return new e(surfaceControl);
    }
}
