package al;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ui.m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1596k;
    public final /* synthetic */ c0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(c0 c0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1595j = i11;
        this.l = c0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f1595j) {
            case 0:
                return new v(this.l, cVar, 0);
            case 1:
                return new v(this.l, cVar, 1);
            default:
                return new v(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f1595j) {
        }
        return ((v) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1595j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f1596k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                m3 m3Var = this.l.f1526f;
                this.f1596k = 1;
                Object objR = m3Var.r("SplashViewModel", this);
                return objR == aVar ? aVar : objR;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f1596k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    hv.b bVar = this.l.f1528h;
                    this.f1596k = 1;
                    if (((hv.j) bVar).a(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f1596k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    a0 a0Var = new a0(this.l.f1531k.getData(), 0);
                    this.f1596k = 1;
                    obj = y80.r.r(a0Var, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Boolean.valueOf(Intrinsics.areEqual(obj, Boolean.TRUE));
        }
    }
}
