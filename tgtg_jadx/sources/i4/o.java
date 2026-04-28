package i4;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import h7.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23273c;

    /* JADX WARN: Illegal instructions before constructor call */
    public o(long j9, int i11) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            q1.e();
            porterDuffColorFilter = q1.a(g0.C(j9), b.d(i11));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(g0.C(j9), b.e(i11));
        }
        super(porterDuffColorFilter);
        this.f23272b = j9;
        this.f23273c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return v.c(this.f23272b, oVar.f23272b) && this.f23273c == oVar.f23273c;
    }

    public final int hashCode() {
        int i11 = v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Integer.hashCode(this.f23273c) + (Long.hashCode(this.f23272b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        r8.k.x(this.f23272b, ", blendMode=", sb2);
        sb2.append((Object) n.a(this.f23273c));
        sb2.append(')');
        return sb2.toString();
    }
}
