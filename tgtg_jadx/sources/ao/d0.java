package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f4212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4213k;
    public final /* synthetic */ m0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4214m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(m0 m0Var, z70.c cVar) {
        super(cVar);
        this.l = m0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4213k = obj;
        this.f4214m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
