package m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28494a;

    public e(int i11) {
        this.f28494a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof e) && this.f28494a == ((e) obj).f28494a;
    }

    public final int hashCode() {
        return (this.f28494a ^ 1000003) * 1000003;
    }

    public final String toString() {
        return r8.k.i(this.f28494a, ", cause=null}", new StringBuilder("StateError{code="));
    }
}
