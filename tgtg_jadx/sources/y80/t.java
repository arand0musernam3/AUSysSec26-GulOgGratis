package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45577k;
    public final /* synthetic */ u l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f45578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f45579n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, x70.c cVar) {
        super(cVar);
        this.l = uVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45576j = obj;
        this.f45577k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
