package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g9 extends k1 {
    private static final g9 zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private s1 zzf = x1.f12025e;

    static {
        g9 g9Var = new g9();
        zzg = g9Var;
        k1.o(g9.class, g9Var);
    }

    public static f9 y() {
        return (f9) zzg.j();
    }

    public final void A(List list) {
        RandomAccess randomAccess = this.zzf;
        if (!((o0) randomAccess).f11682a) {
            x1 x1Var = (x1) randomAccess;
            int i11 = x1Var.f12027c;
            this.zzf = x1Var.k(i11 + i11);
        }
        n0.d(list, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new g9();
        }
        if (i12 == 4) {
            return new f9(zzg);
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
        synchronized (g9.class) {
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

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final int u() {
        return this.zze;
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return ((x1) this.zzf).size();
    }

    public final long x(int i11) {
        return ((x1) this.zzf).c(i11);
    }

    public final /* synthetic */ void z(int i11) {
        this.zzb |= 1;
        this.zze = i11;
    }
}
