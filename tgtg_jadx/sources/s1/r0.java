package s1;

import com.app.tgtg.model.local.AppConstants;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t1.u1;
import t1.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f38669a = new v1(c.f38540m, c.f38541n);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.b1 f38670b = t1.c.j(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.b1 f38671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.b1 f38672d;

    static {
        t1.c.j(0.0f, 400.0f, null, 5);
        long j9 = 1;
        long j11 = (j9 & 4294967295L) | (j9 << 32);
        f38671c = t1.c.j(0.0f, 400.0f, new z5.j(j11), 1);
        f38672d = t1.c.j(0.0f, 400.0f, new z5.l(j11), 1);
    }

    public static x0 a(t1.b1 b1Var, b4.i iVar, int i11) {
        b4.i iVar2 = b4.d.f5696o;
        if ((i11 & 1) != 0) {
            long j9 = 1;
            b1Var = t1.c.j(0.0f, 400.0f, new z5.l((j9 & 4294967295L) | (j9 << 32)), 1);
        }
        if ((i11 & 2) != 0) {
            iVar = iVar2;
        }
        return b(b1Var, Intrinsics.areEqual(iVar, b4.d.f5694m) ? b4.d.f5686d : Intrinsics.areEqual(iVar, iVar2) ? b4.d.f5688f : b4.d.f5687e, new q0(c.f38543p, 0));
    }

    public static final x0 b(t1.x xVar, b4.k kVar, Function1 function1) {
        return new x0(new l1((z0) null, (j1) null, new c0(kVar, function1, xVar), (c1) null, (LinkedHashMap) null, AppConstants.RESULT_CODE_ORDER_CANCELLED));
    }

    public static x0 c(u1 u1Var, int i11) {
        b4.j jVar = b4.d.l;
        b4.j jVar2 = b4.d.f5692j;
        t1.x xVarJ = u1Var;
        if ((i11 & 1) != 0) {
            long j9 = 1;
            xVarJ = t1.c.j(0.0f, 400.0f, new z5.l((j9 & 4294967295L) | (j9 << 32)), 1);
        }
        b4.j jVar3 = (i11 & 2) != 0 ? jVar : jVar2;
        return b(xVarJ, Intrinsics.areEqual(jVar3, jVar2) ? b4.d.f5684b : Intrinsics.areEqual(jVar3, jVar) ? b4.d.f5690h : b4.d.f5687e, new q0(c.f38545r, 1));
    }

    public static x0 d(t1.x xVar, int i11) {
        if ((i11 & 1) != 0) {
            xVar = t1.c.j(0.0f, 400.0f, null, 5);
        }
        return new x0(new l1(new z0(0.0f, xVar), (j1) null, (c0) null, (c1) null, (LinkedHashMap) null, 126));
    }

    public static y0 e(t1.x xVar, int i11) {
        if ((i11 & 1) != 0) {
            xVar = t1.c.j(0.0f, 400.0f, null, 5);
        }
        return new y0(new l1(new z0(0.0f, xVar), (j1) null, (c0) null, (c1) null, (LinkedHashMap) null, 126));
    }

    public static x0 f(t1.x xVar, float f11, int i11) {
        if ((i11 & 1) != 0) {
            xVar = t1.c.j(0.0f, 400.0f, null, 5);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return new x0(new l1((z0) null, (j1) null, (c0) null, new c1(f11, i4.z0.f23335b, xVar), (LinkedHashMap) null, 119));
    }

    public static y0 g(u1 u1Var, float f11, int i11) {
        t1.x xVarJ = u1Var;
        if ((i11 & 1) != 0) {
            xVarJ = t1.c.j(0.0f, 400.0f, null, 5);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return new y0(new l1((z0) null, (j1) null, (c0) null, new c1(f11, i4.z0.f23335b, xVarJ), (LinkedHashMap) null, 119));
    }

    public static y0 h(t1.b1 b1Var, b4.i iVar, int i11) {
        b4.i iVar2 = b4.d.f5696o;
        if ((i11 & 1) != 0) {
            long j9 = 1;
            b1Var = t1.c.j(0.0f, 400.0f, new z5.l((j9 & 4294967295L) | (j9 << 32)), 1);
        }
        if ((i11 & 2) != 0) {
            iVar = iVar2;
        }
        return i(Intrinsics.areEqual(iVar, b4.d.f5694m) ? b4.d.f5686d : Intrinsics.areEqual(iVar, iVar2) ? b4.d.f5688f : b4.d.f5687e, new q0(c.f38546s, 2), b1Var);
    }

    public static final y0 i(b4.f fVar, Function1 function1, t1.x xVar) {
        return new y0(new l1((z0) null, (j1) null, new c0(fVar, function1, xVar), (c1) null, (LinkedHashMap) null, AppConstants.RESULT_CODE_ORDER_CANCELLED));
    }

    public static y0 j(u1 u1Var, int i11) {
        b4.j jVar = b4.d.l;
        b4.j jVar2 = b4.d.f5692j;
        t1.x xVarJ = u1Var;
        if ((i11 & 1) != 0) {
            long j9 = 1;
            xVarJ = t1.c.j(0.0f, 400.0f, new z5.l((j9 & 4294967295L) | (j9 << 32)), 1);
        }
        b4.j jVar3 = (i11 & 2) != 0 ? jVar : jVar2;
        return i(Intrinsics.areEqual(jVar3, jVar2) ? b4.d.f5684b : Intrinsics.areEqual(jVar3, jVar) ? b4.d.f5690h : b4.d.f5687e, new q0(c.f38548u, 3), xVarJ);
    }

    public static final x0 k(Function1 function1, t1.x xVar) {
        return new x0(new l1((z0) null, new j1(new q0(function1, 4), xVar), (c0) null, (c1) null, (LinkedHashMap) null, 125));
    }

    public static x0 l(int i11, Function1 function1) {
        long j9 = 1;
        t1.b1 b1VarJ = t1.c.j(0.0f, 400.0f, new z5.j((j9 & 4294967295L) | (j9 << 32)), 1);
        if ((i11 & 2) != 0) {
            function1 = c.f38549v;
        }
        return k(function1, b1VarJ);
    }

    public static final x0 m(Function1 function1, t1.x xVar) {
        return new x0(new l1((z0) null, new j1(new q0(function1, 5), xVar), (c0) null, (c1) null, (LinkedHashMap) null, 125));
    }

    public static x0 n(Function1 function1) {
        long j9 = 1;
        return m(function1, t1.c.j(0.0f, 400.0f, new z5.j((j9 & 4294967295L) | (j9 << 32)), 1));
    }

    public static y0 o(int i11, Function1 function1) {
        long j9 = 1;
        t1.b1 b1VarJ = t1.c.j(0.0f, 400.0f, new z5.j((j9 & 4294967295L) | (j9 << 32)), 1);
        if ((i11 & 2) != 0) {
            function1 = c.f38550w;
        }
        return new y0(new l1((z0) null, new j1(new q0(function1, 7), b1VarJ), (c0) null, (c1) null, (LinkedHashMap) null, 125));
    }
}
