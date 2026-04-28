package pk;

import ao.r1;
import com.app.tgtg.model.remote.item.LatLngInfo;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LatLngInfo f35440k;
    public r1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f35441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f35442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f35443o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35444p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, z70.c cVar) {
        super(cVar);
        this.f35443o = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f35442n = obj;
        this.f35444p |= Integer.MIN_VALUE;
        return this.f35443o.b(null, null, this);
    }
}
