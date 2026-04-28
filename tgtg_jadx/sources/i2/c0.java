package i2;

import v1.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f22794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j1 f22795k;
    public z70.i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f22796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f22797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22798o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, z70.c cVar) {
        super(cVar);
        this.f22797n = e0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22796m = obj;
        this.f22798o |= Integer.MIN_VALUE;
        return e0.u(this.f22797n, null, null, this);
    }
}
