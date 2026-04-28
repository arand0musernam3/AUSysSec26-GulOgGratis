package lh;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f27814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27815k;
    public final /* synthetic */ q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, x70.c cVar) {
        super(cVar);
        this.l = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f27814j = obj;
        this.f27815k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
