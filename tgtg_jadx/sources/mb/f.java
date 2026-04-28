package mb;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29913e;

    public f(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f29909a = z11;
        this.f29910b = z12;
        this.f29911c = z13;
        this.f29912d = z14;
        this.f29913e = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f29909a == fVar.f29909a && this.f29910b == fVar.f29910b && this.f29911c == fVar.f29911c && this.f29912d == fVar.f29912d && this.f29913e == fVar.f29913e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29913e) + k.e(k.e(k.e(Boolean.hashCode(this.f29909a) * 31, 31, this.f29910b), 31, this.f29911c), 31, this.f29912d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f29909a);
        sb2.append(", isValidated=");
        sb2.append(this.f29910b);
        sb2.append(", isMetered=");
        sb2.append(this.f29911c);
        sb2.append(", isNotRoaming=");
        sb2.append(this.f29912d);
        sb2.append(", isBlocked=");
        return k.q(sb2, this.f29913e, ')');
    }
}
