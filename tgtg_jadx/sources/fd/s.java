package fd;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public td.p f17588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public td.i f17589k;
    public g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f17590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f17591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f17592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17593p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, z70.c cVar) {
        super(cVar);
        this.f17592o = tVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f17591n = obj;
        this.f17593p |= Integer.MIN_VALUE;
        return this.f17592o.b(null, 0, this);
    }
}
