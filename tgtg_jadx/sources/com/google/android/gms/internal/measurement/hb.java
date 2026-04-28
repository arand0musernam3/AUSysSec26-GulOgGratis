package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class hb extends k1 {
    private static final hb zzj;
    private static volatile h2 zzk;
    private int zzb;
    private long zzh;
    private z1 zzi = z1.f12078b;
    private String zze = "";
    private u0 zzf = u0.f11915b;
    private String zzg = "";

    static {
        hb hbVar = new hb();
        zzj = hbVar;
        k1.o(hb.class, hbVar);
    }

    public static hb A() {
        return zzj;
    }

    public static hb z(x0 x0Var, c1 c1Var) throws zzaeh {
        k1 k1VarI = zzj.i();
        try {
            m2 m2VarA = j2.f11503c.a(k1VarI.getClass());
            a60.s sVar = x0Var.f12023c;
            if (sVar == null) {
                sVar = new a60.s(x0Var);
            }
            m2VarA.c(k1VarI, sVar, c1Var);
            m2VarA.f(k1VarI);
            k1.r(k1VarI);
            return (hb) k1VarI;
        } catch (zzaeh e5) {
            if (e5.f12098a) {
                throw new zzaeh(e5.getMessage(), e5);
            }
            throw e5;
        } catch (zzafy e11) {
            throw e11.a();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaeh) {
                throw ((zzaeh) e12.getCause());
            }
            throw new zzaeh(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaeh) {
                throw ((zzaeh) e13.getCause());
            }
            throw e13;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i11) {
        h2 j1Var;
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", gb.f11434a});
        }
        if (i12 == 3) {
            return new hb();
        }
        if (i12 == 4) {
            return new k7(zzj);
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
        synchronized (hb.class) {
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

    public final int x() {
        return this.zzi.size();
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
