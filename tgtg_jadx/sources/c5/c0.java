package c5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q1.h0 f7133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x80.b f7134k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0 f7135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7136n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, z70.c cVar) {
        super(cVar);
        this.f7135m = f0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f7136n |= Integer.MIN_VALUE;
        return this.f7135m.c(this);
    }
}
