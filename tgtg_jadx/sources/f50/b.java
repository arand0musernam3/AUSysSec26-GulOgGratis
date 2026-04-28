package f50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f17328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e90.a f17329k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f17330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17331n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, z70.c cVar2) {
        super(cVar2);
        this.f17330m = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f17331n |= Integer.MIN_VALUE;
        return this.f17330m.d(this);
    }
}
