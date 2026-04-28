package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0.n f16639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h1.d f16640k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g0 f16642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16643o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, z70.c cVar) {
        super(cVar);
        this.f16642n = g0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16641m = obj;
        this.f16643o |= Integer.MIN_VALUE;
        return this.f16642n.a(null, this);
    }
}
