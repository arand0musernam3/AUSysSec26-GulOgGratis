package u10;

import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f40631a = new e(Integer.class, "circularRevealScrimColor");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((g) obj).getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((g) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
    }
}
