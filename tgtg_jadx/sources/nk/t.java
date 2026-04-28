package nk;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f31061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31062k;
    public final /* synthetic */ lh.q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(lh.q qVar, x70.c cVar) {
        super(cVar);
        this.l = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f31061j = obj;
        this.f31062k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
