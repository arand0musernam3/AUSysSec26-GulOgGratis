package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ lz.i f4457k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(lz.i iVar, z70.c cVar) {
        super(cVar);
        this.f4457k = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4456j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objY = this.f4457k.y(null, this);
        return objY == y70.a.COROUTINE_SUSPENDED ? objY : new u70.q(objY);
    }
}
