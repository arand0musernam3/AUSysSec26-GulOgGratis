package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f43848d = new i(17, f.f43843c, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43851c;

    public i(int i11, float f11, int i12) {
        this.f43849a = f11;
        this.f43850b = i11;
        this.f43851c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f11 = iVar.f43849a;
        float f12 = f.f43842b;
        return Float.compare(this.f43849a, f11) == 0 && this.f43850b == iVar.f43850b && this.f43851c == iVar.f43851c;
    }

    public final int hashCode() {
        float f11 = f.f43842b;
        return Integer.hashCode(this.f43851c) + r8.k.b(this.f43850b, Float.hashCode(this.f43849a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f43849a));
        sb2.append(", trim=");
        String str = "Invalid";
        int i11 = this.f43850b;
        sb2.append((Object) (i11 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i11 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i11 == 17 ? "LineHeightStyle.Trim.Both" : i11 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb2.append(",mode=");
        int i12 = this.f43851c;
        if (i12 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i12 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i12 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
