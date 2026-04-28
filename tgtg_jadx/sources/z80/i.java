package z80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f47370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f47371k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f47372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47373n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, x70.c cVar) {
        super(cVar);
        this.f47372m = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f47373n |= Integer.MIN_VALUE;
        return this.f47372m.emit(null, this);
    }
}
