package et;

import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Order f16400k;
    public OrderResult l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f16401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f16404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f16405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16406r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z zVar, z70.c cVar) {
        super(cVar);
        this.f16405q = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16404p = obj;
        this.f16406r |= Integer.MIN_VALUE;
        Object objK = this.f16405q.k(null, this);
        return objK == y70.a.COROUTINE_SUSPENDED ? objK : new u70.q(objK);
    }
}
