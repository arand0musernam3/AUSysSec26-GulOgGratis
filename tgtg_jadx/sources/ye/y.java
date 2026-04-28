package ye;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f45947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45948k;
    public final /* synthetic */ b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45949m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, z70.c cVar) {
        super(cVar);
        this.l = b0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45948k = obj;
        this.f45949m |= Integer.MIN_VALUE;
        return b0.c(this.l, null, this);
    }
}
