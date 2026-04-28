package d2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f13786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13787d;

    public g(float f11, boolean z11, Function2 function2) {
        this.f13784a = f11;
        this.f13785b = z11;
        this.f13786c = function2;
        this.f13787d = f11;
    }

    @Override // d2.f, d2.h
    public final float a() {
        return this.f13787d;
    }

    @Override // d2.h
    public final void b(z5.c cVar, int i11, int[] iArr, int[] iArr2) {
        c(cVar, i11, iArr, z5.m.Ltr, iArr2);
    }

    @Override // d2.f
    public final void c(z5.c cVar, int i11, int[] iArr, z5.m mVar, int[] iArr2) {
        int i12;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iQ0 = cVar.q0(this.f13784a);
        boolean z11 = this.f13785b && mVar == z5.m.Rtl;
        b bVar = i.f13801a;
        if (z11) {
            i12 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i13 = iArr[length];
                int iMin2 = Math.min(i12, i11 - i13);
                iArr2[length] = iMin2;
                iMin = Math.min(iQ0, (i11 - iMin2) - i13);
                i12 = iArr2[length] + i13 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i14 = 0;
            i12 = 0;
            iMin = 0;
            int i15 = 0;
            while (i14 < length2) {
                int i16 = iArr[i14];
                int iMin3 = Math.min(i12, i11 - i16);
                iArr2[i15] = iMin3;
                int iMin4 = Math.min(iQ0, (i11 - iMin3) - i16);
                int i17 = iArr2[i15] + i16 + iMin4;
                i14++;
                iMin = iMin4;
                i12 = i17;
                i15++;
            }
        }
        int i18 = i12 - iMin;
        Function2 function2 = this.f13786c;
        if (function2 == null || i18 >= i11) {
            return;
        }
        int iIntValue = ((Number) function2.invoke(Integer.valueOf(i11 - i18), mVar)).intValue();
        int length3 = iArr2.length;
        for (int i19 = 0; i19 < length3; i19++) {
            iArr2[i19] = iArr2[i19] + iIntValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return z5.f.c(this.f13784a, gVar.f13784a) && this.f13785b == gVar.f13785b && Intrinsics.areEqual(this.f13786c, gVar.f13786c);
    }

    public final int hashCode() {
        int iE = r8.k.e(Float.hashCode(this.f13784a) * 31, 31, this.f13785b);
        Function2 function2 = this.f13786c;
        return iE + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13785b ? "" : "Absolute");
        sb2.append("Arrangement#spacedAligned(");
        r8.k.u(this.f13784a, ", ", sb2);
        sb2.append(this.f13786c);
        sb2.append(')');
        return sb2.toString();
    }
}
