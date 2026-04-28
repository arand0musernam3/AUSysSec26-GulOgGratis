package zs;

import a3.w1;
import ao.g3;
import com.app.tgtg.model.remote.UserSettings;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z80.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f48096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48097k;
    public final /* synthetic */ o l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f48096j = i11;
        this.l = oVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f48096j) {
            case 0:
                return new n(this.l, cVar, 0);
            default:
                return new n(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f48096j) {
        }
        return ((n) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f48096j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f48097k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    o oVar = this.l;
                    ys.a aVar2 = oVar.f48101d;
                    aVar2.getClass();
                    at.o oVar2 = new at.o(new tg.g(aVar2, (x70.c) null, 21));
                    this.f48097k = 1;
                    Object objCollect = oVar2.collect(new w1(21, s.f47399a, oVar), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f26487a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f26487a;
                    }
                    if (objCollect == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f48097k;
                o oVar3 = this.l;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    g3 g3Var = oVar3.f48100c;
                    this.f48097k = 1;
                    obj = g3Var.A(this);
                    if (obj == aVar3) {
                    }
                }
                oVar3.f48103f.i(new qt.a(((UserSettings) obj).getMyStoreUrl()));
                break;
        }
        return Unit.f26487a;
    }
}
