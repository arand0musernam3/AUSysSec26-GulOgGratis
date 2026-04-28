package x5;

import i4.v;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43838a;

    public c(long j9) {
        this.f43838a = j9;
        if (j9 != 16) {
            return;
        }
        s5.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // x5.o
    public final float a() {
        return v.d(this.f43838a);
    }

    @Override // x5.o
    public final long b() {
        return this.f43838a;
    }

    @Override // x5.o
    public final i4.r c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && v.c(this.f43838a, ((c) obj).f43838a);
    }

    public final int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.f43838a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) v.i(this.f43838a)) + ')';
    }
}
