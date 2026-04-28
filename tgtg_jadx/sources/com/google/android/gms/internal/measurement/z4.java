package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class z4 implements c5, y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12081a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.y4
    public final c5 b(String str) {
        HashMap map = this.f12081a;
        return map.containsKey(str) ? (c5) map.get(str) : c5.U;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Iterator c() {
        return new t4(this.f12081a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final String e() {
        return "[object Object]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z4) {
            return this.f12081a.equals(((z4) obj).f12081a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final void g(String str, c5 c5Var) {
        HashMap map = this.f12081a;
        if (c5Var == null) {
            map.remove(str);
        } else {
            map.put(str, c5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f12081a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final boolean i(String str) {
        return this.f12081a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public c5 j(String str, b7 b7Var, ArrayList arrayList) {
        return "toString".equals(str) ? new f5(toString()) : y4.l(this, new f5(str), b7Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 m() {
        z4 z4Var = new z4();
        for (Map.Entry entry : this.f12081a.entrySet()) {
            boolean z11 = entry.getValue() instanceof y4;
            HashMap map = z4Var.f12081a;
            if (z11) {
                map.put((String) entry.getKey(), (c5) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((c5) entry.getValue()).m());
            }
        }
        return z4Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f12081a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(MessageLogView.COMMA_SEPARATOR));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
