package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5210k;
    public AutoCloseable l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r0 f5212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5213o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r0 r0Var, z70.c cVar) {
        super(cVar);
        this.f5212n = r0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f5211m = obj;
        this.f5213o |= Integer.MIN_VALUE;
        return r0.d(this.f5212n, 0L, false, this);
    }
}
