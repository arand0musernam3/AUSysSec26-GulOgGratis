package qc;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f36885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e90.e f36886k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f36887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36888n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, z70.c cVar) {
        super(cVar);
        this.f36887m = dVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f36888n |= Integer.MIN_VALUE;
        return this.f36887m.a(this);
    }
}
