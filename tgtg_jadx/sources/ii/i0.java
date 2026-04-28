package ii;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f23909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23910k;
    public final /* synthetic */ al.z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(al.z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f23909j = obj;
        this.f23910k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
