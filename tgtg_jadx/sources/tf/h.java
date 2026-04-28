package tf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f40126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f40127k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, z70.c cVar) {
        super(cVar);
        this.f40127k = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f40126j = obj;
        this.l |= Integer.MIN_VALUE;
        return j.b(this.f40127k, this);
    }
}
