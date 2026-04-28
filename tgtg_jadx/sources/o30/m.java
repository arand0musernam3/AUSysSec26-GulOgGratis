package o30;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class m {
    public static /* synthetic */ boolean a(Unsafe unsafe, j jVar, long j9, g gVar, g gVar2) {
        while (!unsafe.compareAndSwapObject(jVar, j9, gVar, gVar2)) {
            if (unsafe.getObject(jVar, j9) != gVar) {
                return false;
            }
        }
        return true;
    }
}
