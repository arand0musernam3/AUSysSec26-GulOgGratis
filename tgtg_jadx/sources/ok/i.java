package ok;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32599a;

    public i(boolean z11) {
        this.f32599a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f32599a == ((i) obj).f32599a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32599a);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.f("GoToNotificationSettingsClick(gotoSettings=", ")", this.f32599a);
    }
}
