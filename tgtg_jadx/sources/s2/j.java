package s2;

import b5.n;
import kotlin.jvm.functions.Function1;
import m3.i0;
import v80.b2;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n implements b5.k, t2.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f38771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z70.i f38772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Function1 f38773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Function1 f38774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b2 f38775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i0 f38776v = m3.i.q(new rv.a(this, 1));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h4.c f38777w = h4.c.f21379e;

    /* JADX WARN: Multi-variable type inference failed */
    public j(l lVar, Function1 function1, Function1 function12, Function1 function13) {
        this.f38771q = lVar;
        this.f38772r = (z70.i) function1;
        this.f38773s = function12;
        this.f38774t = function13;
    }

    @Override // t2.d
    public final h4.c C0(z zVar) {
        if (!isAttached()) {
            return this.f38777w;
        }
        h4.c cVar = (h4.c) this.f38774t.invoke(zVar);
        if (cVar == null) {
            return this.f38777w;
        }
        this.f38777w = cVar;
        return cVar;
    }

    @Override // t2.d
    public final p2.c P() {
        return (p2.c) this.f38776v.getValue();
    }

    @Override // b4.s
    public final void onAttach() {
        l lVar = this.f38771q;
        lVar.f38779b = k.Attached;
        lVar.f38778a = this;
    }

    @Override // b4.s
    public final void onDetach() {
        l lVar = this.f38771q;
        lVar.f38779b = k.Detached;
        lVar.f38778a = null;
        super.onDetach();
    }

    @Override // t2.d
    public final long u0(z zVar) {
        return C0(zVar).f();
    }
}
