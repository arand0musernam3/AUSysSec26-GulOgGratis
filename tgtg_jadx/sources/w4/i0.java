package w4;

import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b2 f43127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f43128k;
    public final /* synthetic */ k0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43129m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, z70.a aVar) {
        super(aVar);
        this.l = k0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f43128k = obj;
        this.f43129m |= Integer.MIN_VALUE;
        return this.l.p(0L, null, this);
    }
}
