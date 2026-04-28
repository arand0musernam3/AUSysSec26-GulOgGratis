package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45451k;
    public final /* synthetic */ w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w f45452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f45453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Throwable f45454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f45455p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(w wVar, x70.c cVar) {
        super(cVar);
        this.l = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45450j = obj;
        this.f45451k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
