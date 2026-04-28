package hm;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f22144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22145k;
    public final /* synthetic */ al.z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(al.z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22144j = obj;
        this.f22145k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
