package pk;

import com.app.tgtg.model.remote.item.response.BasicItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BasicItem f35462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f35463k;
    public final /* synthetic */ i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35464m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, z70.c cVar) {
        super(cVar);
        this.l = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f35463k = obj;
        this.f35464m |= Integer.MIN_VALUE;
        return this.l.f(null, this);
    }
}
