package m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29221e;

    public b(int i11) {
        this.f29221e = i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f29221e == this.f29221e;
    }

    public final int hashCode() {
        return this.f29221e * 31;
    }
}
