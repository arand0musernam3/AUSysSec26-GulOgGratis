package d8;

/* JADX INFO: loaded from: classes.dex */
public final class n extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f14657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14658k;
    public final /* synthetic */ al.z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(al.z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14657j = obj;
        this.f14658k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
