package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f46559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k2 f46560k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, z70.c cVar) {
        super(cVar);
        this.f46560k = k2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46559j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f46560k.g(this);
    }
}
