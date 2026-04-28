package o30;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ boolean a(Unsafe unsafe, s sVar, long j9, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(sVar, j9, obj, obj2)) {
            if (unsafe.getObject(sVar, j9) != obj) {
                return false;
            }
        }
        return true;
    }
}
