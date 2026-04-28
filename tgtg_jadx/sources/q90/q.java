package q90;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements b, p, v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f36598a = new q();

    public static final l d(q qVar, String str) {
        l lVar = new l(str);
        l.f36525d.put(str, lVar);
        return lVar;
    }

    public static final void e(List list, StringBuilder sb2) {
        kotlin.ranges.a aVarH = n80.p.h(2, n80.p.j(0, list.size()));
        int i11 = aVarH.f26553a;
        int i12 = aVarH.f26554b;
        int i13 = aVarH.f26555c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i11);
            String str2 = (String) list.get(i11 + 1);
            if (i11 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
            if (i11 == i12) {
                return;
            } else {
                i11 += i13;
            }
        }
    }

    @Override // q90.b
    public g0 a(s0 s0Var, p0 p0Var) {
        return null;
    }

    @Override // q90.p
    public void b(v vVar, List list) {
        vVar.getClass();
    }

    @Override // q90.p
    public List c(v vVar) {
        vVar.getClass();
        return kotlin.collections.n0.f26529a;
    }

    public synchronized l f(String str) {
        l lVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = l.f36525d;
            lVar = (l) linkedHashMap.get(str);
            if (lVar == null) {
                lVar = (l) linkedHashMap.get(kotlin.text.y.p(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : kotlin.text.y.p(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (lVar == null) {
                    lVar = new l(str);
                }
                linkedHashMap.put(str, lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar;
    }
}
