package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Throwable f4445k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y0 f4446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4447n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(y0 y0Var, z70.c cVar) {
        super(cVar);
        this.f4446m = y0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f4447n |= Integer.MIN_VALUE;
        Object objE = this.f4446m.e(null, this);
        return objE == y70.a.COROUTINE_SUSPENDED ? objE : new u70.q(objE);
    }
}
