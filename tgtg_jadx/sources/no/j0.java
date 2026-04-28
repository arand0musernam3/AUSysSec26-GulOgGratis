package no;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f31229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0 f31230k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, z70.c cVar) {
        super(cVar);
        this.f31230k = m0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f31229j = obj;
        this.l |= Integer.MIN_VALUE;
        return m0.p(this.f31230k, null, this);
    }
}
