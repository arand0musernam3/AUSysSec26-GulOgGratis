package un;

import b3.i;
import e0.f;
import i4.v;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f41452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f41453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f41454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41458i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f41450a, aVar.f41450a) && Intrinsics.areEqual(this.f41451b, aVar.f41451b) && Intrinsics.areEqual(this.f41452c, aVar.f41452c) && Intrinsics.areEqual(this.f41453d, aVar.f41453d) && Intrinsics.areEqual(this.f41454e, aVar.f41454e) && Intrinsics.areEqual(this.f41455f, aVar.f41455f) && this.f41456g == aVar.f41456g && this.f41457h == aVar.f41457h && Intrinsics.areEqual(this.f41458i, aVar.f41458i);
    }

    public final int hashCode() {
        int iHashCode;
        String str = this.f41450a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f41451b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f41452c;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f41453d;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        v vVar = this.f41454e;
        if (vVar == null) {
            iHashCode = 0;
        } else {
            long j9 = vVar.f23317a;
            b0 b0Var = c0.f40833b;
            iHashCode = Long.hashCode(j9);
        }
        int i11 = (iHashCode5 + iHashCode) * 31;
        String str3 = this.f41455f;
        return this.f41458i.hashCode() + k.e(k.e((i11 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f41456g), 31, this.f41457h);
    }

    public final String toString() {
        String str = this.f41450a;
        String str2 = this.f41451b;
        Integer num = this.f41452c;
        Integer num2 = this.f41453d;
        v vVar = this.f41454e;
        String str3 = this.f41455f;
        boolean z11 = this.f41456g;
        boolean z12 = this.f41457h;
        String str4 = this.f41458i;
        StringBuilder sbT = f.t("OrderDetails(storeImageUrl=", str, ", storeName=", str2, ", pendingCollectionText=");
        s.z(sbT, num, ", statusIconRef=", num2, ", storeImageBackground=");
        sbT.append(vVar);
        sbT.append(", descriptionText=");
        sbT.append(str3);
        sbT.append(", showCollectButton=");
        i.C(sbT, z11, ", showRating=", z12, ", cardVoiceOverText=");
        return k.p(sbT, str4, ")");
    }
}
