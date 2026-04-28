package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15367c;

    public m0(int i11, boolean z11) {
        super("GRAPH_ERROR");
        this.f15366b = i11;
        this.f15367c = z11;
    }

    @Override // e0.q0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15398a);
        sb2.append("(cameraError=");
        sb2.append((Object) l.a(this.f15366b));
        sb2.append(", willAttemptRetry=");
        return r8.k.q(sb2, this.f15367c, ')');
    }
}
