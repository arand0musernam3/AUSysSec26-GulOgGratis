package nk;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f30983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30984k;
    public final /* synthetic */ m l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(m mVar, x70.c cVar) {
        super(cVar);
        this.l = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f30983j = obj;
        this.f30984k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
