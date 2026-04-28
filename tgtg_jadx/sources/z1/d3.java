package z1;

import com.app.tgtg.model.remote.user.response.MoneySavedResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f46470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46471k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f46472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f46473n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d3(i80.n nVar, k2 k2Var, w4.v vVar, x70.c cVar) {
        super(2, cVar);
        this.f46470j = 2;
        this.l = (z70.i) nVar;
        this.f46473n = k2Var;
        this.f46472m = vVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [i80.n, z70.i] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f46470j) {
            case 0:
                d3 d3Var = new d3((d1) this.f46473n, (l3) this.f46472m, cVar, 0);
                d3Var.l = obj;
                return d3Var;
            case 1:
                d3 d3Var2 = new d3((l3) this.f46472m, (Function2) this.f46473n, cVar);
                d3Var2.l = obj;
                return d3Var2;
            case 2:
                return new d3((i80.n) this.l, (k2) this.f46473n, (w4.v) this.f46472m, cVar);
            case 3:
                d3 d3Var3 = new d3((v80.i1) this.f46473n, (Function2) this.f46472m, cVar);
                d3Var3.l = obj;
                return d3Var3;
            case 4:
                d3 d3Var4 = new d3((y80.j) this.f46473n, (z80.d) this.f46472m, cVar, 4);
                d3Var4.l = obj;
                return d3Var4;
            case 5:
                return new d3((y80.i) this.l, (z80.w) this.f46473n, (e90.i) this.f46472m, cVar, 5);
            case 6:
                return new d3((z80.l) this.f46473n, (y80.j) this.f46472m, this.l, cVar);
            case 7:
                d3 d3Var5 = new d3((y80.q) this.f46473n, (y80.j) this.f46472m, cVar, 7);
                d3Var5.l = obj;
                return d3Var5;
            default:
                return new d3((f2.c0) this.l, (MoneySavedResponse) this.f46473n, (m3.b1) this.f46472m, cVar, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46470j) {
        }
        return ((d3) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [i80.n, z70.i] */
    /* JADX WARN: Type inference failed for: r7v20, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r7v37, types: [i80.n, z70.i] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        v80.b0 b0Var;
        switch (this.f46470j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f46471k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    k3 k3Var = (k3) this.l;
                    d1 d1Var = (d1) this.f46473n;
                    xq.a aVar2 = new xq.a(10, k3Var, (l3) this.f46472m);
                    this.f46471k = 1;
                    if (d1Var.invoke(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 1:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f46471k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    q2 q2Var = (q2) this.l;
                    l3 l3Var = (l3) this.f46472m;
                    l3Var.f46594k = q2Var;
                    Function2 function2 = (Function2) this.f46473n;
                    k3 k3Var2 = l3Var.l;
                    this.f46471k = 1;
                    if (function2.invoke(k3Var2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 2:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f46471k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    ?? r72 = (z70.i) this.l;
                    k2 k2Var = (k2) this.f46473n;
                    h4.b bVar = new h4.b(((w4.v) this.f46472m).f43180c);
                    this.f46471k = 1;
                    if (r72.invoke(k2Var, bVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 3:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f46471k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    b0Var = (v80.b0) this.l;
                    v80.i1 i1Var = (v80.i1) this.f46473n;
                    this.l = b0Var;
                    this.f46471k = 1;
                    if (i1Var.B(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            ba0.g.M(obj);
                            return Unit.f26487a;
                        }
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (v80.b0) this.l;
                    ba0.g.M(obj);
                }
                ?? r73 = (z70.i) this.f46472m;
                this.l = null;
                this.f46471k = 2;
                if (r73.invoke(b0Var, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f26487a;
            case 4:
                Object obj2 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f46471k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    v80.b0 b0Var2 = (v80.b0) this.l;
                    y80.j jVar = (y80.j) this.f46473n;
                    x80.w wVarF = ((z80.d) this.f46472m).f(b0Var2);
                    this.f46471k = 1;
                    Object objO = y80.r.o(jVar, wVarF, true, this);
                    if (objO != obj2) {
                        objO = Unit.f26487a;
                    }
                    if (objO == obj2) {
                        return obj2;
                    }
                } else {
                    if (i15 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 5:
                e90.i iVar = (e90.i) this.f46472m;
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f46471k;
                try {
                    if (i16 == 0) {
                        ba0.g.M(obj);
                        y80.i iVar2 = (y80.i) this.l;
                        z80.w wVar = (z80.w) this.f46473n;
                        this.f46471k = 1;
                        if (iVar2.collect(wVar, this) == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i16 != 1) {
                            com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                    }
                    iVar.d();
                    return Unit.f26487a;
                } catch (Throwable th2) {
                    iVar.d();
                    throw th2;
                }
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f46471k;
                if (i17 == 0) {
                    ba0.g.M(obj);
                    ?? r74 = ((z80.l) this.f46473n).f47381e;
                    y80.j jVar2 = (y80.j) this.f46472m;
                    Object obj3 = this.l;
                    this.f46471k = 1;
                    if (r74.invoke(jVar2, obj3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i17 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f46471k;
                if (i18 == 0) {
                    ba0.g.M(obj);
                    v80.b0 b0Var3 = (v80.b0) this.l;
                    y80.q qVar = (y80.q) this.f46473n;
                    y80.j jVar3 = (y80.j) this.f46472m;
                    this.f46471k = 1;
                    if (qVar.invoke(b0Var3, jVar3, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i18 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f46471k;
                if (i19 == 0) {
                    ba0.g.M(obj);
                    at.o oVarD = m3.i.D(new f2.f((f2.c0) this.l, 10));
                    a3.w1 w1Var = new a3.w1(20, (MoneySavedResponse) this.f46473n, (m3.b1) this.f46472m);
                    this.f46471k = 1;
                    if (oVarD.collect(w1Var, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i19 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f46470j = i11;
        this.l = obj;
        this.f46473n = obj2;
        this.f46472m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f46470j = i11;
        this.f46473n = obj;
        this.f46472m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d3(v80.i1 i1Var, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f46470j = 3;
        this.f46473n = i1Var;
        this.f46472m = (z70.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(l3 l3Var, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f46470j = 1;
        this.f46472m = l3Var;
        this.f46473n = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(z80.l lVar, y80.j jVar, Object obj, x70.c cVar) {
        super(2, cVar);
        this.f46470j = 6;
        this.f46473n = lVar;
        this.f46472m = jVar;
        this.l = obj;
    }
}
