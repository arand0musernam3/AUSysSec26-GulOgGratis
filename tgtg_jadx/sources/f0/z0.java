package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v80.i0 f17007k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c1 f17008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17009n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c1 c1Var, z70.c cVar) {
        super(cVar);
        this.f17008m = c1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f17009n |= Integer.MIN_VALUE;
        return this.f17008m.b(null, this);
    }
}
