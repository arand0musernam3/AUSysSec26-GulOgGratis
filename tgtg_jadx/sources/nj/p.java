package nj;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f30939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30940k;
    public final /* synthetic */ j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j jVar, x70.c cVar) {
        super(cVar);
        this.l = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f30939j = obj;
        this.f30940k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
