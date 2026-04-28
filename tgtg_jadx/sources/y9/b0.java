package y9;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45653k;
    public final /* synthetic */ y l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45654m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y yVar, z70.c cVar) {
        super(cVar);
        this.l = yVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45653k = obj;
        this.f45654m |= Integer.MIN_VALUE;
        return y.l(this.l, this);
    }
}
