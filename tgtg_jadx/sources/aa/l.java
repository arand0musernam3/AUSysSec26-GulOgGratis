package aa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1135k;
    public y80.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f1136m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, x70.c cVar) {
        super(cVar);
        this.f1136m = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f1134j = obj;
        this.f1135k |= Integer.MIN_VALUE;
        return this.f1136m.emit(null, this);
    }
}
