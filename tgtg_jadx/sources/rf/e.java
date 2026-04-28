package rf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f37974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f37975k;
    public final /* synthetic */ g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37976m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, z70.c cVar) {
        super(cVar);
        this.l = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f37975k = obj;
        this.f37976m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
