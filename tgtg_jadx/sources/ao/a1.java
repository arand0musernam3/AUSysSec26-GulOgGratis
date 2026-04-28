package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r1 f4177k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(r1 r1Var, z70.c cVar) {
        super(cVar);
        this.f4177k = r1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4176j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objB = this.f4177k.b(null, this);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : new u70.q(objB);
    }
}
