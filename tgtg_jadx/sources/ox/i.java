package ox;

import android.text.TextUtils;
import ax.a0;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f33797a = new i();

    public static final File a() {
        if (yx.a.f46339a.contains(i.class)) {
            return null;
        }
        try {
            File file = new File(a0.a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            yx.a.a(i.class, th2);
            return null;
        }
    }

    public String b(String str) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = Intrinsics.compare((int) str.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            String strJoin = TextUtils.join(" ", (String[]) new Regex("\\s+").g(0, str.subSequence(i11, length + 1).toString()).toArray(new String[0]));
            strJoin.getClass();
            return strJoin;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public int[] c(String str) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int[] iArr = new int[128];
            String strB = b(str);
            Charset charsetForName = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);
            charsetForName.getClass();
            byte[] bytes = strB.getBytes(charsetForName);
            bytes.getClass();
            for (int i11 = 0; i11 < 128; i11++) {
                if (i11 < bytes.length) {
                    iArr[i11] = bytes[i11] & 255;
                } else {
                    iArr[i11] = 0;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }
}
