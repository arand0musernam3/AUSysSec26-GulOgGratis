package aa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1151k;
    public final /* synthetic */ u l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1152m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, z70.c cVar) {
        super(cVar);
        this.l = uVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f1151k = obj;
        this.f1152m |= Integer.MIN_VALUE;
        return this.l.e(null, null, this);
    }
}
