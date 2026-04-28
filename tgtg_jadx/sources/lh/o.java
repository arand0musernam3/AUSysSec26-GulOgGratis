package lh;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f27812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27813k;
    public final /* synthetic */ l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, x70.c cVar) {
        super(cVar);
        this.l = lVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f27812j = obj;
        this.f27813k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
