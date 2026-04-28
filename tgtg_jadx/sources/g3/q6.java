package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19358k;
    public final /* synthetic */ r6 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(r6 r6Var, z70.c cVar) {
        super(cVar);
        this.l = r6Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f19358k = obj;
        this.f19359m |= Integer.MIN_VALUE;
        return this.l.q(0L, this);
    }
}
