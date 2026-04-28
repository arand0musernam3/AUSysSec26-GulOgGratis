package e1;

import android.graphics.Rect;
import android.util.Size;
import c50.w;
import j4.s;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f15437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f15440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f15441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15443g;

    public c(UUID uuid, int i11, int i12, Rect rect, Size size, int i13, boolean z11) {
        if (uuid == null) {
            w.l("Null getUuid");
            throw null;
        }
        this.f15437a = uuid;
        this.f15438b = i11;
        this.f15439c = i12;
        if (rect == null) {
            w.l("Null getCropRect");
            throw null;
        }
        this.f15440d = rect;
        if (size == null) {
            w.l("Null getSize");
            throw null;
        }
        this.f15441e = size;
        this.f15442f = i13;
        this.f15443g = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15437a.equals(cVar.f15437a) && this.f15438b == cVar.f15438b && this.f15439c == cVar.f15439c && this.f15440d.equals(cVar.f15440d) && this.f15441e.equals(cVar.f15441e) && this.f15442f == cVar.f15442f && this.f15443g == cVar.f15443g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f15437a.hashCode() ^ 1000003) * 1000003) ^ this.f15438b) * 1000003) ^ this.f15439c) * 1000003) ^ this.f15440d.hashCode()) * 1000003) ^ this.f15441e.hashCode()) * 1000003) ^ this.f15442f) * 1000003) ^ (this.f15443g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutConfig{getUuid=");
        sb2.append(this.f15437a);
        sb2.append(", getTargets=");
        sb2.append(this.f15438b);
        sb2.append(", getFormat=");
        sb2.append(this.f15439c);
        sb2.append(", getCropRect=");
        sb2.append(this.f15440d);
        sb2.append(", getSize=");
        sb2.append(this.f15441e);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.f15442f);
        sb2.append(", isMirroring=");
        return s.o(sb2, this.f15443g, ", shouldRespectInputCropRect=false}");
    }
}
