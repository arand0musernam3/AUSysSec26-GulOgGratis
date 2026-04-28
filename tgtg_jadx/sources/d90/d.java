package d90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f14777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14778k;
    public final /* synthetic */ e l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14779m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, z70.c cVar) {
        super(cVar);
        this.l = eVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14778k = obj;
        this.f14779m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
