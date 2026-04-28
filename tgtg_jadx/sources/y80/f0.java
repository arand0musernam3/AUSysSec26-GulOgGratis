package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f45472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f45473k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g0 f45474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45475n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, x70.c cVar) {
        super(cVar);
        this.f45474m = g0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f45475n |= Integer.MIN_VALUE;
        return this.f45474m.emit(null, this);
    }
}
