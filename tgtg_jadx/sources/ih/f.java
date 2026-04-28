package ih;

import y80.j;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f23841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23842k;
    public final /* synthetic */ g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f23843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23844n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, x70.c cVar) {
        super(cVar);
        this.l = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f23841j = obj;
        this.f23842k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
