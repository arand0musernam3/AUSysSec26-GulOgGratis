package ln;

import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f27949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f27950k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, z70.c cVar) {
        super(cVar);
        this.f27950k = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f27949j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objE = this.f27950k.e(null, null, this);
        return objE == y70.a.COROUTINE_SUSPENDED ? objE : new q(objE);
    }
}
