package f70;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17503c;

    public /* synthetic */ q(String str, String str2, int i11) {
        this(str, (i11 & 2) != 0 ? null : str2, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f17501a, qVar.f17501a) && Intrinsics.areEqual(this.f17502b, qVar.f17502b) && Intrinsics.areEqual(this.f17503c, qVar.f17503c);
    }

    public final int hashCode() {
        int iHashCode = this.f17501a.hashCode() * 31;
        String str = this.f17502b;
        return this.f17503c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbT = e0.f.t("ShareWithChooser(url=", this.f17501a, ", title=", this.f17502b, ", comIntentList=");
        sbT.append(this.f17503c);
        sbT.append(")");
        return sbT.toString();
    }

    public q(String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.f17501a = str;
        this.f17502b = str2;
        this.f17503c = arrayList;
    }
}
