package tc;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f39938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public rc.g f39939k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f39940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f39941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39942o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, z70.c cVar) {
        super(cVar);
        this.f39941n = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f39940m = obj;
        this.f39942o |= Integer.MIN_VALUE;
        return this.f39941n.a(this);
    }
}
