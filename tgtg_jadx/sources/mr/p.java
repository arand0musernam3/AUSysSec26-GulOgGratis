package mr;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f30105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f30106k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, z70.c cVar) {
        super(cVar);
        this.f30106k = rVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f30105j = obj;
        this.l |= Integer.MIN_VALUE;
        return r.b(this.f30106k, null, this);
    }
}
