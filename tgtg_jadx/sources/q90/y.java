package q90;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.d1;
import kotlin.text.MatchGroup;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static z a(String str) {
        str.getClass();
        kotlin.text.l lVarC = z.f36633e.c(0, str);
        if (lVarC == null) {
            i4.a.f(e0.f.g('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((d1) lVarC.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((d1) lVarC.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i11 = lVarC.b().f26554b;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= str.length()) {
                return new z(str, (String[]) arrayList.toArray(new String[0]), lowerCase, lowerCase2);
            }
            kotlin.text.l lVarC2 = z.f36634f.c(i12, str);
            if (lVarC2 == null) {
                org.bouncycastle.jce.provider.a.j("Parameter is not formatted correctly: \"", str.substring(i12), "\" for: \"", str, 34);
                return null;
            }
            kotlin.collections.j jVar = lVarC2.f26616c;
            MatchGroup matchGroupD = jVar.d(1);
            String str3 = matchGroupD != null ? matchGroupD.f26584a : null;
            if (str3 == null) {
                i11 = lVarC2.b().f26554b;
            } else {
                MatchGroup matchGroupD2 = jVar.d(2);
                String strSubstring = matchGroupD2 != null ? matchGroupD2.f26584a : null;
                if (strSubstring == null) {
                    MatchGroup matchGroupD3 = jVar.d(3);
                    matchGroupD3.getClass();
                    strSubstring = matchGroupD3.f26584a;
                } else if (StringsKt.T(strSubstring, '\'') && StringsKt.B(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i11 = lVarC2.b().f26554b;
            }
        }
    }
}
