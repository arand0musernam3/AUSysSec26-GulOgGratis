package d70;

import android.content.res.Configuration;
import c5.v0;
import c5.x1;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.l;
import kotlin.text.y;
import m3.m;
import m3.n;
import m3.s;
import m5.e;
import m5.h;
import m5.l0;
import z5.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(double r4, m3.n r6) {
        /*
            m3.e0 r0 = c5.v0.f7389a
            m3.s r6 = (m3.s) r6
            java.lang.Object r0 = r6.j(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            android.os.LocaleList r0 = r0.getLocales()
            r1 = 0
            java.util.Locale r0 = r0.get(r1)
            r0.getClass()
            boolean r2 = r6.f(r0)
            java.lang.Object r3 = r6.M()
            if (r2 != 0) goto L24
            m3.f r2 = m3.m.f29332a
            if (r3 != r2) goto L31
        L24:
            java.text.NumberFormat r3 = java.text.NumberFormat.getPercentInstance(r0)
            r3.setMinimumFractionDigits(r1)
            r3.setMaximumFractionDigits(r1)
            r6.k0(r3)
        L31:
            java.text.NumberFormat r3 = (java.text.NumberFormat) r3
            r6 = 100
            double r0 = (double) r6
            double r4 = r4 / r0
            java.lang.String r4 = r3.format(r4)
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d70.a.a(double, m3.n):java.lang.String");
    }

    public static final h b(String str, l0 l0Var, String str2, int i11) {
        String strN;
        String value;
        str.getClass();
        String strN2 = null;
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if (StringsKt.z(str, "%1$s", false) && StringsKt.z(str, "%2$s", false)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format(str, Arrays.copyOf(new Object[]{"#", "#"}, 2));
            Matcher matcher = new Regex("#(.*?)#").f26587a.matcher(str3);
            matcher.getClass();
            l lVar = !matcher.find(0) ? null : new l(matcher, str3);
            if (lVar != null && (value = lVar.getValue()) != null) {
                strN2 = y.n(value, "#", "", false);
            }
            strN = y.n(str3, "#", "", false);
            str = strN2;
        } else {
            strN = str;
        }
        e eVar = new e();
        if (str != null) {
            eVar.c(strN);
            int iG = StringsKt.G(strN, str, 0, false, 6);
            int length = str.length() + iG;
            eVar.b(l0Var, iG, length);
            if (str2 != null) {
                eVar.a("TAG_URL", iG, length, str2);
            }
        }
        return eVar.j();
    }

    public static final String c(String str, n nVar) {
        s sVar = (s) nVar;
        Locale locale = ((Configuration) sVar.j(v0.f7389a)).getLocales().get(0);
        boolean zF = sVar.f(str) | sVar.f(locale);
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            objM = locale.getDisplayCountry();
            sVar.k0(objM);
        }
        String str2 = (String) objM;
        str2.getClass();
        return str2;
    }

    public static final float d(float f11, n nVar) {
        return ((c) ((s) nVar).j(x1.f7416h)).R(f11);
    }

    public static final float e(n nVar, int i11) {
        return ((c) ((s) nVar).j(x1.f7416h)).O(i11);
    }
}
