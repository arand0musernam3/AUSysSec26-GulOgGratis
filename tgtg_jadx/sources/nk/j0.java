package nk;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f31007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31008k;
    public final /* synthetic */ lh.q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(lh.q qVar, x70.c cVar) {
        super(cVar);
        this.l = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f31007j = obj;
        this.f31008k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
