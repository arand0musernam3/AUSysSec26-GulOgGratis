package fe;

import e0.f;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17612d;

    public a(String str, String str2, boolean z11, String str3) {
        this.f17609a = str;
        this.f17610b = str2;
        this.f17611c = z11;
        this.f17612d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f17609a, aVar.f17609a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f17610b, aVar.f17610b) && Intrinsics.areEqual((Object) null, (Object) null) && this.f17611c == aVar.f17611c && Intrinsics.areEqual(this.f17612d, aVar.f17612d);
    }

    public final int hashCode() {
        String str = this.f17609a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.f17610b;
        int iE = k.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 961, 31, this.f17611c);
        String str3 = this.f17612d;
        return iE + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = f.t("ShowkaseBrowserScreenMetadata(currentGroup=", this.f17609a, ", currentComponentName=null, currentComponentStyleName=", this.f17610b, ", currentComponentKey=null, isSearchActive=");
        sbT.append(this.f17611c);
        sbT.append(", searchQuery=");
        sbT.append(this.f17612d);
        sbT.append(")");
        return sbT.toString();
    }
}
