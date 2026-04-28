package h50;

import com.adyen.checkout.components.core.Address;
import com.google.i18n.phonenumbers.MissingMetadataException;
import com.google.i18n.phonenumbers.NumberParseException;
import j4.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import r8.k;
import w.a0;
import zendesk.messaging.android.internal.KnownUriSchemes;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f21419h = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f21420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map f21421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f21422k;
    public static final Pattern l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f21423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f21424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f21425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f21426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f21427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f21428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f21429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f21430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static d f21431u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8.d f21432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f21433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a50.c f21434c = new a50.c(26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f21435d = new HashSet(35);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final se.b f21436e = new se.b(27);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f21437f = new HashSet(320);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f21438g = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR), '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        f21420i = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        f21421j = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map map7 = f21420i;
        sb2.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb2.toString();
        f21422k = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        l = Pattern.compile("(\\p{Nd})");
        f21423m = Pattern.compile("[+＋\\p{Nd}]");
        f21424n = Pattern.compile("[\\\\/] *x");
        f21425o = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f21426p = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strP = a0.p("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strA = a(true);
        a(false);
        f21427q = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strConcat = string.concat("\\p{Nd}");
        f21428r = Pattern.compile("^(" + org.bouncycastle.jcajce.provider.asymmetric.a.d("[", strConcat, "]+((\\-)*[", strConcat, "])*") + "\\.)*" + org.bouncycastle.jcajce.provider.asymmetric.a.d("[", string, "]+((\\-)*[", strConcat, "])*") + "\\.?$");
        StringBuilder sb3 = new StringBuilder("(?:");
        sb3.append(strA);
        sb3.append(")$");
        f21429s = Pattern.compile(sb3.toString(), 66);
        f21430t = Pattern.compile(strP + "(?:" + strA + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        f21431u = null;
    }

    public d(k8.d dVar, HashMap map) {
        this.f21432a = dVar;
        this.f21433b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f21438g.add((Integer) entry.getKey());
            } else {
                this.f21437f.addAll(list);
            }
        }
        if (this.f21437f.remove("001")) {
            f21419h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f21435d.addAll((Collection) map.get(1));
    }

    public static String a(boolean z11) {
        String strConcat = ";ext=".concat(b(20));
        String str = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b(20) + "#?";
        String str2 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b(9) + "#?";
        String str3 = "[- ]+" + b(6) + "#";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strConcat);
        sb2.append("|");
        sb2.append(str);
        sb2.append("|");
        sb2.append(str2);
        String strP = k.p(sb2, "|", str3);
        if (!z11) {
            return strP;
        }
        return strP + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b(9) + "#?");
    }

    public static String b(int i11) {
        return k.h(i11, "(\\p{Nd}{1,", "})");
    }

    public static String e(j jVar) {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        if (jVar.f21488f && (i11 = jVar.f21490h) > 0) {
            char[] cArr = new char[i11];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(jVar.f21484b);
        return sb2.toString();
    }

    public static h f(f fVar, b bVar) {
        switch (bVar.ordinal()) {
            case 0:
            case 2:
                return fVar.f21450d;
            case 1:
                return fVar.f21452f;
            case 3:
                return fVar.f21456h;
            case 4:
                return fVar.f21460j;
            case 5:
                return fVar.l;
            case 6:
                return fVar.f21465p;
            case 7:
                return fVar.f21463n;
            case 8:
                return fVar.f21467r;
            case 9:
                return fVar.f21469t;
            case 10:
                return fVar.f21473x;
            default:
                return fVar.f21448b;
        }
    }

    public static void l(StringBuilder sb2) {
        if (!f21426p.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), m(sb2));
            return;
        }
        int length = sb2.length();
        StringBuilder sb3 = new StringBuilder(sb2.length());
        for (int i11 = 0; i11 < sb2.length(); i11++) {
            Character ch = (Character) f21421j.get(Character.valueOf(Character.toUpperCase(sb2.charAt(i11))));
            if (ch != null) {
                sb3.append(ch);
            }
        }
        sb2.replace(0, length, sb3.toString());
    }

    public static String m(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            int iDigit = Character.digit(charSequence.charAt(i11), 10);
            if (iDigit != -1) {
                sb2.append(iDigit);
            }
        }
        return sb2.toString();
    }

    public static c o(StringBuilder sb2, f fVar, b bVar) {
        h hVarF = f(fVar, bVar);
        ArrayList arrayList = hVarF.f21479c.isEmpty() ? fVar.f21448b.f21479c : hVarF.f21479c;
        ArrayList arrayList2 = hVarF.f21480d;
        if (bVar == b.FIXED_LINE_OR_MOBILE) {
            h hVarF2 = f(fVar, b.FIXED_LINE);
            if (hVarF2.f21479c.size() == 1 && ((Integer) hVarF2.f21479c.get(0)).intValue() == -1) {
                return o(sb2, fVar, b.MOBILE);
            }
            h hVarF3 = f(fVar, b.MOBILE);
            ArrayList arrayList3 = hVarF3.f21479c;
            ArrayList arrayList4 = hVarF3.f21479c;
            boolean z11 = (arrayList3.size() == 1 && ((Integer) arrayList4.get(0)).intValue() == -1) ? false : true;
            ArrayList arrayList5 = hVarF3.f21480d;
            if (z11) {
                ArrayList arrayList6 = new ArrayList(arrayList);
                if (arrayList4.size() == 0) {
                    arrayList4 = fVar.f21448b.f21479c;
                }
                arrayList6.addAll(arrayList4);
                Collections.sort(arrayList6);
                if (arrayList2.isEmpty()) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList7 = new ArrayList(arrayList2);
                    arrayList7.addAll(arrayList5);
                    Collections.sort(arrayList7);
                    arrayList2 = arrayList7;
                }
                arrayList = arrayList6;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return c.INVALID_LENGTH;
        }
        int length = sb2.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return c.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        return iIntValue == length ? c.IS_POSSIBLE : iIntValue > length ? c.TOO_SHORT : ((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length ? c.TOO_LONG : arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) ? c.IS_POSSIBLE : c.INVALID_LENGTH;
    }

    public final f c(String str) {
        if (str == null || !this.f21437f.contains(str)) {
            return null;
        }
        k8.d dVar = this.f21432a;
        dVar.getClass();
        if (str.equals("001")) {
            i4.a.f(str.concat(" region code is a non-geo entity"));
            return null;
        }
        f fVar = (f) ((ConcurrentHashMap) ((k8.d) ((com.google.firebase.messaging.a0) dVar.f26135c).L(((a30.j) dVar.f26134b).a(str)).f26135c).f26134b).get(str);
        String strConcat = "Missing metadata for region code ".concat(str);
        if (fVar != null) {
            return fVar;
        }
        throw new MissingMetadataException(strConcat);
    }

    public final f d(int i11, String str) {
        if (!"001".equals(str)) {
            return c(str);
        }
        if (!this.f21438g.contains(Integer.valueOf(i11))) {
            return null;
        }
        k8.d dVar = this.f21432a;
        dVar.getClass();
        List list = (List) ox.h.z().get(Integer.valueOf(i11));
        if (list != null && !list.contains("001")) {
            throw new IllegalArgumentException(i11 + " calling code belongs to a geo entity");
        }
        f fVar = (f) ((ConcurrentHashMap) ((k8.d) ((com.google.firebase.messaging.a0) dVar.f26135c).L(((a30.j) dVar.f26134b).a(Integer.valueOf(i11))).f26134b).f26134b).get(Integer.valueOf(i11));
        String strF = s.f(i11, "Missing metadata for country code ");
        if (fVar != null) {
            return fVar;
        }
        throw new MissingMetadataException(strF);
    }

    public final b g(String str, f fVar) {
        if (!h(str, fVar.f21448b)) {
            return b.UNKNOWN;
        }
        if (h(str, fVar.f21460j)) {
            return b.PREMIUM_RATE;
        }
        if (h(str, fVar.f21456h)) {
            return b.TOLL_FREE;
        }
        if (h(str, fVar.l)) {
            return b.SHARED_COST;
        }
        if (h(str, fVar.f21465p)) {
            return b.VOIP;
        }
        if (h(str, fVar.f21463n)) {
            return b.PERSONAL_NUMBER;
        }
        if (h(str, fVar.f21467r)) {
            return b.PAGER;
        }
        if (h(str, fVar.f21469t)) {
            return b.UAN;
        }
        if (h(str, fVar.f21473x)) {
            return b.VOICEMAIL;
        }
        boolean zH = h(str, fVar.f21450d);
        boolean z11 = fVar.Y;
        return zH ? z11 ? b.FIXED_LINE_OR_MOBILE : h(str, fVar.f21452f) ? b.FIXED_LINE_OR_MOBILE : b.FIXED_LINE : (z11 || !h(str, fVar.f21452f)) ? b.UNKNOWN : b.MOBILE;
    }

    public final boolean h(String str, h hVar) {
        int length = str.length();
        ArrayList arrayList = hVar.f21479c;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.f21434c.z(str, hVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(h50.j r9) {
        /*
            r8 = this;
            int r0 = r9.f21483a
            java.util.HashMap r1 = r8.f21433b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L2e
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Missing/invalid country_code ("
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.util.logging.Logger r5 = h50.d.f21419h
            r5.log(r1, r0)
            goto L74
        L2e:
            int r0 = r1.size()
            if (r0 != r3) goto L3c
            java.lang.Object r0 = r1.get(r2)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L74
        L3c:
            java.lang.String r0 = e(r9)
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            h50.f r6 = r8.c(r5)
            boolean r7 = r6.f21453f1
            if (r7 == 0) goto L6b
            se.b r7 = r8.f21436e
            java.lang.String r6 = r6.f21455g1
            java.util.regex.Pattern r6 = r7.m(r6)
            java.util.regex.Matcher r6 = r6.matcher(r0)
            boolean r6 = r6.lookingAt()
            if (r6 == 0) goto L44
            goto L73
        L6b:
            h50.b r6 = r8.g(r0, r6)
            h50.b r7 = h50.b.UNKNOWN
            if (r6 == r7) goto L44
        L73:
            r4 = r5
        L74:
            int r0 = r9.f21483a
            h50.f r1 = r8.d(r0, r4)
            if (r1 == 0) goto La7
            java.lang.String r5 = "001"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L9a
            h50.f r5 = r8.c(r4)
            if (r5 == 0) goto L8f
            int r4 = r5.J
            if (r0 == r4) goto L9a
            goto La7
        L8f:
            java.lang.String r9 = "Invalid region code: "
            java.lang.String r9 = e0.f.k(r9, r4)
            i4.a.f(r9)
            r9 = 0
            return r9
        L9a:
            java.lang.String r9 = e(r9)
            h50.b r9 = r8.g(r9, r1)
            h50.b r0 = h50.b.UNKNOWN
            if (r9 == r0) goto La7
            return r3
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h50.d.i(h50.j):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(java.lang.CharSequence r7, h50.f r8, java.lang.StringBuilder r9, h50.j r10) throws com.google.i18n.phonenumbers.NumberParseException {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h50.d.j(java.lang.CharSequence, h50.f, java.lang.StringBuilder, h50.j):int");
    }

    public final void k(StringBuilder sb2, f fVar, StringBuilder sb3) {
        int length = sb2.length();
        String str = fVar.V;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.f21436e.m(str).matcher(sb2);
        if (matcher.lookingAt()) {
            h hVar = fVar.f21448b;
            a50.c cVar = this.f21434c;
            boolean z11 = cVar.z(sb2, hVar);
            int iGroupCount = matcher.groupCount();
            String str2 = fVar.X;
            if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!z11 || cVar.z(sb2.substring(matcher.end()), hVar)) {
                    if (sb3 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder(sb2);
            sb4.replace(0, length, matcher.replaceFirst(str2));
            if (!z11 || cVar.z(sb4.toString(), hVar)) {
                if (sb3 != null && iGroupCount > 1) {
                    sb3.append(matcher.group(1));
                }
                sb2.replace(0, sb2.length(), sb4.toString());
            }
        }
    }

    public final j n(String str) throws NumberParseException {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iJ;
        j jVar = new j();
        jVar.f21483a = 0;
        jVar.f21484b = 0L;
        String strGroup = "";
        jVar.f21486d = "";
        jVar.f21488f = false;
        jVar.f21490h = 1;
        jVar.f21491i = "";
        jVar.f21493k = "";
        jVar.f21492j = i.UNSPECIFIED;
        if (str.length() > 250) {
            throw new NumberParseException(a.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
        String string = str.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i11 = iIndexOf + 15;
            if (i11 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i11);
                strSubstring = iIndexOf2 != -1 ? string.substring(i11, iIndexOf2) : string.substring(i11);
            }
        }
        if (strSubstring != null && (strSubstring.length() == 0 || !(f21427q.matcher(strSubstring).matches() || f21428r.matcher(strSubstring).matches()))) {
            throw new NumberParseException(a.NOT_A_NUMBER, "The phone-context value is invalid.");
        }
        if (strSubstring != null) {
            if (strSubstring.charAt(0) == '+') {
                sb2.append(strSubstring);
            }
            int iIndexOf3 = string.indexOf(KnownUriSchemes.PHONE_NUMBER);
            sb2.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = f21423m.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = f21425o.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = f21424n.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb2.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb2.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb2.delete(iIndexOf4, sb2.length());
        }
        int length = sb2.length();
        Pattern pattern = f21430t;
        if (!(length < 2 ? false : pattern.matcher(sb2).matches())) {
            throw new NumberParseException(a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        boolean zContains = this.f21437f.contains(Address.ADDRESS_COUNTRY_NULL_PLACEHOLDER);
        Pattern pattern2 = f21422k;
        if (!zContains && (sb2.length() == 0 || !pattern2.matcher(sb2).lookingAt())) {
            throw new NumberParseException(a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        Matcher matcher4 = f21429s.matcher(sb2);
        if (matcher4.find()) {
            String strSubstring2 = sb2.substring(0, matcher4.start());
            if (strSubstring2.length() < 2 ? false : pattern.matcher(strSubstring2).matches()) {
                int iGroupCount = matcher4.groupCount();
                int i12 = 1;
                while (true) {
                    if (i12 > iGroupCount) {
                        break;
                    }
                    if (matcher4.group(i12) != null) {
                        strGroup = matcher4.group(i12);
                        sb2.delete(matcher4.start(), sb2.length());
                        break;
                    }
                    i12++;
                }
            }
        }
        if (strGroup.length() > 0) {
            jVar.f21485c = true;
            jVar.f21486d = strGroup;
        }
        f fVarC = c(Address.ADDRESS_COUNTRY_NULL_PLACEHOLDER);
        StringBuilder sb3 = new StringBuilder();
        try {
            iJ = j(sb2, fVarC, sb3, jVar);
        } catch (NumberParseException e5) {
            Matcher matcher5 = pattern2.matcher(sb2);
            a aVar = a.INVALID_COUNTRY_CODE;
            a aVar2 = e5.f12897a;
            if (aVar2 != aVar || !matcher5.lookingAt()) {
                throw new NumberParseException(aVar2, e5.getMessage());
            }
            iJ = j(sb2.substring(matcher5.end()), fVarC, sb3, jVar);
            if (iJ == 0) {
                throw new NumberParseException(a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iJ != 0) {
            List list = (List) this.f21433b.get(Integer.valueOf(iJ));
            String str2 = list == null ? Address.ADDRESS_COUNTRY_NULL_PLACEHOLDER : (String) list.get(0);
            if (!str2.equals(Address.ADDRESS_COUNTRY_NULL_PLACEHOLDER)) {
                fVarC = d(iJ, str2);
            }
        } else {
            l(sb2);
            sb3.append((CharSequence) sb2);
            jVar.f21483a = fVarC.J;
        }
        if (sb3.length() < 2) {
            throw new NumberParseException(a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (fVarC != null) {
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder(sb3);
            k(sb5, fVarC, sb4);
            c cVarO = o(sb5, fVarC, b.UNKNOWN);
            if (cVarO != c.TOO_SHORT && cVarO != c.IS_POSSIBLE_LOCAL_ONLY && cVarO != c.INVALID_LENGTH) {
                sb3 = sb5;
            }
        }
        int length2 = sb3.length();
        if (length2 < 2) {
            throw new NumberParseException(a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(a.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        if (sb3.length() > 1 && sb3.charAt(0) == '0') {
            jVar.f21487e = true;
            jVar.f21488f = true;
            int i13 = 1;
            while (i13 < sb3.length() - 1 && sb3.charAt(i13) == '0') {
                i13++;
            }
            if (i13 != 1) {
                jVar.f21489g = true;
                jVar.f21490h = i13;
            }
        }
        jVar.f21484b = Long.parseLong(sb3.toString());
        return jVar;
    }
}
