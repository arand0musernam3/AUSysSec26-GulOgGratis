package ye;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f45846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public xf.b f45847k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f45848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45849n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, z70.c cVar) {
        super(cVar);
        this.f45848m = bVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f45849n |= Integer.MIN_VALUE;
        return b.b(this.f45848m, null, this);
    }
}
