package g3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18299a = 280;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18300b = 560;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m3.e0 f18301c;

    static {
        float f11 = 24;
        d2.c.b(f11);
        float f12 = 16;
        d2.c.e(0.0f, 0.0f, 0.0f, f12, 7);
        d2.c.e(0.0f, 0.0f, 0.0f, f12, 7);
        d2.c.e(0.0f, 0.0f, 0.0f, f11, 7);
        f18301c = new m3.e0(new fw.b(10));
    }

    public static final void a(Function0 function0, b4.t tVar, d6.a0 a0Var, u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(24925658);
        int i12 = i11 | 48;
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            ((w0) sVar.j(f18301c)).a(new a8.h(function0, a0Var, dVar), sVar, 0);
            tVar = b4.q.f5711a;
        } else {
            sVar.U();
        }
        b4.t tVar2 = tVar;
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(function0, tVar2, i11, a0Var, dVar, 10);
        }
    }
}
