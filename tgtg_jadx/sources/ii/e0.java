package ii;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f23890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23891k;
    public final /* synthetic */ j0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(j0 j0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f23890j = i11;
        this.l = j0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f23890j) {
            case 0:
                return new e0(this.l, cVar, 0);
            case 1:
                return new e0(this.l, cVar, 1);
            case 2:
                return new e0(this.l, cVar, 2);
            case 3:
                return new e0(this.l, cVar, 3);
            case 4:
                return new e0(this.l, cVar, 4);
            case 5:
                return new e0(this.l, cVar, 5);
            case 6:
                return new e0(this.l, cVar, 6);
            case 7:
                return new e0(this.l, cVar, 7);
            default:
                return new e0(this.l, cVar, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f23890j) {
        }
        return ((e0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        int i11 = this.f23890j;
        int i12 = 18;
        int i13 = 2;
        j0 j0Var = this.l;
        x70.c cVar = null;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f23891k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    this.f23891k = 1;
                    if (v80.f0.o(500L, this) == aVar) {
                    }
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                a2 a2Var = j0Var.f23932n;
                Boolean bool = Boolean.TRUE;
                a2Var.getClass();
                a2Var.k(null, bool);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f23891k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    al.a0 a0Var = new al.a0(j0Var.f23924e.getData(), 18);
                    this.f23891k = 1;
                    obj = y80.r.r(a0Var, this);
                    if (obj == aVar2) {
                    }
                } else if (i15 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                Boolean bool2 = (Boolean) obj;
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f23891k;
                if (i16 == 0) {
                    ba0.g.M(obj);
                    d8.f fVar = j0Var.f23924e;
                    bm.o oVar = new bm.o(i13, cVar, 16);
                    this.f23891k = 1;
                    if (xz.b.r(fVar, oVar, this) == aVar3) {
                    }
                } else if (i16 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f23891k;
                if (i17 == 0) {
                    ba0.g.M(obj);
                    al.a0 a0Var2 = new al.a0(j0Var.f23924e.getData(), 19);
                    this.f23891k = 1;
                    obj = y80.r.r(a0Var2, this);
                    if (obj == aVar4) {
                    }
                } else if (i17 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                Boolean bool3 = (Boolean) obj;
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f23891k;
                if (i18 == 0) {
                    ba0.g.M(obj);
                    d8.f fVar2 = j0Var.f23924e;
                    bm.o oVar2 = new bm.o(i13, cVar, 17);
                    this.f23891k = 1;
                    if (xz.b.r(fVar2, oVar2, this) == aVar5) {
                    }
                } else if (i18 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f23891k;
                if (i19 == 0) {
                    ba0.g.M(obj);
                    al.a0 a0Var3 = new al.a0(j0Var.f23924e.getData(), 20);
                    this.f23891k = 1;
                    obj = y80.r.r(a0Var3, this);
                    if (obj == aVar6) {
                    }
                } else if (i19 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                Boolean bool4 = (Boolean) obj;
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f23891k;
                if (i21 == 0) {
                    ba0.g.M(obj);
                    d8.f fVar3 = j0Var.f23924e;
                    bm.o oVar3 = new bm.o(i13, cVar, i12);
                    this.f23891k = 1;
                    if (xz.b.r(fVar3, oVar3, this) == aVar7) {
                    }
                } else if (i21 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i22 = this.f23891k;
                if (i22 == 0) {
                    ba0.g.M(obj);
                    w2.z zVar = j0Var.f23920a;
                    this.f23891k = 1;
                    objU = zVar.u(this);
                    if (objU == aVar8) {
                    }
                } else if (i22 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                    objU = ((u70.q) obj).f40851a;
                }
                u70.o oVar4 = u70.q.f40850b;
                if (!(objU instanceof u70.p)) {
                    ai.f fVar4 = (ai.f) objU;
                    a2 a2Var2 = j0Var.B;
                    if (!fVar4.f1488b && !fVar4.f1487a) {
                        if (!((Boolean) v80.f0.E(kotlin.coroutines.g.f26549a, new e0(j0Var, cVar, 3))).booleanValue()) {
                            z = true;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    a2Var2.getClass();
                    a2Var2.k(null, boolValueOf);
                }
                break;
            default:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i23 = this.f23891k;
                if (i23 == 0) {
                    ba0.g.M(obj);
                    al.a0 a0Var4 = new al.a0(j0Var.f23924e.getData(), 21);
                    this.f23891k = 1;
                    obj = y80.r.r(a0Var4, this);
                    if (obj == aVar9) {
                    }
                } else if (i23 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                String str = (String) obj;
                if (str == null) {
                }
                break;
        }
        return Unit.f26487a;
    }
}
