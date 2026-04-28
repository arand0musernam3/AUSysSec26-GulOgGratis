package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x8 extends k1 {
    private static final x8 zzh;
    private static volatile h2 zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private h8 zzg;

    static {
        x8 x8Var = new x8();
        zzh = x8Var;
        k1.o(x8.class, x8Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new x8();
        }
        if (i12 == 4) {
            return new k7(zzh);
        }
        if (i12 == 5) {
            return zzh;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzi;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (x8.class) {
            try {
                j1Var = zzi;
                if (j1Var == null) {
                    j1Var = new j1(zzh);
                    zzi = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }
}
