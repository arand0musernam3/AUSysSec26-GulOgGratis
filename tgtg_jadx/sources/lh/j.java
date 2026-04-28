package lh;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f27800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27801k;
    public final /* synthetic */ al.z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(al.z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f27800j = obj;
        this.f27801k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
