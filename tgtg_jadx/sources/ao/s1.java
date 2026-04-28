package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ lz.i f4449k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(lz.i iVar, z70.c cVar) {
        super(cVar);
        this.f4449k = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4448j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objX = this.f4449k.x(0, null, null, null, this);
        return objX == y70.a.COROUTINE_SUSPENDED ? objX : new u70.q(objX);
    }
}
