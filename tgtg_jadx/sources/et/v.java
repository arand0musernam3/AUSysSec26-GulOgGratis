package et;

import com.app.tgtg.model.remote.brief.BriefOrder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BriefOrder f16452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16453k;
    public final /* synthetic */ z l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16454m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, z70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16453k = obj;
        this.f16454m |= Integer.MIN_VALUE;
        return this.l.w(null, null, this);
    }
}
