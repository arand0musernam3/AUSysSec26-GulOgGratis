package ok;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rk.e0 f32619a;

    public q(rk.e0 e0Var) {
        e0Var.getClass();
        this.f32619a = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f32619a == ((q) obj).f32619a;
    }

    public final int hashCode() {
        return this.f32619a.hashCode();
    }

    public final String toString() {
        return "TranslateClicked(currentTranslationMode=" + this.f32619a + ")";
    }
}
