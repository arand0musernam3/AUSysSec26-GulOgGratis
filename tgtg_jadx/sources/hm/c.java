package hm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22110a;

    public c(int i11) {
        this.f22110a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c) || this.f22110a != ((c) obj).f22110a) {
            return false;
        }
        yn.d dVar = yn.d.f46279a;
        return Intrinsics.areEqual(dVar, dVar);
    }

    public final int hashCode() {
        return yn.d.f46279a.hashCode() + (Integer.hashCode(this.f22110a) * 31);
    }

    public final String toString() {
        return "OnlyUnreadMessages(unreadCount=" + this.f22110a + ", tooltipState=" + yn.d.f46279a + ")";
    }
}
