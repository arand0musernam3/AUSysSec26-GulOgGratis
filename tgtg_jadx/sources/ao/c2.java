package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f2 f4204k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(f2 f2Var, z70.c cVar) {
        super(cVar);
        this.f4204k = f2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4203j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objC = this.f4204k.c(this);
        return objC == y70.a.COROUTINE_SUSPENDED ? objC : new u70.q(objC);
    }
}
