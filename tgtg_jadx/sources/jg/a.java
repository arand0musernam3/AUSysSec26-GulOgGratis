package jg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25144d;

    public a(String str, String str2, List list) {
        list.getClass();
        this.f25141a = str;
        this.f25142b = str2;
        this.f25143c = list;
        this.f25144d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f25141a, aVar.f25141a) && Intrinsics.areEqual(this.f25142b, aVar.f25142b) && Intrinsics.areEqual(this.f25143c, aVar.f25143c) && this.f25144d == aVar.f25144d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25144d) + e0.f.c(this.f25143c, l1.b(this.f25141a.hashCode() * 31, 31, this.f25142b), 31);
    }

    public final String toString() {
        boolean z11 = this.f25144d;
        StringBuilder sbT = e0.f.t("Province(abbreviation=", this.f25141a, ", name=", this.f25142b, ", postal=");
        sbT.append(this.f25143c);
        sbT.append(", isSelected=");
        sbT.append(z11);
        sbT.append(")");
        return sbT.toString();
    }
}
