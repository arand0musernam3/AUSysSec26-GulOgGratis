package y00;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.z8;
import com.google.android.gms.internal.measurement.zzaeh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n4 extends f4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45014f;

    public static final String A(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable B(t8 t8Var, String str) {
        w8 w8VarZ = z(t8Var, str);
        if (w8VarZ == null) {
            return null;
        }
        return H(w8VarZ);
    }

    public static final void E(int i11, StringBuilder sb2) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
    }

    public static final void F(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String G(boolean z11, boolean z12, boolean z13) {
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append("Dynamic ");
        }
        if (z12) {
            sb2.append("Sequence ");
        }
        if (z13) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable H(w8 w8Var) {
        if (w8Var.v()) {
            return w8Var.w();
        }
        if (w8Var.x()) {
            return Long.valueOf(w8Var.y());
        }
        if (w8Var.B()) {
            return Double.valueOf(w8Var.C());
        }
        if (w8Var.E() > 0) {
            return c0(w8Var.D());
        }
        return null;
    }

    public static final void I(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(MessageLogView.COMMA_SEPARATOR);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                F(builder, str3, string, hashSet);
            }
        }
    }

    public static final void J(StringBuilder sb2, String str, e9 e9Var) {
        if (e9Var == null) {
            return;
        }
        E(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (e9Var.w() != 0) {
            E(4, sb2);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l : e9Var.v()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (e9Var.u() != 0) {
            E(4, sb2);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l7 : e9Var.t()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l7);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (e9Var.y() != 0) {
            E(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (r8 r8Var : e9Var.x()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(r8Var.t() ? Integer.valueOf(r8Var.u()) : null);
                sb2.append(":");
                sb2.append(r8Var.v() ? Long.valueOf(r8Var.w()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (e9Var.A() != 0) {
            E(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (g9 g9Var : e9Var.z()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(g9Var.t() ? Integer.valueOf(g9Var.u()) : null);
                sb2.append(": [");
                Iterator it = g9Var.v().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i21 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i21;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        E(3, sb2);
        sb2.append("}\n");
    }

    public static final void K(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj == null) {
            return;
        }
        E(i11 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void L(StringBuilder sb2, int i11, String str, l7 l7Var) {
        if (l7Var == null) {
            return;
        }
        E(i11, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (l7Var.t()) {
            int iD = l7Var.D();
            K(sb2, i11, "comparison_type", iD != 1 ? iD != 2 ? iD != 3 ? iD != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (l7Var.u()) {
            K(sb2, i11, "match_as_float", Boolean.valueOf(l7Var.v()));
        }
        if (l7Var.w()) {
            K(sb2, i11, "comparison_value", l7Var.x());
        }
        if (l7Var.y()) {
            K(sb2, i11, "min_comparison_value", l7Var.z());
        }
        if (l7Var.A()) {
            K(sb2, i11, "max_comparison_value", l7Var.B());
        }
        E(i11, sb2);
        sb2.append("}\n");
    }

    public static boolean T(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean U(com.google.android.gms.internal.measurement.s1 s1Var, int i11) {
        if (i11 < ((com.google.android.gms.internal.measurement.x1) s1Var).f12027c * 64) {
            return ((1 << (i11 % 64)) & ((Long) ((com.google.android.gms.internal.measurement.x1) s1Var).get(i11 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList V(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            long j9 = 0;
            for (int i12 = 0; i12 < 64; i12++) {
                int i13 = (i11 * 64) + i12;
                if (i13 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i13)) {
                    j9 |= 1 << i12;
                }
            }
            arrayList.add(Long.valueOf(j9));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.i1 a0(com.google.android.gms.internal.measurement.i1 i1Var, byte[] bArr) throws zzaeh {
        com.google.android.gms.internal.measurement.c1 c1VarA = com.google.android.gms.internal.measurement.c1.a();
        if (c1VarA != null) {
            i1Var.getClass();
            i1Var.h(bArr, bArr.length, c1VarA);
            return i1Var;
        }
        i1Var.getClass();
        int length = bArr.length;
        int i11 = com.google.android.gms.internal.measurement.p0.f11740a;
        i1Var.h(bArr, length, com.google.android.gms.internal.measurement.c1.f11298b);
        return i1Var;
    }

    public static int b0(a9 a9Var, String str) {
        for (int i11 = 0; i11 < ((b9) a9Var.f11483b).a2(); i11++) {
            if (str.equals(((b9) a9Var.f11483b).b2(i11).v())) {
                return i11;
            }
        }
        return -1;
    }

    public static Bundle[] c0(com.google.android.gms.internal.measurement.t1 t1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = t1Var.iterator();
        while (it.hasNext()) {
            w8 w8Var = (w8) it.next();
            if (w8Var != null) {
                Bundle bundle = new Bundle();
                for (w8 w8Var2 : w8Var.D()) {
                    if (w8Var2.v()) {
                        bundle.putString(w8Var2.u(), w8Var2.w());
                    } else if (w8Var2.x()) {
                        bundle.putLong(w8Var2.u(), w8Var2.y());
                    } else if (w8Var2.B()) {
                        bundle.putDouble(w8Var2.u(), w8Var2.C());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap d0(Bundle bundle, boolean z11) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z12 = obj instanceof Parcelable[];
            if (z12 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z11) {
                    ArrayList arrayList = new ArrayList();
                    if (z12) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(d0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            Object obj2 = arrayList2.get(i11);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(d0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(d0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static u t(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleU = u(bVar.f11265c, true);
        String string = (!bundleU.containsKey("_o") || (obj = bundleU.get("_o")) == null) ? "app" : obj.toString();
        String strG = c2.g(c2.f44647a, bVar.f11263a, c2.f44652f);
        if (strG == null) {
            strG = bVar.f11263a;
        }
        return new u(strG, new t(bundleU), string, bVar.f11264b, 0L);
    }

    public static Bundle u(Map map, boolean z11) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z11) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList2.add(u((Map) arrayList.get(i11), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void x(s8 s8Var, String str, Long l) {
        List listI = s8Var.i();
        int i11 = 0;
        while (true) {
            if (i11 >= listI.size()) {
                i11 = -1;
                break;
            } else if (str.equals(((w8) listI.get(i11)).u())) {
                break;
            } else {
                i11++;
            }
        }
        v8 v8VarF = w8.F();
        v8VarF.i(str);
        v8VarF.k(l.longValue());
        if (i11 < 0) {
            s8Var.m(v8VarF);
        } else {
            s8Var.b();
            ((t8) s8Var.f11483b).K(i11, (w8) v8VarF.d());
        }
    }

    public static final Bundle y(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w8 w8Var = (w8) it.next();
            String strU = w8Var.u();
            if (w8Var.B()) {
                bundle.putDouble(strU, w8Var.C());
            } else if (w8Var.z()) {
                bundle.putFloat(strU, w8Var.A());
            } else if (w8Var.v()) {
                bundle.putString(strU, w8Var.w());
            } else if (w8Var.x()) {
                bundle.putLong(strU, w8Var.y());
            }
        }
        return bundle;
    }

    public static final w8 z(t8 t8Var, String str) {
        for (w8 w8Var : t8Var.v()) {
            if (w8Var.u().equals(str)) {
                return w8Var;
            }
        }
        return null;
    }

    public final void C(StringBuilder sb2, int i11, com.google.android.gms.internal.measurement.t1 t1Var) {
        if (t1Var == null) {
            return;
        }
        int i12 = i11 + 1;
        Iterator it = t1Var.iterator();
        while (it.hasNext()) {
            w8 w8Var = (w8) it.next();
            if (w8Var != null) {
                E(i12, sb2);
                sb2.append("param {\n");
                K(sb2, i12, "name", w8Var.t() ? ((n1) this.f21216b).f44991j.b(w8Var.u()) : null);
                K(sb2, i12, "string_value", w8Var.v() ? w8Var.w() : null);
                K(sb2, i12, "int_value", w8Var.x() ? Long.valueOf(w8Var.y()) : null);
                K(sb2, i12, "double_value", w8Var.B() ? Double.valueOf(w8Var.C()) : null);
                if (w8Var.E() > 0) {
                    C(sb2, i12, w8Var.D());
                }
                E(i12, sb2);
                sb2.append("}\n");
            }
        }
    }

    public final void D(StringBuilder sb2, int i11, j7 j7Var) {
        String str;
        if (j7Var == null) {
            return;
        }
        E(i11, sb2);
        sb2.append("filter {\n");
        if (j7Var.x()) {
            K(sb2, i11, "complement", Boolean.valueOf(j7Var.y()));
        }
        if (j7Var.z()) {
            K(sb2, i11, "param_name", ((n1) this.f21216b).f44991j.b(j7Var.A()));
        }
        if (j7Var.t()) {
            int i12 = i11 + 1;
            o7 o7VarU = j7Var.u();
            if (o7VarU != null) {
                E(i12, sb2);
                sb2.append("string_filter {\n");
                if (o7VarU.t()) {
                    switch (o7VarU.B()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    K(sb2, i12, "match_type", str);
                }
                if (o7VarU.u()) {
                    K(sb2, i12, "expression", o7VarU.v());
                }
                if (o7VarU.w()) {
                    K(sb2, i12, "case_sensitive", Boolean.valueOf(o7VarU.x()));
                }
                if (o7VarU.z() > 0) {
                    E(i11 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : o7VarU.y()) {
                        E(i11 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                E(i12, sb2);
                sb2.append("}\n");
            }
        }
        if (j7Var.v()) {
            L(sb2, i11 + 1, "number_filter", j7Var.w());
        }
        E(i11, sb2);
        sb2.append("}\n");
    }

    public final void M(k9 k9Var, Object obj) {
        com.google.android.gms.common.internal.i0.h(obj);
        k9Var.b();
        ((l9) k9Var.f11483b).I();
        k9Var.b();
        ((l9) k9Var.f11483b).K();
        k9Var.b();
        ((l9) k9Var.f11483b).M();
        if (obj instanceof String) {
            k9Var.b();
            ((l9) k9Var.f11483b).H((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            k9Var.b();
            ((l9) k9Var.f11483b).J(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            k9Var.b();
            ((l9) k9Var.f11483b).L(dDoubleValue);
        } else {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void N(v8 v8Var, Object obj) {
        v8Var.b();
        ((w8) v8Var.f11483b).I();
        v8Var.b();
        ((w8) v8Var.f11483b).K();
        v8Var.b();
        ((w8) v8Var.f11483b).M();
        v8Var.b();
        ((w8) v8Var.f11483b).P();
        if (obj instanceof String) {
            v8Var.j((String) obj);
            return;
        }
        if (obj instanceof Long) {
            v8Var.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            v8Var.b();
            ((w8) v8Var.f11483b).L(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                v8 v8VarF = w8.F();
                for (String str : bundle.keySet()) {
                    v8 v8VarF2 = w8.F();
                    v8VarF2.i(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        v8VarF2.k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        v8VarF2.j((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        v8VarF2.b();
                        ((w8) v8VarF2.f11483b).L(dDoubleValue2);
                    }
                    v8VarF.b();
                    ((w8) v8VarF.f11483b).N((w8) v8VarF2.d());
                }
                if (((w8) v8VarF.f11483b).E() > 0) {
                    arrayList.add((w8) v8VarF.d());
                }
            }
        }
        v8Var.b();
        ((w8) v8Var.f11483b).O(arrayList);
    }

    public final y3 O(String str, a9 a9Var, s8 s8Var, String str2) {
        int iIndexOf;
        com.google.android.gms.internal.measurement.f4.a();
        n1 n1Var = (n1) this.f21216b;
        g gVar = n1Var.f44985d;
        if (!gVar.A(str, g0.O0)) {
            return null;
        }
        n1Var.f44992k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(gVar.w(str, g0.t0).split(MessageLogView.COMMA_SEPARATOR)));
        l4 l4Var = this.f44586c;
        h4 h4Var = l4Var.f44929j;
        h1 h1Var = l4Var.f44920a;
        h1 h1Var2 = h4Var.f44586c.f44920a;
        l4.U(h1Var2);
        String strC = h1Var2.C(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((n1) h4Var.f21216b).f44985d;
        builder.scheme(gVar2.w(str, g0.f44796m0));
        if (TextUtils.isEmpty(strC)) {
            builder.authority(gVar2.w(str, g0.f44798n0));
        } else {
            String strW = gVar2.w(str, g0.f44798n0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strC).length() + 1 + String.valueOf(strW).length());
            sb2.append(strC);
            sb2.append(".");
            sb2.append(strW);
            builder.authority(sb2.toString());
        }
        builder.path(gVar2.w(str, g0.f44800o0));
        F(builder, "gmp_app_id", ((b9) a9Var.f11483b).I(), hashSet);
        gVar.v();
        F(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strC2 = ((b9) a9Var.f11483b).C();
        f0 f0Var = g0.R0;
        if (gVar.A(str, f0Var)) {
            l4.U(h1Var);
            if (h1Var.J(str)) {
                strC2 = "";
            }
        }
        F(builder, "app_instance_id", strC2, hashSet);
        F(builder, "rdid", ((b9) a9Var.f11483b).z(), hashSet);
        F(builder, "bundle_id", a9Var.q(), hashSet);
        String strO = s8Var.o();
        String strG = c2.g(c2.f44652f, strO, c2.f44647a);
        if (true != TextUtils.isEmpty(strG)) {
            strO = strG;
        }
        F(builder, "app_event_name", strO, hashSet);
        F(builder, "app_version", String.valueOf(((b9) a9Var.f11483b).O()), hashSet);
        String strN2 = ((b9) a9Var.f11483b).n2();
        if (gVar.A(str, f0Var)) {
            l4.U(h1Var);
            if (h1Var.I(str) && !TextUtils.isEmpty(strN2) && (iIndexOf = strN2.indexOf(".")) != -1) {
                strN2 = strN2.substring(0, iIndexOf);
            }
        }
        F(builder, "os_version", strN2, hashSet);
        F(builder, "timestamp", String.valueOf(s8Var.s()), hashSet);
        if (((b9) a9Var.f11483b).B()) {
            F(builder, "lat", "1", hashSet);
        }
        F(builder, "privacy_sandbox_version", String.valueOf(((b9) a9Var.f11483b).K0()), hashSet);
        F(builder, "trigger_uri_source", "1", hashSet);
        F(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        F(builder, "request_uuid", str2, hashSet);
        List<w8> listI = s8Var.i();
        Bundle bundle = new Bundle();
        for (w8 w8Var : listI) {
            String strU = w8Var.u();
            if (w8Var.B()) {
                bundle.putString(strU, String.valueOf(w8Var.C()));
            } else if (w8Var.z()) {
                bundle.putString(strU, String.valueOf(w8Var.A()));
            } else if (w8Var.v()) {
                bundle.putString(strU, w8Var.w());
            } else if (w8Var.x()) {
                bundle.putString(strU, String.valueOf(w8Var.y()));
            }
        }
        I(builder, gVar.w(str, g0.f44808s0).split("\\|"), bundle, hashSet);
        List<l9> listUnmodifiableList = Collections.unmodifiableList(((b9) a9Var.f11483b).Z1());
        Bundle bundle2 = new Bundle();
        for (l9 l9Var : listUnmodifiableList) {
            String strV = l9Var.v();
            if (l9Var.C()) {
                bundle2.putString(strV, String.valueOf(l9Var.D()));
            } else if (l9Var.A()) {
                bundle2.putString(strV, String.valueOf(l9Var.B()));
            } else if (l9Var.w()) {
                bundle2.putString(strV, l9Var.x());
            } else if (l9Var.y()) {
                bundle2.putString(strV, String.valueOf(l9Var.z()));
            }
        }
        I(builder, gVar.w(str, g0.f44806r0).split("\\|"), bundle2, hashSet);
        F(builder, "dma", true != ((b9) a9Var.f11483b).H0() ? "0" : "1", hashSet);
        if (!((b9) a9Var.f11483b).J0().isEmpty()) {
            F(builder, "dma_cps", ((b9) a9Var.f11483b).J0(), hashSet);
        }
        if (((b9) a9Var.f11483b).P0()) {
            g8 g8VarQ0 = ((b9) a9Var.f11483b).Q0();
            if (!g8VarQ0.H().isEmpty()) {
                F(builder, "dl_gclid", g8VarQ0.H(), hashSet);
            }
            if (!g8VarQ0.J().isEmpty()) {
                F(builder, "dl_gbraid", g8VarQ0.J(), hashSet);
            }
            if (!g8VarQ0.L().isEmpty()) {
                F(builder, "dl_gs", g8VarQ0.L(), hashSet);
            }
            if (g8VarQ0.N() > 0) {
                F(builder, "dl_ss_ts", String.valueOf(g8VarQ0.N()), hashSet);
            }
            if (!g8VarQ0.P().isEmpty()) {
                F(builder, "mr_gclid", g8VarQ0.P(), hashSet);
            }
            if (!g8VarQ0.R().isEmpty()) {
                F(builder, "mr_gbraid", g8VarQ0.R(), hashSet);
            }
            if (!g8VarQ0.T().isEmpty()) {
                F(builder, "mr_gs", g8VarQ0.T(), hashSet);
            }
            if (g8VarQ0.V() > 0) {
                F(builder, "mr_click_ts", String.valueOf(g8VarQ0.V()), hashSet);
            }
        }
        return new y3(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final t8 P(q qVar) {
        s8 s8VarJ = t8.J();
        long j9 = qVar.f45078f;
        s8VarJ.b();
        ((t8) s8VarJ.f11483b).R(j9);
        long j11 = qVar.f45077e;
        s8VarJ.b();
        ((t8) s8VarJ.f11483b).t(j11);
        t tVar = qVar.f45079g;
        Objects.requireNonNull(tVar);
        Bundle bundle = tVar.f45137a;
        for (String str : bundle.keySet()) {
            v8 v8VarF = w8.F();
            v8VarF.i(str);
            Object obj = bundle.get(str);
            com.google.android.gms.common.internal.i0.h(obj);
            N(v8VarF, obj);
            s8VarJ.m(v8VarF);
        }
        String str2 = qVar.f45075c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            v8 v8VarF2 = w8.F();
            v8VarF2.i("_o");
            v8VarF2.j(str2);
            s8VarJ.l((w8) v8VarF2.d());
        }
        return (t8) s8VarJ.d();
    }

    public final String Q(z8 z8Var) {
        j8 j8VarM0;
        StringBuilder sbO = b3.i.o("\nbatch {\n");
        if (z8Var.y()) {
            K(sbO, 0, "upload_subdomain", z8Var.z());
        }
        if (z8Var.w()) {
            K(sbO, 0, "sgtm_join_id", z8Var.x());
        }
        for (b9 b9Var : z8Var.t()) {
            if (b9Var != null) {
                E(1, sbO);
                sbO.append("bundle {\n");
                if (b9Var.T()) {
                    K(sbO, 1, "protocol_version", Integer.valueOf(b9Var.T0()));
                }
                n1 n1Var = (n1) this.f21216b;
                g gVar = n1Var.f44985d;
                r0 r0Var = n1Var.f44991j;
                if (gVar.A(b9Var.t(), g0.M0) && b9Var.z0()) {
                    K(sbO, 1, "session_stitching_token", b9Var.A0());
                }
                K(sbO, 1, "platform", b9Var.m2());
                if (b9Var.v()) {
                    K(sbO, 1, "gmp_version", Long.valueOf(b9Var.w()));
                }
                if (b9Var.x()) {
                    K(sbO, 1, "uploading_gmp_version", Long.valueOf(b9Var.y()));
                }
                if (b9Var.v0()) {
                    K(sbO, 1, "dynamite_version", Long.valueOf(b9Var.w0()));
                }
                if (b9Var.P()) {
                    K(sbO, 1, "config_version", Long.valueOf(b9Var.Q()));
                }
                K(sbO, 1, "gmp_app_id", b9Var.I());
                K(sbO, 1, "app_id", b9Var.t());
                K(sbO, 1, "app_version", b9Var.u());
                if (b9Var.N()) {
                    K(sbO, 1, "app_version_major", Integer.valueOf(b9Var.O()));
                }
                K(sbO, 1, "firebase_instance_id", b9Var.M());
                if (b9Var.D()) {
                    K(sbO, 1, "dev_cert_hash", Long.valueOf(b9Var.E()));
                }
                K(sbO, 1, "app_store", b9Var.s2());
                if (b9Var.c2()) {
                    K(sbO, 1, "upload_timestamp_millis", Long.valueOf(b9Var.d2()));
                }
                if (b9Var.e2()) {
                    K(sbO, 1, "start_timestamp_millis", Long.valueOf(b9Var.f2()));
                }
                if (b9Var.g2()) {
                    K(sbO, 1, "end_timestamp_millis", Long.valueOf(b9Var.h2()));
                }
                if (b9Var.i2()) {
                    K(sbO, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(b9Var.j2()));
                }
                if (b9Var.k2()) {
                    K(sbO, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(b9Var.l2()));
                }
                K(sbO, 1, "app_instance_id", b9Var.C());
                K(sbO, 1, "resettable_device_id", b9Var.z());
                K(sbO, 1, "ds_id", b9Var.S());
                if (b9Var.A()) {
                    K(sbO, 1, "limited_ad_tracking", Boolean.valueOf(b9Var.B()));
                }
                K(sbO, 1, "os_version", b9Var.n2());
                K(sbO, 1, "device_model", b9Var.o2());
                K(sbO, 1, "user_default_language", b9Var.p2());
                if (b9Var.q2()) {
                    K(sbO, 1, "time_zone_offset_minutes", Integer.valueOf(b9Var.r2()));
                }
                if (b9Var.F()) {
                    K(sbO, 1, "bundle_sequential_index", Integer.valueOf(b9Var.G()));
                }
                if (b9Var.N0()) {
                    K(sbO, 1, "delivery_index", Integer.valueOf(b9Var.O0()));
                }
                if (b9Var.J()) {
                    K(sbO, 1, "service_upload", Boolean.valueOf(b9Var.K()));
                }
                K(sbO, 1, "health_monitor", b9Var.H());
                if (b9Var.t0()) {
                    K(sbO, 1, "retry_counter", Integer.valueOf(b9Var.u0()));
                }
                if (b9Var.x0()) {
                    K(sbO, 1, "consent_signals", b9Var.y0());
                }
                if (b9Var.G0()) {
                    K(sbO, 1, "is_dma_region", Boolean.valueOf(b9Var.H0()));
                }
                if (b9Var.I0()) {
                    K(sbO, 1, "core_platform_services", b9Var.J0());
                }
                if (b9Var.E0()) {
                    K(sbO, 1, "consent_diagnostics", b9Var.F0());
                }
                if (b9Var.B0()) {
                    K(sbO, 1, "target_os_version", Long.valueOf(b9Var.C0()));
                }
                com.google.android.gms.internal.measurement.f4.a();
                if (gVar.A(b9Var.t(), g0.O0)) {
                    K(sbO, 1, "ad_services_version", Integer.valueOf(b9Var.K0()));
                    if (b9Var.L0() && (j8VarM0 = b9Var.M0()) != null) {
                        E(2, sbO);
                        sbO.append("attribution_eligibility_status {\n");
                        K(sbO, 2, "eligible", Boolean.valueOf(j8VarM0.t()));
                        K(sbO, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(j8VarM0.u()));
                        K(sbO, 2, "pre_r", Boolean.valueOf(j8VarM0.v()));
                        K(sbO, 2, "r_extensions_too_old", Boolean.valueOf(j8VarM0.w()));
                        K(sbO, 2, "adservices_extension_too_old", Boolean.valueOf(j8VarM0.x()));
                        K(sbO, 2, "ad_storage_not_allowed", Boolean.valueOf(j8VarM0.y()));
                        K(sbO, 2, "measurement_manager_disabled", Boolean.valueOf(j8VarM0.z()));
                        E(2, sbO);
                        sbO.append("}\n");
                    }
                }
                if (b9Var.P0()) {
                    g8 g8VarQ0 = b9Var.Q0();
                    E(2, sbO);
                    sbO.append("ad_campaign_info {\n");
                    if (g8VarQ0.G()) {
                        K(sbO, 2, "deep_link_gclid", g8VarQ0.H());
                    }
                    if (g8VarQ0.I()) {
                        K(sbO, 2, "deep_link_gbraid", g8VarQ0.J());
                    }
                    if (g8VarQ0.K()) {
                        K(sbO, 2, "deep_link_gad_source", g8VarQ0.L());
                    }
                    if (g8VarQ0.W()) {
                        K(sbO, 2, "deep_link_url", g8VarQ0.X());
                    }
                    if (g8VarQ0.M()) {
                        K(sbO, 2, "deep_link_session_millis", Long.valueOf(g8VarQ0.N()));
                    }
                    if (g8VarQ0.O()) {
                        K(sbO, 2, "market_referrer_gclid", g8VarQ0.P());
                    }
                    if (g8VarQ0.Q()) {
                        K(sbO, 2, "market_referrer_gbraid", g8VarQ0.R());
                    }
                    if (g8VarQ0.S()) {
                        K(sbO, 2, "market_referrer_gad_source", g8VarQ0.T());
                    }
                    if (g8VarQ0.U()) {
                        K(sbO, 2, "market_referrer_click_millis", Long.valueOf(g8VarQ0.V()));
                    }
                    E(2, sbO);
                    sbO.append("}\n");
                }
                if (b9Var.U()) {
                    K(sbO, 1, "batching_timestamp_millis", Long.valueOf(b9Var.V()));
                }
                if (b9Var.R0()) {
                    j9 j9VarS0 = b9Var.S0();
                    E(2, sbO);
                    sbO.append("sgtm_diagnostics {\n");
                    int iX = j9VarS0.x();
                    K(sbO, 2, "upload_type", iX != 1 ? iX != 2 ? iX != 3 ? iX != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    K(sbO, 2, "client_upload_eligibility", j9VarS0.t().name());
                    int iY = j9VarS0.y();
                    K(sbO, 2, "service_upload_eligibility", iY != 1 ? iY != 2 ? iY != 3 ? iY != 4 ? iY != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    E(2, sbO);
                    sbO.append("}\n");
                }
                if (b9Var.W()) {
                    p8 p8VarX = b9Var.X();
                    E(2, sbO);
                    sbO.append("consent_info_extra {\n");
                    for (o8 o8Var : p8VarX.t()) {
                        E(3, sbO);
                        sbO.append("limited_data_modes {\n");
                        int iU = o8Var.u();
                        K(sbO, 3, "type", iU != 1 ? iU != 2 ? iU != 3 ? iU != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iV = o8Var.v();
                        K(sbO, 3, "mode", iV != 1 ? iV != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        E(3, sbO);
                        sbO.append("}\n");
                    }
                    E(2, sbO);
                    sbO.append("}\n");
                }
                com.google.android.gms.internal.measurement.t1<l9> t1VarZ1 = b9Var.Z1();
                if (t1VarZ1 != null) {
                    for (l9 l9Var : t1VarZ1) {
                        if (l9Var != null) {
                            E(2, sbO);
                            sbO.append("user_property {\n");
                            K(sbO, 2, "set_timestamp_millis", l9Var.t() ? Long.valueOf(l9Var.u()) : null);
                            K(sbO, 2, "name", r0Var.c(l9Var.v()));
                            K(sbO, 2, "string_value", l9Var.x());
                            K(sbO, 2, "int_value", l9Var.y() ? Long.valueOf(l9Var.z()) : null);
                            K(sbO, 2, "double_value", l9Var.C() ? Double.valueOf(l9Var.D()) : null);
                            E(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.t1<l8> t1VarL = b9Var.L();
                if (t1VarL != null) {
                    for (l8 l8Var : t1VarL) {
                        if (l8Var != null) {
                            E(2, sbO);
                            sbO.append("audience_membership {\n");
                            if (l8Var.t()) {
                                K(sbO, 2, "audience_id", Integer.valueOf(l8Var.u()));
                            }
                            if (l8Var.y()) {
                                K(sbO, 2, "new_audience", Boolean.valueOf(l8Var.z()));
                            }
                            J(sbO, "current_data", l8Var.v());
                            if (l8Var.w()) {
                                J(sbO, "previous_data", l8Var.x());
                            }
                            E(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                List<t8> listT1 = b9Var.T1();
                if (listT1 != null) {
                    for (t8 t8Var : listT1) {
                        if (t8Var != null) {
                            E(2, sbO);
                            sbO.append("event {\n");
                            K(sbO, 2, "name", r0Var.a(t8Var.y()));
                            if (t8Var.z()) {
                                K(sbO, 2, "timestamp_millis", Long.valueOf(t8Var.A()));
                            }
                            if (gVar.A(null, g0.f44776e1) && t8Var.F()) {
                                K(sbO, 2, "corrected_timestamp_millis", Long.valueOf(t8Var.G()));
                            }
                            if (t8Var.B()) {
                                K(sbO, 2, "previous_timestamp_millis", Long.valueOf(t8Var.C()));
                            }
                            if (t8Var.D()) {
                                K(sbO, 2, "count", Integer.valueOf(t8Var.E()));
                            }
                            if (t8Var.w() != 0) {
                                C(sbO, 2, (com.google.android.gms.internal.measurement.t1) t8Var.v());
                            }
                            E(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                E(1, sbO);
                sbO.append("}\n");
            }
        }
        sbO.append("} // End-of-batch\n");
        return sbO.toString();
    }

    public final String R(n7 n7Var) {
        StringBuilder sbO = b3.i.o("\nproperty_filter {\n");
        if (n7Var.t()) {
            K(sbO, 0, "filter_id", Integer.valueOf(n7Var.u()));
        }
        K(sbO, 0, "property_name", ((n1) this.f21216b).f44991j.c(n7Var.v()));
        String strG = G(n7Var.x(), n7Var.y(), n7Var.A());
        if (!strG.isEmpty()) {
            K(sbO, 0, "filter_type", strG);
        }
        D(sbO, 1, n7Var.w());
        sbO.append("}\n");
        return sbO.toString();
    }

    public final Parcelable S(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (SafeParcelReader$ParseException unused) {
                w0 w0Var = ((n1) this.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45260g.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final List W(com.google.android.gms.internal.measurement.s1 s1Var, List list) {
        int i11;
        n1 n1Var = (n1) this.f21216b;
        ArrayList arrayList = new ArrayList(s1Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45263j.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    w0 w0Var2 = n1Var.f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45263j.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i12 = size2;
            i11 = size;
            size = i12;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i11);
    }

    public final boolean X(long j9, long j11) {
        if (j9 == 0 || j11 <= 0) {
            return true;
        }
        ((n1) this.f21216b).f44992k.getClass();
        return Math.abs(System.currentTimeMillis() - j9) > j11;
    }

    public final long Y(byte[] bArr) {
        com.google.android.gms.common.internal.i0.h(bArr);
        n1 n1Var = (n1) this.f21216b;
        r4 r4Var = n1Var.f44990i;
        n1.k(r4Var);
        r4Var.p();
        MessageDigest messageDigestI = r4.I();
        if (messageDigestI != null) {
            return r4.J(messageDigestI.digest(bArr));
        }
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        w0Var.f45260g.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] Z(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(e5, "Failed to gzip content");
            throw e5;
        }
    }

    public final void v(Map map) {
        long epochMilli;
        n1 n1Var = (n1) this.f21216b;
        String strA = A("Date", map);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            epochMilli = ZonedDateTime.parse(strA, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(strA, "Unable to parse header time, time");
            epochMilli = 0;
        }
        if (epochMilli > 0) {
            n1Var.f44992k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            p();
            if (this.f45014f == 0) {
                this.f45013e = jElapsedRealtime;
                this.f45014f = epochMilli;
            }
        }
    }

    public final long w(long j9) {
        p();
        long j11 = this.f45014f;
        if (j11 == 0 || j9 == 0) {
            return 0L;
        }
        return (j11 - this.f45013e) + j9;
    }

    @Override // y00.f4
    public final void s() {
    }
}
