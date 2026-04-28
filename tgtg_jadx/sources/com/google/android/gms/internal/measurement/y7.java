package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y7 extends k1 {
    private static final y7 zze;
    private static volatile h2 zzf;
    private t1 zzb = k2.f11555e;

    static {
        y7 y7Var = new y7();
        zze = y7Var;
        k1.o(y7.class, y7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i12 == 3) {
            return new y7();
        }
        if (i12 == 4) {
            return new k7(zze);
        }
        if (i12 == 5) {
            return zze;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzf;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (y7.class) {
            try {
                j1Var = zzf;
                if (j1Var == null) {
                    j1Var = new j1(zze);
                    zzf = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }
}
