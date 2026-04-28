package yi;

import a3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zi.c f46004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46005k;
    public final /* synthetic */ w1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46006m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w1 w1Var, x70.c cVar) {
        super(cVar);
        this.l = w1Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46005k = obj;
        this.f46006m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
