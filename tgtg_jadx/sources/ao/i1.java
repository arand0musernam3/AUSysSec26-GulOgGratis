package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r1 f4313k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(r1 r1Var, z70.c cVar) {
        super(cVar);
        this.f4313k = r1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4312j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objI = this.f4313k.i(null, this);
        return objI == y70.a.COROUTINE_SUSPENDED ? objI : new u70.q(objI);
    }
}
