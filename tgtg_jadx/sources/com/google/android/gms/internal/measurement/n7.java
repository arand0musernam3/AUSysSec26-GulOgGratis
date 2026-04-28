package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n7 extends k1 {
    private static final n7 zzk;
    private static volatile h2 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private j7 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        n7 n7Var = new n7();
        zzk = n7Var;
        k1.o(n7.class, n7Var);
    }

    public static m7 B() {
        return (m7) zzk.j();
    }

    public final boolean A() {
        return this.zzj;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new n7();
        }
        if (i12 == 4) {
            return new m7(zzk);
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
        synchronized (n7.class) {
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

    public final int u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }

    public final j7 w() {
        j7 j7Var = this.zzg;
        return j7Var == null ? j7.B() : j7Var;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zzb & 32) != 0;
    }
}
