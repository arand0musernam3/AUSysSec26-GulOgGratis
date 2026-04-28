package ui;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f41288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m3 f41289k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(m3 m3Var, z70.c cVar) {
        super(cVar);
        this.f41289k = m3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41288j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objF = this.f41289k.f(null, this);
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : new u70.q(objF);
    }
}
