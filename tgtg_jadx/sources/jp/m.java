package jp;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f25347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f25348k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, z70.c cVar) {
        super(cVar);
        this.f25348k = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f25347j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objM = this.f25348k.m(null, this);
        return objM == y70.a.COROUTINE_SUSPENDED ? objM : new u70.q(objM);
    }
}
