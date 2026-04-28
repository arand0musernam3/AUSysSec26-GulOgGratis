package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r3 f16762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16763k;
    public final /* synthetic */ q3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16764m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(q3 q3Var, z70.c cVar) {
        super(cVar);
        this.l = q3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16763k = obj;
        this.f16764m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
