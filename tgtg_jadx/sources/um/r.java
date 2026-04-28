package um;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f41423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t f41424k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, z70.c cVar) {
        super(cVar);
        this.f41424k = tVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41423j = obj;
        this.l |= Integer.MIN_VALUE;
        return t.g(this.f41424k, null, null, this);
    }
}
