package um;

import com.app.tgtg.model.local.GenericErrors;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t f41407k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, x70.c cVar) {
        super(2, cVar);
        this.f41407k = tVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new n(this.f41407k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f41406j;
        if (i11 == 0) {
            ba0.g.M(obj);
            a2 a2Var = this.f41407k.f41437n;
            GenericErrors.Generic generic = GenericErrors.Generic.INSTANCE;
            this.f41406j = 1;
            a2Var.j(generic);
            if (Unit.f26487a == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
