package jg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f25213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f25215c;

    public p(a aVar, String str, q qVar) {
        qVar.getClass();
        this.f25213a = aVar;
        this.f25214b = str;
        this.f25215c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f25213a, pVar.f25213a) && Intrinsics.areEqual(this.f25214b, pVar.f25214b) && this.f25215c == pVar.f25215c;
    }

    public final int hashCode() {
        a aVar = this.f25213a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f25214b;
        return this.f25215c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProvinceAdapterItem(province=" + this.f25213a + ", text=" + this.f25214b + ", itemType=" + this.f25215c + ")";
    }
}
