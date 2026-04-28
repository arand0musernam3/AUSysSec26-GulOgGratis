package c40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f7071c = new j(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7073b;

    public j(int i11, int i12) {
        this.f7072a = i11;
        this.f7073b = i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f7072a);
        sb2.append(", length = ");
        return r8.k.i(this.f7073b, "]", sb2);
    }
}
