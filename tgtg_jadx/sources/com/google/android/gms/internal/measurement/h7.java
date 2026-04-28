package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h7 extends k1 {
    private static final h7 zzm;
    private static volatile h2 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private t1 zzg = k2.f11555e;
    private boolean zzh;
    private l7 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        h7 h7Var = new h7();
        zzm = h7Var;
        k1.o(h7.class, h7Var);
    }

    public static g7 F() {
        return (g7) zzm.j();
    }

    public final l7 A() {
        l7 l7Var = this.zzi;
        return l7Var == null ? l7.C() : l7Var;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        return (this.zzb & 64) != 0;
    }

    public final boolean E() {
        return this.zzl;
    }

    public final /* synthetic */ void G(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void H(int i11, j7 j7Var) {
        t1 t1Var = this.zzg;
        if (!((o0) t1Var).f11682a) {
            this.zzg = b3.i.h(t1Var);
        }
        this.zzg.set(i11, j7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", j7.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i12 == 3) {
            return new h7();
        }
        if (i12 == 4) {
            return new g7(zzm);
        }
        if (i12 == 5) {
            return zzm;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzn;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (h7.class) {
            try {
                j1Var = zzn;
                if (j1Var == null) {
                    j1Var = new j1(zzm);
                    zzn = j1Var;
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

    public final String v() {
        return this.zzf;
    }

    public final List w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final j7 y(int i11) {
        return (j7) this.zzg.get(i11);
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
