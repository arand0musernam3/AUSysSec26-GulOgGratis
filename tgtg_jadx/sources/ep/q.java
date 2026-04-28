package ep;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hp.g f16318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16319k;
    public final /* synthetic */ d0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16320m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d0 d0Var, z70.c cVar) {
        super(cVar);
        this.l = d0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16319k = obj;
        this.f16320m |= Integer.MIN_VALUE;
        return d0.a(this.l, null, this);
    }
}
