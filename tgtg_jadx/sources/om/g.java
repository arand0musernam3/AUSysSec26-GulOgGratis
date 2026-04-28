package om;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f32655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f32656k;
    public final /* synthetic */ l l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32657m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, z70.c cVar) {
        super(cVar);
        this.l = lVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f32656k = obj;
        this.f32657m |= Integer.MIN_VALUE;
        return l.s(this.l, this);
    }
}
