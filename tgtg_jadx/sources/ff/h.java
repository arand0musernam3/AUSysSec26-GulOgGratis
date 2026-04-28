package ff;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dn.k f17641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17642k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dn.k f17643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17644n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dn.k kVar, z70.c cVar) {
        super(cVar);
        this.f17643m = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f17644n |= Integer.MIN_VALUE;
        return this.f17643m.m(this);
    }
}
