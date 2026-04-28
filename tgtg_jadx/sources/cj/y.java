package cj;

import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DeliveryOptionsResponse f8432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8433k;
    public final /* synthetic */ e0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8434m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e0 e0Var, z70.c cVar) {
        super(cVar);
        this.l = e0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f8433k = obj;
        this.f8434m |= Integer.MIN_VALUE;
        return this.l.g(null, this);
    }
}
