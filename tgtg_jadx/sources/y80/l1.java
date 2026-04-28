package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m1 f45514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f45515k;
    public n1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v80.i1 f45516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f45517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m1 f45518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45519p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, x70.c cVar) {
        super(cVar);
        this.f45518o = m1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45517n = obj;
        this.f45519p |= Integer.MIN_VALUE;
        return m1.k(this.f45518o, null, this);
    }
}
