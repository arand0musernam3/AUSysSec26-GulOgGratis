package r8;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f37773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f37774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v70.e f37775d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(AbstractList abstractList, float f11, float f12) {
        char c3;
        char c7;
        ArrayList arrayListJ;
        ArrayList arrayListJ2;
        char c8;
        b bVar;
        List list;
        char c11;
        abstractList.getClass();
        this.f37772a = abstractList;
        this.f37773b = f11;
        this.f37774c = f12;
        v70.e eVarB = c0.b();
        char c12 = 3;
        b bVar2 = null;
        if (abstractList.size() <= 0 || ((e) abstractList.get(0)).f37759a.size() != 3) {
            c3 = 4;
            c7 = 5;
            arrayListJ = null;
            arrayListJ2 = null;
        } else {
            b bVar3 = (b) ((e) abstractList.get(0)).f37759a.get(1);
            float f13 = 1 - 0.5f;
            float[] fArr = bVar3.f37755a;
            float f14 = f13 * f13;
            float f15 = f14 * f13;
            c7 = 5;
            float f16 = 3 * 0.5f;
            float f17 = f16 * f13 * f13;
            float f18 = f16 * 0.5f * f13;
            long jA = q1.h.a((bVar3.a() * 0.125f) + (fArr[4] * f18) + (fArr[2] * f17) + (fArr[0] * f15), (bVar3.b() * 0.125f) + (fArr[5] * f18) + (fArr[3] * f17) + (fArr[1] * f15));
            float[] fArr2 = bVar3.f37755a;
            float f19 = fArr2[0];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            c3 = 4;
            float f23 = 2 * f13 * 0.5f;
            b bVarF = p30.b.f(f19, f20, (f21 * 0.5f) + (f19 * f13), (f22 * 0.5f) + (f20 * f13), (fArr2[4] * 0.25f) + (f21 * f23) + (f19 * f14), (fArr2[5] * 0.25f) + (f22 * f23) + (f20 * f14), pd.g.y(jA), pd.g.z(jA));
            b bVarF2 = p30.b.f(pd.g.y(jA), pd.g.z(jA), (bVar3.a() * 0.25f) + (fArr2[4] * f23) + (fArr2[2] * f14), (bVar3.b() * 0.25f) + (fArr2[5] * f23) + (fArr2[3] * f14), (bVar3.a() * 0.5f) + (fArr2[4] * f13), (bVar3.b() * 0.5f) + (fArr2[5] * f13), bVar3.a(), bVar3.b());
            arrayListJ2 = d0.j(((e) abstractList.get(0)).f37759a.get(0), bVarF);
            arrayListJ = d0.j(bVarF2, ((e) abstractList.get(0)).f37759a.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i11 = 0;
            b bVar4 = null;
            while (true) {
                if (i11 == 0 && arrayListJ != null) {
                    list = arrayListJ;
                } else if (i11 != this.f37772a.size()) {
                    list = ((e) this.f37772a.get(i11)).f37759a;
                } else {
                    if (arrayListJ2 == null) {
                        c8 = c12;
                        break;
                    }
                    list = arrayListJ2;
                }
                int size2 = list.size();
                int i12 = 0;
                while (i12 < size2) {
                    b bVar5 = (b) list.get(i12);
                    if (bVar5.d()) {
                        c11 = c12;
                        if (bVar4 != null) {
                            float[] fArr3 = bVar4.f37755a;
                            fArr3[6] = bVar5.a();
                            fArr3[7] = bVar5.b();
                        }
                    } else {
                        if (bVar4 != null) {
                            eVarB.add(bVar4);
                        }
                        c11 = c12;
                        bVar4 = bVar5;
                        if (bVar2 == null) {
                            bVar2 = bVar4;
                        }
                    }
                    i12++;
                    c12 = c11;
                }
                c8 = c12;
                if (i11 == size) {
                    break;
                }
                i11++;
                c12 = c8;
            }
            bVar = bVar2;
            bVar2 = bVar4;
        } else {
            c8 = 3;
            bVar = null;
        }
        if (bVar2 != null && bVar != null) {
            float[] fArr4 = bVar2.f37755a;
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            float f26 = fArr4[2];
            float f27 = fArr4[c8];
            float f28 = fArr4[c3];
            float f29 = fArr4[c7];
            float[] fArr5 = bVar.f37755a;
            eVarB.add(p30.b.f(f24, f25, f26, f27, f28, f29, fArr5[0], fArr5[1]));
        }
        v70.e eVarA = c0.a(eVarB);
        this.f37775d = eVarA;
        Object obj = eVarA.get(eVarA.b() - 1);
        int iB = eVarA.b();
        int i13 = 0;
        while (i13 < iB) {
            b bVar6 = (b) this.f37775d.get(i13);
            b bVar7 = (b) obj;
            if (Math.abs(bVar6.f37755a[0] - bVar7.a()) > 1.0E-4f || Math.abs(bVar6.f37755a[1] - bVar7.b()) > 1.0E-4f) {
                i4.a.f("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i13++;
            obj = bVar6;
        }
    }

    public final j a() {
        char c3;
        char c7;
        char c8;
        char c11;
        char c12 = 4;
        float[] fArr = new float[4];
        v70.e eVar = this.f37775d;
        int iB = eVar.b();
        float fMax = Float.MIN_VALUE;
        char c13 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        int i11 = 0;
        float fMax2 = Float.MIN_VALUE;
        while (i11 < iB) {
            b bVar = (b) eVar.get(i11);
            bVar.getClass();
            boolean zD = bVar.d();
            char c14 = c12;
            float[] fArr2 = bVar.f37755a;
            if (zD) {
                fArr[c13] = fArr2[c13];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[c13];
                fArr[3] = fArr2[1];
                c3 = c13;
                c11 = 2;
                c7 = 1;
                c8 = 3;
            } else {
                c3 = c13;
                float fMin3 = Math.min(fArr2[c13], bVar.a());
                c7 = 1;
                float fMin4 = Math.min(fArr2[1], bVar.b());
                c8 = 3;
                float fMax3 = Math.max(fArr2[c3], bVar.a());
                float fMax4 = Math.max(fArr2[1], bVar.b());
                c11 = 2;
                fArr[c3] = Math.min(fMin3, Math.min(fArr2[2], fArr2[c14]));
                fArr[1] = Math.min(fMin4, Math.min(fArr2[3], fArr2[5]));
                fArr[2] = Math.max(fMax3, Math.max(fArr2[2], fArr2[c14]));
                fArr[3] = Math.max(fMax4, Math.max(fArr2[3], fArr2[5]));
            }
            fMin = Math.min(fMin, fArr[c3]);
            fMin2 = Math.min(fMin2, fArr[c7]);
            fMax = Math.max(fMax, fArr[c11]);
            fMax2 = Math.max(fMax2, fArr[c8]);
            i11++;
            c12 = c14;
            c13 = c3;
        }
        char c15 = c13;
        fArr[c15] = fMin;
        fArr[1] = fMin2;
        fArr[2] = fMax;
        fArr[3] = fMax2;
        float f11 = fMax - fMin;
        float f12 = fMax2 - fMin2;
        float fMax5 = Math.max(f11, f12);
        float f13 = 2;
        return b(new i(((fMax5 - f11) / f13) - fArr[c15], fMax5, ((fMax5 - f12) / f13) - fArr[1]));
    }

    public final j b(g gVar) {
        long jK = pd.g.K(q1.h.a(this.f37773b, this.f37774c), gVar);
        v70.e eVarB = c0.b();
        List list = this.f37772a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            eVarB.add(((e) list.get(i11)).a(gVar));
        }
        return new j(c0.a(eVarB), pd.g.y(jK), pd.g.z(jK));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return Intrinsics.areEqual(this.f37772a, ((j) obj).f37772a);
    }

    public final int hashCode() {
        return this.f37772a.hashCode();
    }

    public final String toString() {
        return "[RoundedPolygon. Cubics = " + CollectionsKt.U(this.f37775d, null, null, null, null, 63) + " || Features = " + CollectionsKt.U(this.f37772a, null, null, null, null, 63) + " || Center = (" + this.f37773b + ", " + this.f37774c + ")]";
    }
}
