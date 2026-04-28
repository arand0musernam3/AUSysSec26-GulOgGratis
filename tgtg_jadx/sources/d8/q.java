package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e90.c f14675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14676k;
    public final /* synthetic */ y l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14677m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, z70.c cVar) {
        super(cVar);
        this.l = yVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14676k = obj;
        this.f14677m |= Integer.MIN_VALUE;
        return y.d(this.l, this);
    }
}
