package nk;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f70.i f31072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f31073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f31074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f31075f;

    public v0(String str, String str2, f70.i iVar, HashMap map, String str3, String str4) {
        iVar.getClass();
        this.f31070a = str;
        this.f31071b = str2;
        this.f31072c = iVar;
        this.f31073d = map;
        this.f31074e = str3;
        this.f31075f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.areEqual(this.f31070a, v0Var.f31070a) && Intrinsics.areEqual(this.f31071b, v0Var.f31071b) && this.f31072c == v0Var.f31072c && Intrinsics.areEqual(this.f31073d, v0Var.f31073d) && Intrinsics.areEqual(this.f31074e, v0Var.f31074e) && Intrinsics.areEqual(this.f31075f, v0Var.f31075f);
    }

    public final int hashCode() {
        String str = this.f31070a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31071b;
        int iHashCode2 = (this.f31072c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Map map = this.f31073d;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.f31074e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31075f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = e0.f.t("ItemViewTrackingParams(fillerType=", this.f31070a, ", deeplinkId=", this.f31071b, ", origin=");
        sbT.append(this.f31072c);
        sbT.append(", deeplinkParams=");
        sbT.append(this.f31073d);
        sbT.append(", displayType=");
        return e0.f.o(sbT, this.f31074e, ", categoryType=", this.f31075f, ")");
    }
}
