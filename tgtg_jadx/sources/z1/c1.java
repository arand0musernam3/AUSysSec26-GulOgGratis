package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p0 f46434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46435k;
    public final /* synthetic */ f1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46436m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(f1 f1Var, z70.c cVar) {
        super(cVar);
        this.l = f1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46435k = obj;
        this.f46436m |= Integer.MIN_VALUE;
        return f1.Q0(this.l, null, this);
    }
}
