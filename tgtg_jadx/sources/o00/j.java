package o00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f31681d = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f31682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.k1 f31683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31684c = false;

    public j(j jVar, q1.k1 k1Var) {
        if (jVar != null && !jVar.f31684c) {
            i4.a.h();
            throw null;
        }
        this.f31682a = jVar;
        this.f31683b = k1Var;
    }

    public final boolean a() {
        if (this.f31683b.containsKey(f31681d)) {
            return true;
        }
        j jVar = this.f31682a;
        return jVar != null && jVar.a();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (j jVar = this; jVar != null; jVar = jVar.f31682a) {
            for (int i11 = 0; i11 < jVar.f31683b.f35782c; i11++) {
                sb2.append("[");
                sb2.append(this.f31683b.j(i11));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }
}
