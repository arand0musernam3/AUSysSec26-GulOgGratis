package lh;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f27798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27799k;
    public final /* synthetic */ aa.m l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(aa.m mVar, x70.c cVar) {
        super(cVar);
        this.l = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f27798j = obj;
        this.f27799k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
