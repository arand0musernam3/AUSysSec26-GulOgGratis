package jp;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hp.g f25351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f25352k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f25354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f25355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25356p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, z70.c cVar) {
        super(cVar);
        this.f25355o = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f25354n = obj;
        this.f25356p |= Integer.MIN_VALUE;
        Object objO = this.f25355o.o(null, this);
        return objO == y70.a.COROUTINE_SUSPENDED ? objO : new u70.q(objO);
    }
}
