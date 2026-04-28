package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v80.q f5191k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l1 f5192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5193n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var, z70.c cVar) {
        super(cVar);
        this.f5192m = l1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f5193n |= Integer.MIN_VALUE;
        return this.f5192m.b(0L, this);
    }
}
