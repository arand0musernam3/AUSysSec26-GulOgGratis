package dp;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f15100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f15101k;
    public final /* synthetic */ ap.n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(b1 b1Var, ap.n nVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f15100j = i11;
        this.f15101k = b1Var;
        this.l = nVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f15100j) {
            case 0:
                return new o(this.f15101k, this.l, cVar, 0);
            case 1:
                return new o(this.f15101k, this.l, cVar, 1);
            case 2:
                return new o(this.f15101k, this.l, cVar, 2);
            default:
                return new o(this.f15101k, this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f15100j) {
        }
        return ((o) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f15100j;
        ap.n nVar = this.l;
        b1 b1Var = this.f15101k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    dv.d dVar = dv.d.HOW_MUCH_SPENT;
                    nVar.k(dVar != null ? dVar.a() : null);
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    dv.d dVar2 = dv.d.PICTURE_UPLOAD;
                    nVar.k(dVar2 != null ? dVar2.a() : null);
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    dv.d dVar3 = dv.d.WHY_THIS_BAG;
                    nVar.k(dVar3 != null ? dVar3.a() : null);
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    dv.d dVar4 = dv.d.CONTENT_DESCRIBED;
                    nVar.k(dVar4 != null ? dVar4.a() : null);
                }
                break;
        }
        return Unit.f26487a;
    }
}
