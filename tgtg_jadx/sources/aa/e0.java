package aa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y9.d0 f1083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f1084k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0 f1085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1086n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, z70.c cVar) {
        super(cVar);
        this.f1085m = i0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f1086n |= Integer.MIN_VALUE;
        return this.f1085m.e(null, this);
    }
}
