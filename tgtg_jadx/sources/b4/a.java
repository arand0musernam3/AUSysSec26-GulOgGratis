package b4;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5676a = new h(-1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f5677b = new h(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f5678c = new g(-1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f5679d = new g(1.0f);

    public static final t a(t tVar, Function1 function1, i80.n nVar) {
        return tVar.then(new n(function1, nVar));
    }

    public static final t b(t tVar, m3.n nVar) {
        if (tVar.all(o.f5708a)) {
            return tVar;
        }
        m3.s sVar = (m3.s) nVar;
        sVar.b0(1219399079);
        t tVar2 = (t) tVar.foldIn(q.f5711a, new p(sVar, 0));
        sVar.q(false);
        return tVar2;
    }

    public static final t c(t tVar, m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        sVar.a0(439770924);
        t tVarB = b(tVar, sVar);
        sVar.q(false);
        return tVarB;
    }

    public static final t d(t tVar, float f11) {
        return tVar.then(new w(f11));
    }
}
