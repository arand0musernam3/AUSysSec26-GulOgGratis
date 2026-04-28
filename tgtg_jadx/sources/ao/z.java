package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f4505k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, z70.c cVar) {
        super(cVar);
        this.f4505k = c0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4504j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objD = this.f4505k.d(null, this);
        return objD == y70.a.COROUTINE_SUSPENDED ? objD : new u70.q(objD);
    }
}
