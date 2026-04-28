package j30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24505a;

    public i(Object obj) {
        this.f24505a = obj;
    }

    @Override // j30.h
    public final Object a() {
        return this.f24505a;
    }

    @Override // j30.h
    public final boolean b() {
        return true;
    }

    @Override // j30.h
    public final Object c() {
        return this.f24505a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f24505a.equals(((i) obj).f24505a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24505a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f24505a + ")";
    }
}
