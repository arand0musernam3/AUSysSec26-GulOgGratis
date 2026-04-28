package lh;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f27820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27821k;
    public final /* synthetic */ q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, x70.c cVar) {
        super(cVar);
        this.l = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f27820j = obj;
        this.f27821k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
