package c50;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements e50.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7642a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f7643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.a f7644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t70.a f7645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e50.c f7646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t70.a f7647f;

    public v0(e50.c cVar, n0 n0Var, e50.c cVar2, e50.c cVar3, e50.c cVar4) {
        this.f7643b = cVar;
        this.f7644c = n0Var;
        this.f7645d = cVar2;
        this.f7647f = cVar3;
        this.f7646e = cVar4;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f7642a) {
            case 0:
                return new u0((p30.g) ((n0) this.f7647f).f7607b, (u40.e) this.f7643b.get(), (f50.k) this.f7644c.get(), (l) this.f7646e.get(), (CoroutineContext) this.f7645d.get());
            default:
                return new f50.c((k1) this.f7643b.get(), (u40.e) this.f7644c.get(), (b) this.f7645d.get(), (f50.e) this.f7647f.get(), (f50.o) this.f7646e.get());
        }
    }

    public v0(n0 n0Var, n0 n0Var2, e50.c cVar, e50.c cVar2, n0 n0Var3) {
        this.f7647f = n0Var;
        this.f7643b = n0Var2;
        this.f7644c = cVar;
        this.f7646e = cVar2;
        this.f7645d = n0Var3;
    }
}
