package cj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f8419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8420k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f8421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8422n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e0 e0Var, z70.c cVar) {
        super(cVar);
        this.f8421m = e0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f8422n |= Integer.MIN_VALUE;
        return e0.a(this.f8421m, this);
    }
}
