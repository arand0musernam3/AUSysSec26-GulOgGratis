package ir;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f24119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f24120k;
    public final /* synthetic */ h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24121m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, z70.c cVar) {
        super(cVar);
        this.l = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f24120k = obj;
        this.f24121m |= Integer.MIN_VALUE;
        return h.a(this.l, null, this);
    }
}
