package pk;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f35437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f35438k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, z70.c cVar) {
        super(cVar);
        this.f35438k = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f35437j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f35438k.a(null, null, this);
    }
}
