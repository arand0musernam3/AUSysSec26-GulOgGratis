package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f3432k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, z70.c cVar) {
        super(cVar);
        this.f3432k = gVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f3431j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f3432k.l(this);
    }
}
