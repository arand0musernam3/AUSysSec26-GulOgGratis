package xg;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f44287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44288k;
    public final /* synthetic */ h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h hVar, x70.c cVar) {
        super(cVar);
        this.l = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f44287j = obj;
        this.f44288k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
