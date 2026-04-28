package uy;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import ty.c;
import y9.w;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f41568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f41569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f41570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f41571f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41573b;

    static {
        String strA = w.A("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f41568c = strA;
        String strA2 = w.A("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strA3 = w.A("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f41569d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f41570e = new a(strA, null);
        f41571f = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f41572a = str;
        this.f41573b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE));
        if (!str.startsWith("1$")) {
            i4.a.f("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            i4.a.f("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            i4.a.f("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
