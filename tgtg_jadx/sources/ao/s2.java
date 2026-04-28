package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g3 f4451k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(g3 g3Var, z70.c cVar) {
        super(cVar);
        this.f4451k = g3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4450j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objL = this.f4451k.l(null, this);
        return objL == y70.a.COROUTINE_SUSPENDED ? objL : new u70.q(objL);
    }
}
