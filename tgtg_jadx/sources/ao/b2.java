package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f2 f4190k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(f2 f2Var, z70.c cVar) {
        super(cVar);
        this.f4190k = f2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4189j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objB = this.f4190k.b(null, this);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : new u70.q(objB);
    }
}
