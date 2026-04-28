package gt;

import com.app.tgtg.model.remote.order.OrderState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f20879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f20880k;
    public OrderState l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f20882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20883o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, z70.c cVar) {
        super(cVar);
        this.f20882n = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f20881m = obj;
        this.f20883o |= Integer.MIN_VALUE;
        return w.v(this.f20882n, null, null, this);
    }
}
