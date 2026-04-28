package m2;

import a3.b3;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29051a;

    public /* synthetic */ p1(int i11) {
        this.f29051a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m5.r0 r0VarB;
        m5.l0 l0Var;
        m5.l0 l0Var2 = null;
        l0Var2 = null;
        int i11 = 0;
        switch (this.f29051a) {
            case 0:
                b3 b3Var = (b3) obj;
                Integer numD = b3Var.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue = numD.intValue();
                long j9 = b3Var.f283f;
                int i12 = m5.t0.f29649c;
                return new r5.e(0, iIntValue - ((int) (j9 & 4294967295L)));
            case 1:
                b3 b3Var2 = (b3) obj;
                Integer numC = b3Var2.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue2 = numC.intValue();
                long j11 = b3Var2.f283f;
                int i13 = m5.t0.f29649c;
                return new r5.e(((int) (j11 & 4294967295L)) - iIntValue2, 0);
            case 2:
                b3 b3Var3 = (b3) obj;
                Integer numB = b3Var3.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue3 = numB.intValue();
                long j12 = b3Var3.f283f;
                int i14 = m5.t0.f29649c;
                return new r5.e(0, iIntValue3 - ((int) (j12 & 4294967295L)));
            case 3:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                z1.h2 h2Var = ((Boolean) obj2).booleanValue() ? z1.h2.Vertical : z1.h2.Horizontal;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new y1(h2Var, ((Float) obj3).floatValue());
            case 4:
                m5.f fVar = (m5.f) obj;
                Object obj4 = fVar.f29529a;
                if (!(obj4 instanceof m5.o) || (r0VarB = ((m5.o) obj4).b()) == null || (r0VarB.f29631a == null && r0VarB.f29632b == null && r0VarB.f29633c == null && r0VarB.f29634d == null)) {
                    return kotlin.collections.d0.d(fVar);
                }
                Object obj5 = fVar.f29529a;
                obj5.getClass();
                m5.r0 r0VarB2 = ((m5.o) obj5).b();
                if (r0VarB2 == null || (l0Var = r0VarB2.f29631a) == null) {
                    l0Var = new m5.l0(0L, 0L, (q5.r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                }
                return kotlin.collections.d0.d(fVar, new m5.f(l0Var, fVar.f29530b, fVar.f29531c));
            case 5:
                j5.a0 a0Var = j5.x.A;
                Unit unit = Unit.f26487a;
                ((j5.b0) obj).b(a0Var, unit);
                return unit;
            case 6:
                defpackage.a aVar = ((m3.d1) obj).f29261a;
                if (aVar != null) {
                    aVar.invoke();
                }
                return Unit.f26487a;
            case 7:
                return Boolean.valueOf(!(((m5.c) obj) instanceof m5.w));
            case 8:
                m5.t tVar = (m5.t) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(tVar.f29642b);
                sb2.append(", ");
                return r8.k.o(sb2, tVar.f29643c, ')');
            case 9:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(0);
                Function1 function1 = (Function1) m5.i0.f29549h.f40982c;
                Boolean bool = Boolean.FALSE;
                m5.l0 l0Var3 = (Intrinsics.areEqual(obj6, bool) || obj6 == null) ? null : (m5.l0) function1.invoke(obj6);
                Object obj7 = list2.get(1);
                m5.l0 l0Var4 = (Intrinsics.areEqual(obj7, bool) || obj7 == null) ? null : (m5.l0) function1.invoke(obj7);
                Object obj8 = list2.get(2);
                m5.l0 l0Var5 = (Intrinsics.areEqual(obj8, bool) || obj8 == null) ? null : (m5.l0) function1.invoke(obj8);
                Object obj9 = list2.get(3);
                if (!Intrinsics.areEqual(obj9, bool) && obj9 != null) {
                    l0Var2 = (m5.l0) function1.invoke(obj9);
                }
                return new m5.r0(l0Var3, l0Var4, l0Var5, l0Var2);
            case 10:
                obj.getClass();
                List list3 = (List) obj;
                Object obj10 = list3.get(1);
                List list4 = (Intrinsics.areEqual(obj10, Boolean.FALSE) || obj10 == null) ? null : (List) ((Function1) m5.i0.f29542a.f40982c).invoke(obj10);
                Object obj11 = list3.get(0);
                String str = obj11 != null ? (String) obj11 : null;
                str.getClass();
                return new m5.h(list4, str);
            case 11:
                obj.getClass();
                return new x5.l(((Integer) obj).intValue());
            case 12:
                obj.getClass();
                List list5 = (List) obj;
                return new x5.p(((Number) list5.get(0)).floatValue(), ((Number) list5.get(1)).floatValue());
            case 13:
                obj.getClass();
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                z5.p[] pVarArr = z5.o.f47288b;
                Function1 function12 = m5.i0.f29562v.f29536b;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.areEqual(obj12, bool2);
                z5.o oVar = obj12 != null ? (z5.o) function12.invoke(obj12) : null;
                oVar.getClass();
                long j13 = oVar.f47290a;
                Object obj13 = list6.get(1);
                Intrinsics.areEqual(obj13, bool2);
                z5.o oVar2 = obj13 != null ? (z5.o) function12.invoke(obj13) : null;
                oVar2.getClass();
                return new x5.q(j13, oVar2.f47290a);
            case 14:
                obj.getClass();
                return new q5.r(((Integer) obj).intValue());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                obj.getClass();
                return new x5.a(((Float) obj).floatValue());
            case 16:
                obj.getClass();
                List list7 = (List) obj;
                Object obj14 = list7.get(0);
                Integer num = obj14 != null ? (Integer) obj14 : null;
                num.getClass();
                int iIntValue4 = num.intValue();
                Object obj15 = list7.get(1);
                Integer num2 = obj15 != null ? (Integer) obj15 : null;
                num2.getClass();
                return new m5.t0(m5.k0.b(iIntValue4, num2.intValue()));
            case 17:
                obj.getClass();
                List list8 = (List) obj;
                Object obj16 = list8.get(0);
                int i15 = i4.v.f23316i;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.areEqual(obj16, bool3);
                i4.v vVar = obj16 != null ? Intrinsics.areEqual(obj16, bool3) ? new i4.v(i4.v.f23315h) : new i4.v(i4.g0.c(((Integer) obj16).intValue())) : null;
                vVar.getClass();
                long j14 = vVar.f23317a;
                Object obj17 = list8.get(1);
                m5.g0 g0Var = m5.i0.f29564x;
                Intrinsics.areEqual(obj17, bool3);
                h4.b bVar = obj17 != null ? (h4.b) g0Var.f29536b.invoke(obj17) : null;
                bVar.getClass();
                long j15 = bVar.f21378a;
                Object obj18 = list8.get(2);
                Float f11 = obj18 != null ? (Float) obj18 : null;
                f11.getClass();
                return new i4.u0(j14, j15, f11.floatValue());
            case 18:
                obj.getClass();
                return new x5.k(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                List list9 = (List) obj;
                Object obj19 = list9.get(0);
                String str2 = obj19 != null ? (String) obj19 : null;
                str2.getClass();
                Object obj20 = list9.get(1);
                return new m5.n(str2, (Intrinsics.areEqual(obj20, Boolean.FALSE) || obj20 == null) ? null : (m5.r0) ((Function1) m5.i0.f29550i.f40982c).invoke(obj20), null);
            case 20:
                obj.getClass();
                return new x5.m(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                return new x5.d(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                List list10 = (List) obj;
                ArrayList arrayList = new ArrayList(list10.size());
                int size = list10.size();
                while (i11 < size) {
                    Object obj21 = list10.get(i11);
                    m5.f fVar2 = (Intrinsics.areEqual(obj21, Boolean.FALSE) || obj21 == null) ? null : (m5.f) ((Function1) m5.i0.f29543b.f40982c).invoke(obj21);
                    fVar2.getClass();
                    arrayList.add(fVar2);
                    i11++;
                }
                return arrayList;
            case 23:
                obj.getClass();
                return new q5.n(((Integer) obj).intValue());
            case 24:
                obj.getClass();
                return new q5.o(((Integer) obj).intValue());
            case 25:
                Boolean bool4 = Boolean.FALSE;
                if (Intrinsics.areEqual(obj, bool4)) {
                    return new z5.o(z5.o.f47289c);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj22 = list11.get(0);
                Float f12 = obj22 != null ? (Float) obj22 : null;
                f12.getClass();
                float fFloatValue = f12.floatValue();
                Object obj23 = list11.get(1);
                m5.g0 g0Var2 = m5.i0.f29563w;
                Intrinsics.areEqual(obj23, bool4);
                z5.p pVar = obj23 != null ? (z5.p) g0Var2.f29536b.invoke(obj23) : null;
                pVar.getClass();
                return new z5.o(b0.a0.F(fFloatValue, pVar.f47291a));
            case 26:
                return Intrinsics.areEqual(obj, (Object) 0) ? new z5.p(8589934592L) : Intrinsics.areEqual(obj, (Object) 1) ? new z5.p(4294967296L) : new z5.p(0L);
            case 27:
                if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                    return new h4.b(9205357640488583168L);
                }
                obj.getClass();
                List list12 = (List) obj;
                Object obj24 = list12.get(0);
                Float f13 = obj24 != null ? (Float) obj24 : null;
                f13.getClass();
                float fFloatValue2 = f13.floatValue();
                Object obj25 = list12.get(1);
                Float f14 = obj25 != null ? (Float) obj25 : null;
                f14.getClass();
                return new h4.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f14.floatValue())) & 4294967295L));
            case 28:
                obj.getClass();
                List list13 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list13.size());
                int size2 = list13.size();
                while (i11 < size2) {
                    Object obj26 = list13.get(i11);
                    t5.b bVar2 = (Intrinsics.areEqual(obj26, Boolean.FALSE) || obj26 == null) ? null : (t5.b) ((Function1) m5.i0.f29566z.f40982c).invoke(obj26);
                    bVar2.getClass();
                    arrayList2.add(bVar2);
                    i11++;
                }
                return new t5.c(arrayList2);
            default:
                obj.getClass();
                String str3 = (String) obj;
                t5.d.f39798a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (Intrinsics.areEqual(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new t5.b(localeForLanguageTag);
        }
    }
}
