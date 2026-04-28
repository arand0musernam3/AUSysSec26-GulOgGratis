package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g3 f4485k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(g3 g3Var, z70.c cVar) {
        super(cVar);
        this.f4485k = g3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Exception {
        this.f4484j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objR = this.f4485k.r(null, this);
        return objR == y70.a.COROUTINE_SUSPENDED ? objR : new u70.q(objR);
    }
}
