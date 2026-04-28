package i2;

import t1.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b1 f22784k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f22785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22786n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, z70.c cVar) {
        super(cVar);
        this.f22785m = e0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f22786n |= Integer.MIN_VALUE;
        return this.f22785m.f(0, null, this);
    }
}
