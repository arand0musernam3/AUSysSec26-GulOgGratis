package m3;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements v80.b0, e2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f29292e = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f29293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f29294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f29295c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile CoroutineContext f29296d;

    public h2(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.f29293a = coroutineContext;
        this.f29294b = coroutineContext2;
    }

    public final void a() {
        synchronized (this.f29295c) {
            try {
                CoroutineContext coroutineContext = this.f29296d;
                if (coroutineContext == null) {
                    this.f29296d = f29292e;
                } else {
                    v80.f0.i(coroutineContext, new n0(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m3.e2
    public final void b() {
        a();
    }

    @Override // m3.e2
    public final void c() {
        a();
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this.f29296d;
        if (coroutineContext == null || coroutineContext == f29292e) {
            a4.h hVar = (a4.h) this.f29293a.get(a4.h.f684b);
            CoroutineContext g2Var = hVar != null ? new g2(hVar, this) : kotlin.coroutines.g.f26549a;
            synchronized (this.f29295c) {
                try {
                    CoroutineContext coroutineContext2 = this.f29296d;
                    if (coroutineContext2 == null) {
                        CoroutineContext coroutineContext3 = this.f29293a;
                        coroutineContextPlus = coroutineContext3.plus(new v80.j1((v80.i1) coroutineContext3.get(v80.h1.f42106a))).plus(this.f29294b).plus(g2Var);
                    } else if (coroutineContext2 == f29292e) {
                        CoroutineContext coroutineContext4 = this.f29293a;
                        v80.j1 j1Var = new v80.j1((v80.i1) coroutineContext4.get(v80.h1.f42106a));
                        j1Var.q(new n0(0));
                        coroutineContextPlus = coroutineContext4.plus(j1Var).plus(this.f29294b).plus(g2Var);
                    } else {
                        coroutineContextPlus = coroutineContext2;
                    }
                    this.f29296d = coroutineContextPlus;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            coroutineContext = coroutineContextPlus;
        }
        coroutineContext.getClass();
        return coroutineContext;
    }

    @Override // m3.e2
    public final void d() {
    }
}
