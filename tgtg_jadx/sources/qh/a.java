package qh;

import e0.f;
import j4.s;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f37054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37056e;

    public a(String str, String str2, ArrayList arrayList, String str3) {
        str3.getClass();
        this.f37052a = str;
        this.f37053b = str2;
        this.f37054c = arrayList;
        this.f37055d = str3;
        this.f37056e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f37052a, aVar.f37052a) && Intrinsics.areEqual(this.f37053b, aVar.f37053b) && Intrinsics.areEqual(this.f37054c, aVar.f37054c) && Intrinsics.areEqual(this.f37055d, aVar.f37055d) && this.f37056e == aVar.f37056e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37056e) + l1.b((this.f37054c.hashCode() + l1.b(this.f37052a.hashCode() * 31, 31, this.f37053b)) * 31, 31, this.f37055d);
    }

    public final String toString() {
        boolean z11 = this.f37056e;
        StringBuilder sbT = f.t("BucketListUiData(title=", this.f37052a, ", description=", this.f37053b, ", items=");
        sbT.append(this.f37054c);
        sbT.append(", fillerType=");
        sbT.append(this.f37055d);
        sbT.append(", shouldShowSpecialRewards=");
        return s.o(sbT, z11, ")");
    }
}
