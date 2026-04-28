package o00;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, t1 t1Var, long j9, Object obj) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            t1 t1Var2 = t1Var;
            long j11 = j9;
            Object obj2 = obj;
            if (unsafe2.compareAndSwapObject(t1Var2, j11, obj2, b1.f31625b)) {
                return true;
            }
            if (unsafe2.getObject(t1Var2, j11) != obj2) {
                return false;
            }
            unsafe = unsafe2;
            t1Var = t1Var2;
            j9 = j11;
            obj = obj2;
        }
    }
}
