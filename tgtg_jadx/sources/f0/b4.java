package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f16580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a50.c f16581k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(a50.c cVar, z70.c cVar2) {
        super(cVar2);
        this.f16581k = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16580j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f16581k.q(this);
    }
}
