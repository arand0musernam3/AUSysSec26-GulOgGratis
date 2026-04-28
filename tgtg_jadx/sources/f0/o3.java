package f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u3 f16808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16809k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q3 f16811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(q3 q3Var, z70.c cVar) {
        super(cVar);
        this.f16811n = q3Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16810m = obj;
        this.f16812o |= Integer.MIN_VALUE;
        return this.f16811n.h(null, this);
    }
}
