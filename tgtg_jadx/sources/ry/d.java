package ry;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38274a;

    public d(boolean z11) {
        this.f38274a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f38274a == ((d) obj).f38274a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38274a);
    }

    public final String toString() {
        return k.q(new StringBuilder("Denied(shouldShowRationale="), this.f38274a, ')');
    }
}
