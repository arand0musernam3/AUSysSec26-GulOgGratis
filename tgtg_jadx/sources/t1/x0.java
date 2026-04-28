package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f39601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f39602k;
    public final /* synthetic */ y0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f39603m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, z70.c cVar) {
        super(cVar);
        this.l = y0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f39602k = obj;
        this.f39603m |= Integer.MIN_VALUE;
        return y0.t(this.l, this);
    }
}
