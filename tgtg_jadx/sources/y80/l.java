package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45506k;
    public final /* synthetic */ at.o l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public at.o f45507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f45508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45509o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45510p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(at.o oVar, x70.c cVar) {
        super(cVar);
        this.l = oVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45505j = obj;
        this.f45506k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
