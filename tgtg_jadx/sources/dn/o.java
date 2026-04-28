package dn;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f15034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15038e;

    public o(n nVar, View view, int i11, int i12, String str) {
        this.f15034a = nVar;
        this.f15035b = view;
        this.f15036c = i11;
        this.f15037d = i12;
        this.f15038e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f15034a, oVar.f15034a) && Intrinsics.areEqual(this.f15035b, oVar.f15035b) && this.f15036c == oVar.f15036c && this.f15037d == oVar.f15037d && Intrinsics.areEqual(this.f15038e, oVar.f15038e);
    }

    public final int hashCode() {
        n nVar = this.f15034a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        View view = this.f15035b;
        int iB = r8.k.b(this.f15037d, r8.k.b(this.f15036c, (iHashCode + (view == null ? 0 : view.hashCode())) * 31, 31), 31);
        String str = this.f15038e;
        return iB + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnuImpressionsElementV2(leanImpressionObject=");
        sb2.append(this.f15034a);
        sb2.append(", view=");
        sb2.append(this.f15035b);
        sb2.append(", horPos=");
        e0.f.C(sb2, this.f15036c, ", vertPos=", this.f15037d, ", bucketId=");
        return r8.k.p(sb2, this.f15038e, ")");
    }
}
