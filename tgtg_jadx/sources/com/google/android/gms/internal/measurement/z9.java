package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z9 extends b4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12083c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12084d;

    public z9(x0.e eVar) {
        super("internal.logger");
        this.f12084d = eVar;
        this.f11277b.put("log", new zd(this, false, true));
        this.f11277b.put("silent", new mb("silent", 1));
        ((b4) this.f11277b.get("silent")).g("log", new zd(this, true, true));
        this.f11277b.put("unmonitored", new mb("unmonitored", 2));
        ((b4) this.f11277b.get("unmonitored")).g("log", new zd(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final c5 a(b7 b7Var, List list) {
        TreeMap treeMap;
        switch (this.f12083c) {
            case 0:
                fa.c(this.f11276a, list, 3);
                String strE = ((i5) b7Var.f11283c).e(b7Var, (c5) list.get(0)).e();
                c5 c5Var = (c5) list.get(1);
                i5 i5Var = (i5) b7Var.f11283c;
                long jR = (long) fa.r(i5Var.e(b7Var, c5Var).h().doubleValue());
                c5 c5VarE = i5Var.e(b7Var, (c5) list.get(2));
                HashMap mapW = c5VarE instanceof z4 ? fa.w((z4) c5VarE) : new HashMap();
                a8.h hVar = (a8.h) this.f12084d;
                hVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapW.keySet()) {
                    HashMap map2 = ((b) hVar.f973b).f11265c;
                    map.put(str, b.b(str, map2.containsKey(str) ? map2.get(str) : null, mapW.get(str)));
                }
                ((ArrayList) hVar.f975d).add(new b(strE, jR, map));
                break;
            case 1:
                fa.c("getValue", list, 2);
                c5 c5VarE2 = ((i5) b7Var.f11283c).e(b7Var, (c5) list.get(0));
                c5 c5VarE3 = ((i5) b7Var.f11283c).e(b7Var, (c5) list.get(1));
                String strE2 = c5VarE2.e();
                ub.a aVar = (ub.a) this.f12084d;
                Map map3 = (Map) ((y00.h1) aVar.f40982c).f44833e.get((String) aVar.f40981b);
                String str2 = (map3 == null || !map3.containsKey(strE2)) ? null : (String) map3.get(strE2);
                if (str2 != null) {
                }
                break;
            case 2:
                break;
            case 3:
                try {
                } catch (Exception unused) {
                    return c5.U;
                }
                break;
            default:
                fa.c(this.f11276a, list, 3);
                ((i5) b7Var.f11283c).e(b7Var, (c5) list.get(0)).e();
                c5 c5Var2 = (c5) list.get(1);
                i5 i5Var2 = (i5) b7Var.f11283c;
                c5 c5VarE4 = i5Var2.e(b7Var, c5Var2);
                if (c5VarE4 instanceof b5) {
                    c5 c5VarE5 = i5Var2.e(b7Var, (c5) list.get(2));
                    if (c5VarE5 instanceof z4) {
                        z4 z4Var = (z4) c5VarE5;
                        HashMap map4 = z4Var.f12081a;
                        if (map4.containsKey("type")) {
                            String strE3 = z4Var.b("type").e();
                            int iP = map4.containsKey("priority") ? fa.p(z4Var.b("priority").h().doubleValue()) : 1000;
                            i5 i5Var3 = (i5) this.f12084d;
                            b5 b5Var = (b5) c5VarE4;
                            i5Var3.getClass();
                            if ("create".equals(strE3)) {
                                treeMap = (TreeMap) i5Var3.f11488c;
                            } else if (!"edit".equals(strE3)) {
                                com.braze.h2.b("Unknown callback type: ".concat(String.valueOf(strE3)));
                            } else {
                                treeMap = (TreeMap) i5Var3.f11487b;
                            }
                            if (treeMap.containsKey(Integer.valueOf(iP))) {
                                iP = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iP), b5Var);
                        } else {
                            i4.a.f("Undefined rule type");
                        }
                    } else {
                        i4.a.f("Invalid callback params");
                    }
                } else {
                    i4.a.f("Invalid callback type");
                }
                break;
        }
        return c5.U;
    }

    public z9(i5 i5Var) {
        super("internal.registerCallback");
        this.f12084d = i5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(mb mbVar, ub.a aVar) {
        super("getValue");
        this.f12084d = aVar;
    }

    public z9(a8.h hVar) {
        super("internal.eventLogger");
        this.f12084d = hVar;
    }

    public z9(y00.g1 g1Var) {
        super("internal.appMetadata");
        this.f12084d = g1Var;
    }
}
