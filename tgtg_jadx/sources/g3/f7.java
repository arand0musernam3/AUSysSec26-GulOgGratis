package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f7 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e7 f18616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e90.a f18617k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g7 f18618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18619n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(g7 g7Var, x70.c cVar) {
        super(cVar);
        this.f18618m = g7Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f18619n |= Integer.MIN_VALUE;
        return this.f18618m.b(null, this);
    }
}
