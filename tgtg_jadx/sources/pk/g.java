package pk;

import ao.r1;
import com.app.tgtg.model.remote.item.LatLngInfo;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r1 f35454k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LatLngInfo f35455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e90.a f35456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f35459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f35460r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35461s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, z70.c cVar) {
        super(cVar);
        this.f35460r = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f35459q = obj;
        this.f35461s |= Integer.MIN_VALUE;
        Object objE = this.f35460r.e(null, this);
        return objE == y70.a.COROUTINE_SUSPENDED ? objE : new q(objE);
    }
}
