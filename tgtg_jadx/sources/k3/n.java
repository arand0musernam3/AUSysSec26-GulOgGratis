package k3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f25849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f25850k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, z70.c cVar) {
        super(cVar);
        this.f25850k = sVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f25849j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f25850k.P0(this);
    }
}
