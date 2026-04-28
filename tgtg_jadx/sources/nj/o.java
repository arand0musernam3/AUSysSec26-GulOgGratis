package nj;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f30937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30938k;
    public final /* synthetic */ d l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, x70.c cVar) {
        super(cVar);
        this.l = dVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f30937j = obj;
        this.f30938k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
