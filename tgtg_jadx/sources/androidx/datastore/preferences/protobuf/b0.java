package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2931b;

    static {
        Charset.forName("US-ASCII");
        f2930a = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f2931b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new g(bArr, 0, 0, false).e(0);
        } catch (InvalidProtocolBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c50.w.l(str);
    }

    public static int b(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }
}
