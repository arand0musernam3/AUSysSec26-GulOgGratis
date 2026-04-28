package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x80.u f45439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45440k;
    public final /* synthetic */ c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45441m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, z70.c cVar2) {
        super(cVar2);
        this.l = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45440k = obj;
        this.f45441m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
