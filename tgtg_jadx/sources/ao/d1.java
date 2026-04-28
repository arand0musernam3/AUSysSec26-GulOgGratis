package ao;

import com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public pt.b f4215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DiscoverSingleBucketResponse f4216k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r1 f4217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4218n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(r1 r1Var, z70.c cVar) {
        super(cVar);
        this.f4217m = r1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f4218n |= Integer.MIN_VALUE;
        return this.f4217m.e(null, this);
    }
}
