package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d1 f17011k;
    public d0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f17014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f2 f17015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17016q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(f2 f2Var, z70.c cVar) {
        super(cVar);
        this.f17015p = f2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f17014o = obj;
        this.f17016q |= Integer.MIN_VALUE;
        return this.f17015p.c(null, 0, 0L, null, null, this);
    }
}
