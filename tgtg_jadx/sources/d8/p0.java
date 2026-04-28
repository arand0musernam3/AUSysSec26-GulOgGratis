package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f14670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f14671k;
    public AutoCloseable l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r0 f14673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14674o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, z70.c cVar) {
        super(cVar);
        this.f14673n = r0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14672m = obj;
        this.f14674o |= Integer.MIN_VALUE;
        return this.f14673n.d(null, this);
    }
}
