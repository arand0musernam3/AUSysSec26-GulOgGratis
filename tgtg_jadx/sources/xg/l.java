package xg;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f44277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44278k;
    public final /* synthetic */ nj.d l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(nj.d dVar, x70.c cVar) {
        super(cVar);
        this.l = dVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f44277j = obj;
        this.f44278k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
