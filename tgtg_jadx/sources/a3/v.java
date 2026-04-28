package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f591k;
    public e90.c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0 f594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f595p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b0 b0Var, z70.c cVar) {
        super(cVar);
        this.f594o = b0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f593n = obj;
        this.f595p |= Integer.MIN_VALUE;
        return b0.a(this.f594o, null, 0L, null, this);
    }
}
