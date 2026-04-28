package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class bb extends k1 {
    private static final bb zzl;
    private static volatile h2 zzm;
    private int zzb;
    private String zze = "";
    private u0 zzf = u0.f11915b;
    private String zzg = "";
    private t1 zzh;
    private t1 zzi;
    private boolean zzj;
    private long zzk;

    static {
        bb bbVar = new bb();
        zzl = bbVar;
        k1.o(bb.class, bbVar);
    }

    public bb() {
        k2 k2Var = k2.f11555e;
        this.zzh = k2Var;
        this.zzi = k2Var;
    }

    public static ab z() {
        return (ab) zzl.j();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void B(t0 t0Var) {
        t0Var.getClass();
        this.zzb |= 2;
        this.zzf = t0Var;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void D(db dbVar) {
        t1 t1Var = this.zzh;
        if (!((o0) t1Var).f11682a) {
            this.zzh = b3.i.h(t1Var);
        }
        this.zzh.add(dbVar);
    }

    public final void E(String str) {
        str.getClass();
        t1 t1Var = this.zzi;
        if (!((o0) t1Var).f11682a) {
            this.zzi = b3.i.h(t1Var);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void F(boolean z11) {
        this.zzb |= 8;
        this.zzj = z11;
    }

    public final /* synthetic */ void G(long j9) {
        this.zzb |= 16;
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
            return new l2(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", db.class, "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new bb();
        }
        if (i12 == 4) {
            return new ab(zzl);
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
        synchronized (bb.class) {
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

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final u0 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final t1 x() {
        return this.zzh;
    }

    public final long y() {
        return this.zzk;
    }
}
