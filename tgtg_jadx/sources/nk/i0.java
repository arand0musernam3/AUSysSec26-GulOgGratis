package nk;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f31001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31002k;
    public final /* synthetic */ m l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m mVar, x70.c cVar) {
        super(cVar);
        this.l = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f31001j = obj;
        this.f31002k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
