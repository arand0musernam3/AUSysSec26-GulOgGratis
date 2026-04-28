package l6;

import f6.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends d {
    @Override // k6.g, k6.b, k6.h
    public final void apply() {
        t tVar;
        ArrayList arrayList = this.f26049m0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tVar = this.f26047k0;
            if (!zHasNext) {
                break;
            } else {
                tVar.b(it.next()).h();
            }
        }
        k6.b bVar = null;
        k6.b bVar2 = null;
        for (Object obj : arrayList) {
            k6.b bVarB = tVar.b(obj);
            if (bVar2 == null) {
                Object obj2 = this.R;
                if (obj2 != null) {
                    bVarB.p(obj2);
                    bVarB.k(this.f26015n).m(this.f26021t);
                } else {
                    Object obj3 = this.S;
                    if (obj3 != null) {
                        bVarB.f26000d0 = k6.j.TOP_TO_BOTTOM;
                        bVarB.S = obj3;
                        bVarB.k(this.f26015n).m(this.f26021t);
                    } else {
                        String string = bVarB.f25993a.toString();
                        bVarB.p(0);
                        bVarB.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                    }
                }
                bVar2 = bVarB;
            }
            if (bVar != null) {
                String string2 = bVar.f25993a.toString();
                String string3 = bVarB.f25993a.toString();
                Object obj4 = bVarB.f25993a;
                bVar.f26000d0 = k6.j.BOTTOM_TO_TOP;
                bVar.U = obj4;
                bVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj5 = bVar.f25993a;
                bVarB.f26000d0 = k6.j.TOP_TO_BOTTOM;
                bVarB.S = obj5;
                bVarB.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.f27394o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                bVarB.f26005g = fFloatValue;
            }
            bVar = bVarB;
        }
        if (bVar != null) {
            Object obj6 = this.U;
            if (obj6 != null) {
                bVar.f26000d0 = k6.j.BOTTOM_TO_TOP;
                bVar.U = obj6;
                bVar.k(this.f26016o).m(this.f26022u);
            } else {
                Object obj7 = this.V;
                if (obj7 != null) {
                    bVar.e(obj7);
                    bVar.k(this.f26016o).m(this.f26022u);
                } else {
                    String string5 = bVar.f25993a.toString();
                    bVar.e(0);
                    bVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                }
            }
        }
        if (bVar2 == null) {
            return;
        }
        float f11 = this.f27393n0;
        if (f11 != 0.5f) {
            bVar2.f26009i = f11;
        }
        int i11 = k.f27431a[this.t0.ordinal()];
        if (i11 == 1) {
            bVar2.f26001e = 0;
        } else if (i11 == 2) {
            bVar2.f26001e = 1;
        } else {
            if (i11 != 3) {
                return;
            }
            bVar2.f26001e = 2;
        }
    }
}
