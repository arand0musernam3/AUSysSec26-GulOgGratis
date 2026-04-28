package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p9 extends k1 {
    private static final p9 zzk;
    private static volatile h2 zzl;
    private int zzb;
    private int zze;
    private t1 zzf = k2.f11555e;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        p9 p9Var = new p9();
        zzk = p9Var;
        k1.o(p9.class, p9Var);
    }

    public final double A() {
        return this.zzj;
    }

    public final int B() {
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
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", k0.f11552p, "zzf", p9.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new p9();
        }
        if (i12 == 4) {
            return new k7(zzk);
        }
        if (i12 == 5) {
            return zzk;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzl;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (p9.class) {
            try {
                j1Var = zzl;
                if (j1Var == null) {
                    j1Var = new j1(zzk);
                    zzl = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final List t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final String w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zzb & 16) != 0;
    }
}
