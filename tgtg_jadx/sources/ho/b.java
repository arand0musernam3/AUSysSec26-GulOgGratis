package ho;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f22192k;
    public final /* synthetic */ c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22193m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, x70.c cVar2) {
        super(cVar2);
        this.l = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22192k = obj;
        this.f22193m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
