package g2;

import v1.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j1 f18120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z70.i f18121k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f18122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18123n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, z70.c cVar) {
        super(cVar);
        this.f18122m = b0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f18123n |= Integer.MIN_VALUE;
        return this.f18122m.a(null, null, this);
    }
}
