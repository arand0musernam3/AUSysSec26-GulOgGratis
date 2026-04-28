package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4394k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r1 f4395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4396n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, z70.c cVar) {
        super(cVar);
        this.f4395m = r1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f4396n |= Integer.MIN_VALUE;
        Object objR = this.f4395m.r(null, false, null, this);
        return objR == y70.a.COROUTINE_SUSPENDED ? objR : new u70.q(objR);
    }
}
