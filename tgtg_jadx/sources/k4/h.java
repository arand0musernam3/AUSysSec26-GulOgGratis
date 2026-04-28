package k4;

import i4.i;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f25948e;

    public h(float f11, float f12, int i11, int i12, i iVar, int i13) {
        f12 = (i13 & 2) != 0 ? 4.0f : f12;
        i11 = (i13 & 4) != 0 ? 0 : i11;
        i12 = (i13 & 8) != 0 ? 0 : i12;
        iVar = (i13 & 16) != 0 ? null : iVar;
        this.f25944a = f11;
        this.f25945b = f12;
        this.f25946c = i11;
        this.f25947d = i12;
        this.f25948e = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25944a == hVar.f25944a && this.f25945b == hVar.f25945b && this.f25946c == hVar.f25946c && this.f25947d == hVar.f25947d && Intrinsics.areEqual(this.f25948e, hVar.f25948e);
    }

    public final int hashCode() {
        int iB = k.b(this.f25947d, k.b(this.f25946c, k.a(Float.hashCode(this.f25944a) * 31, this.f25945b, 31), 31), 31);
        i iVar = this.f25948e;
        return iB + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f25944a);
        sb2.append(", miter=");
        sb2.append(this.f25945b);
        sb2.append(", cap=");
        String str = "Unknown";
        int i11 = this.f25946c;
        sb2.append((Object) (i11 == 0 ? "Butt" : i11 == 1 ? "Round" : i11 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i12 = this.f25947d;
        if (i12 == 0) {
            str = "Miter";
        } else if (i12 == 1) {
            str = "Round";
        } else if (i12 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=");
        sb2.append(this.f25948e);
        sb2.append(')');
        return sb2.toString();
    }
}
