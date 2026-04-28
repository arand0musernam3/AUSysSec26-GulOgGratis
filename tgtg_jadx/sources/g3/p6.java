package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p6 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19315k;
    public final /* synthetic */ r6 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(r6 r6Var, z70.c cVar) {
        super(cVar);
        this.l = r6Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f19315k = obj;
        this.f19316m |= Integer.MIN_VALUE;
        return this.l.V(0L, 0L, this);
    }
}
