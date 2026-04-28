package s0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38342d;

    public i(int i11, int i12, List list, List list2) {
        this.f38339a = i11;
        this.f38340b = i12;
        if (list == null) {
            c50.w.l("Null audioProfiles");
            throw null;
        }
        this.f38341c = list;
        if (list2 != null) {
            this.f38342d = list2;
        } else {
            c50.w.l("Null videoProfiles");
            throw null;
        }
    }

    public static i a(int i11, int i12, ArrayList arrayList, ArrayList arrayList2) {
        return new i(i11, i12, Collections.unmodifiableList(new ArrayList(arrayList)), Collections.unmodifiableList(new ArrayList(arrayList2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f38339a == iVar.f38339a && this.f38340b == iVar.f38340b && this.f38341c.equals(iVar.f38341c) && this.f38342d.equals(iVar.f38342d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f38339a ^ 1000003) * 1000003) ^ this.f38340b) * 1000003) ^ this.f38341c.hashCode()) * 1000003) ^ this.f38342d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb2.append(this.f38339a);
        sb2.append(", recommendedFileFormat=");
        sb2.append(this.f38340b);
        sb2.append(", audioProfiles=");
        sb2.append(this.f38341c);
        sb2.append(", videoProfiles=");
        return e0.f.p(sb2, this.f38342d, "}");
    }
}
