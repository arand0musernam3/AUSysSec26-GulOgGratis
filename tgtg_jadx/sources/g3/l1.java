package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f18995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f18996k;
    public final /* synthetic */ m1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18997m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, z70.c cVar) {
        super(cVar);
        this.l = m1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f18996k = obj;
        this.f18997m |= Integer.MIN_VALUE;
        return this.l.V(0L, 0L, this);
    }
}
