package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a3.w1 f45570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45571k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a3.w1 f45572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f45573n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(a3.w1 w1Var, x70.c cVar) {
        super(cVar);
        this.f45572m = w1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45571k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f45572m.emit(null, this);
    }
}
