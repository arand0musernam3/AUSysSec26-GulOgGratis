package o30;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ boolean a(Unsafe unsafe, s sVar, long j9, r rVar, r rVar2) {
        while (!unsafe.compareAndSwapObject(sVar, j9, rVar, rVar2)) {
            if (unsafe.getObject(sVar, j9) != rVar) {
                return false;
            }
        }
        return true;
    }
}
