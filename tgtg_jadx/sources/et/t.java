package et;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16446k;
    public final /* synthetic */ z l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16447m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, z70.c cVar) {
        super(cVar);
        this.l = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16446k = obj;
        this.f16447m |= Integer.MIN_VALUE;
        return this.l.s(null, this);
    }
}
