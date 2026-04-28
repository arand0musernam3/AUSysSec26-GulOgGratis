package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q7 extends k1 {
    private static final q7 zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        q7 q7Var = new q7();
        zzg = q7Var;
        k1.o(q7.class, q7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            k0 k0Var = k0.f11543f;
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", k0Var, "zzf", k0Var});
        }
        if (i12 == 3) {
            return new q7();
        }
        if (i12 == 4) {
            return new k7(zzg);
        }
        if (i12 == 5) {
            return zzg;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzh;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (q7.class) {
            try {
                j1Var = zzh;
                if (j1Var == null) {
                    j1Var = new j1(zzg);
                    zzh = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final int t() {
        int iA = g1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int u() {
        int iA = g1.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
