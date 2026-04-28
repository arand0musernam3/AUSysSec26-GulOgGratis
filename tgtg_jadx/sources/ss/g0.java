package ss;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f39178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39179k;
    public final /* synthetic */ oq.k l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(oq.k kVar, x70.c cVar) {
        super(cVar);
        this.l = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f39178j = obj;
        this.f39179k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
