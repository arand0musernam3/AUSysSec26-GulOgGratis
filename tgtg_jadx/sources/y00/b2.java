package y00;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b2 f44615c = new b2(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f44616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44617b;

    public b2(int i11) {
        EnumMap enumMap = new EnumMap(a2.class);
        this.f44616a = enumMap;
        a2 a2Var = a2.AD_STORAGE;
        y1 y1Var = y1.UNINITIALIZED;
        enumMap.put(a2Var, y1Var);
        enumMap.put(a2.ANALYTICS_STORAGE, y1Var);
        this.f44617b = i11;
    }

    public static String a(int i11) {
        return i11 != -30 ? i11 != -20 ? i11 != -10 ? i11 != 0 ? i11 != 30 ? i11 != 90 ? i11 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static b2 b(int i11, Bundle bundle) {
        if (bundle == null) {
            return new b2(i11);
        }
        EnumMap enumMap = new EnumMap(a2.class);
        for (a2 a2Var : z1.STORAGE.c()) {
            enumMap.put(a2Var, d(bundle.getString(a2Var.zze)));
        }
        return new b2(enumMap, i11);
    }

    public static b2 c(int i11, String str) {
        EnumMap enumMap = new EnumMap(a2.class);
        a2[] a2VarArrA = z1.STORAGE.a();
        for (int i12 = 0; i12 < a2VarArrA.length; i12++) {
            String str2 = str == null ? "" : str;
            a2 a2Var = a2VarArrA[i12];
            int i13 = i12 + 2;
            if (i13 < str2.length()) {
                enumMap.put(a2Var, e(str2.charAt(i13)));
            } else {
                enumMap.put(a2Var, y1.UNINITIALIZED);
            }
        }
        return new b2(enumMap, i11);
    }

    public static y1 d(String str) {
        return str == null ? y1.UNINITIALIZED : str.equals("granted") ? y1.GRANTED : str.equals("denied") ? y1.DENIED : y1.UNINITIALIZED;
    }

    public static y1 e(char c3) {
        return c3 != '+' ? c3 != '0' ? c3 != '1' ? y1.UNINITIALIZED : y1.GRANTED : y1.DENIED : y1.POLICY;
    }

    public static char h(y1 y1Var) {
        if (y1Var == null) {
            return '-';
        }
        int iOrdinal = y1Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i11, int i12) {
        int i13 = -30;
        if (i11 == -20) {
            if (i12 == -30) {
                return true;
            }
            i11 = -20;
        }
        if (i11 != -30) {
            i13 = i11;
        } else if (i12 == -20) {
            return true;
        }
        return i13 == i12 || i11 < i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        for (a2 a2Var : z1.STORAGE.c()) {
            if (this.f44616a.get(a2Var) != b2Var.f44616a.get(a2Var)) {
                return false;
            }
        }
        return this.f44617b == b2Var.f44617b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            y00.z1 r1 = y00.z1.STORAGE
            y00.a2[] r1 = r1.a()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f44616a
            java.lang.Object r4 = r5.get(r4)
            y00.y1 r4 = (y00.y1) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.b2.f():java.lang.String");
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a2 a2Var : z1.STORAGE.a()) {
            sb2.append(h((y1) this.f44616a.get(a2Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f44616a.values().iterator();
        int iHashCode = this.f44617b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((y1) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(a2 a2Var) {
        return ((y1) this.f44616a.get(a2Var)) != y1.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.b2 j(y00.b2 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<y00.a2> r1 = y00.a2.class
            r0.<init>(r1)
            y00.z1 r1 = y00.z1.STORAGE
            y00.a2[] r1 = r1.c()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f44616a
            java.lang.Object r5 = r5.get(r4)
            y00.y1 r5 = (y00.y1) r5
            java.util.EnumMap r6 = r9.f44616a
            java.lang.Object r6 = r6.get(r4)
            y00.y1 r6 = (y00.y1) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            y00.y1 r7 = y00.y1.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            y00.y1 r7 = y00.y1.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            y00.y1 r7 = y00.y1.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            y00.y1 r5 = y00.y1.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            y00.b2 r9 = new y00.b2
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.b2.j(y00.b2):y00.b2");
    }

    public final b2 k(b2 b2Var) {
        EnumMap enumMap = new EnumMap(a2.class);
        for (a2 a2Var : z1.STORAGE.c()) {
            y1 y1Var = (y1) this.f44616a.get(a2Var);
            if (y1Var == y1.UNINITIALIZED) {
                y1Var = (y1) b2Var.f44616a.get(a2Var);
            }
            if (y1Var != null) {
                enumMap.put(a2Var, y1Var);
            }
        }
        return new b2(enumMap, this.f44617b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f44617b));
        for (a2 a2Var : z1.STORAGE.c()) {
            sb2.append(MessageLogView.COMMA_SEPARATOR);
            sb2.append(a2Var.zze);
            sb2.append("=");
            y1 y1Var = (y1) this.f44616a.get(a2Var);
            if (y1Var == null) {
                y1Var = y1.UNINITIALIZED;
            }
            sb2.append(y1Var);
        }
        return sb2.toString();
    }

    public b2(EnumMap enumMap, int i11) {
        EnumMap enumMap2 = new EnumMap(a2.class);
        this.f44616a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f44617b = i11;
    }
}
