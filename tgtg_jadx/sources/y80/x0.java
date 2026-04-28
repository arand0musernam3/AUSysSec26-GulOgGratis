package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45609k;
    public final /* synthetic */ ss.o0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ss.o0 o0Var, x70.c cVar) {
        super(cVar);
        this.l = o0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45608j = obj;
        this.f45609k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
