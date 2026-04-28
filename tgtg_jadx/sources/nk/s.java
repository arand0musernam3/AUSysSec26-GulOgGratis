package nk;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f31059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31060k;
    public final /* synthetic */ nj.d l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nj.d dVar, x70.c cVar) {
        super(cVar);
        this.l = dVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f31059j = obj;
        this.f31060k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
