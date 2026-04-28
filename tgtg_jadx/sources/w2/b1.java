package w2;

import c5.c3;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f42843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42844k;
    public final /* synthetic */ e1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(e1 e1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f42843j = i11;
        this.l = e1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f42843j) {
            case 0:
                return new b1(this.l, cVar, 0);
            case 1:
                return new b1(this.l, cVar, 1);
            case 2:
                return new b1(this.l, cVar, 2);
            case 3:
                return new b1(this.l, cVar, 3);
            case 4:
                return new b1(this.l, cVar, 4);
            default:
                return new b1(this.l, cVar, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f42843j) {
        }
        return ((b1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42843j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f42844k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    x2.w wVar = this.l.f42880s;
                    this.f42844k = 1;
                    if (wVar.e(true, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f42844k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    x2.w wVar2 = this.l.f42880s;
                    this.f42844k = 1;
                    if (wVar2.f(this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f42844k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    x2.w wVar3 = this.l.f42880s;
                    this.f42844k = 1;
                    if (wVar3.s(this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f42844k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f42844k = 1;
                    e1 e1Var = this.l;
                    Object objCollect = new mn.j(new mn.j(m3.i.D(new y0(e1Var, 0)), 15), 16).collect(new androidx.lifecycle.m(e1Var, 25), this);
                    if (objCollect != aVar4) {
                        objCollect = Unit.f26487a;
                    }
                    if (objCollect == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f42844k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    x2.w wVar4 = this.l.f42880s;
                    this.f42844k = 1;
                    if (wVar4.x(this) == aVar5) {
                    }
                }
                break;
            default:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f42844k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    e1 e1Var2 = this.l;
                    tm.d dVar = new tm.d(e1Var2, null, 17);
                    this.f42844k = 1;
                    if (c3.a(e1Var2, dVar, this) == aVar6) {
                    }
                }
                qc.y.m();
                break;
        }
        return Unit.f26487a;
    }
}
