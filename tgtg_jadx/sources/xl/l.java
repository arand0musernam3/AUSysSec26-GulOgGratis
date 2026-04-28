package xl;

import com.app.tgtg.feature.logincharity.ui.model.AuthEmailState;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f44460k;
    public final /* synthetic */ AuthEmailState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, AuthEmailState authEmailState, x70.c cVar) {
        super(2, cVar);
        this.f44460k = mVar;
        this.l = authEmailState;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new l(this.f44460k, this.l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f44459j;
        if (i11 == 0) {
            ba0.g.M(obj);
            m1 m1Var = this.f44460k.f44465e;
            AuthEmailState.Partner partner = (AuthEmailState.Partner) this.l;
            c cVar = new c(partner.getPartnerUrl(), partner.getEmail());
            this.f44459j = 1;
            if (m1Var.emit(cVar, this) == aVar) {
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
