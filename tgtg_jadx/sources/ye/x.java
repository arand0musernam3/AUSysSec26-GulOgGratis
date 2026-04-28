package ye;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f45942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public pf.a f45943k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f45944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b0 f45945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45946o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, z70.c cVar) {
        super(cVar);
        this.f45945n = b0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45944m = obj;
        this.f45946o |= Integer.MIN_VALUE;
        return this.f45945n.f(null, this);
    }
}
