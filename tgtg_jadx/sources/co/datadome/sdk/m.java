package co.datadome.sdk;

import java.util.List;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f8672a = new Regex("\\s*=\\s*");

    public static final String a(String str, String str2) {
        str.getClass();
        if (str.length() == 0 || b(str)) {
            return str;
        }
        if (str2 != null && str2.length() != 0 && b(str2)) {
            int iF = StringsKt.F(str2, ';', 0, false, 6);
            String strSubstring = iF != -1 ? str2.substring(iF) : null;
            if (strSubstring != null) {
                return r8.k.l(StringsKt.e0(StringsKt.Y(str, ';')).toString(), strSubstring);
            }
        }
        return null;
    }

    public static final boolean b(String str) {
        List<String> listS;
        CharSequence charSequenceSubSequence;
        str.getClass();
        int iF = StringsKt.F(str, ';', 0, false, 6);
        if (iF != -1 && ((listS = StringsKt.S(str.substring(iF + 1), new char[]{';'}, 6)) == null || !listS.isEmpty())) {
            for (String str2 : listS) {
                str2.getClass();
                int length = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        charSequenceSubSequence = "";
                        break;
                    }
                    if (!CharsKt.b(str2.charAt(i11))) {
                        charSequenceSubSequence = str2.subSequence(i11, str2.length());
                        break;
                    }
                    i11++;
                }
                String strReplace = f8672a.replace(charSequenceSubSequence.toString(), "=");
                if (kotlin.text.y.p(strReplace, "Domain=", true) && strReplace.length() > 7) {
                    return true;
                }
            }
        }
        return false;
    }
}
