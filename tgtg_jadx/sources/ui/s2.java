package ui;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f41275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m3 f41276k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(m3 m3Var, z70.c cVar) {
        super(cVar);
        this.f41276k = m3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41275j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objC = this.f41276k.c(0, null, null, null, this);
        return objC == y70.a.COROUTINE_SUSPENDED ? objC : new u70.q(objC);
    }
}
