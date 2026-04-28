package jl;

import j4.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f25313f;

    public d(String str, String str2, String str3, String str4, String str5, List list, int i11) {
        str = (i11 & 2) != 0 ? null : str;
        str2 = (i11 & 4) != 0 ? null : str2;
        str3 = (i11 & 8) != 0 ? null : str3;
        str4 = (i11 & 16) != 0 ? null : str4;
        str5 = (i11 & 32) != 0 ? null : str5;
        list = (i11 & 64) != 0 ? null : list;
        this.f25308a = str;
        this.f25309b = str2;
        this.f25310c = str3;
        this.f25311d = str4;
        this.f25312e = str5;
        this.f25313f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f25308a, dVar.f25308a) && Intrinsics.areEqual(this.f25309b, dVar.f25309b) && Intrinsics.areEqual(this.f25310c, dVar.f25310c) && Intrinsics.areEqual(this.f25311d, dVar.f25311d) && Intrinsics.areEqual(this.f25312e, dVar.f25312e) && Intrinsics.areEqual(this.f25313f, dVar.f25313f);
    }

    public final int hashCode() {
        String str = this.f25308a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25309b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25310c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25311d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25312e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f25313f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = e0.f.t("OnboardingItem(animationFile=null, title=", this.f25308a, ", body=", this.f25309b, ", surveyHeader=");
        s.A(sbT, this.f25310c, ", surveyDescription=", this.f25311d, ", surveyLabel=");
        sbT.append(this.f25312e);
        sbT.append(", surveyOptions=");
        sbT.append(this.f25313f);
        sbT.append(")");
        return sbT.toString();
    }
}
