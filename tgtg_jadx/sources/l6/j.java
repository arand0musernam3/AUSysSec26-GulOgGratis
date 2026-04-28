package l6;

import f6.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends d {
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
                tVar.b(it.next()).g();
            }
        }
        k6.b bVar = null;
        k6.b bVar2 = null;
        for (Object obj : arrayList) {
            k6.b bVarB = tVar.b(obj);
            if (bVar2 == null) {
                Object obj2 = this.N;
                if (obj2 != null) {
                    bVarB.o(obj2);
                    bVarB.k(this.l).m(this.f26019r);
                } else {
                    Object obj3 = this.O;
                    if (obj3 != null) {
                        bVarB.f26000d0 = k6.j.START_TO_END;
                        bVarB.O = obj3;
                        bVarB.k(this.l).m(this.f26019r);
                    } else {
                        Object obj4 = this.J;
                        if (obj4 != null) {
                            bVarB.o(obj4);
                            bVarB.k(this.f26011j).m(this.f26017p);
                        } else {
                            Object obj5 = this.K;
                            if (obj5 != null) {
                                bVarB.f26000d0 = k6.j.START_TO_END;
                                bVarB.O = obj5;
                                bVarB.k(this.f26011j).m(this.f26017p);
                            } else {
                                String string = bVarB.f25993a.toString();
                                bVarB.o(0);
                                bVarB.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                            }
                        }
                    }
                }
                bVar2 = bVarB;
            }
            if (bVar != null) {
                String string2 = bVar.f25993a.toString();
                String string3 = bVarB.f25993a.toString();
                Object obj6 = bVarB.f25993a;
                bVar.f26000d0 = k6.j.END_TO_START;
                bVar.P = obj6;
                bVar.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj7 = bVar.f25993a;
                bVarB.f26000d0 = k6.j.START_TO_END;
                bVarB.O = obj7;
                bVarB.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.f27394o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                bVarB.f26003f = fFloatValue;
            }
            bVar = bVarB;
        }
        if (bVar != null) {
            Object obj8 = this.P;
            if (obj8 != null) {
                bVar.f26000d0 = k6.j.END_TO_START;
                bVar.P = obj8;
                bVar.k(this.f26014m).m(this.f26020s);
            } else {
                Object obj9 = this.Q;
                if (obj9 != null) {
                    bVar.i(obj9);
                    bVar.k(this.f26014m).m(this.f26020s);
                } else {
                    Object obj10 = this.L;
                    if (obj10 != null) {
                        bVar.f26000d0 = k6.j.END_TO_START;
                        bVar.P = obj10;
                        bVar.k(this.f26013k).m(this.f26018q);
                    } else {
                        Object obj11 = this.M;
                        if (obj11 != null) {
                            bVar.i(obj11);
                            bVar.k(this.f26013k).m(this.f26018q);
                        } else {
                            String string5 = bVar.f25993a.toString();
                            bVar.i(0);
                            bVar.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                        }
                    }
                }
            }
        }
        if (bVar2 == null) {
            return;
        }
        float f11 = this.f27393n0;
        if (f11 != 0.5f) {
            bVar2.f26007h = f11;
        }
        int i11 = i.f27430a[this.t0.ordinal()];
        if (i11 == 1) {
            bVar2.f25999d = 0;
        } else if (i11 == 2) {
            bVar2.f25999d = 1;
        } else {
            if (i11 != 3) {
                return;
            }
            bVar2.f25999d = 2;
        }
    }
}
