package ye;

import java.util.LinkedHashSet;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf.b f45876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of.l f45877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f45878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f45879d;

    public c(LinkedHashSet linkedHashSet, v vVar, tf.c cVar, kf.b bVar, of.l lVar) {
        linkedHashSet.getClass();
        vVar.getClass();
        bVar.getClass();
        this.f45876a = bVar;
        this.f45877b = lVar;
        v70.e eVarB = kotlin.collections.c0.b();
        if (linkedHashSet.contains(e.ELEMENT_INTERACTIONS)) {
            eVarB.add(s.f45938a);
        }
        if (linkedHashSet.contains(e.FRUSTRATION_INTERACTIONS)) {
            eVarB.add(t.f45939a);
            eVarB.add(r.f45937a);
        }
        a2 a2VarC = y80.r.c(new f(linkedHashSet.contains(e.SESSIONS), linkedHashSet.contains(e.APP_LIFECYCLES), linkedHashSet.contains(e.SCREEN_VIEWS), linkedHashSet.contains(e.DEEP_LINKS), kotlin.collections.c0.a(eVarB)));
        this.f45878c = a2VarC;
        this.f45879d = new h1(a2VarC);
        f fVar = (f) a2VarC.getValue();
        if (lVar != null) {
            lVar.h("autocapture.enabled", fVar.toString());
        }
        if (cVar != null) {
            tf.j jVar = (tf.j) cVar;
            jVar.f(tf.a.ANALYTICS_SDK, new of.a(this, 1));
        }
    }
}
