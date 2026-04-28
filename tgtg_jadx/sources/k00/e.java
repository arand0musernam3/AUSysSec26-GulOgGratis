package k00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a00.u f25635a;

    public e(a00.u uVar) {
        this.f25635a = uVar;
    }

    @Override // k00.d
    public final Object a() {
        return this.f25635a;
    }

    @Override // k00.d
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f25635a.equals(((e) obj).f25635a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25635a.hashCode() + 1502476572;
    }

    public final String toString() {
        return w.a0.p("Optional.of(", this.f25635a.toString(), ")");
    }
}
