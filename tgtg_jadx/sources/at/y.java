package at;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4821k;
    public final /* synthetic */ k l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k kVar, x70.c cVar) {
        super(cVar);
        this.l = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4820j = obj;
        this.f4821k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
