package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v80.i0 f16561k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c1 f16562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16563n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, z70.c cVar) {
        super(cVar);
        this.f16562m = c1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f16563n |= Integer.MIN_VALUE;
        return this.f16562m.c(null, this);
    }
}
