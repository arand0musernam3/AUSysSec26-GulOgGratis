package kn;

import e0.f;
import i4.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lv.s;
import r8.k;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f26475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f26476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f26479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f26480h;

    public d(long j9, Integer num, Integer num2, int i11, long j11, Function0 function0, Function0 function02, int i12) {
        boolean z11 = (i12 & 1) == 0;
        j9 = (i12 & 2) != 0 ? s.J : j9;
        num = (i12 & 4) != 0 ? null : num;
        num2 = (i12 & 8) != 0 ? null : num2;
        j11 = (i12 & 32) != 0 ? s.C : j11;
        function0 = (i12 & 64) != 0 ? null : function0;
        function02.getClass();
        this.f26473a = z11;
        this.f26474b = j9;
        this.f26475c = num;
        this.f26476d = num2;
        this.f26477e = i11;
        this.f26478f = j11;
        this.f26479g = function0;
        this.f26480h = function02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f26473a == dVar.f26473a && v.c(this.f26474b, dVar.f26474b) && Intrinsics.areEqual(this.f26475c, dVar.f26475c) && Intrinsics.areEqual(this.f26476d, dVar.f26476d) && this.f26477e == dVar.f26477e && v.c(this.f26478f, dVar.f26478f) && Intrinsics.areEqual(this.f26479g, dVar.f26479g) && Intrinsics.areEqual(this.f26480h, dVar.f26480h);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f26473a) * 31;
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        int iB = f.b(iHashCode, 31, this.f26474b);
        Integer num = this.f26475c;
        int iHashCode2 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f26476d;
        int iB2 = f.b(k.b(this.f26477e, (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31, this.f26478f);
        Function0 function0 = this.f26479g;
        return this.f26480h.hashCode() + ((iB2 + (function0 != null ? function0.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strI = v.i(this.f26474b);
        String strI2 = v.i(this.f26478f);
        StringBuilder sb2 = new StringBuilder("ProfileToolTipData(showOverlay=");
        sb2.append(this.f26473a);
        sb2.append(", background=");
        sb2.append(strI);
        sb2.append(", icon=");
        j4.s.z(sb2, this.f26475c, ", header=", this.f26476d, ", body=");
        sb2.append(this.f26477e);
        sb2.append(", textColor=");
        sb2.append(strI2);
        sb2.append(", onClick=");
        sb2.append(this.f26479g);
        sb2.append(", hide=");
        sb2.append(this.f26480h);
        sb2.append(")");
        return sb2.toString();
    }
}
