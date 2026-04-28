package a3;

import android.util.Rational;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f311b;

    public d2(Comparator comparator) {
        this.f310a = 3;
        b5.g0 g0Var = b5.m0.V;
        this.f311b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String strM;
        String strM2;
        switch (this.f310a) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                q1.i0 i0Var = (q1.i0) this.f311b;
                return w70.a.a(Integer.valueOf(i0Var.b(jLongValue)), Integer.valueOf(i0Var.b(((Number) obj2).longValue())));
            case 1:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.f311b;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f11 = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f11);
            case 2:
                ArrayList arrayList = ((i0.g0) this.f311b).f22658g;
                Iterator it = ((i0.d0) obj).l.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(arrayList.indexOf((e0.e0) it.next()));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(arrayList.indexOf((e0.e0) it.next()));
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((i0.d0) obj2).l.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(arrayList.indexOf((e0.e0) it2.next()));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(arrayList.indexOf((e0.e0) it2.next()));
                            if (numValueOf3.compareTo(numValueOf4) > 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return w70.a.a(numValueOf, numValueOf3);
                    }
                }
                m0.i1.c();
                return 0;
            case 3:
                int iCompare = ((Comparator) this.f311b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : b5.m0.Y.compare(((j5.t) obj).f24695c, ((j5.t) obj2).f24695c);
            case 4:
                int iCompare2 = ((d2) this.f311b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : w70.a.a(Integer.valueOf(((j5.t) obj).f24699g), Integer.valueOf(((j5.t) obj2).f24699g));
            case 5:
                List list = (List) this.f311b;
                int iIndexOf = list.indexOf(((FilterChipOption) obj).getId());
                Integer numValueOf5 = iIndexOf < 0 ? Integer.MAX_VALUE : Integer.valueOf(iIndexOf);
                int iIndexOf2 = list.indexOf(((FilterChipOption) obj2).getId());
                return w70.a.a(numValueOf5, iIndexOf2 >= 0 ? Integer.valueOf(iIndexOf2) : Integer.MAX_VALUE);
            case 6:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f311b;
                Integer num = (Integer) linkedHashMap.get((FilterChipOption) obj);
                Integer numValueOf6 = Integer.valueOf(num != null ? num.intValue() : 0);
                Integer num2 = (Integer) linkedHashMap.get((FilterChipOption) obj2);
                return w70.a.a(numValueOf6, Integer.valueOf(num2 != null ? num2.intValue() : 0));
            case 7:
                jd.a aVar = (jd.a) this.f311b;
                return w70.a.a((Comparable) aVar.invoke(obj), (Comparable) aVar.invoke(obj2));
            case 8:
                q1.m0 m0Var = (q1.m0) this.f311b;
                return w70.a.a(Float.valueOf(m0Var.b(((Map.Entry) obj2).getKey())), Float.valueOf(m0Var.b(((Map.Entry) obj).getKey())));
            default:
                File file = (File) obj;
                file.getClass();
                String strG = e80.m.g(file);
                StringBuilder sb2 = new StringBuilder();
                uf.g gVar = (uf.g) this.f311b;
                String strN = kotlin.text.y.n(strG, w2.l1.f(sb2, gVar.f41099b, '-'), "", false);
                int iF = StringsKt.F(strN, '-', 0, false, 6);
                if (iF >= 0) {
                    strM = StringsKt.M(10, strN.substring(0, iF)) + strN.substring(iF);
                } else {
                    strM = StringsKt.M(10, strN);
                }
                File file2 = (File) obj2;
                file2.getClass();
                String strN2 = kotlin.text.y.n(e80.m.g(file2), w2.l1.f(new StringBuilder(), gVar.f41099b, '-'), "", false);
                int iF2 = StringsKt.F(strN2, '-', 0, false, 6);
                if (iF2 >= 0) {
                    strM2 = StringsKt.M(10, strN2.substring(0, iF2)) + strN2.substring(iF2);
                } else {
                    strM2 = StringsKt.M(10, strN2);
                }
                return w70.a.a(strM, strM2);
        }
    }

    public /* synthetic */ d2(Object obj, int i11) {
        this.f310a = i11;
        this.f311b = obj;
    }
}
