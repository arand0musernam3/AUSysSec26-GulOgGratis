package et;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f16423k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f16425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z f16426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16427p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, z70.c cVar) {
        super(cVar);
        this.f16426o = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16425n = obj;
        this.f16427p |= Integer.MIN_VALUE;
        Object objO = this.f16426o.o(null, this, false);
        return objO == y70.a.COROUTINE_SUSPENDED ? objO : new u70.q(objO);
    }
}
