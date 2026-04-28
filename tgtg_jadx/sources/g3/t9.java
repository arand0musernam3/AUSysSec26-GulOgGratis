package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f19537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19538k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f19539m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9(Object obj, float f11, x70.c cVar, int i11) {
        super(2, cVar);
        this.f19537j = i11;
        this.l = obj;
        this.f19539m = f11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f19537j) {
            case 0:
                return new t9((w9) this.l, this.f19539m, cVar, 0);
            case 1:
                return new t9((w9) this.l, this.f19539m, cVar, 1);
            default:
                return new t9((t1.b) this.l, this.f19539m, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f19537j) {
        }
        return ((t9) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19537j) {
            case 0:
                w9 w9Var = (w9) this.l;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f19538k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar = w9Var.f19739t;
                    if (bVar != null) {
                        Float f11 = new Float(this.f19539m);
                        t1.i iVar = w9Var.f19737r ? z7.f19904f : w9Var.f19736q;
                        this.f19538k = 1;
                        obj = t1.b.c(bVar, f11, iVar, null, this, 12);
                        if (obj == aVar) {
                        }
                    }
                } else if (i11 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 1:
                w9 w9Var2 = (w9) this.l;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f19538k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar2 = w9Var2.f19738s;
                    if (bVar2 != null) {
                        Float f12 = new Float(this.f19539m);
                        t1.i iVar2 = w9Var2.f19737r ? z7.f19904f : w9Var2.f19736q;
                        this.f19538k = 1;
                        obj = t1.b.c(bVar2, f12, iVar2, null, this, 12);
                        if (obj == aVar2) {
                        }
                    }
                } else if (i12 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f19538k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1.b bVar3 = (t1.b) this.l;
                    Float f13 = new Float(this.f19539m);
                    t1.u1 u1VarK = t1.c.k(800, 300, null, 4);
                    this.f19538k = 1;
                    if (t1.b.c(bVar3, f13, u1VarK, null, this, 12) == aVar3) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
