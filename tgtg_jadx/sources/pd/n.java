package pd;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f34693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r f34694k;
    public jd.f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f34695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f34696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34697o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, z70.c cVar) {
        super(cVar);
        this.f34696n = oVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f34695m = obj;
        this.f34697o |= Integer.MIN_VALUE;
        return o.d(this.f34696n, null, null, null, this);
    }
}
