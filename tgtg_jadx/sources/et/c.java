package et;

import com.app.tgtg.model.remote.order.Order;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Order f16356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e90.a f16357k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f16359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16360o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z zVar, z70.c cVar) {
        super(cVar);
        this.f16359n = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16358m = obj;
        this.f16360o |= Integer.MIN_VALUE;
        return this.f16359n.b(null, this);
    }
}
