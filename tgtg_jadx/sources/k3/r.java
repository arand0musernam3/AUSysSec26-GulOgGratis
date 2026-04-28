package k3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f25857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f25858k;
    public final /* synthetic */ s l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25859m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, z70.c cVar) {
        super(cVar);
        this.l = sVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f25858k = obj;
        this.f25859m |= Integer.MIN_VALUE;
        return this.l.S0(0.0f, this);
    }
}
