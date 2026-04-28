package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f14578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e90.c f14579k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d1 f14580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14581n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, z70.c cVar) {
        super(cVar);
        this.f14580m = d1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f14581n |= Integer.MIN_VALUE;
        return this.f14580m.d(null, this);
    }
}
