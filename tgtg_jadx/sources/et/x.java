package et;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16460k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f16461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16462n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, z70.c cVar) {
        super(cVar);
        this.f16461m = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f16462n |= Integer.MIN_VALUE;
        Object objY = this.f16461m.y(null, null, false, this);
        return objY == y70.a.COROUTINE_SUSPENDED ? objY : new u70.q(objY);
    }
}
