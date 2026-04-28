package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x7 extends k1 {
    private static final x7 zzw;
    private static volatile h2 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private t1 zzh;
    private t1 zzi;
    private t1 zzj;
    private String zzk;
    private boolean zzl;
    private t1 zzm;
    private t1 zzn;
    private String zzo;
    private String zzp;
    private s7 zzq;
    private z7 zzr;
    private c8 zzs;
    private a8 zzt;
    private y7 zzu;
    private o1 zzv;

    static {
        x7 x7Var = new x7();
        zzw = x7Var;
        k1.o(x7.class, x7Var);
    }

    public x7() {
        k2 k2Var = k2.f11555e;
        this.zzh = k2Var;
        this.zzi = k2Var;
        this.zzj = k2Var;
        this.zzk = "";
        this.zzm = k2Var;
        this.zzn = k2Var;
        this.zzo = "";
        this.zzp = "";
        this.zzv = l1.f11581e;
    }

    public static w7 K() {
        return (w7) zzw.j();
    }

    public static x7 L() {
        return zzw;
    }

    public final List A() {
        return this.zzj;
    }

    public final t1 B() {
        return this.zzm;
    }

    public final int C() {
        return this.zzm.size();
    }

    public final t1 D() {
        return this.zzn;
    }

    public final String E() {
        return this.zzo;
    }

    public final boolean F() {
        return (this.zzb & 128) != 0;
    }

    public final s7 G() {
        s7 s7Var = this.zzq;
        return s7Var == null ? s7.z() : s7Var;
    }

    public final boolean H() {
        return (this.zzb & 512) != 0;
    }

    public final c8 I() {
        c8 c8Var = this.zzs;
        return c8Var == null ? c8.v() : c8Var;
    }

    public final o1 J() {
        return this.zzv;
    }

    public final void M(int i11, v7 v7Var) {
        t1 t1Var = this.zzi;
        if (!((o0) t1Var).f11682a) {
            this.zzi = b3.i.h(t1Var);
        }
        this.zzi.set(i11, v7Var);
    }

    public final void N() {
        this.zzj = k2.f11555e;
    }

    public final void O() {
        this.zzm = k2.f11555e;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", b8.class, "zzi", v7.class, "zzj", f7.class, "zzk", "zzl", "zzm", o9.class, "zzn", t7.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i12 == 3) {
            return new x7();
        }
        if (i12 == 4) {
            return new w7(zzw);
        }
        if (i12 == 5) {
            return zzw;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzx;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (x7.class) {
            try {
                j1Var = zzx;
                if (j1Var == null) {
                    j1Var = new j1(zzw);
                    zzx = j1Var;
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

    public final long u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final t1 x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzi.size();
    }

    public final v7 z(int i11) {
        return (v7) this.zzi.get(i11);
    }
}
