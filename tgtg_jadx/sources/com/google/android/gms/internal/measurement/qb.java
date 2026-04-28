package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class qb extends k1 {
    private static final p1 zzl = new h1(14);
    private static final qb zzq;
    private static volatile h2 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private t1 zzi;
    private t1 zzj;
    private o1 zzk;
    private sb zzm;
    private boolean zzn;
    private boolean zzo;
    private ob zzp;
    private u0 zze = u0.f11915b;
    private String zzg = "";

    static {
        qb qbVar = new qb();
        zzq = qbVar;
        k1.o(qb.class, qbVar);
    }

    public qb() {
        k2 k2Var = k2.f11555e;
        this.zzi = k2Var;
        this.zzj = k2Var;
        this.zzk = l1.f11581e;
    }

    public static pb G() {
        return (pb) zzq.j();
    }

    public static qb H() {
        return zzq;
    }

    public final List A() {
        return new q1(this.zzk, zzl);
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final sb C() {
        sb sbVar = this.zzm;
        return sbVar == null ? sb.v() : sbVar;
    }

    public final boolean D() {
        return this.zzn;
    }

    public final boolean E() {
        return this.zzo;
    }

    public final ob F() {
        ob obVar = this.zzp;
        return obVar == null ? ob.u() : obVar;
    }

    public final /* synthetic */ void I(long j9) {
        this.zzb |= 8;
        this.zzh = j9;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", k0.f11539b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i12 == 3) {
            return new qb();
        }
        if (i12 == 4) {
            return new pb(zzq);
        }
        if (i12 == 5) {
            return zzq;
        }
        if (i12 != 6) {
            throw null;
        }
        h2 h2Var = zzr;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (qb.class) {
            try {
                j1Var = zzr;
                if (j1Var == null) {
                    j1Var = new j1(zzq);
                    zzr = j1Var;
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

    public final u0 u() {
        return this.zze;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final t1 y() {
        return this.zzi;
    }

    public final t1 z() {
        return this.zzj;
    }
}
