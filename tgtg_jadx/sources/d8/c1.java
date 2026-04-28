package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e90.c f14590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14591k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d1 f14592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14593n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, z70.c cVar) {
        super(cVar);
        this.f14592m = d1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f14593n |= Integer.MIN_VALUE;
        return this.f14592m.a(null, this);
    }
}
