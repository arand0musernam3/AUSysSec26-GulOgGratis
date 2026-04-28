package g3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f18509a = new e1();

    public static r8.j a(e1 e1Var, List list, int i11, int i12) {
        char c3;
        long j9;
        List listA;
        float f11;
        float fFloatValue;
        float f12;
        ArrayList arrayList;
        int i13;
        char c7 = ' ';
        long j11 = 4294967295L;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
        int i14 = 2;
        float f13 = 360.0f;
        if ((i12 & 8) == 0) {
            v70.e eVarB = kotlin.collections.c0.b();
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            int i15 = 0;
            while (i15 < size) {
                char c8 = c7;
                q2 q2Var = (q2) list.get(i15);
                e1 e1Var2 = r2.f19379a;
                long jE = h4.b.e(q2Var.f19345a, jFloatToRawIntBits);
                arrayList2.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (jE & r16)), Float.intBitsToFloat((int) (jE >> c8)))) * 180.0f) / 3.1415927f));
                i15++;
                c7 = c8;
                j11 = j11;
            }
            c3 = c7;
            j9 = j11;
            float f14 = 3.1415927f;
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList3.add(Float.valueOf(h4.b.c(h4.b.e(((q2) list.get(i16)).f19345a, jFloatToRawIntBits))));
            }
            int i17 = i11 * 2;
            float f15 = 360.0f / i17;
            int i18 = 0;
            while (i18 < i17) {
                Iterator it = kotlin.collections.d0.f(list).iterator();
                while (((n80.h) it).f30715c) {
                    int iNextInt = ((kotlin.collections.s0) it).nextInt();
                    int i19 = i18 % 2;
                    if (i19 != 0) {
                        iNextInt = (list.size() - 1) - iNextInt;
                    }
                    if (iNextInt > 0 || i19 == 0) {
                        e1 e1Var3 = r2.f19379a;
                        float f16 = f15 * i18;
                        if (i19 == 0) {
                            f11 = f14;
                            fFloatValue = ((Number) arrayList2.get(iNextInt)).floatValue();
                        } else {
                            f11 = f14;
                            fFloatValue = (((Number) arrayList2.get(0)).floatValue() * i14) + (f15 - ((Number) arrayList2.get(iNextInt)).floatValue());
                        }
                        f12 = f13;
                        arrayList = arrayList2;
                        double d3 = ((f16 + fFloatValue) / f13) * i14 * f11;
                        i13 = i18;
                        eVarB.add(new q2(h4.b.f(h4.b.g(((Number) arrayList3.get(iNextInt)).floatValue(), (((long) Float.floatToRawIntBits((float) Math.cos(d3))) << c3) | (((long) Float.floatToRawIntBits((float) Math.sin(d3))) & j9)), jFloatToRawIntBits), ((q2) list.get(iNextInt)).f19346b));
                    } else {
                        f11 = f14;
                        f12 = f13;
                        arrayList = arrayList2;
                        i13 = i18;
                    }
                    i18 = i13;
                    f13 = f12;
                    arrayList2 = arrayList;
                    f14 = f11;
                    i14 = 2;
                }
                i18++;
                arrayList2 = arrayList2;
                i14 = 2;
            }
            listA = kotlin.collections.c0.a(eVarB);
        } else {
            c3 = ' ';
            j9 = 4294967295L;
            int size3 = list.size();
            IntRange intRangeJ = n80.p.j(0, size3 * i11);
            ArrayList arrayList4 = new ArrayList(kotlin.collections.e0.o(intRangeJ, 10));
            Iterator it2 = intRangeJ.iterator();
            while (((n80.h) it2).f30715c) {
                int iNextInt2 = ((kotlin.collections.s0) it2).nextInt();
                e1 e1Var4 = r2.f19379a;
                int i21 = iNextInt2 % size3;
                long jE2 = h4.b.e(((q2) list.get(i21)).f19345a, jFloatToRawIntBits);
                int i22 = (int) (jE2 >> 32);
                double d11 = ((((iNextInt2 / size3) * 360.0f) / i11) / 360.0f) * 2 * 3.1415927f;
                long j12 = jFloatToRawIntBits;
                int i23 = (int) (jE2 & 4294967295L);
                arrayList4.add(new q2(h4.b.f((((long) Float.floatToRawIntBits((Float.intBitsToFloat(i22) * ((float) Math.cos(d11))) - (Float.intBitsToFloat(i23) * ((float) Math.sin(d11))))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i23) * ((float) Math.cos(d11))) + (Float.intBitsToFloat(i22) * ((float) Math.sin(d11))))) & 4294967295L), j12), ((q2) list.get(i21)).f19346b));
                jFloatToRawIntBits = j12;
            }
            listA = arrayList4;
        }
        long j13 = jFloatToRawIntBits;
        int size4 = listA.size() * 2;
        float[] fArr = new float[size4];
        for (int i24 = 0; i24 < size4; i24++) {
            long j14 = ((q2) listA.get(i24 / 2)).f19345a;
            fArr[i24] = Float.intBitsToFloat((int) (i24 % 2 == 0 ? j14 >> c3 : j14 & j9));
        }
        v70.e eVarB2 = kotlin.collections.c0.b();
        Iterator it3 = listA.iterator();
        while (it3.hasNext()) {
            eVarB2.add(((q2) it3.next()).f19346b);
        }
        return u00.d.k(fArr, r8.a.f37753b, kotlin.collections.c0.a(eVarB2), Float.intBitsToFloat((int) (j13 >> c3)), Float.intBitsToFloat((int) (j13 & j9)));
    }

    public r8.j b() {
        r8.j jVar = r2.f19390m;
        if (jVar != null) {
            return jVar;
        }
        r8.j jVarA = a(this, kotlin.collections.d0.h(new q2((((long) Float.floatToRawIntBits(0.193f)) << 32) | (((long) Float.floatToRawIntBits(0.277f)) & 4294967295L), new r8.a(0.053f, 2)), new q2((((long) Float.floatToRawIntBits(0.176f)) << 32) | (((long) Float.floatToRawIntBits(0.055f)) & 4294967295L), new r8.a(0.053f, 2))), 10, 12).a();
        r2.f19390m = jVarA;
        return jVarA;
    }
}
