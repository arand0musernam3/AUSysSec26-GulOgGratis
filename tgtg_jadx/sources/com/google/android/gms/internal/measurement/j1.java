package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f11502a;

    static {
        c1 c1Var = c1.f11297a;
        int i11 = p0.f11740a;
    }

    public j1(k1 k1Var) {
        this.f11502a = k1Var;
    }

    public final k1 a(InputStream inputStream, c1 c1Var) throws zzaeh {
        x0 x0VarH = x0.h(inputStream, 4096);
        int i11 = k1.zzd;
        k1 k1VarI = this.f11502a.i();
        try {
            m2 m2VarA = j2.f11503c.a(k1VarI.getClass());
            a60.s sVar = x0VarH.f12023c;
            if (sVar == null) {
                sVar = new a60.s(x0VarH);
            }
            m2VarA.c(k1VarI, sVar, c1Var);
            m2VarA.f(k1VarI);
            x0VarH.m(0);
            if (k1.q(k1VarI, true)) {
                return k1VarI;
            }
            throw new zzafy().a();
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
}
