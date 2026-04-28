package x5;

import b0.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f43862c = new q(a0.C(0), a0.C(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43864b;

    public q(long j9, long j11) {
        this.f43863a = j9;
        this.f43864b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return z5.o.a(this.f43863a, qVar.f43863a) && z5.o.a(this.f43864b, qVar.f43864b);
    }

    public final int hashCode() {
        z5.p[] pVarArr = z5.o.f47288b;
        return Long.hashCode(this.f43864b) + (Long.hashCode(this.f43863a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) z5.o.d(this.f43863a)) + ", restLine=" + ((Object) z5.o.d(this.f43864b)) + ')';
    }
}
