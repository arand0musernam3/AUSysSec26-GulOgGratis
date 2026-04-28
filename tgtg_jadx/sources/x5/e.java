package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f43840b = 66305;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43841a;

    public static String a(int i11) {
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i12 = i11 & 255;
        String str = "Invalid";
        sb2.append((Object) (i12 == 1 ? "Strategy.Simple" : i12 == 2 ? "Strategy.HighQuality" : i12 == 3 ? "Strategy.Balanced" : i12 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb2.append(", strictness=");
        int i13 = (i11 >> 8) & 255;
        sb2.append((Object) (i13 == 1 ? "Strictness.None" : i13 == 2 ? "Strictness.Loose" : i13 == 3 ? "Strictness.Normal" : i13 == 4 ? "Strictness.Strict" : i13 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb2.append(", wordBreak=");
        int i14 = (i11 >> 16) & 255;
        if (i14 == 1) {
            str = "WordBreak.None";
        } else if (i14 == 2) {
            str = "WordBreak.Phrase";
        } else if (i14 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f43841a == ((e) obj).f43841a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43841a);
    }

    public final String toString() {
        return a(this.f43841a);
    }
}
