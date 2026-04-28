package z80;

import m2.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n0 f47363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y80.i f47364k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0 f47365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47366n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n0 n0Var, x70.c cVar) {
        super(cVar);
        this.f47365m = n0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f47366n |= Integer.MIN_VALUE;
        return this.f47365m.a(null, this);
    }
}
