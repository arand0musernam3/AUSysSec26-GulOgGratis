package ok;

import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements f70.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32643a = System.currentTimeMillis();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f32643a == ((z) obj).f32643a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32643a);
    }

    public final String toString() {
        return l1.e("ShowNotificationsPopup(timestamp=", this.f32643a, ")");
    }
}
