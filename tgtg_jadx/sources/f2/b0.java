package f2;

import v1.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j1 f17071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z70.i f17072k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c0 f17073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17074n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, z70.c cVar) {
        super(cVar);
        this.f17073m = c0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f17074n |= Integer.MIN_VALUE;
        return this.f17073m.a(null, null, this);
    }
}
