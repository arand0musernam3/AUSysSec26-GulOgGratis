package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f19295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19296k;
    public final /* synthetic */ t1.b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(t1.b bVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f19295j = i11;
        this.l = bVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f19295j) {
            case 0:
                return new p3(this.l, cVar, 0);
            case 1:
                return new p3(this.l, cVar, 1);
            case 2:
                return new p3(this.l, cVar, 2);
            default:
                return new p3(this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f19295j) {
        }
        return ((p3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19295j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f19296k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    Float f11 = new Float(0.0f);
                    this.f19296k = 1;
                    if (t1.b.c(this.l, f11, null, null, this, 14) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f19296k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                    } else if (i12 != 2) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    Float f12 = new Float(6.0f);
                    t1.u1 u1VarK = t1.c.k(80, 0, null, 6);
                    this.f19296k = 1;
                    if (t1.b.c(this.l, f12, u1VarK, null, this, 12) == aVar2) {
                    }
                }
                Float f13 = new Float(2.0f);
                t1.b1 b1VarJ = t1.c.j(0.5f, 200.0f, null, 4);
                this.f19296k = 2;
                if (t1.b.c(this.l, f13, b1VarJ, null, this, 12) == aVar2) {
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f19296k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    i4.v vVar = new i4.v(lv.s.J);
                    t1.u1 u1Var = new t1.u1(600, 200, t1.w.f39593a);
                    this.f19296k = 1;
                    if (t1.b.c(this.l, vVar, u1Var, null, this, 12) == aVar3) {
                    }
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f19296k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    Float f14 = new Float(1.0f);
                    t1.u1 u1VarK2 = t1.c.k(200, 0, null, 6);
                    this.f19296k = 1;
                    if (t1.b.c(this.l, f14, u1VarK2, null, this, 12) == aVar4) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
