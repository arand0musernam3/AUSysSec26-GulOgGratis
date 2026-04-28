package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y1 f5069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o2 f5070k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d2 f5071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5072n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(d2 d2Var, z70.c cVar) {
        super(cVar);
        this.f5071m = d2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f5072n |= Integer.MIN_VALUE;
        return d2.b(this.f5071m, null, null, this);
    }
}
