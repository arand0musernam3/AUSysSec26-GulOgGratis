package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45617k;
    public final /* synthetic */ n0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f45618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f45619n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(n0 n0Var, x70.c cVar) {
        super(cVar);
        this.l = n0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45616j = obj;
        this.f45617k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
