package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t8 extends k1 {
    private static final t8 zzm;
    private static volatile h2 zzn;
    private int zzb;
    private t1 zze = k2.f11555e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        t8 t8Var = new t8();
        zzm = t8Var;
        k1.o(t8.class, t8Var);
    }

    public static s8 J() {
        return (s8) zzm.j();
    }

    public final long A() {
        return this.zzg;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final int E() {
        return this.zzi;
    }

    public final boolean F() {
        return (this.zzb & 32) != 0;
    }

    public final long G() {
        return this.zzk;
    }

    public final boolean H() {
        return (this.zzb & 64) != 0;
    }

    public final long I() {
        return this.zzl;
    }

    public final /* synthetic */ void K(int i11, w8 w8Var) {
        u();
        this.zze.set(i11, w8Var);
    }

    public final /* synthetic */ void L(w8 w8Var) {
        w8Var.getClass();
        u();
        this.zze.add(w8Var);
    }

    public final /* synthetic */ void M(Iterable iterable) {
        u();
        n0.d(iterable, this.zze);
    }

    public final void N() {
        this.zze = k2.f11555e;
    }

    public final /* synthetic */ void O(int i11) {
        u();
        this.zze.remove(i11);
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void Q(long j9) {
        this.zzb |= 2;
        this.zzg = j9;
    }

    public final /* synthetic */ void R(long j9) {
        this.zzb |= 4;
        this.zzh = j9;
    }

    public final /* synthetic */ void S(long j9) {
        this.zzb |= 16;
        this.zzj = j9;
    }

    public final /* synthetic */ void T(long j9) {
        this.zzb |= 32;
        this.zzk = j9;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", w8.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i12 == 3) {
            return new t8();
        }
        if (i12 == 4) {
            return new s8(zzm);
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
        synchronized (t8.class) {
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

    public final /* synthetic */ void t(long j9) {
        this.zzb |= 64;
        this.zzl = j9;
    }

    public final void u() {
        t1 t1Var = this.zze;
        if (((o0) t1Var).f11682a) {
            return;
        }
        this.zze = b3.i.h(t1Var);
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return this.zze.size();
    }

    public final w8 x(int i11) {
        return (w8) this.zze.get(i11);
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
