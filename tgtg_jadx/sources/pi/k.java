package pi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f35393k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f35394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35395n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, z70.c cVar) {
        super(cVar);
        this.f35394m = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f35395n |= Integer.MIN_VALUE;
        return this.f35394m.b(this);
    }
}
