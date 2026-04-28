package ho;

import com.braze.h2;
import go.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qc.y;
import v80.b0;
import y80.g1;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22197k;
    public final /* synthetic */ w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(w wVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f22196j = i11;
        this.l = wVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f22196j) {
            case 0:
                return new d(this.l, cVar, 0);
            default:
                return new d(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f22196j) {
        }
        return ((d) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22196j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f22197k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    w wVar = this.l;
                    g1 g1Var = wVar.C().f22220o;
                    c cVar = new c(wVar, 0);
                    this.f22197k = 1;
                    if (g1Var.f45482a.collect(cVar, this) == aVar) {
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
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f22197k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    w wVar2 = this.l;
                    h1 h1Var = wVar2.C().f22224s;
                    c cVar2 = new c(wVar2, 1);
                    this.f22197k = 1;
                    if (h1Var.f45488a.collect(cVar2, this) == aVar2) {
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
        }
    }
}
