package y9;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f45659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45660k;
    public final /* synthetic */ p0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45661m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p0 p0Var, z70.c cVar) {
        super(cVar);
        this.l = p0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f45660k = obj;
        this.f45661m |= Integer.MIN_VALUE;
        return p0.a(this.l, null, this);
    }
}
