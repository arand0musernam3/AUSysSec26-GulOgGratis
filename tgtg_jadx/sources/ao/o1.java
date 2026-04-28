package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r1 f4384k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r1 r1Var, z70.c cVar) {
        super(cVar);
        this.f4384k = r1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4383j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objQ = this.f4384k.q(null, this);
        return objQ == y70.a.COROUTINE_SUSPENDED ? objQ : new u70.q(objQ);
    }
}
