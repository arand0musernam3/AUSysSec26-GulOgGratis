package mr;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f30103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f30104k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, z70.c cVar) {
        super(cVar);
        this.f30104k = rVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f30103j = obj;
        this.l |= Integer.MIN_VALUE;
        return r.a(this.f30104k, this);
    }
}
