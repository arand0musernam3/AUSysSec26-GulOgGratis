package hm;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f22142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22143k;
    public final /* synthetic */ al.z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(al.z zVar, x70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22142j = obj;
        this.f22143k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
