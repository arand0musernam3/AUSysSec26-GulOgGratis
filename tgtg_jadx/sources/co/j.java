package co;

import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f8765k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(b1 b1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8764j = i11;
        this.f8765k = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8764j) {
            case 0:
                return new j(this.f8765k, cVar, 0);
            case 1:
                return new j(this.f8765k, cVar, 1);
            case 2:
                return new j(this.f8765k, cVar, 2);
            case 3:
                return new j(this.f8765k, cVar, 3);
            case 4:
                return new j(this.f8765k, cVar, 4);
            case 5:
                return new j(this.f8765k, cVar, 5);
            default:
                return new j(this.f8765k, cVar, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8764j) {
        }
        return ((j) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f8764j;
        b1 b1Var = this.f8765k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                int i12 = MapBottomSheet.f9095y;
                b1Var.setValue(Boolean.TRUE);
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
            default:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f26487a;
    }
}
