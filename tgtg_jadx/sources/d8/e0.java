package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f14604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f14605k;
    public h0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f0 f14607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14608o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, z70.c cVar) {
        super(cVar);
        this.f14607n = f0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14606m = obj;
        this.f14608o |= Integer.MIN_VALUE;
        return this.f14607n.b(null, this);
    }
}
