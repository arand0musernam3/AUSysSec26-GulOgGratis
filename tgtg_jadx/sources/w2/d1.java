package w2;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.y3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f42865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42866k;
    public final /* synthetic */ x2.w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w4.y f42867m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(w4.y yVar, x2.w wVar, x70.c cVar) {
        super(2, cVar);
        this.f42865j = 3;
        this.f42867m = yVar;
        this.l = wVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f42865j) {
            case 0:
                return new d1(this.l, this.f42867m, cVar, 0);
            case 1:
                return new d1(this.l, this.f42867m, cVar, 1);
            case 2:
                return new d1(this.l, this.f42867m, cVar, 2);
            case 3:
                return new d1(this.f42867m, this.l, cVar);
            default:
                return new d1(this.l, this.f42867m, cVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f42865j) {
        }
        return ((d1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42865j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f42866k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f42866k = 1;
                    if (this.l.i(this.f42867m, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f42866k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f42866k = 1;
                    if (this.l.i(this.f42867m, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f42866k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f42866k = 1;
                    if (x2.w.a(this.l, this.f42867m, this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f42866k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    m2.j jVar = new m2.j(this.l, 1);
                    this.f42866k = 1;
                    if (y3.f(this.f42867m, jVar, this) == aVar4) {
                    }
                }
                break;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f42866k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f42866k = 1;
                    if (this.l.i(this.f42867m, this) == aVar5) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(x2.w wVar, w4.y yVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f42865j = i11;
        this.l = wVar;
        this.f42867m = yVar;
    }
}
