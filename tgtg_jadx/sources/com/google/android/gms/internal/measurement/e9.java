package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e9 extends k1 {
    private static final e9 zzh;
    private static volatile h2 zzi;
    private s1 zzb;
    private s1 zze;
    private t1 zzf;
    private t1 zzg;

    static {
        e9 e9Var = new e9();
        zzh = e9Var;
        k1.o(e9.class, e9Var);
    }

    public e9() {
        x1 x1Var = x1.f12025e;
        this.zzb = x1Var;
        this.zze = x1Var;
        k2 k2Var = k2.f11555e;
        this.zzf = k2Var;
        this.zzg = k2Var;
    }

    public static d9 B() {
        return (d9) zzh.j();
    }

    public static e9 C() {
        return zzh;
    }

    public final int A() {
        return this.zzg.size();
    }

    public final void D(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((o0) randomAccess).f11682a) {
            x1 x1Var = (x1) randomAccess;
            int i11 = x1Var.f12027c;
            this.zzb = x1Var.k(i11 + i11);
        }
        n0.d(iterable, this.zzb);
    }

    public final void E() {
        this.zzb = x1.f12025e;
    }

    public final void F(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((o0) randomAccess).f11682a) {
            x1 x1Var = (x1) randomAccess;
            int i11 = x1Var.f12027c;
            this.zze = x1Var.k(i11 + i11);
        }
        n0.d(list, this.zze);
    }

    public final void G() {
        this.zze = x1.f12025e;
    }

    public final void H(ArrayList arrayList) {
        t1 t1Var = this.zzf;
        if (!((o0) t1Var).f11682a) {
            this.zzf = b3.i.h(t1Var);
        }
        n0.d(arrayList, this.zzf);
    }

    public final void I() {
        this.zzf = k2.f11555e;
    }

    public final void J(Iterable iterable) {
        t1 t1Var = this.zzg;
        if (!((o0) t1Var).f11682a) {
            this.zzg = b3.i.h(t1Var);
        }
        n0.d(iterable, this.zzg);
    }

    public final void K() {
        this.zzg = k2.f11555e;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", r8.class, "zzg", g9.class});
        }
        if (i12 == 3) {
            return new e9();
        }
        if (i12 == 4) {
            return new d9(zzh);
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
        synchronized (e9.class) {
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

    public final List t() {
        return this.zzb;
    }

    public final int u() {
        return ((x1) this.zzb).size();
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return ((x1) this.zze).size();
    }

    public final t1 x() {
        return this.zzf;
    }

    public final int y() {
        return this.zzf.size();
    }

    public final t1 z() {
        return this.zzg;
    }
}
