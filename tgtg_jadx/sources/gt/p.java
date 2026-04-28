package gt;

import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f20873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public OrderState f20874k;
    public Order l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f20876n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f20877o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20878p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, z70.c cVar) {
        super(cVar);
        this.f20877o = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f20876n = obj;
        this.f20878p |= Integer.MIN_VALUE;
        return w.u(this.f20877o, null, null, false, this);
    }
}
