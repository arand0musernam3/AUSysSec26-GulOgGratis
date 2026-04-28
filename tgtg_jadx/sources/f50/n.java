package f50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f17362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f17363k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, z70.c cVar) {
        super(cVar);
        this.f17363k = oVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f17362j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f17363k.c(null, this);
    }
}
