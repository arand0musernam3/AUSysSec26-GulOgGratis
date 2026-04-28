package bi;

import u70.q;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f6286k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, z70.c cVar) {
        super(cVar);
        this.f6286k = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f6285j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objA = this.f6286k.A(0, this);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : new q(objA);
    }
}
