package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r0 f5081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5082k;
    public final /* synthetic */ r0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5083m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(r0 r0Var, z70.c cVar) {
        super(cVar);
        this.l = r0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f5082k = obj;
        this.f5083m |= Integer.MIN_VALUE;
        return this.l.i(this);
    }
}
