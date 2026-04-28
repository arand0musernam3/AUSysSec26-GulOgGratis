package ye;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0 f45851k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, z70.c cVar) {
        super(cVar);
        this.f45851k = b0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45850j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f45851k.j(0L, this);
    }
}
