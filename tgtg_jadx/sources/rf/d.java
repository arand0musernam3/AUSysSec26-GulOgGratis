package rf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f37970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public pf.a f37971k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f37972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37973n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, z70.c cVar) {
        super(cVar);
        this.f37972m = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f37973n |= Integer.MIN_VALUE;
        return this.f37972m.a(null, this);
    }
}
