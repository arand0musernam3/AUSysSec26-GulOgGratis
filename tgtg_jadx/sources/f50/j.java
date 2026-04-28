package f50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f17354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f17355k;
    public final /* synthetic */ k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17356m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, z70.c cVar) {
        super(cVar);
        this.l = kVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f17355k = obj;
        this.f17356m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
