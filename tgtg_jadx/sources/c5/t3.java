package c5;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t3 {
    public static final b5.r1 a(a aVar, Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            e40.a.k("Cannot configure ", aVar, " to disposeComposition at Lifecycle ON_DESTROY: ", lifecycle, "is already destroyed");
            return null;
        }
        androidx.lifecycle.s sVar = new androidx.lifecycle.s(aVar, 1);
        lifecycle.a(sVar);
        return new b5.r1(6, lifecycle, sVar);
    }
}
