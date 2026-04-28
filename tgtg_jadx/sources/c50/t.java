package c50;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements e50.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7625a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f7626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e50.c f7627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t70.a f7628d;

    public t(n0 n0Var, e50.c cVar, e50.c cVar2) {
        this.f7626b = n0Var;
        this.f7628d = cVar;
        this.f7627c = cVar2;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f7625a) {
            case 0:
                Context context = (Context) ((n0) this.f7628d).f7607b;
                CoroutineContext coroutineContext = (CoroutineContext) this.f7626b.get();
                m0 m0Var = (m0) this.f7627c.get();
                context.getClass();
                coroutineContext.getClass();
                m0Var.getClass();
                return q.b(m0Var, new e8.a(new p(m0Var, 0)), v80.f0.b(coroutineContext), new bo.a(context, 2));
            default:
                return new f50.o((CoroutineContext) this.f7626b.get(), (k1) this.f7628d.get(), (d8.f) this.f7627c.get());
        }
    }

    public t(n0 n0Var, n0 n0Var2, e50.c cVar) {
        this.f7628d = n0Var;
        this.f7626b = n0Var2;
        this.f7627c = cVar;
    }
}
