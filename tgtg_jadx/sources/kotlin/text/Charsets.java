package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Charsets;", "", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Charsets {

    @NotNull
    public static final Charset UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Charsets f26577a = new Charsets();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f26578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f26579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f26580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f26581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Charset f26582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile Charset f26583g;

    static {
        Charset charsetForName = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);
        charsetForName.getClass();
        UTF_8 = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        charsetForName2.getClass();
        f26578b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        charsetForName3.getClass();
        f26579c = charsetForName3;
        Charset charsetForName4 = Charset.forName("US-ASCII");
        charsetForName4.getClass();
        f26580d = charsetForName4;
        Charset charsetForName5 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        charsetForName5.getClass();
        f26581e = charsetForName5;
    }
}
