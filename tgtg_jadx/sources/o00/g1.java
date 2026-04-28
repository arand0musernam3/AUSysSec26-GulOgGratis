package o00;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class g1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, j1 j1Var, long j9, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(j1Var, j9, obj, obj2)) {
            if (unsafe.getObject(j1Var, j9) != obj) {
                return false;
            }
        }
        return true;
    }
}
