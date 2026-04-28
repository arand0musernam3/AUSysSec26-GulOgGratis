package at;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4814k;
    public final /* synthetic */ k l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k kVar, x70.c cVar) {
        super(cVar);
        this.l = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4813j = obj;
        this.f4814k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
