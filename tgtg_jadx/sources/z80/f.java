package z80;

import com.google.android.gms.internal.measurement.cg;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import m2.n0;
import v80.b0;
import v80.d0;
import v80.h1;
import v80.i1;
import z1.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final at.o f47367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47368e;

    public f(at.o oVar, int i11, CoroutineContext coroutineContext, int i12, x80.a aVar) {
        super(coroutineContext, i12, aVar);
        this.f47367d = oVar;
        this.f47368e = i11;
    }

    @Override // z80.d
    public final String b() {
        return "concurrency=" + this.f47368e;
    }

    @Override // z80.d
    public final Object c(x80.u uVar, x70.c cVar) {
        Object objCollect = this.f47367d.collect(new n0(2, (i1) cVar.getContext().get(h1.f42106a), e90.j.a(this.f47368e), uVar, new w(uVar)), cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }

    @Override // z80.d
    public final d d(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return new f(this.f47367d, this.f47368e, coroutineContext, i11, aVar);
    }

    @Override // z80.d
    public final x80.w f(b0 b0Var) {
        Function2 a2Var = new a2(this, null, 5);
        x80.a aVar = x80.a.SUSPEND;
        d0 d0Var = d0.DEFAULT;
        x80.t tVar = new x80.t(v80.v.b(b0Var, this.f47360a), cg.a(this.f47361b, aVar, null, 4));
        tVar.k0(d0Var, tVar, a2Var);
        return tVar;
    }
}
