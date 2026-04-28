package m2;

import kotlin.Unit;
import z1.k2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ k2 f29084k;
    public /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f29085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f29086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b2.l f29087o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(v80.b0 b0Var, m3.b1 b1Var, b2.l lVar, x70.c cVar) {
        super(3, cVar);
        this.f29085m = b0Var;
        this.f29086n = b1Var;
        this.f29087o = lVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j9 = ((h4.b) obj2).f21378a;
        m3.b1 b1Var = this.f29086n;
        b2.l lVar = this.f29087o;
        t1 t1Var = new t1(this.f29085m, b1Var, lVar, (x70.c) obj3);
        t1Var.f29084k = (k2) obj;
        t1Var.l = j9;
        return t1Var.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f29083j;
        v80.b0 b0Var = this.f29085m;
        if (i11 == 0) {
            ba0.g.M(obj);
            k2 k2Var = this.f29084k;
            v80.f0.B(b0Var, null, null, new a3.w(this.f29086n, this.l, this.f29087o, (x70.c) null, 4), 3);
            this.f29083j = 1;
            obj = k2Var.g(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        v80.f0.B(b0Var, null, null, new ep.a0(this.f29086n, ((Boolean) obj).booleanValue(), this.f29087o, (x70.c) null), 3);
        return Unit.f26487a;
    }
}
