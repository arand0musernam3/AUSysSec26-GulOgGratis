package cj;

import com.app.tgtg.model.remote.order.AbortState;
import com.app.tgtg.model.remote.order.response.AbortOrderResponse;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ui.a2;
import ui.g2;
import ui.m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8241k;
    public final /* synthetic */ s0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f8242m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(s0 s0Var, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8240j = i11;
        this.l = s0Var;
        this.f8242m = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8240j) {
            case 0:
                return new g0(this.l, this.f8242m, cVar, 0);
            default:
                return new g0(this.l, this.f8242m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8240j) {
        }
        return ((g0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objA;
        int i11 = this.f8240j;
        String str = this.f8242m;
        s0 s0Var = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f8241k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    m3 m3Var = s0Var.f8386b;
                    this.f8241k = 1;
                    objA = m3Var.a(str, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objA = ((u70.q) obj).f40851a;
                }
                u70.o oVar = u70.q.f40850b;
                if (!(objA instanceof u70.p)) {
                    AbortState state = ((AbortOrderResponse) objA).getState();
                    if (state == null) {
                        throw new Exception("Null from server");
                    }
                    s0Var.k().k(new a2(state));
                }
                Throwable thA = u70.q.a(objA);
                if (thA != null) {
                    s0Var.k().k(new g2(thA));
                }
                return Unit.f26487a;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f8241k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    this.f8241k = 1;
                    if (s0.a(s0Var, str, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }
}
