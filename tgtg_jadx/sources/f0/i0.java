package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v80.q f16716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16717k;
    public final /* synthetic */ j0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16718m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, z70.c cVar) {
        super(cVar);
        this.l = j0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16717k = obj;
        this.f16718m |= Integer.MIN_VALUE;
        return this.l.a(0L, this);
    }
}
