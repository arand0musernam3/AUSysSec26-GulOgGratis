package qc;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f36938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f36939k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f36940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36941n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, z70.c cVar) {
        super(cVar);
        this.f36940m = a0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f36941n |= Integer.MIN_VALUE;
        return this.f36940m.d(null, this);
    }
}
