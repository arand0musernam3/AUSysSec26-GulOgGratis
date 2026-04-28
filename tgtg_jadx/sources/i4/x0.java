package i4;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23332a;

    public x0(long j9) {
        this.f23332a = j9;
    }

    @Override // i4.r
    public final void a(float f11, long j9, i0.w wVar) {
        wVar.F(1.0f);
        long jB = this.f23332a;
        if (f11 != 1.0f) {
            jB = v.b(v.d(jB) * f11, jB);
        }
        wVar.H(jB);
        if (((Shader) wVar.f22747d) != null) {
            wVar.L(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return v.c(this.f23332a, ((x0) obj).f23332a);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f23332a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) v.i(this.f23332a)) + ')';
    }
}
