package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o0 f46411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b2.b f46412k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f1 f46413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46414n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(f1 f1Var, z70.c cVar) {
        super(cVar);
        this.f46413m = f1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f46414n |= Integer.MIN_VALUE;
        return f1.P0(this.f46413m, null, this);
    }
}
