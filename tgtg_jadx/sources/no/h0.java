package no;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f31211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31212k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f31213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31214n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, z70.c cVar) {
        super(cVar);
        this.f31213m = m0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f31214n |= Integer.MIN_VALUE;
        return m0.o(this.f31213m, null, this);
    }
}
