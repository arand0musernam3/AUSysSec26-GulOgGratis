package lh;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27823k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f27822j = i12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f27822j) {
            case 0:
                t tVar = new t(2, cVar, 0);
                tVar.l = obj;
                return tVar;
            default:
                t tVar2 = new t(2, cVar, 1);
                tVar2.l = obj;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27822j) {
            case 0:
                return ((t) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((t) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        v80.b0 b0Var;
        switch (this.f27822j) {
            case 0:
                y80.j jVar = (y80.j) this.l;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f27823k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.l = null;
                    this.f27823k = 1;
                    if (jVar.emit(z.f27838a, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f27823k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    b0Var = (v80.b0) this.l;
                } else if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    b0Var = (v80.b0) this.l;
                    ba0.g.M(obj);
                }
                while (f0.x(b0Var.getCoroutineContext())) {
                    yj.m mVar = new yj.m(9);
                    this.l = b0Var;
                    this.f27823k = 1;
                    if (m3.i.u(getContext()).t(mVar, this) == aVar2) {
                        break;
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
