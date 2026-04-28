package nn;

import i4.q0;
import i4.v;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import u70.b0;
import u70.c0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f31117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f31118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f31119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i4.r f31120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f31121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f31122k;
    public final a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f31123m;

    public c(String str, String str2, String str3, long j9, long j11, String str4, String str5, long j12, q0 q0Var, float f11, a aVar, a aVar2, a aVar3, int i11) {
        str3 = (i11 & 4) != 0 ? null : str3;
        String str6 = (i11 & 32) != 0 ? null : str4;
        String str7 = (i11 & 64) != 0 ? null : str5;
        q0 q0Var2 = (i11 & 256) != 0 ? null : q0Var;
        a aVar4 = (i11 & 1024) != 0 ? null : aVar;
        a aVar5 = (i11 & NewHope.SENDB_BYTES) != 0 ? null : aVar2;
        a aVar6 = (i11 & 4096) == 0 ? aVar3 : null;
        str.getClass();
        str2.getClass();
        this.f31112a = str;
        this.f31113b = str2;
        this.f31114c = str3;
        this.f31115d = j9;
        this.f31116e = j11;
        this.f31117f = str6;
        this.f31118g = str7;
        this.f31119h = j12;
        this.f31120i = q0Var2;
        this.f31121j = f11;
        this.f31122k = aVar4;
        this.l = aVar5;
        this.f31123m = aVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f31112a, cVar.f31112a) && Intrinsics.areEqual(this.f31113b, cVar.f31113b) && Intrinsics.areEqual(this.f31114c, cVar.f31114c) && v.c(this.f31115d, cVar.f31115d) && v.c(this.f31116e, cVar.f31116e) && Intrinsics.areEqual(this.f31117f, cVar.f31117f) && Intrinsics.areEqual(this.f31118g, cVar.f31118g) && v.c(this.f31119h, cVar.f31119h) && Intrinsics.areEqual(this.f31120i, cVar.f31120i) && z5.f.c(this.f31121j, cVar.f31121j) && Intrinsics.areEqual(this.f31122k, cVar.f31122k) && Intrinsics.areEqual(this.l, cVar.l) && Intrinsics.areEqual(this.f31123m, cVar.f31123m);
    }

    public final int hashCode() {
        int iB = l1.b(this.f31112a.hashCode() * 31, 31, this.f31113b);
        String str = this.f31114c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        int iB2 = e0.f.b(e0.f.b(iHashCode, 31, this.f31115d), 31, this.f31116e);
        String str2 = this.f31117f;
        int iHashCode2 = (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31118g;
        int iB3 = e0.f.b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f31119h);
        i4.r rVar = this.f31120i;
        int iA = r8.k.a((iB3 + (rVar == null ? 0 : rVar.hashCode())) * 31, this.f31121j, 31);
        a aVar = this.f31122k;
        int iHashCode3 = (iA + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.l;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.f31123m;
        return iHashCode4 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    public final String toString() {
        String strI = v.i(this.f31115d);
        String strI2 = v.i(this.f31116e);
        String strI3 = v.i(this.f31119h);
        String strD = z5.f.d(this.f31121j);
        StringBuilder sbT = e0.f.t("PanelContent(headerText=", this.f31112a, ", bodyText=", this.f31113b, ", bodyVoiceOver=");
        j4.s.A(sbT, this.f31114c, ", headerColor=", strI, ", bodyColor=");
        j4.s.A(sbT, strI2, ", headerTagText=", this.f31117f, ", headerTagVoiceOver=");
        j4.s.A(sbT, this.f31118g, ", bodyBGColor=", strI3, ", bodyBGGradient=");
        sbT.append(this.f31120i);
        sbT.append(", elevation=");
        sbT.append(strD);
        sbT.append(", primaryCTA=");
        sbT.append(this.f31122k);
        sbT.append(", secondaryCTA=");
        sbT.append(this.l);
        sbT.append(", tertiaryCTA=");
        sbT.append(this.f31123m);
        sbT.append(")");
        return sbT.toString();
    }
}
