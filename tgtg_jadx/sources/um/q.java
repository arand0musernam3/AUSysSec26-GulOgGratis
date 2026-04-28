package um;

import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BasketResponse f41420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f41421k;
    public final /* synthetic */ t l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41422m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, z70.c cVar) {
        super(cVar);
        this.l = tVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41421k = obj;
        this.f41422m |= Integer.MIN_VALUE;
        return t.f(this.l, null, this);
    }
}
