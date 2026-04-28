package aa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a0 f1174k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, z70.c cVar) {
        super(cVar);
        this.f1174k = a0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f1173j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f1174k.a(this);
    }
}
