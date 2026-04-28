package bm;

import com.app.tgtg.feature.logincharity.ui.model.AuthEmailState;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f6376k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, x70.c cVar) {
        super(2, cVar);
        this.f6376k = pVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new n(this.f6376k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f6375j;
        if (i11 == 0) {
            ba0.g.M(obj);
            m1 m1Var = this.f6376k.f6384f;
            h hVar = new h(AuthEmailState.Authenticated.INSTANCE);
            this.f6375j = 1;
            if (m1Var.emit(hVar, this) == aVar) {
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
