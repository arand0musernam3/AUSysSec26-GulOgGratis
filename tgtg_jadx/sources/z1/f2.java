package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f46507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g2 f46508k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var, z70.c cVar) {
        super(cVar);
        this.f46508k = g2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46507j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f46508k.g(null, null, this);
    }
}
