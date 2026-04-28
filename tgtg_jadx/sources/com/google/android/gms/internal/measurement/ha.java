package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ha extends z4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8.h f11458b;

    public ha(a8.h hVar) {
        this.f11458b = hVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.z4, com.google.android.gms.internal.measurement.c5
    public final c5 j(String str, b7 b7Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        a8.h hVar = this.f11458b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    fa.c("getEventName", arrayList, 0);
                    return new f5(((b) hVar.f974c).f11263a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    fa.c("getTimestamp", arrayList, 0);
                    return new i3(Double.valueOf(((b) hVar.f974c).f11264b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    fa.c("getParamValue", arrayList, 1);
                    String strE = ((i5) b7Var.f11283c).e(b7Var, (c5) arrayList.get(0)).e();
                    HashMap map = ((b) hVar.f974c).f11265c;
                    return la.b(map.containsKey(strE) ? map.get(strE) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    fa.c("getParams", arrayList, 0);
                    HashMap map2 = ((b) hVar.f974c).f11265c;
                    z4 z4Var = new z4();
                    for (String str2 : map2.keySet()) {
                        z4Var.g(str2, la.b(map2.get(str2)));
                    }
                    return z4Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    fa.c("setParamValue", arrayList, 2);
                    String strE2 = ((i5) b7Var.f11283c).e(b7Var, (c5) arrayList.get(0)).e();
                    c5 c5VarE = ((i5) b7Var.f11283c).e(b7Var, (c5) arrayList.get(1));
                    b bVar = (b) hVar.f974c;
                    Object objU = fa.u(c5VarE);
                    HashMap map3 = bVar.f11265c;
                    if (objU == null) {
                        map3.remove(strE2);
                        return c5VarE;
                    }
                    map3.put(strE2, b.b(strE2, map3.get(strE2), objU));
                    return c5VarE;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    fa.c("setEventName", arrayList, 1);
                    c5 c5VarE2 = ((i5) b7Var.f11283c).e(b7Var, (c5) arrayList.get(0));
                    if (c5.U.equals(c5VarE2) || c5.f11303a0.equals(c5VarE2)) {
                        i4.a.f("Illegal event name");
                        return null;
                    }
                    ((b) hVar.f974c).f11263a = c5VarE2.e();
                    return new f5(c5VarE2.e());
                }
                break;
        }
        return super.j(str, b7Var, arrayList);
    }
}
