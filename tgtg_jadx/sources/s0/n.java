package s0;

import android.util.Range;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Range f38401h = new Range(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f38402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f38403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.c0 f38404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Range f38406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u0 f38407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38408g;

    public n(Size size, Size size2, m0.c0 c0Var, int i11, Range range, u0 u0Var, boolean z11) {
        this.f38402a = size;
        this.f38403b = size2;
        this.f38404c = c0Var;
        this.f38405d = i11;
        this.f38406e = range;
        this.f38407f = u0Var;
        this.f38408g = z11;
    }

    public static g40.b a(Size size) {
        g40.b bVar = new g40.b();
        if (size == null) {
            c50.w.l("Null resolution");
            return null;
        }
        bVar.f20000a = size;
        bVar.f20001b = size;
        bVar.f20003d = 0;
        Range range = f38401h;
        if (range == null) {
            c50.w.l("Null expectedFrameRateRange");
            return null;
        }
        bVar.f20004e = range;
        bVar.f20002c = m0.c0.f28478d;
        bVar.f20006g = Boolean.FALSE;
        return bVar;
    }

    public final g40.b b() {
        g40.b bVar = new g40.b();
        bVar.f20000a = this.f38402a;
        bVar.f20001b = this.f38403b;
        bVar.f20002c = this.f38404c;
        bVar.f20003d = Integer.valueOf(this.f38405d);
        bVar.f20004e = this.f38406e;
        bVar.f20005f = this.f38407f;
        bVar.f20006g = Boolean.valueOf(this.f38408g);
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f38402a.equals(nVar.f38402a) && this.f38403b.equals(nVar.f38403b) && this.f38404c.equals(nVar.f38404c) && this.f38405d == nVar.f38405d && this.f38406e.equals(nVar.f38406e)) {
                u0 u0Var = nVar.f38407f;
                u0 u0Var2 = this.f38407f;
                if (u0Var2 != null ? u0Var2.equals(u0Var) : u0Var == null) {
                    if (this.f38408g == nVar.f38408g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f38402a.hashCode() ^ 1000003) * 1000003) ^ this.f38403b.hashCode()) * 1000003) ^ this.f38404c.hashCode()) * 1000003) ^ this.f38405d) * 1000003) ^ this.f38406e.hashCode()) * 1000003;
        u0 u0Var = this.f38407f;
        return ((iHashCode ^ (u0Var == null ? 0 : u0Var.hashCode())) * 1000003) ^ (this.f38408g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpec{resolution=");
        sb2.append(this.f38402a);
        sb2.append(", originalConfiguredResolution=");
        sb2.append(this.f38403b);
        sb2.append(", dynamicRange=");
        sb2.append(this.f38404c);
        sb2.append(", sessionType=");
        sb2.append(this.f38405d);
        sb2.append(", expectedFrameRateRange=");
        sb2.append(this.f38406e);
        sb2.append(", implementationOptions=");
        sb2.append(this.f38407f);
        sb2.append(", zslDisabled=");
        return j4.s.o(sb2, this.f38408g, "}");
    }
}
