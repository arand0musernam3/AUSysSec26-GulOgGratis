package ao;

import com.app.tgtg.model.remote.discover.request.BucketFillerType;
import com.app.tgtg.model.remote.discover.request.SingleBucketPaging;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BucketFillerType f4369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleBucketPaging f4370k;
    public r1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f4372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r1 f4373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4374p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r1 r1Var, z70.c cVar) {
        super(cVar);
        this.f4373o = r1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4372n = obj;
        this.f4374p |= Integer.MIN_VALUE;
        Object objP = this.f4373o.p(null, null, false, this);
        return objP == y70.a.COROUTINE_SUSPENDED ? objP : new u70.q(objP);
    }
}
