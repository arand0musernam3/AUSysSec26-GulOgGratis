package go;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f20765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f20766k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f20768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20769o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, z70.c cVar) {
        super(cVar);
        this.f20768n = vVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f20767m = obj;
        this.f20769o |= Integer.MIN_VALUE;
        return this.f20768n.o(null, this);
    }
}
