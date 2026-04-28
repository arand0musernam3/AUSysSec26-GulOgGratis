package uf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f41078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f41079k;
    public e90.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f41080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f41081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41082o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, z70.c cVar) {
        super(cVar);
        this.f41081n = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41080m = obj;
        this.f41082o |= Integer.MIN_VALUE;
        return this.f41081n.e(null, this);
    }
}
