package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45490k;
    public final /* synthetic */ mn.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f45491m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(mn.j jVar, x70.c cVar) {
        super(cVar);
        this.l = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45489j = obj;
        this.f45490k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
