package pm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f35518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f35519e;

    public k(String str, String str2, String str3, Function0 function0, Function0 function02) {
        a0.C(str, str2, str3);
        this.f35515a = str;
        this.f35516b = str2;
        this.f35517c = str3;
        this.f35518d = function0;
        this.f35519e = function02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f35515a, kVar.f35515a) && Intrinsics.areEqual(this.f35516b, kVar.f35516b) && Intrinsics.areEqual(this.f35517c, kVar.f35517c) && Intrinsics.areEqual(this.f35518d, kVar.f35518d) && Intrinsics.areEqual(this.f35519e, kVar.f35519e);
    }

    public final int hashCode() {
        return this.f35519e.hashCode() + ((this.f35518d.hashCode() + l1.b(l1.b(this.f35515a.hashCode() * 31, 31, this.f35516b), 31, this.f35517c)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = e0.f.t("ErrorInfo(title=", this.f35515a, ", subTitle=", this.f35516b, ", buttonText=");
        sbT.append(this.f35517c);
        sbT.append(", onButtonClicked=");
        sbT.append(this.f35518d);
        sbT.append(", onDismiss=");
        sbT.append(this.f35519e);
        sbT.append(")");
        return sbT.toString();
    }
}
