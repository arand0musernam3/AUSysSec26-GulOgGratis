package bi;

import com.app.tgtg.model.remote.order.CancelOrderState;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f6267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CancelOrderState f6268k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f6269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6270n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z zVar, z70.c cVar) {
        super(cVar);
        this.f6269m = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f6270n |= Integer.MIN_VALUE;
        return this.f6269m.e(null, this);
    }
}
