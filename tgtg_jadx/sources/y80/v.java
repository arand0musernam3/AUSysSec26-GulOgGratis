package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45593k;
    public final /* synthetic */ w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w f45594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f45595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z80.t f45596o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, x70.c cVar) {
        super(cVar);
        this.l = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45592j = obj;
        this.f45593k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
