package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45613k;
    public final /* synthetic */ w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w f45614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f45615n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, x70.c cVar) {
        super(cVar);
        this.l = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45612j = obj;
        this.f45613k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
