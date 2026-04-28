package dt;

import a3.b2;
import android.net.Uri;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import ao.g3;
import at.b0;
import at.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldt/c;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebViewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewViewModel.kt\ncom/app/tgtg/feature/webview/ui/WebViewViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class c extends l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15169e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f15170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f15171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a50.c f15172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f15173d;

    public c(c1 c1Var, b0 b0Var, g3 g3Var) {
        c1Var.getClass();
        b0Var.getClass();
        g3Var.getClass();
        this.f15170a = c1Var;
        this.f15171b = b0Var;
        this.f15172c = new a50.c(b0Var);
        this.f15173d = r.c(f0.f4775a);
        String blogUrl = g3Var.n().getBlogUrl();
        blogUrl = blogUrl == null ? "" : blogUrl;
        String str = (String) c1Var.a("STRING_TITLE");
        String str2 = str == null ? "" : str;
        Integer num = (Integer) c1Var.a("TITLE");
        int iIntValue = num != null ? num.intValue() : -1;
        String string = (String) c1Var.a("URL");
        string = string == null ? "" : string;
        if (blogUrl.length() == 0) {
            String str3 = (String) c1Var.a("URL");
            blogUrl = str3 != null ? str3 : "";
        }
        ct.a aVar = (ct.a) c1Var.a("DESTINATION");
        aVar = aVar == null ? ct.a.UNKNOWN : aVar;
        aVar.getClass();
        if (aVar == ct.a.BLOG) {
            string = Uri.parse(blogUrl).buildUpon().appendQueryParameter("at_campaign", "blog").appendQueryParameter("at_medium", "app").appendQueryParameter("webview", "1").build().toString();
            string.getClass();
        } else if (aVar == ct.a.CAREER) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("at_campaign", "careers").appendQueryParameter("at_medium", "app").appendQueryParameter("webview", "1").build().toString();
            string.getClass();
        } else if (!StringsKt.z(string, "webview=1", false)) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("webview", "1").build().toString();
            string.getClass();
        }
        Boolean bool = (Boolean) c1Var.a("ALLOW_ZOOM");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) c1Var.a("CLEAR_COOKIES");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = (Boolean) c1Var.a("STORE_REFERRAL");
        b0Var.a(new at.c(iIntValue, str2, string, zBooleanValue, zBooleanValue2, bool3 != null ? bool3.booleanValue() : false));
        v80.f0.B(m1.d(this), null, null, new b2(this, null, 11), 3);
    }
}
