package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l9 extends k1 {
    private static final l9 zzk;
    private static volatile h2 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        l9 l9Var = new l9();
        zzk = l9Var;
        k1.o(l9.class, l9Var);
    }

    public static k9 E() {
        return (k9) zzk.j();
    }

    public final boolean A() {
        return (this.zzb & 16) != 0;
    }

    public final float B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zzb & 32) != 0;
    }

    public final double D() {
        return this.zzj;
    }

    public final /* synthetic */ void F(long j9) {
        this.zzb |= 1;
        this.zze = j9;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void J(long j9) {
        this.zzb |= 8;
        this.zzh = j9;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void L(double d3) {
        this.zzb |= 32;
        this.zzj = d3;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new l9();
        }
        if (i12 == 4) {
            return new k9(zzk);
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
        synchronized (l9.class) {
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

    public final long u() {
        return this.zze;
    }

    public final String v() {
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

    public final long z() {
        return this.zzh;
    }
}
