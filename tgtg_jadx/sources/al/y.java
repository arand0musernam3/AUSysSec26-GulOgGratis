package al;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1599k;
    public final /* synthetic */ z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f1598j = obj;
        this.f1599k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
