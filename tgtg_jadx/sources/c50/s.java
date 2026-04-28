package c50;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements e50.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f7621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.a f7622c;

    public s(e50.c cVar, n0 n0Var) {
        this.f7620a = 2;
        this.f7622c = cVar;
        this.f7621b = n0Var;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f7620a) {
            case 0:
                Context context = (Context) this.f7621b.f7607b;
                CoroutineContext coroutineContext = (CoroutineContext) this.f7622c.get();
                context.getClass();
                coroutineContext.getClass();
                return q.b(f50.i.f17352a, new e8.a(new defpackage.g(16)), v80.f0.b(coroutineContext), new bo.a(context, 1));
            case 1:
                return new g0((Context) this.f7621b.f7607b, (l1) this.f7622c.get());
            default:
                return new f50.e((b) this.f7622c.get(), (CoroutineContext) this.f7621b.f7607b);
        }
    }

    public /* synthetic */ s(n0 n0Var, e50.c cVar, int i11) {
        this.f7620a = i11;
        this.f7621b = n0Var;
        this.f7622c = cVar;
    }
}
