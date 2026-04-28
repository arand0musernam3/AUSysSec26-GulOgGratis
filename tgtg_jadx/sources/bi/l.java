package bi;

import u70.q;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f6292k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z zVar, z70.c cVar) {
        super(cVar);
        this.f6292k = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f6291j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objG = this.f6292k.G(null, this);
        return objG == y70.a.COROUTINE_SUSPENDED ? objG : new q(objG);
    }
}
