package qb;

/* JADX INFO: loaded from: classes.dex */
public final class p extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f36852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36853k;
    public final /* synthetic */ oq.k l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(oq.k kVar, x70.c cVar) {
        super(cVar);
        this.l = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f36852j = obj;
        this.f36853k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
