package androidx.appcompat.view;

import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static void a(Window.Callback callback, boolean z11) {
        callback.onPointerCaptureChanged(z11);
    }
}
