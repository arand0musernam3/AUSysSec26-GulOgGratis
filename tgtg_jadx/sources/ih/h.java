package ih;

import y80.j;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f23848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23849k;
    public final /* synthetic */ g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f23850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23852o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, x70.c cVar) {
        super(cVar);
        this.l = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f23848j = obj;
        this.f23849k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
