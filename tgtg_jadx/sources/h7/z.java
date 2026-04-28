package h7;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointerIcon f21646a;

    public z(PointerIcon pointerIcon) {
        this.f21646a = pointerIcon;
    }

    public static z b(Context context, int i11) {
        return new z(PointerIcon.getSystemIcon(context, i11));
    }

    public Object a() {
        return this.f21646a;
    }
}
