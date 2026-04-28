package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s7 extends k1 {
    private static final s7 zzj;
    private static volatile h2 zzk;
    private int zzb;
    private t1 zze;
    private t1 zzf;
    private t1 zzg;
    private boolean zzh;
    private t1 zzi;

    static {
        s7 s7Var = new s7();
        zzj = s7Var;
        k1.o(s7.class, s7Var);
    }

    public s7() {
        k2 k2Var = k2.f11555e;
        this.zze = k2Var;
        this.zzf = k2Var;
        this.zzg = k2Var;
        this.zzi = k2Var;
    }

    public static s7 z() {
        return zzj;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", p7.class, "zzf", q7.class, "zzg", r7.class, "zzh", "zzi", p7.class});
        }
        if (i12 == 3) {
            return new s7();
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
        synchronized (s7.class) {
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

    public final List t() {
        return this.zze;
    }

    public final List u() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 1) != 0;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final t1 y() {
        return this.zzi;
    }
}
