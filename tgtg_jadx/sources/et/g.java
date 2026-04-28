package et;

import com.app.tgtg.model.remote.order.Order;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Order f16383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16384k;
    public final /* synthetic */ z l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16385m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z zVar, z70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16384k = obj;
        this.f16385m |= Integer.MIN_VALUE;
        Object objF = this.l.f(null, this);
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : new u70.q(objF);
    }
}
