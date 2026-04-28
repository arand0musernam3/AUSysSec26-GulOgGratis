package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j8 extends k1 {
    private static final j8 zzl;
    private static volatile h2 zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        j8 j8Var = new j8();
        zzl = j8Var;
        k1.o(j8.class, j8Var);
    }

    public static i8 A() {
        return (i8) zzl.j();
    }

    public static j8 B() {
        return zzl;
    }

    public final /* synthetic */ void C(boolean z11) {
        this.zzb |= 1;
        this.zze = z11;
    }

    public final /* synthetic */ void D(boolean z11) {
        this.zzb |= 2;
        this.zzf = z11;
    }

    public final /* synthetic */ void E(boolean z11) {
        this.zzb |= 4;
        this.zzg = z11;
    }

    public final /* synthetic */ void F(boolean z11) {
        this.zzb |= 8;
        this.zzh = z11;
    }

    public final /* synthetic */ void G(boolean z11) {
        this.zzb |= 16;
        this.zzi = z11;
    }

    public final /* synthetic */ void H(boolean z11) {
        this.zzb |= 32;
        this.zzj = z11;
    }

    public final /* synthetic */ void I(boolean z11) {
        this.zzb |= 64;
        this.zzk = z11;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new j8();
        }
        if (i12 == 4) {
            return new i8(zzl);
        }
        if (i12 == 5) {
            return zzl;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzm;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (j8.class) {
            try {
                j1Var = zzm;
                if (j1Var == null) {
                    j1Var = new j1(zzl);
                    zzm = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final boolean t() {
        return this.zze;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return this.zzk;
    }
}
