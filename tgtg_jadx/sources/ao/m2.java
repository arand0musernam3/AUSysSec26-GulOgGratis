package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g3 f4364k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(g3 g3Var, z70.c cVar) {
        super(cVar);
        this.f4364k = g3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f4363j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objE = this.f4364k.e(this);
        return objE == y70.a.COROUTINE_SUSPENDED ? objE : new u70.q(objE);
    }
}
