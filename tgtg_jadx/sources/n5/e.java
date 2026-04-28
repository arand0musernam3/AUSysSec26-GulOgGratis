package n5;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30514c;

    public e(int i11, int i12, boolean z11) {
        this.f30512a = i11;
        this.f30513b = i12;
        this.f30514c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f30512a == eVar.f30512a && this.f30513b == eVar.f30513b && this.f30514c == eVar.f30514c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30514c) + k.b(this.f30513b, Integer.hashCode(this.f30512a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f30512a);
        sb2.append(", end=");
        sb2.append(this.f30513b);
        sb2.append(", isRtl=");
        return k.q(sb2, this.f30514c, ')');
    }
}
