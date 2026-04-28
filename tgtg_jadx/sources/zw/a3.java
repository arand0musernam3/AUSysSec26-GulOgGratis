package zw;

import a3.i3;
import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t5.a f48154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1 f48155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y2 f48159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StringBuilder f48160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f48161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StringBuilder f48162i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x046b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void C(zw.h1 r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.a3.C(zw.h1, java.lang.String, java.lang.String):void");
    }

    public static int b(float f11) {
        if (f11 < 0.0f) {
            return 0;
        }
        if (f11 > 255.0f) {
            return 255;
        }
        return Math.round(f11);
    }

    public static int d(float f11, float f12, float f13) {
        float f14 = f11 % 360.0f;
        if (f11 < 0.0f) {
            f14 += 360.0f;
        }
        float f15 = f14 / 60.0f;
        float f16 = f12 / 100.0f;
        float f17 = f13 / 100.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        } else if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        float f18 = f17 >= 0.0f ? f17 > 1.0f ? 1.0f : f17 : 0.0f;
        float f19 = f18 <= 0.5f ? (f16 + 1.0f) * f18 : (f18 + f16) - (f16 * f18);
        float f20 = (f18 * 2.0f) - f19;
        return b(e(f20, f19, f15 - 2.0f) * 256.0f) | (b(e(f20, f19, f15 + 2.0f) * 256.0f) << 16) | (b(e(f20, f19, f15) * 256.0f) << 8);
    }

    public static float e(float f11, float f12, float f13) {
        if (f13 < 0.0f) {
            f13 += 6.0f;
        }
        if (f13 >= 6.0f) {
            f13 -= 6.0f;
        }
        return f13 < 1.0f ? j4.s.a(f12, f11, f13, f11) : f13 < 3.0f ? f12 : f13 < 4.0f ? j4.s.a(4.0f, f13, f12 - f11, f11) : f11;
    }

    public static void f(j1 j1Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (r2.f48341b[w2.l1.d(attributes, i11)]) {
                case 21:
                    mv.b0 b0Var = new mv.b0(strTrim);
                    HashSet hashSet = new HashSet();
                    while (!b0Var.n()) {
                        String strD = b0Var.D();
                        if (strD.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(strD.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        b0Var.K();
                    }
                    j1Var.d(hashSet);
                    break;
                case 22:
                    j1Var.g(strTrim);
                    break;
                case 23:
                    mv.b0 b0Var2 = new mv.b0(strTrim);
                    HashSet hashSet2 = new HashSet();
                    while (!b0Var2.n()) {
                        String strD2 = b0Var2.D();
                        int iIndexOf = strD2.indexOf(45);
                        if (iIndexOf != -1) {
                            strD2 = strD2.substring(0, iIndexOf);
                        }
                        hashSet2.add(new Locale(strD2, "", "").getLanguage());
                        b0Var2.K();
                    }
                    j1Var.i(hashSet2);
                    break;
                case 24:
                    mv.b0 b0Var3 = new mv.b0(strTrim);
                    HashSet hashSet3 = new HashSet();
                    while (!b0Var3.n()) {
                        hashSet3.add(b0Var3.D());
                        b0Var3.K();
                    }
                    j1Var.h(hashSet3);
                    break;
                case 25:
                    ArrayList arrayListQ = q(strTrim);
                    j1Var.f(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                    break;
            }
        }
    }

    public static void g(n1 n1Var, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String qName = attributes.getQName(i11);
            if (qName.equals("id") || qName.equals("xml:id")) {
                n1Var.f48294c = attributes.getValue(i11).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i11).trim();
                if ("default".equals(strTrim)) {
                    n1Var.f48295d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SVGParseException(e0.f.k("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    n1Var.f48295d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(zw.e0 r4, org.xml.sax.Attributes r5) throws com.caverock.androidsvg.SVGParseException {
        /*
            r0 = 0
        L1:
            int r1 = r5.getLength()
            if (r0 >= r1) goto L77
            java.lang.String r1 = r5.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = zw.r2.f48341b
            int r3 = w2.l1.d(r5, r0)
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L5a
            switch(r2) {
                case 32: goto L3a;
                case 33: goto L33;
                case 34: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L74
        L1e:
            zw.f0 r2 = zw.f0.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L25
            r4.f48184k = r2     // Catch: java.lang.IllegalArgumentException -> L25
            goto L74
        L25:
            com.caverock.androidsvg.SVGParseException r4 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r5 = "Invalid spreadMethod attribute. \""
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r5 = w.a0.p(r5, r1, r0)
            r4.<init>(r5)
            throw r4
        L33:
            android.graphics.Matrix r1 = z(r1)
            r4.f48183j = r1
            goto L74
        L3a:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L47
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.f48182i = r1
            goto L74
        L47:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L54
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.f48182i = r1
            goto L74
        L54:
            java.lang.String r4 = "Invalid value for attribute gradientUnits"
            wy.o.i(r4)
            return
        L5a:
            java.lang.String r2 = ""
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L72
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L74
        L72:
            r4.l = r1
        L74:
            int r0 = r0 + 1
            goto L1
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.a3.h(zw.e0, org.xml.sax.Attributes):void");
    }

    public static void i(t0 t0Var, Attributes attributes, String str) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (x2.a(attributes.getLocalName(i11)) == x2.points) {
                mv.b0 b0Var = new mv.b0(attributes.getValue(i11));
                ArrayList arrayList = new ArrayList();
                b0Var.K();
                while (!b0Var.n()) {
                    float fA = b0Var.A();
                    if (Float.isNaN(fA)) {
                        throw new SVGParseException(w.a0.p("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    b0Var.J();
                    float fA2 = b0Var.A();
                    if (Float.isNaN(fA2)) {
                        throw new SVGParseException(w.a0.p("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    b0Var.J();
                    arrayList.add(Float.valueOf(fA));
                    arrayList.add(Float.valueOf(fA2));
                }
                t0Var.f48359o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    t0Var.f48359o[i12] = ((Float) it.next()).floatValue();
                    i12++;
                }
            }
        }
    }

    public static void j(n1 n1Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (strTrim.length() != 0) {
                int i12 = r2.f48341b[w2.l1.d(attributes, i11)];
                if (i12 == 45) {
                    mv.b0 b0Var = new mv.b0(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strE = b0Var.E(false, ':');
                        b0Var.K();
                        if (!b0Var.k(':')) {
                            break;
                        }
                        b0Var.K();
                        String strE2 = b0Var.E(true, ';');
                        if (strE2 == null) {
                            break;
                        }
                        b0Var.K();
                        if (b0Var.n() || b0Var.k(';')) {
                            if (n1Var.f48297f == null) {
                                n1Var.f48297f = new h1();
                            }
                            C(n1Var.f48297f, strE, strE2);
                            b0Var.K();
                        }
                    }
                } else if (i12 != 46) {
                    if (n1Var.f48296e == null) {
                        n1Var.f48296e = new h1();
                    }
                    C(n1Var.f48296e, attributes.getLocalName(i11), attributes.getValue(i11).trim());
                } else {
                    e eVar = new e(strTrim);
                    ArrayList arrayList = null;
                    while (!eVar.n()) {
                        String strD = eVar.D();
                        if (strD != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strD);
                            eVar.K();
                        }
                    }
                    n1Var.f48298g = arrayList;
                }
            }
        }
    }

    public static void k(c2 c2Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = r2.f48341b[w2.l1.d(attributes, i11)];
            if (i12 == 1) {
                c2Var.f48172n = t(strTrim);
            } else if (i12 == 2) {
                c2Var.f48173o = t(strTrim);
            } else if (i12 == 19) {
                c2Var.f48174p = t(strTrim);
            } else if (i12 == 20) {
                c2Var.f48175q = t(strTrim);
            }
        }
    }

    public static void l(i0 i0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (x2.a(attributes.getLocalName(i11)) == x2.transform) {
                i0Var.j(z(attributes.getValue(i11)));
            }
        }
    }

    public static void m(t1 t1Var, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = r2.f48341b[w2.l1.d(attributes, i11)];
            if (i12 == 7) {
                x(t1Var, strTrim);
            } else if (i12 != 87) {
                continue;
            } else {
                mv.b0 b0Var = new mv.b0(strTrim);
                b0Var.K();
                float fA = b0Var.A();
                b0Var.J();
                float fA2 = b0Var.A();
                b0Var.J();
                float fA3 = b0Var.A();
                b0Var.J();
                float fA4 = b0Var.A();
                if (Float.isNaN(fA) || Float.isNaN(fA2) || Float.isNaN(fA3) || Float.isNaN(fA4)) {
                    wy.o.i("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (fA3 < 0.0f) {
                    wy.o.i("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (fA4 < 0.0f) {
                        wy.o.i("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    t1Var.f48360o = new h4.a(fA, fA2, fA3, fA4);
                }
            }
        }
    }

    public static a0 n(String str) throws SVGParseException {
        long j9;
        int i11;
        if (str.charAt(0) == '#') {
            int length = str.length();
            ic.b bVar = null;
            if (1 < length) {
                long j11 = 0;
                int i12 = 1;
                while (i12 < length) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j9 = j11 * 16;
                            i11 = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j9 = j11 * 16;
                            i11 = cCharAt - 'a';
                        }
                        j11 = j9 + ((long) i11) + 10;
                    } else {
                        j11 = (j11 * 16) + ((long) (cCharAt - '0'));
                    }
                    if (j11 > 4294967295L) {
                        break;
                    }
                    i12++;
                }
                if (i12 != 1) {
                    bVar = new ic.b(j11, i12);
                }
            }
            if (bVar == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j12 = bVar.f23776a;
            int i13 = bVar.f23777b;
            if (i13 == 4) {
                int i14 = (int) j12;
                int i15 = i14 & 3840;
                int i16 = i14 & 240;
                int i17 = i14 & 15;
                return new a0(i17 | (i15 << 8) | (-16777216) | (i15 << 12) | (i16 << 8) | (i16 << 4) | (i17 << 4));
            }
            if (i13 != 5) {
                if (i13 == 7) {
                    return new a0(((int) j12) | RoundCornerImageView.DEFAULT_STROKE_COLOR);
                }
                if (i13 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i18 = (int) j12;
                return new a0((i18 >>> 8) | (i18 << 24));
            }
            int i19 = (int) j12;
            int i21 = 61440 & i19;
            int i22 = i19 & 3840;
            int i23 = i19 & 240;
            int i24 = i19 & 15;
            return new a0((i24 << 24) | (i24 << 28) | (i21 << 8) | (i21 << 4) | (i22 << 4) | i22 | i23 | (i23 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            mv.b0 b0Var = new mv.b0(str.substring(zStartsWith ? 5 : 4));
            b0Var.K();
            float fA = b0Var.A();
            if (!Float.isNaN(fA) && b0Var.k('%')) {
                fA = (fA * 256.0f) / 100.0f;
            }
            float fJ = b0Var.j(fA);
            if (!Float.isNaN(fJ) && b0Var.k('%')) {
                fJ = (fJ * 256.0f) / 100.0f;
            }
            float fJ2 = b0Var.j(fJ);
            if (!Float.isNaN(fJ2) && b0Var.k('%')) {
                fJ2 = (fJ2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                b0Var.K();
                if (Float.isNaN(fJ2) || !b0Var.k(')')) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new a0((b(fA) << 16) | RoundCornerImageView.DEFAULT_STROKE_COLOR | (b(fJ) << 8) | b(fJ2));
            }
            float fJ3 = b0Var.j(fJ2);
            b0Var.K();
            if (Float.isNaN(fJ3) || !b0Var.k(')')) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new a0((b(fJ3 * 256.0f) << 24) | (b(fA) << 16) | (b(fJ) << 8) | b(fJ2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) t2.f48361a.get(lowerCase);
            if (num != null) {
                return new a0(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        mv.b0 b0Var2 = new mv.b0(str.substring(zStartsWith2 ? 5 : 4));
        b0Var2.K();
        float fA2 = b0Var2.A();
        float fJ4 = b0Var2.j(fA2);
        if (!Float.isNaN(fJ4)) {
            b0Var2.k('%');
        }
        float fJ5 = b0Var2.j(fJ4);
        if (!Float.isNaN(fJ5)) {
            b0Var2.k('%');
        }
        if (!zStartsWith2) {
            b0Var2.K();
            if (Float.isNaN(fJ5) || !b0Var2.k(')')) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new a0(d(fA2, fJ4, fJ5) | RoundCornerImageView.DEFAULT_STROKE_COLOR);
        }
        float fJ6 = b0Var2.j(fJ5);
        b0Var2.K();
        if (Float.isNaN(fJ6) || !b0Var2.k(')')) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new a0((b(fJ6 * 256.0f) << 24) | d(fA2, fJ4, fJ5));
    }

    public static float o(int i11, String str) throws SVGParseException {
        float fA = new s().a(0, i11, str);
        if (Float.isNaN(fA)) {
            throw new SVGParseException(e0.f.k("Invalid float value: ", str));
        }
        return fA;
    }

    public static float p(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        wy.o.i("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList q(String str) {
        mv.b0 b0Var = new mv.b0(str);
        ArrayList arrayList = null;
        do {
            String strC = b0Var.C();
            if (strC == null) {
                strC = b0Var.E(true, ',');
            }
            if (strC == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strC);
            b0Var.J();
        } while (!b0Var.n());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static k0 s(String str) throws SVGParseException {
        if (str.length() == 0) {
            wy.o.i("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        e2 e2VarValueOf = e2.f48191px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            e2VarValueOf = e2.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                e2VarValueOf = e2.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new k0(o(length, str), e2VarValueOf);
        } catch (NumberFormatException e5) {
            throw new SVGParseException("Invalid length value: ".concat(str), e5);
        }
    }

    public static ArrayList t(String str) throws SVGParseException {
        if (str.length() == 0) {
            wy.o.i("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        mv.b0 b0Var = new mv.b0(str);
        b0Var.K();
        while (!b0Var.n()) {
            float fA = b0Var.A();
            if (Float.isNaN(fA)) {
                StringBuilder sb2 = new StringBuilder("Invalid length list value: ");
                String str2 = (String) b0Var.f30157e;
                int i11 = b0Var.f30154b;
                while (!b0Var.n() && !mv.b0.w(str2.charAt(b0Var.f30154b))) {
                    b0Var.f30154b++;
                }
                String strSubstring = str2.substring(i11, b0Var.f30154b);
                b0Var.f30154b = i11;
                sb2.append(strSubstring);
                throw new SVGParseException(sb2.toString());
            }
            e2 e2VarF = b0Var.F();
            if (e2VarF == null) {
                e2VarF = e2.f48191px;
            }
            arrayList.add(new k0(fA, e2VarF));
            b0Var.J();
        }
        return arrayList;
    }

    public static k0 u(mv.b0 b0Var) {
        return b0Var.l("auto") ? new k0(0.0f) : b0Var.B();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f11 = 0.0f;
            if (fP < 0.0f) {
                fP = f11;
            } else {
                f11 = 1.0f;
                if (fP > 1.0f) {
                    fP = f11;
                }
            }
            return Float.valueOf(fP);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static q1 w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        q1 q1VarN = a0.f48152c;
        b0 b0Var = b0.f48165a;
        q1 q1Var = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return q1VarN;
            }
            if (str.equals("currentColor")) {
                return b0Var;
            }
            try {
                return n(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new p0(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    q1VarN = b0Var;
                } else {
                    try {
                        q1VarN = n(strTrim2);
                    } catch (SVGParseException unused2) {
                        q1VarN = null;
                    }
                }
            }
            q1Var = q1VarN;
        }
        return new p0(strTrim, q1Var);
    }

    public static void x(r1 r1Var, String str) throws SVGParseException {
        u uVar;
        mv.b0 b0Var = new mv.b0(str);
        b0Var.K();
        String strD = b0Var.D();
        if ("defer".equals(strD)) {
            b0Var.K();
            strD = b0Var.D();
        }
        t tVar = (t) s2.f48358a.get(strD);
        b0Var.K();
        if (b0Var.n()) {
            uVar = null;
        } else {
            String strD2 = b0Var.D();
            strD2.getClass();
            if (strD2.equals("meet")) {
                uVar = u.meet;
            } else {
                if (!strD2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                uVar = u.slice;
            }
        }
        r1Var.f48339n = new v(tVar, uVar);
    }

    public static HashMap y(mv.b0 b0Var) {
        HashMap map = new HashMap();
        b0Var.K();
        String strE = b0Var.E(false, '=');
        while (strE != null) {
            b0Var.k('=');
            map.put(strE, b0Var.C());
            b0Var.K();
            strE = b0Var.E(false, '=');
        }
        return map;
    }

    public static Matrix z(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        mv.b0 b0Var = new mv.b0(str);
        b0Var.K();
        while (!b0Var.n()) {
            String str2 = (String) b0Var.f30157e;
            String strSubstring = null;
            if (!b0Var.n()) {
                int i11 = b0Var.f30154b;
                int iCharAt = str2.charAt(i11);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = b0Var.g();
                    }
                }
                int i12 = b0Var.f30154b;
                while (mv.b0.w(iCharAt)) {
                    iCharAt = b0Var.g();
                }
                if (iCharAt == 40) {
                    b0Var.f30154b++;
                    strSubstring = str2.substring(i11, i12);
                } else {
                    b0Var.f30154b = i11;
                }
            }
            if (strSubstring == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    b0Var.K();
                    float fA = b0Var.A();
                    b0Var.J();
                    float fA2 = b0Var.A();
                    b0Var.J();
                    float fA3 = b0Var.A();
                    b0Var.J();
                    float fA4 = b0Var.A();
                    b0Var.J();
                    float fA5 = b0Var.A();
                    b0Var.J();
                    float fA6 = b0Var.A();
                    b0Var.K();
                    if (Float.isNaN(fA6) || !b0Var.k(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fA, fA3, fA5, fA2, fA4, fA6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    b0Var.K();
                    float fA7 = b0Var.A();
                    float fG = b0Var.G();
                    float fG2 = b0Var.G();
                    b0Var.K();
                    if (Float.isNaN(fA7) || !b0Var.k(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fG)) {
                        matrix.preRotate(fA7);
                    } else {
                        if (Float.isNaN(fG2)) {
                            throw new SVGParseException("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fA7, fG, fG2);
                    }
                    break;
                    break;
                case "scale":
                    b0Var.K();
                    float fA8 = b0Var.A();
                    float fG3 = b0Var.G();
                    b0Var.K();
                    if (Float.isNaN(fA8) || !b0Var.k(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fG3)) {
                        matrix.preScale(fA8, fG3);
                    } else {
                        matrix.preScale(fA8, fA8);
                    }
                    break;
                    break;
                case "skewX":
                    b0Var.K();
                    float fA9 = b0Var.A();
                    b0Var.K();
                    if (Float.isNaN(fA9) || !b0Var.k(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fA9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    b0Var.K();
                    float fA10 = b0Var.A();
                    b0Var.K();
                    if (Float.isNaN(fA10) || !b0Var.k(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fA10)));
                    break;
                    break;
                case "translate":
                    b0Var.K();
                    float fA11 = b0Var.A();
                    float fG4 = b0Var.G();
                    b0Var.K();
                    if (Float.isNaN(fA11) || !b0Var.k(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fG4)) {
                        matrix.preTranslate(fA11, fG4);
                    } else {
                        matrix.preTranslate(fA11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException(w.a0.p("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (b0Var.n()) {
                return matrix;
            }
            b0Var.J();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws SVGParseException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            w2 w2Var = new w2(this);
            xMLReader.setContentHandler(w2Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", w2Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e5) {
            throw new SVGParseException("Stream error", e5);
        } catch (ParserConfigurationException e11) {
            throw new SVGParseException("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new SVGParseException("SVG parse error", e12);
        }
    }

    public final void B(InputStream inputStream) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                z2 z2Var = new z2();
                z2Var.f48406a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        D();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        mv.b0 b0Var = new mv.b0(xmlPullParserNewPullParser.getText());
                        String strD = b0Var.D();
                        y(b0Var);
                        strD.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((i1) this.f48154a.f39791b) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        E(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, z2Var);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        G(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        F(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e5) {
                throw new SVGParseException("XML parser problem", e5);
            }
        } catch (IOException e11) {
            throw new SVGParseException("Stream error", e11);
        }
    }

    public final void D() {
        t5.a aVar = new t5.a(29, false);
        aVar.f39791b = null;
        aVar.f39792c = new i4(8);
        aVar.f39793d = new HashMap();
        this.f48154a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:786:0x031a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0504, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x0cda A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.String r24, java.lang.String r25, java.lang.String r26, org.xml.sax.Attributes r27) throws com.caverock.androidsvg.SVGParseException {
        /*
            Method dump skipped, instruction units count: 3890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.a3.E(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void F(String str) {
        if (this.f48156c) {
            return;
        }
        if (this.f48158e) {
            if (this.f48160g == null) {
                this.f48160g = new StringBuilder(str.length());
            }
            this.f48160g.append(str);
        } else if (this.f48161h) {
            if (this.f48162i == null) {
                this.f48162i = new StringBuilder(str.length());
            }
            this.f48162i.append(str);
        } else if (this.f48155b instanceof a2) {
            a(str);
        }
    }

    public final void G(char[] cArr, int i11, int i12) {
        if (this.f48156c) {
            return;
        }
        if (this.f48158e) {
            if (this.f48160g == null) {
                this.f48160g = new StringBuilder(i12);
            }
            this.f48160g.append(cArr, i11, i12);
        } else if (this.f48161h) {
            if (this.f48162i == null) {
                this.f48162i = new StringBuilder(i12);
            }
            this.f48162i.append(cArr, i11, i12);
        } else if (this.f48155b instanceof a2) {
            a(new String(cArr, i11, i12));
        }
    }

    public final void a(String str) {
        k1 k1Var = (k1) this.f48155b;
        int size = k1Var.f48263i.size();
        p1 p1Var = size == 0 ? null : (p1) k1Var.f48263i.get(size - 1);
        if (p1Var instanceof d2) {
            d2 d2Var = (d2) p1Var;
            d2Var.f48180c = r8.k.p(new StringBuilder(), d2Var.f48180c, str);
        } else {
            l1 l1Var = this.f48155b;
            d2 d2Var2 = new d2();
            d2Var2.f48180c = str;
            l1Var.k(d2Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.f48156c) {
            int i11 = this.f48157d - 1;
            this.f48157d = i11;
            if (i11 == 0) {
                this.f48156c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i12 = r2.f48340a[y2.a(str2).ordinal()];
            if (i12 != 1 && i12 != 2 && i12 != 4 && i12 != 5 && i12 != 13 && i12 != 14) {
                switch (i12) {
                    case 22:
                    case 23:
                        this.f48158e = false;
                        if (this.f48160g != null) {
                            y2 y2Var = this.f48159f;
                            if (y2Var == y2.title || y2Var == y2.desc) {
                                this.f48154a.getClass();
                            }
                            this.f48160g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.f48162i;
                        if (sb2 != null) {
                            this.f48161h = false;
                            String string = sb2.toString();
                            i3 i3Var = new i3(g.screen, r.Document);
                            t5.a aVar = this.f48154a;
                            e eVar = new e(string);
                            eVar.K();
                            ((i4) aVar.f39792c).f(i3Var.t(eVar));
                            this.f48162i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f48155b = ((p1) this.f48155b).f48324b;
        }
    }
}
