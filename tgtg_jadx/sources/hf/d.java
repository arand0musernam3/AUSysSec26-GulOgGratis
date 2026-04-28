package hf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f22017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f22018k;
    public final /* synthetic */ c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22019m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, z70.c cVar2) {
        super(cVar2);
        this.l = cVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22018k = obj;
        this.f22019m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
