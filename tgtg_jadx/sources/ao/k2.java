package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f4334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4335k;
    public final /* synthetic */ g3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4336m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(g3 g3Var, z70.c cVar) {
        super(cVar);
        this.l = g3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f4335k = obj;
        this.f4336m |= Integer.MIN_VALUE;
        Object objC = this.l.c(null, this);
        return objC == y70.a.COROUTINE_SUSPENDED ? objC : new u70.q(objC);
    }
}
