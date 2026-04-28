package y9;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f45719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d8.z f45720k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d8.z zVar, z70.c cVar) {
        super(cVar);
        this.f45720k = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45719j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f45720k.a(null, this);
    }
}
