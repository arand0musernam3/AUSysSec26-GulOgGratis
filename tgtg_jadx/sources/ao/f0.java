package ao;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4242k;
    public final /* synthetic */ al.z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(al.z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4241j = obj;
        this.f4242k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
