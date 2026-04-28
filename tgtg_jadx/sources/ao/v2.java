package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4478k;
    public final /* synthetic */ g3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4479m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(g3 g3Var, z70.c cVar) {
        super(cVar);
        this.l = g3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4478k = obj;
        this.f4479m |= Integer.MIN_VALUE;
        Object objQ = this.l.q(null, this);
        return objQ == y70.a.COROUTINE_SUSPENDED ? objQ : new u70.q(objQ);
    }
}
