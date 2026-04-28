package rf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f37977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f37978k;
    public final /* synthetic */ g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37979m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, z70.c cVar) {
        super(cVar);
        this.l = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f37978k = obj;
        this.f37979m |= Integer.MIN_VALUE;
        return this.l.c(this);
    }
}
