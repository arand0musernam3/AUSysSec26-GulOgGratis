package v4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f41985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f41986k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f41987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41988n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, z70.c cVar) {
        super(cVar);
        this.f41987m = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f41988n |= Integer.MIN_VALUE;
        return this.f41987m.V(0L, 0L, this);
    }
}
