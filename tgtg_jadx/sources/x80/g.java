package x80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f44039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f44040k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, z70.c cVar) {
        super(cVar);
        this.f44040k = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f44039j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objF = i.F(this.f44040k, this);
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : new p(objF);
    }
}
