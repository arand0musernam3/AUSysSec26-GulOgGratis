package nk;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f31068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31069k;
    public final /* synthetic */ m l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m mVar, x70.c cVar) {
        super(cVar);
        this.l = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f31068j = obj;
        this.f31069k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
