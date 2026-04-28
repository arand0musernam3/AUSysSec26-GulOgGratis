package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n0 f45525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45526k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0 f45527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f45528n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, x70.c cVar) {
        super(cVar);
        this.f45527m = n0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45526k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f45527m.emit(null, this);
    }
}
