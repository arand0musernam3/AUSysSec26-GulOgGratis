package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ub extends k1 {
    private static final ub zzg;
    private static volatile h2 zzh;
    private int zzb;
    private qb zze;
    private rb zzf;

    static {
        ub ubVar = new ub();
        zzg = ubVar;
        k1.o(ub.class, ubVar);
    }

    public static ub v(byte[] bArr, c1 c1Var) {
        return (ub) k1.e(zzg, bArr, c1Var);
    }

    public static tb w() {
        return (tb) zzg.j();
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new ub();
        }
        if (i12 == 4) {
            return new tb(zzg);
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
        synchronized (ub.class) {
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

    public final qb t() {
        qb qbVar = this.zze;
        return qbVar == null ? qb.H() : qbVar;
    }

    public final rb u() {
        rb rbVar = this.zzf;
        return rbVar == null ? rb.t() : rbVar;
    }

    public final /* synthetic */ void x(qb qbVar) {
        this.zze = qbVar;
        this.zzb |= 1;
    }
}
