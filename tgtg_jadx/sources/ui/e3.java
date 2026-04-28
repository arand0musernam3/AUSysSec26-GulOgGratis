package ui;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f41192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m3 f41193k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(m3 m3Var, z70.c cVar) {
        super(cVar);
        this.f41193k = m3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41192j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objO = this.f41193k.o(null, this);
        return objO == y70.a.COROUTINE_SUSPENDED ? objO : new u70.q(objO);
    }
}
