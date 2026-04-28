package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ se.b f4465k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(se.b bVar, z70.c cVar) {
        super(cVar);
        this.f4465k = bVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4464j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objK = this.f4465k.k(null, this);
        return objK == y70.a.COROUTINE_SUSPENDED ? objK : new u70.q(objK);
    }
}
