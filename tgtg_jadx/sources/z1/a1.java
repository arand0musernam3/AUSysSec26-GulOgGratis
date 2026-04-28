package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f46394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f1 f46395k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(f1 f1Var, z70.c cVar) {
        super(cVar);
        this.f46395k = f1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46394j = obj;
        this.l |= Integer.MIN_VALUE;
        return f1.O0(this.f46395k, this);
    }
}
