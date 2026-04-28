package cj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public aj.c f8204k;
    public ui.e l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f8207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8208p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, z70.c cVar) {
        super(cVar);
        this.f8207o = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f8206n = obj;
        this.f8208p |= Integer.MIN_VALUE;
        return q.a(this.f8207o, null, this);
    }
}
