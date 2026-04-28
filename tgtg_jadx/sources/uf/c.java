package uf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f41083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e90.a f41084k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f41085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41086n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, z70.c cVar) {
        super(cVar);
        this.f41085m = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f41086n |= Integer.MIN_VALUE;
        return g.a(this.f41085m, this);
    }
}
