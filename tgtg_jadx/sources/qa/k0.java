package qa;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f36692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c20.d f36693b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f36692a = new m0();
        } else {
            f36692a = new l0();
        }
        f36693b = new c20.d(17, "translationAlpha", Float.class);
        new c20.d(18, "clipBounds", Rect.class);
    }

    public static void a(View view, int i11, int i12, int i13, int i14) {
        f36692a.h(view, i11, i12, i13, i14);
    }

    public static void b(int i11, View view) {
        f36692a.i(i11, view);
    }
}
