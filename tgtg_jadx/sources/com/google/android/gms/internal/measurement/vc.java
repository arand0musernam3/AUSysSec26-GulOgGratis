package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class vc extends k1 {
    private static final vc zzl;
    private static volatile h2 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private t1 zzg = k2.f11555e;

    static {
        vc vcVar = new vc();
        zzl = vcVar;
        k1.o(vc.class, vcVar);
    }

    public static vc v(InputStream inputStream, c1 c1Var) throws zzaeh {
        vc vcVar = zzl;
        x0 x0VarH = x0.h(inputStream, 4096);
        k1 k1VarI = vcVar.i();
        try {
            m2 m2VarA = j2.f11503c.a(k1VarI.getClass());
            a60.s sVar = x0VarH.f12023c;
            if (sVar == null) {
                sVar = new a60.s(x0VarH);
            }
            m2VarA.c(k1VarI, sVar, c1Var);
            m2VarA.f(k1VarI);
            k1.r(k1VarI);
            return (vc) k1VarI;
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
            return new l2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", k0.f11539b, "zzi", "zzk", "zzj"});
        }
        if (i12 == 3) {
            return new vc();
        }
        if (i12 == 4) {
            return new k7(zzl);
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
        synchronized (vc.class) {
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
        return this.zzf;
    }
}
