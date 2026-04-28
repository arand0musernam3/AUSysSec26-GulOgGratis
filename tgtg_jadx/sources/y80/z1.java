package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2 f45627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f45628k;
    public b2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v80.i1 f45629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f45630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f45631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a2 f45632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45633q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, x70.c cVar) {
        super(cVar);
        this.f45632p = a2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45631o = obj;
        this.f45633q |= Integer.MIN_VALUE;
        return this.f45632p.collect(null, this);
    }
}
