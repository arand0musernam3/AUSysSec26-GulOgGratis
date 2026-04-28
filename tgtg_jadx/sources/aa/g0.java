package aa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f1102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Throwable f1103k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0 f1105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1106o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, z70.c cVar) {
        super(cVar);
        this.f1105n = i0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f1104m = obj;
        this.f1106o |= Integer.MIN_VALUE;
        return this.f1105n.g(null, null, this);
    }
}
