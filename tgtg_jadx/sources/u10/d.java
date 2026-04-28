package u10;

import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f40630a = new d(f.class, "circularReveal");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return ((g) obj).getRevealInfo();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((g) obj).setRevealInfo((f) obj2);
    }
}
