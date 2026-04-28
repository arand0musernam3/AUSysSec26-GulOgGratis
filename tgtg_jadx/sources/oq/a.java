package oq;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f32914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32915k;
    public final /* synthetic */ lh.q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lh.q qVar, x70.c cVar) {
        super(cVar);
        this.l = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f32914j = obj;
        this.f32915k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
