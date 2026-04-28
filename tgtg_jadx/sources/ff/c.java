package ff;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a8.h f17625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public nf.e f17626k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a8.h f17627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17628n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a8.h hVar, z70.c cVar) {
        super(cVar);
        this.f17627m = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f17628n |= Integer.MIN_VALUE;
        return this.f17627m.u(null, this);
    }
}
