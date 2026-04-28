package c50;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements e50.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f7654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f7655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.a f7656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e50.c f7657d;

    public y(n0 n0Var, e50.c cVar, n0 n0Var2, e50.c cVar2) {
        this.f7654a = n0Var;
        this.f7655b = cVar;
        this.f7656c = n0Var2;
        this.f7657d = cVar2;
    }

    @Override // t70.a
    public final Object get() {
        return new o((p30.g) this.f7654a.f7607b, (f50.k) this.f7655b.get(), (CoroutineContext) this.f7656c.get(), (z0) this.f7657d.get());
    }
}
