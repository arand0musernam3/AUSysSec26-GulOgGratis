package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ob extends k1 {
    private static final ob zzf;
    private static volatile h2 zzg;
    private int zzb;
    private boolean zze;

    static {
        ob obVar = new ob();
        zzf = obVar;
        k1.o(ob.class, obVar);
    }

    public static ob u() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i12 == 3) {
            return new ob();
        }
        if (i12 == 4) {
            return new k7(zzf);
        }
        if (i12 == 5) {
            return zzf;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzg;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (ob.class) {
            try {
                j1Var = zzg;
                if (j1Var == null) {
                    j1Var = new j1(zzf);
                    zzg = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final boolean t() {
        return this.zze;
    }
}
