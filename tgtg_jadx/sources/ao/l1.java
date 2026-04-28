package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4341j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r1 f4342k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(r1 r1Var, z70.c cVar) {
        super(cVar);
        this.f4342k = r1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f4341j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objN = this.f4342k.n(null, null, this);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : new u70.q(objN);
    }
}
