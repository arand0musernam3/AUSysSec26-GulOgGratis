package nj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f30945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public dv.d f30946k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f30947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30948n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, z70.c cVar) {
        super(cVar);
        this.f30947m = tVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f30948n |= Integer.MIN_VALUE;
        return t.b(this.f30947m, null, null, this);
    }
}
