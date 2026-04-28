package gn;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f20602k;
    public final /* synthetic */ g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20603m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, z70.c cVar) {
        super(cVar);
        this.l = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f20602k = obj;
        this.f20603m |= Integer.MIN_VALUE;
        return this.l.q(0L, this);
    }
}
