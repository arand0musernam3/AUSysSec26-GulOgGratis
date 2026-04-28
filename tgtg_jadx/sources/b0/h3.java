package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f5217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i3 f5218k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(i3 i3Var, z70.c cVar) {
        super(cVar);
        this.f5218k = i3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f5217j = obj;
        this.l |= Integer.MIN_VALUE;
        return i3.a(this.f5218k, null, 0L, this);
    }
}
