package nj;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f30943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30944k;
    public final /* synthetic */ j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j jVar, x70.c cVar) {
        super(cVar);
        this.l = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f30943j = obj;
        this.f30944k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
