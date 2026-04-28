package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f4208k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f4210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4211o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, z70.c cVar) {
        super(cVar);
        this.f4210n = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4209m = obj;
        this.f4211o |= Integer.MIN_VALUE;
        Object objA = this.f4210n.a(false, this);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : new u70.q(objA);
    }
}
