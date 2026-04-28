package et;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16443k;
    public final /* synthetic */ z l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16444m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, z70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16443k = obj;
        this.f16444m |= Integer.MIN_VALUE;
        Object objR = this.l.r(null, this);
        return objR == y70.a.COROUTINE_SUSPENDED ? objR : new u70.q(objR);
    }
}
