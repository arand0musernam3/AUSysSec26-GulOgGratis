package jp;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hp.g f25318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f25319k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f25322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f25323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25324q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, z70.c cVar) {
        super(cVar);
        this.f25323p = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f25322o = obj;
        this.f25324q |= Integer.MIN_VALUE;
        Object objA = this.f25323p.a(null, this);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : new u70.q(objA);
    }
}
