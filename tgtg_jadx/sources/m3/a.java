package m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29174a;

    public a(int i11) {
        this.f29174a = i11;
    }

    public final boolean a() {
        return this.f29174a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return r8.k.i(this.f29174a, " }", sb2);
    }
}
