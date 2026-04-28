package e40;

import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.onboarding.OnboardingActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import com.braze.h2;
import d40.n2;
import d40.s0;
import d40.v0;
import h7.w;
import j4.s;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mv.r0;
import s20.g;
import s20.l;
import ty.e;
import w.a0;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements b, s.a, w, l, e, ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15746a;

    public /* synthetic */ a(int i11) {
        this.f15746a = i11;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession e(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void f() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, int i11) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i11)).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void m(StringBuilder sb2, Object obj, Object obj2) {
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        switch (this.f15746a) {
            case 28:
                ((Boolean) obj).getClass();
                boolean z11 = MainActivity.f9078v;
                break;
            default:
                h.a aVar = (h.a) obj;
                boolean z12 = MainActivity.f9078v;
                aVar.getClass();
                int i11 = aVar.f20935a;
                if (i11 != -1) {
                    sa0.a.f38953a.c(s.f(i11, "In-app update flow failed or was cancelled. Result code: "), new Object[0]);
                }
                break;
        }
    }

    @Override // s.a
    /* JADX INFO: renamed from: apply */
    public Object mo962apply(Object obj) {
        switch (this.f15746a) {
            case 14:
                int i11 = PrivacyActionActivity.f9330k;
                if (r0.s((String) obj)) {
                    return Integer.valueOf(R.string.privacy_request_data_error_enter_valid_email);
                }
                return -1;
            default:
                h40.a.f21393b.getClass();
                return c.f15747a.e((n2) obj).getBytes(Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE));
        }
    }

    @Override // e40.b
    public Object c(JsonReader jsonReader) throws IOException {
        int i11 = 2;
        switch (this.f15746a) {
            case 0:
                jsonReader.beginObject();
                byte b8 = 0;
                int iNextInt = 0;
                String strNextString = null;
                List listD = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "frames":
                            listD = c.d(jsonReader, new a(i11));
                            if (listD == null) {
                                c50.w.l("Null frames");
                                return null;
                            }
                            continue;
                            break;
                            break;
                        case "name":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                c50.w.l("Null name");
                                return null;
                            }
                            break;
                        case "importance":
                            iNextInt = jsonReader.nextInt();
                            b8 = (byte) (b8 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b8 == 1 && strNextString != null && listD != null) {
                    return new v0(strNextString, listD, iNextInt);
                }
                StringBuilder sb2 = new StringBuilder();
                if (strNextString == null) {
                    sb2.append(" name");
                }
                if ((b8 & 1) == 0) {
                    sb2.append(" importance");
                }
                if (listD == null) {
                    sb2.append(" frames");
                }
                h2.b(a0.q("Missing required properties:", sb2));
                return null;
            case 1:
                jsonReader.beginObject();
                byte b11 = 0;
                String strNextString2 = null;
                String str = null;
                long jNextLong = 0;
                long jNextLong2 = 0;
                while (true) {
                    if (!jsonReader.hasNext()) {
                        jsonReader.endObject();
                        if (b11 == 3 && strNextString2 != null) {
                            return new s0(jNextLong, jNextLong2, strNextString2, str);
                        }
                        StringBuilder sb3 = new StringBuilder();
                        if ((b11 & 1) == 0) {
                            sb3.append(" baseAddress");
                        }
                        if ((b11 & 2) == 0) {
                            sb3.append(" size");
                        }
                        if (strNextString2 == null) {
                            sb3.append(" name");
                        }
                        h2.b(a0.q("Missing required properties:", sb3));
                        return null;
                    }
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "name":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                c50.w.l("Null name");
                                return null;
                            }
                            break;
                            break;
                        case "size":
                            b11 = (byte) (b11 | 2);
                            jNextLong2 = jsonReader.nextLong();
                            break;
                        case "uuid":
                            str = new String(Base64.decode(jsonReader.nextString(), 2), n2.f14292a);
                            break;
                        case "baseAddress":
                            b11 = (byte) (b11 | 1);
                            jNextLong = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                break;
            default:
                return c.a(jsonReader);
        }
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i11 = OnboardingActivity.f9054e;
        view.setPadding(0, 0, 0, s.x(view, windowInsetsCompat).f43876d);
        return windowInsetsCompat;
    }

    @Override // s20.l
    public void b(g gVar, int i11) {
    }
}
