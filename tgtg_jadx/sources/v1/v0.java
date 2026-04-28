package v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b2.h f41855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f41856k;
    public final /* synthetic */ y0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41857m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(y0 y0Var, z70.c cVar) {
        super(cVar);
        this.l = y0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41856k = obj;
        this.f41857m |= Integer.MIN_VALUE;
        return y0.L0(this.l, this);
    }
}
