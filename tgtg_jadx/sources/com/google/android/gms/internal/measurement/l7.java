package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l7 extends k1 {
    private static final l7 zzj;
    private static volatile h2 zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        l7 l7Var = new l7();
        zzj = l7Var;
        k1.o(l7.class, l7Var);
    }

    public static l7 C() {
        return zzj;
    }

    public final boolean A() {
        return (this.zzb & 16) != 0;
    }

    public final String B() {
        return this.zzi;
    }

    public final int D() {
        int i11;
        int i12 = this.zze;
        if (i12 != 0) {
            i11 = 2;
            if (i12 != 1) {
                if (i12 != 2) {
                    i11 = 4;
                    if (i12 != 3) {
                        i11 = i12 != 4 ? 0 : 5;
                    }
                } else {
                    i11 = 3;
                }
            }
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", k0.f11540c, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new l7();
        }
        if (i12 == 4) {
            return new k7(zzj);
        }
        if (i12 == 5) {
            return zzj;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzk;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (l7.class) {
            try {
                j1Var = zzk;
                if (j1Var == null) {
                    j1Var = new j1(zzj);
                    zzk = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final String x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final String z() {
        return this.zzh;
    }
}
