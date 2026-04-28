package ff;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dn.k f17661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f17662k;
    public Long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Long f17663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Long f17664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f17665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ dn.k f17666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17667q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dn.k kVar, z70.c cVar) {
        super(cVar);
        this.f17666p = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f17665o = obj;
        this.f17667q |= Integer.MIN_VALUE;
        return this.f17666p.t(this);
    }
}
