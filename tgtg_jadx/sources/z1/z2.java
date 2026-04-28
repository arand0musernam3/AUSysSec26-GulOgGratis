package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f46791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46792k;
    public final /* synthetic */ a3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(a3 a3Var, z70.c cVar) {
        super(cVar);
        this.l = a3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46792k = obj;
        this.f46793m |= Integer.MIN_VALUE;
        return this.l.V(0L, 0L, this);
    }
}
