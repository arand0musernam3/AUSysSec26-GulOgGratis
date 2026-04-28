package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u0 f7629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7630k;
    public final /* synthetic */ u0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7631m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, z70.c cVar) {
        super(cVar);
        this.l = u0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f7630k = obj;
        this.f7631m |= Integer.MIN_VALUE;
        return u0.a(this.l, this);
    }
}
