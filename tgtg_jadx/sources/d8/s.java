package d8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e1 f14697k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f14698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14699n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, x70.c cVar) {
        super(cVar);
        this.f14698m = yVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f14699n |= Integer.MIN_VALUE;
        return y.f(this.f14698m, false, this);
    }
}
