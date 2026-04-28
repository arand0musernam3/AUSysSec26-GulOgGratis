package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a3 f44618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f44619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f44620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f44621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d3 f44622e;

    public b3(d3 d3Var, a3 a3Var, a3 a3Var2, long j9, boolean z11) {
        this.f44618a = a3Var;
        this.f44619b = a3Var2;
        this.f44620c = j9;
        this.f44621d = z11;
        this.f44622e = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44622e.v(this.f44618a, this.f44619b, this.f44620c, this.f44621d, null);
    }
}
