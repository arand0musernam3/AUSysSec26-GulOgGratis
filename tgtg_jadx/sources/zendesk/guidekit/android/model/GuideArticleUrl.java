package zendesk.guidekit.android.model;

import com.braze.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import zendesk.guidekit.android.exception.InvalidGuideArticleUrl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzendesk/guidekit/android/model/GuideArticleUrl;", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "articleId", "", "locale", "Lzendesk/guidekit/android/model/GuideLocale;", "<init>", "(Ljava/lang/String;JLzendesk/guidekit/android/model/GuideLocale;)V", "getUrl", "()Ljava/lang/String;", "getArticleId", "()J", "getLocale", "()Lzendesk/guidekit/android/model/GuideLocale;", "Companion", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuideArticleUrl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long articleId;

    @NotNull
    private final GuideLocale locale;

    @NotNull
    private final String url;

    private GuideArticleUrl(String str, long j9, GuideLocale guideLocale) {
        this.url = str;
        this.articleId = j9;
        this.locale = guideLocale;
    }

    public final long getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final GuideLocale getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lzendesk/guidekit/android/model/GuideArticleUrl$Companion;", "", "<init>", "()V", "isValidGuideUrl", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "hostMapping", "from", "Lzendesk/guidekit/android/model/GuideArticleUrl;", "articleRegex", "Lkotlin/text/Regex;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Regex articleRegex() {
            return new Regex("/hc/([a-z-]+)/articles/(\\d+)(?:[/-]?.*)?$");
        }

        @NotNull
        public final GuideArticleUrl from(@NotNull String url) throws InvalidGuideArticleUrl {
            MatchGroup matchGroupD;
            String str;
            MatchGroup matchGroupD2;
            url.getClass();
            l lVarB = Regex.b(articleRegex(), url);
            Long lValueOf = null;
            String str2 = (lVarB == null || (matchGroupD2 = lVarB.f26616c.d(1)) == null) ? null : matchGroupD2.f26584a;
            if (lVarB != null && (matchGroupD = lVarB.f26616c.d(2)) != null && (str = matchGroupD.f26584a) != null) {
                lValueOf = Long.valueOf(Long.parseLong(str));
            }
            if (str2 == null || lValueOf == null) {
                throw new InvalidGuideArticleUrl(url);
            }
            return new GuideArticleUrl(url, lValueOf.longValue(), GuideLocale.INSTANCE.toGuideLocale(str2), null);
        }

        public final boolean isValidGuideUrl(@NotNull String url, @NotNull String hostMapping) {
            url.getClass();
            hostMapping.getClass();
            try {
                URL url2 = new URL(url);
                String host = url2.getHost();
                host.getClass();
                if (StringsKt.z(host, hostMapping, false)) {
                    Regex regexArticleRegex = articleRegex();
                    String path = url2.getPath();
                    path.getClass();
                    return regexArticleRegex.e(path);
                }
            } catch (MalformedURLException unused) {
            }
            return false;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GuideArticleUrl(String str, long j9, GuideLocale guideLocale, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j9, guideLocale);
    }
}
