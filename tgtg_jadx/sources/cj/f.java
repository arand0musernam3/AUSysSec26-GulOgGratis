package cj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ui.j f8237k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f8238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8239n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q qVar, z70.c cVar) {
        super(cVar);
        this.f8238m = qVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f8239n |= Integer.MIN_VALUE;
        h8.e eVar = q.f8330j0;
        return this.f8238m.e(null, this);
    }
}
