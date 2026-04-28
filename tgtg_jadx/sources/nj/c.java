package nj;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f30909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30910k;
    public final /* synthetic */ d l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, x70.c cVar) {
        super(cVar);
        this.l = dVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f30909j = obj;
        this.f30910k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
