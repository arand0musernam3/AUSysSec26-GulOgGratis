package lo;

import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qc.y;
import v80.b0;
import y80.g1;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27975k;
    public final /* synthetic */ ManufacturerOrderActivity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ManufacturerOrderActivity manufacturerOrderActivity, x70.c cVar, int i11) {
        super(2, cVar);
        this.f27974j = i11;
        this.l = manufacturerOrderActivity;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f27974j) {
            case 0:
                return new h(this.l, cVar, 0);
            default:
                return new h(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f27974j) {
        }
        return ((h) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f27974j;
        ManufacturerOrderActivity manufacturerOrderActivity = this.l;
        int i12 = 1;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f27975k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    int i14 = ManufacturerOrderActivity.f9167q;
                    g1 g1Var = manufacturerOrderActivity.f0().f27992n;
                    g gVar = new g(manufacturerOrderActivity, 0);
                    this.f27975k = 1;
                    if (g1Var.f45482a.collect(gVar, this) == aVar) {
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                y.m();
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f27975k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    int i16 = ManufacturerOrderActivity.f9167q;
                    h1 h1Var = manufacturerOrderActivity.f0().f27996r;
                    g gVar2 = new g(manufacturerOrderActivity, i12);
                    this.f27975k = 1;
                    if (h1Var.f45488a.collect(gVar2, this) == aVar2) {
                    }
                } else if (i15 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                y.m();
                break;
        }
        return null;
    }
}
