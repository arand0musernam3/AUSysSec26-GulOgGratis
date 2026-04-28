package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z80.t f45427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45428k;
    public final /* synthetic */ at.o l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45429m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(at.o oVar, x70.c cVar) {
        super(cVar);
        this.l = oVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45428k = obj;
        this.f45429m |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
