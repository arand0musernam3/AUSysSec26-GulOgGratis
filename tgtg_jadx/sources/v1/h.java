package v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f41736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f41737k;
    public final /* synthetic */ i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41738m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, z70.c cVar) {
        super(cVar);
        this.l = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41737k = obj;
        this.f41738m |= Integer.MIN_VALUE;
        return this.l.b(0L, null, this);
    }
}
