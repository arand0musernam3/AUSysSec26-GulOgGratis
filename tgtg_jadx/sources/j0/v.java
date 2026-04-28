package j0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e90.c f24327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f24328k;
    public final /* synthetic */ w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24329m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, z70.c cVar) {
        super(cVar);
        this.l = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f24328k = obj;
        this.f24329m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
