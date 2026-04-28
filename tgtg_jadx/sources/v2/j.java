package v2;

import java.util.List;
import kotlin.collections.c0;
import y00.d0;
import z3.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements y3.i {
    @Override // y3.i
    public final Object e(Object obj) {
        d0 d0Var;
        obj.getClass();
        List list = (List) obj;
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        int iIntValue3 = ((Number) list.get(2)).intValue();
        v70.e eVarB = c0.b();
        int i11 = 3;
        while (true) {
            int i12 = iIntValue2 + 3;
            d0Var = y2.d.f45375i;
            if (i11 >= i12) {
                break;
            }
            eVarB.add(d0Var.e(list.get(i11)));
            i11++;
        }
        v70.e eVarA = c0.a(eVarB);
        v70.e eVarB2 = c0.b();
        while (i11 < iIntValue2 + iIntValue3 + 3) {
            eVarB2.add(d0Var.e(list.get(i11)));
            i11++;
        }
        return new y2.e(eVarA, c0.a(eVarB2), iIntValue);
    }

    @Override // y3.i
    public final Object i(y3.a aVar, Object obj) {
        d0 d0Var;
        y2.e eVar = (y2.e) obj;
        v70.e eVarB = c0.b();
        eVarB.add(Integer.valueOf(eVar.f45384a));
        r rVar = eVar.f45385b;
        eVarB.add(Integer.valueOf(rVar.size()));
        r rVar2 = eVar.f45386c;
        eVarB.add(Integer.valueOf(rVar2.size()));
        int size = rVar.size();
        int i11 = 0;
        while (true) {
            d0Var = y2.d.f45375i;
            if (i11 >= size) {
                break;
            }
            eVarB.add(d0Var.i(aVar, rVar.get(i11)));
            i11++;
        }
        int size2 = rVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            eVarB.add(d0Var.i(aVar, rVar2.get(i12)));
        }
        return c0.a(eVarB);
    }
}
