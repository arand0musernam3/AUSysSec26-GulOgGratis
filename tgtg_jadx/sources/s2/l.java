package s2;

import b5.o;
import v80.b2;
import v80.d0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f38778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f38779b = k.Uninitialized;

    public final void a() {
        t2.e eVar;
        if (this.f38779b == k.Uninitialized) {
            c2.a.c("ToolbarRequester is not initialized.");
        }
        j jVar = this.f38778a;
        if (jVar == null || !jVar.isAttached()) {
            return;
        }
        b2 b2Var = jVar.f38775u;
        if ((b2Var == null || !b2Var.g()) && (eVar = (t2.e) o.e(jVar, t2.f.f39666b)) != null) {
            jVar.f38775u = f0.B(jVar.getCoroutineScope(), null, d0.UNDISPATCHED, new nk.j(jVar, eVar, (x70.c) null, 18), 1);
        }
    }
}
