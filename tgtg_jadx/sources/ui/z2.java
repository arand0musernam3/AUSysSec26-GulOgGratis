package ui;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f41305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m3 f41306k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(m3 m3Var, z70.c cVar) {
        super(cVar);
        this.f41306k = m3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41305j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objJ = this.f41306k.j(null, this);
        return objJ == y70.a.COROUTINE_SUSPENDED ? objJ : new u70.q(objJ);
    }
}
