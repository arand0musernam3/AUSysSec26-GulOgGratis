package y80;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45512k;
    public final /* synthetic */ w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n0 f45513m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(w wVar, x70.c cVar) {
        super(cVar);
        this.l = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45511j = obj;
        this.f45512k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
