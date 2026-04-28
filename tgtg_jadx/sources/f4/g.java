package f4;

import b4.t;
import i4.g0;
import i4.h0;
import i4.v0;
import i4.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final t a(t tVar, float f11) {
        return f11 == 1.0f ? tVar : g0.r(tVar, 0.0f, 0.0f, f11, 0.0f, 0L, null, 520187);
    }

    public static final t b(t tVar, v0 v0Var) {
        return g0.r(tVar, 0.0f, 0.0f, 0.0f, 0.0f, 0L, v0Var, 518143);
    }

    public static final t c(t tVar) {
        return g0.r(tVar, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, 520191);
    }

    public static final t d(t tVar, Function1 function1) {
        return tVar.then(new e(function1));
    }

    public static final t e(t tVar, Function1 function1) {
        return tVar.then(new h(function1));
    }

    public static final t f(t tVar, Function1 function1) {
        return tVar.then(new i(function1));
    }

    public static final t g(t tVar, v0 v0Var, o4.d dVar) {
        return tVar.then(new p(v0Var, dVar));
    }

    public static t h(t tVar, n4.b bVar, b4.f fVar, z4.m mVar, float f11, w wVar, int i11) {
        if ((i11 & 4) != 0) {
            fVar = b4.d.f5687e;
        }
        b4.f fVar2 = fVar;
        if ((i11 & 16) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i11 & 32) != 0) {
            wVar = null;
        }
        return tVar.then(new l(bVar, fVar2, mVar, f12, wVar));
    }

    public static final t i(t tVar, float f11) {
        return f11 == 0.0f ? tVar : g0.r(tVar, 0.0f, 0.0f, 0.0f, f11, 0L, null, 524031);
    }

    public static final t j(t tVar, float f11, float f12) {
        return (f11 == 1.0f && f12 == 1.0f) ? tVar : g0.r(tVar, f11, f12, 0.0f, 0.0f, 0L, null, 524284);
    }

    public static t k(t tVar, float f11, v0 v0Var, boolean z11, long j9, long j11, int i11) {
        if ((i11 & 2) != 0) {
            v0Var = g0.f23254b;
        }
        v0 v0Var2 = v0Var;
        if ((i11 & 4) != 0) {
            z11 = z5.f.a(f11, (float) 0) > 0;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            j9 = h0.f23262a;
        }
        return (z5.f.a(f11, (float) 0) > 0 || z12) ? tVar.then(new o(f11, v0Var2, z12, j9, (i11 & 16) != 0 ? h0.f23262a : j11)) : tVar;
    }
}
