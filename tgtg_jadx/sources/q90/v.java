package q90;

import com.app.tgtg.model.local.AppConstants;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f36628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f36629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f36630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f36631i;

    public v(String str, String str2, String str3, String str4, int i11, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f36623a = str;
        this.f36624b = str2;
        this.f36625c = str3;
        this.f36626d = str4;
        this.f36627e = i11;
        this.f36628f = arrayList;
        this.f36629g = arrayList2;
        this.f36630h = str5;
        this.f36631i = str6;
    }

    public final String a() {
        if (this.f36625c.length() == 0) {
            return "";
        }
        int length = this.f36623a.length() + 3;
        String str = this.f36631i;
        return str.substring(StringsKt.F(str, ':', length, false, 4) + 1, StringsKt.F(str, '@', 0, false, 6));
    }

    public final String b() {
        int length = this.f36623a.length() + 3;
        String str = this.f36631i;
        int iF = StringsKt.F(str, '/', length, false, 4);
        return str.substring(iF, r90.e.f(str, iF, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.f36623a.length() + 3;
        String str = this.f36631i;
        int iF = StringsKt.F(str, '/', length, false, 4);
        int iF2 = r90.e.f(str, iF, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iF < iF2) {
            int i11 = iF + 1;
            int iE = r90.e.e(str, '/', i11, iF2);
            arrayList.add(str.substring(i11, iE));
            iF = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f36629g == null) {
            return null;
        }
        String str = this.f36631i;
        int iF = StringsKt.F(str, '?', 0, false, 6) + 1;
        return str.substring(iF, r90.e.e(str, '#', iF, str.length()));
    }

    public final String e() {
        if (this.f36624b.length() == 0) {
            return "";
        }
        int length = this.f36623a.length() + 3;
        String str = this.f36631i;
        return str.substring(length, r90.e.f(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && Intrinsics.areEqual(((v) obj).f36631i, this.f36631i);
    }

    public final boolean f() {
        return Intrinsics.areEqual(this.f36623a, "https");
    }

    public final u g() {
        u uVar = new u();
        String str = this.f36623a;
        uVar.f36615a = str;
        uVar.f36616b = e();
        uVar.f36617c = a();
        uVar.f36618d = this.f36626d;
        str.getClass();
        int i11 = Intrinsics.areEqual(str, "http") ? 80 : Intrinsics.areEqual(str, "https") ? 443 : -1;
        int i12 = this.f36627e;
        uVar.f36619e = i12 != i11 ? i12 : -1;
        ArrayList arrayList = uVar.f36620f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        uVar.f36621g = strD != null ? u.g(fa0.a.a(strD, 0, " \"'<>#", 0, 83)) : null;
        if (this.f36630h != null) {
            String str2 = this.f36631i;
            strSubstring = str2.substring(StringsKt.F(str2, '#', 0, false, 6) + 1);
        }
        uVar.f36622h = strSubstring;
        return uVar;
    }

    public final String h() {
        u uVar;
        try {
            uVar = new u();
            uVar.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            uVar = null;
        }
        uVar.getClass();
        uVar.f36616b = fa0.a.a("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, AppConstants.RESULT_CODE_ORDER_CANCELLED);
        uVar.f36617c = fa0.a.a("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, AppConstants.RESULT_CODE_ORDER_CANCELLED);
        return uVar.b().f36631i;
    }

    public final int hashCode() {
        return this.f36631i.hashCode();
    }

    public final URI i() {
        u uVarG = g();
        ArrayList arrayList = uVarG.f36620f;
        String str = uVarG.f36618d;
        uVarG.f36618d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, fa0.a.a((String) arrayList.get(i11), 0, "[]", 0, 99));
        }
        ArrayList arrayList2 = uVarG.f36621g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str2 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str2 != null ? fa0.a.a(str2, 0, "\\^`{|}", 0, 67) : null);
            }
        }
        String str3 = uVarG.f36622h;
        uVarG.f36622h = str3 != null ? fa0.a.a(str3, 0, " \"#<>\\^`{|}", 0, 35) : null;
        String string = uVarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e5) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                org.bouncycastle.jce.provider.a.m(e5);
                return null;
            }
        }
    }

    public final String toString() {
        return this.f36631i;
    }
}
