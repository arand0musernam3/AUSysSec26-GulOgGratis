package et;

import com.app.tgtg.model.remote.order.Order;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Order f16455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Order f16456k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f16457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16458n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, z70.c cVar) {
        super(cVar);
        this.f16457m = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f16458n |= Integer.MIN_VALUE;
        return this.f16457m.x(null, null, this);
    }
}
