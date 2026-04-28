package q5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35990a;

    public a(int i11) {
        this.f35990a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f35990a == ((a) obj).f35990a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35990a);
    }

    public final String toString() {
        return r8.k.o(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f35990a, ')');
    }
}
