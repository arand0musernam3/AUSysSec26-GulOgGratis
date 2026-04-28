package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p7 extends k1 {
    private static final p7 zzh;
    private static volatile h2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        p7 p7Var = new p7();
        zzh = p7Var;
        k1.o(p7.class, p7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", k0.f11543f, "zzf", k0.f11542e, "zzg", k0.f11544g});
        }
        if (i12 == 3) {
            return new p7();
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
        synchronized (p7.class) {
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

    public final int t() {
        int iA = g1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int u() {
        int i11;
        int i12 = this.zzf;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                i11 = i12 != 2 ? 0 : 3;
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int v() {
        int i11;
        int i12 = this.zzg;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                i11 = i12 != 2 ? 0 : 3;
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
