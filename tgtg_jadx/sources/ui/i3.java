package ui;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f41220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m3 f41221k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(m3 m3Var, z70.c cVar) {
        super(cVar);
        this.f41221k = m3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41220j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objS = this.f41221k.s(null, null, null, this);
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : new u70.q(objS);
    }
}
