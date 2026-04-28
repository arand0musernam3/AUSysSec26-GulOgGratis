package a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f213k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, z70.c cVar) {
        super(cVar);
        this.f213k = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f212j = obj;
        this.l |= Integer.MIN_VALUE;
        return j.b(this.f213k, null, 0.0f, 0.0f, null, this);
    }
}
