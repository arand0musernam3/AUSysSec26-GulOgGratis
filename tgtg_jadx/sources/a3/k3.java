package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l3 f437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f438k;
    public final /* synthetic */ l3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f439m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(l3 l3Var, z70.c cVar) {
        super(cVar);
        this.l = l3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f438k = obj;
        this.f439m |= Integer.MIN_VALUE;
        return this.l.s(this);
    }
}
