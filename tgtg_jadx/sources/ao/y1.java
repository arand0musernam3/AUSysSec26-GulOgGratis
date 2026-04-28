package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z1 f4499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4500k;
    public final /* synthetic */ z1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4501m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, z70.c cVar) {
        super(cVar);
        this.l = z1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4500k = obj;
        this.f4501m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
