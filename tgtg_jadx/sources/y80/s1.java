package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t1 f45575k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, x70.c cVar) {
        super(cVar);
        this.f45575k = t1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45574j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f45575k.a(0, this);
    }
}
