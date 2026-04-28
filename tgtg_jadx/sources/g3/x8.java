package g3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x8 implements z4.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f19778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y8 f19780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z5 f19782e;

    public x8(float f11, float f12, y8 y8Var, int i11, z5 z5Var) {
        this.f19778a = f11;
        this.f19779b = f12;
        this.f19780c = y8Var;
        this.f19781d = i11;
        this.f19782e = z5Var;
    }

    @Override // z4.a1
    public final z4.v0 c(final z4.w0 w0Var, List list, long j9) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        float f11 = this.f19778a;
        final int iQ0 = w0Var.q0(f11);
        int size = list2.size();
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((z4.t0) list2.get(i11)).b(Integer.MAX_VALUE)));
        }
        final int iIntValue = numValueOf.intValue();
        int i12 = iQ0 * 2;
        float f12 = this.f19779b;
        long jB = z5.a.b(j9, w0Var.q0(f12), 0, iIntValue, iIntValue, 2);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = f11;
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            arrayList2.add(((z4.t0) list2.get(i13)).D(jB));
        }
        int[] iArrCopyOf = new int[16];
        int size4 = list2.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size4) {
            List list4 = list2;
            int iY = ((z4.t0) list2.get(i14)).y(Integer.MAX_VALUE);
            int i16 = i15 + 1;
            int i17 = i12;
            if (iArrCopyOf.length < i16) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i16, (iArrCopyOf.length * 3) / 2));
            }
            iArrCopyOf[i15] = iY;
            i14++;
            i15 = i16;
            list2 = list4;
            i12 = i17;
        }
        final ArrayList arrayList3 = new ArrayList(size);
        int iQ02 = i12;
        int i18 = 0;
        while (i18 < size) {
            int[] iArr = iArrCopyOf;
            float f13 = ((z5.f) w70.b.c(new z5.f(f12), new z5.f(w0Var.O(((z4.m1) arrayList2.get(i18)).f47183a)))).f47277a;
            iQ02 += w0Var.q0(f13);
            if (i18 < 0 || i18 >= i15) {
                org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
                return null;
            }
            int i19 = size;
            float f14 = ((z5.f) w70.b.c(new z5.f(w0Var.O(iArr[i18]) - (k8.f18978b * 2)), new z5.f(24))).f47277a;
            float f15 = floatRef.element;
            l8 l8Var = new l8(f15, f13, f14);
            floatRef.element = f15 + f13;
            arrayList3.add(l8Var);
            i18++;
            iArrCopyOf = iArr;
            size = i19;
            arrayList2 = arrayList2;
        }
        final ArrayList arrayList4 = arrayList2;
        this.f19780c.f19847a.setValue(arrayList3);
        final ArrayList arrayList5 = new ArrayList(list3.size());
        int i21 = 0;
        for (int size5 = list3.size(); i21 < size5; size5 = size5) {
            arrayList5.add(((z4.t0) list3.get(i21)).D(z5.a.a(0, w0Var.q0(((l8) arrayList3.get(this.f19781d)).f19040c), 0, iIntValue)));
            i21++;
            list3 = list3;
        }
        final float f16 = this.f19778a;
        final z5 z5Var = this.f19782e;
        final int i22 = this.f19781d;
        return z4.w0.f(w0Var, iQ02, iIntValue, new Function1() { // from class: g3.w8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                z4.w0 w0Var2;
                ArrayList arrayList6;
                int i23;
                z4.l1 l1Var = (z4.l1) obj;
                Ref.FloatRef floatRef2 = floatRef;
                floatRef2.element = f16;
                ArrayList arrayList7 = arrayList4;
                int size6 = arrayList7.size();
                int i24 = 0;
                while (true) {
                    w0Var2 = w0Var;
                    arrayList6 = arrayList3;
                    if (i24 >= size6) {
                        break;
                    }
                    z4.l1.o(l1Var, (z4.m1) arrayList7.get(i24), w0Var2.q0(floatRef2.element), 0);
                    floatRef2.element += ((l8) arrayList6.get(i24)).f19039b;
                    i24++;
                }
                ArrayList arrayList8 = arrayList5;
                int size7 = arrayList8.size();
                int i25 = 0;
                while (true) {
                    i23 = i22;
                    if (i25 >= size7) {
                        break;
                    }
                    z4.m1 m1Var = (z4.m1) arrayList8.get(i25);
                    z4.l1.o(l1Var, m1Var, Math.max(0, (w0Var2.q0(((l8) arrayList6.get(i23)).f19039b) - m1Var.f47183a) / 2), iIntValue - m1Var.f47184b);
                    i25++;
                }
                z5 z5Var2 = z5Var;
                v1.y1 y1Var = z5Var2.f19884a;
                Integer num = z5Var2.f19887d;
                if (num == null || num.intValue() != i23) {
                    z5Var2.f19887d = Integer.valueOf(i23);
                    l8 l8Var2 = (l8) CollectionsKt.Q(i23, arrayList6);
                    if (l8Var2 != null) {
                        l8 l8Var3 = (l8) CollectionsKt.W(arrayList6);
                        int iQ03 = w0Var2.q0(l8Var3.f19038a + l8Var3.f19039b) + iQ0;
                        int iH = iQ03 - y1Var.f41892e.h();
                        int iQ04 = w0Var2.q0(l8Var2.f19038a) - ((iH / 2) - (w0Var2.q0(l8Var2.f19039b) / 2));
                        int i26 = iQ03 - iH;
                        if (i26 < 0) {
                            i26 = 0;
                        }
                        int iC = n80.p.c(iQ04, 0, i26);
                        if (y1Var.f41888a.h() != iC) {
                            v80.f0.B(z5Var2.f19885b, null, null, new b0.a1(z5Var2, iC, null, 2), 3);
                        }
                    }
                }
                return Unit.f26487a;
            }
        });
    }
}
