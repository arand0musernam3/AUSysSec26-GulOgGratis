package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f18940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18941k;
    public final /* synthetic */ l2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(l2 l2Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f18940j = i11;
        this.l = l2Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f18940j) {
            case 0:
                return new k2(this.l, cVar, 0);
            case 1:
                return new k2(this.l, cVar, 1);
            case 2:
                return new k2(this.l, cVar, 2);
            default:
                return new k2(this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f18940j) {
        }
        return ((k2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f18940j;
        l2 l2Var = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f18941k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar = l2Var.f19006y;
                    if (bVar != null) {
                        d9 d9VarD = l2Var.f19005x;
                        if (d9VarD == null) {
                            g9 g9Var = g9.f18691a;
                            d9VarD = g9.d((p0) b5.o.e(l2Var, r0.f19375a), (a3.t3) b5.o.e(l2Var, a3.u3.f588a));
                        }
                        i4.v vVar = new i4.v(d9VarD.c(l2Var.f18998q, l2Var.f18999r, l2Var.f19003v));
                        t1.i iVarW = l2Var.f18998q ? s0.w((z3) b5.o.e(l2Var, t2.f19507a), l3.f0.FastEffects) : t1.c.i();
                        this.f18941k = 1;
                        obj = t1.b.c(bVar, vVar, iVarW, null, this, 12);
                        if (obj == aVar) {
                        }
                    }
                } else if (i12 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f18941k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar2 = l2Var.A;
                    z5.f fVar = new z5.f((l2Var.f19003v && l2Var.f18998q) ? l2Var.f19001t : l2Var.f19002u);
                    t1.i iVarW2 = l2Var.f18998q ? s0.w((z3) b5.o.e(l2Var, t2.f19507a), l3.f0.FastSpatial) : t1.c.i();
                    this.f18941k = 1;
                    if (t1.b.c(bVar2, fVar, iVarW2, null, this, 12) == aVar2) {
                    }
                } else if (i13 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f18941k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    this.f18941k = 1;
                    if (l2.O0(l2Var, this) == aVar3) {
                    }
                } else if (i14 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f18941k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    this.f18941k = 1;
                    if (l2.O0(l2Var, this) == aVar4) {
                    }
                } else if (i15 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
        }
        return Unit.f26487a;
    }
}
