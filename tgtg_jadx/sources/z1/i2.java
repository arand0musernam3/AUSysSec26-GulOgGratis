package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f46547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k2 f46548k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(k2 k2Var, z70.c cVar) {
        super(cVar);
        this.f46548k = k2Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f46547j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f46548k.e(this);
    }
}
