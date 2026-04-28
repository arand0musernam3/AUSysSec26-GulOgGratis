package gl;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qc.y;
import v80.b0;
import y80.a2;
import y80.h1;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f20538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20539k;
    public final /* synthetic */ l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l lVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f20538j = i11;
        this.l = lVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f20538j) {
            case 0:
                return new g(this.l, cVar, 0);
            case 1:
                return new g(this.l, cVar, 1);
            default:
                return new g(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f20538j) {
        }
        return ((g) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20538j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f20539k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    l lVar = this.l;
                    h1 h1Var = lVar.r().f20576j;
                    f fVar = new f(lVar, 0);
                    this.f20539k = 1;
                    if (h1Var.f45488a.collect(fVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                y.m();
                return null;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f20539k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    l lVar2 = this.l;
                    m1 m1Var = ((tg.i) lVar2.f20559k.getValue()).f40172k;
                    f fVar2 = new f(lVar2, 1);
                    this.f20539k = 1;
                    m1Var.getClass();
                    if (m1.k(m1Var, fVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                y.m();
                return null;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f20539k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    l lVar3 = this.l;
                    a2 a2Var = lVar3.r().f20574h;
                    f fVar3 = new f(lVar3, 2);
                    this.f20539k = 1;
                    if (a2Var.collect(fVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                y.m();
                return null;
        }
    }
}
