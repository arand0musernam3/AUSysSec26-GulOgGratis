package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r8 extends k1 {
    private static final r8 zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        r8 r8Var = new r8();
        zzg = r8Var;
        k1.o(r8.class, r8Var);
    }

    public static q8 x() {
        return (q8) zzg.j();
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new r8();
        }
        if (i12 == 4) {
            return new q8(zzg);
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
        synchronized (r8.class) {
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

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final long w() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i11) {
        this.zzb |= 1;
        this.zze = i11;
    }

    public final /* synthetic */ void z(long j9) {
        this.zzb |= 2;
        this.zzf = j9;
    }
}
