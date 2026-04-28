package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ss.o0 f45550k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ss.o0 o0Var, x70.c cVar) {
        super(cVar);
        this.f45550k = o0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45549j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f45550k.a(null, this);
    }
}
