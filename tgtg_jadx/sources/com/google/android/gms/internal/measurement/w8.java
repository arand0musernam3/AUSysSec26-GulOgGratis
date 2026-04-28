package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w8 extends k1 {
    private static final w8 zzk;
    private static volatile h2 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private t1 zzj = k2.f11555e;

    static {
        w8 w8Var = new w8();
        zzk = w8Var;
        k1.o(w8.class, w8Var);
    }

    public static v8 F() {
        return (v8) zzk.j();
    }

    public final float A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final double C() {
        return this.zzi;
    }

    public final t1 D() {
        return this.zzj;
    }

    public final int E() {
        return this.zzj.size();
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void J(long j9) {
        this.zzb |= 4;
        this.zzg = j9;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void L(double d3) {
        this.zzb |= 16;
        this.zzi = d3;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void N(w8 w8Var) {
        t1 t1Var = this.zzj;
        if (!((o0) t1Var).f11682a) {
            this.zzj = b3.i.h(t1Var);
        }
        this.zzj.add(w8Var);
    }

    public final void O(ArrayList arrayList) {
        t1 t1Var = this.zzj;
        if (!((o0) t1Var).f11682a) {
            this.zzj = b3.i.h(t1Var);
        }
        n0.d(arrayList, this.zzj);
    }

    public final void P() {
        this.zzj = k2.f11555e;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", w8.class});
        }
        if (i12 == 3) {
            return new w8();
        }
        if (i12 == 4) {
            return new v8(zzk);
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
        synchronized (w8.class) {
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

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
