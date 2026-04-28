package s0;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f38315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f38317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.c0 f38318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u0 f38320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Range f38322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f38323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f38324j;

    public e(i2 i2Var, int i11, Size size, m0.c0 c0Var, List list, u0 u0Var, int i12, Range range, boolean z11, int i13) {
        this.f38315a = i2Var;
        this.f38316b = i11;
        if (size == null) {
            c50.w.l("Null size");
            throw null;
        }
        this.f38317c = size;
        if (c0Var == null) {
            c50.w.l("Null dynamicRange");
            throw null;
        }
        this.f38318d = c0Var;
        if (list == null) {
            c50.w.l("Null captureTypes");
            throw null;
        }
        this.f38319e = list;
        this.f38320f = u0Var;
        this.f38321g = i12;
        if (range == null) {
            c50.w.l("Null targetFrameRate");
            throw null;
        }
        this.f38322h = range;
        this.f38323i = z11;
        this.f38324j = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f38315a.equals(eVar.f38315a) || this.f38316b != eVar.f38316b || !this.f38317c.equals(eVar.f38317c) || !this.f38318d.equals(eVar.f38318d) || !this.f38319e.equals(eVar.f38319e)) {
            return false;
        }
        u0 u0Var = eVar.f38320f;
        u0 u0Var2 = this.f38320f;
        if (u0Var2 == null) {
            if (u0Var != null) {
                return false;
            }
        } else if (!u0Var2.equals(u0Var)) {
            return false;
        }
        return this.f38321g == eVar.f38321g && this.f38322h.equals(eVar.f38322h) && this.f38323i == eVar.f38323i && this.f38324j == eVar.f38324j;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f38315a.hashCode() ^ 1000003) * 1000003) ^ this.f38316b) * 1000003) ^ this.f38317c.hashCode()) * 1000003) ^ this.f38318d.hashCode()) * 1000003) ^ this.f38319e.hashCode()) * 1000003;
        u0 u0Var = this.f38320f;
        return ((((((((iHashCode ^ (u0Var == null ? 0 : u0Var.hashCode())) * 1000003) ^ this.f38321g) * 1000003) ^ this.f38322h.hashCode()) * 1000003) ^ (this.f38323i ? 1231 : 1237)) * 1000003) ^ this.f38324j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb2.append(this.f38315a);
        sb2.append(", imageFormat=");
        sb2.append(this.f38316b);
        sb2.append(", size=");
        sb2.append(this.f38317c);
        sb2.append(", dynamicRange=");
        sb2.append(this.f38318d);
        sb2.append(", captureTypes=");
        sb2.append(this.f38319e);
        sb2.append(", implementationOptions=");
        sb2.append(this.f38320f);
        sb2.append(", sessionType=");
        sb2.append(this.f38321g);
        sb2.append(", targetFrameRate=");
        sb2.append(this.f38322h);
        sb2.append(", strictFrameRateRequired=");
        sb2.append(this.f38323i);
        sb2.append(", customMaxFrameRate=");
        return r8.k.i(this.f38324j, "}", sb2);
    }
}
