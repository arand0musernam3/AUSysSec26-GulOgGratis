package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ld extends k1 {
    private static final ld zzj;
    private static volatile h2 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private u0 zzf = u0.f11915b;
    private String zzg = "";
    private t1 zzi = k2.f11555e;

    static {
        ld ldVar = new ld();
        zzj = ldVar;
        k1.o(ld.class, ldVar);
    }

    public static ld A() {
        return zzj;
    }

    public static kd z() {
        return (kd) zzj.j();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(u0 u0Var) {
        u0Var.getClass();
        this.zzb |= 2;
        this.zzf = u0Var;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void E(long j9) {
        this.zzb |= 8;
        this.zzh = j9;
    }

    public final void F(nd ndVar) {
        t1 t1Var = this.zzi;
        if (!((o0) t1Var).f11682a) {
            this.zzi = b3.i.h(t1Var);
        }
        this.zzi.add(ndVar);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", nd.class});
        }
        if (i12 == 3) {
            return new ld();
        }
        if (i12 == 4) {
            return new kd(zzj);
        }
        if (i12 == 5) {
            return zzj;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzk;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (ld.class) {
            try {
                j1Var = zzk;
                if (j1Var == null) {
                    j1Var = new j1(zzj);
                    zzk = j1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public final String t() {
        return this.zze;
    }

    public final u0 u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final long w() {
        return this.zzh;
    }

    public final t1 x() {
        return this.zzi;
    }

    public final int y() {
        return this.zzi.size();
    }
}
