package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f45493k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, x70.c cVar) {
        super(cVar);
        this.f45493k = k0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45492j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f45493k.emit(null, this);
    }
}
