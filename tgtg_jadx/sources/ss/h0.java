package ss;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f39183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39184k;
    public final /* synthetic */ e0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e0 e0Var, x70.c cVar) {
        super(cVar);
        this.l = e0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f39183j = obj;
        this.f39184k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
