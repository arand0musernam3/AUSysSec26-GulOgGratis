package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0 f14598k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0 f14599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, z70.c cVar) {
        super(cVar);
        this.f14599m = f0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f14600n |= Integer.MIN_VALUE;
        return this.f14599m.a(null, this);
    }
}
