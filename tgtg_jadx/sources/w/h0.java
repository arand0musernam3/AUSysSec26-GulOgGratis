package w;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f42690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42691k;
    public final /* synthetic */ ss.o0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ss.o0 o0Var, x70.c cVar) {
        super(cVar);
        this.l = o0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f42690j = obj;
        this.f42691k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
