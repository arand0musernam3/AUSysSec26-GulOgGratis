package zendesk.guidekit.android;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import x70.c;
import zendesk.guidekit.android.model.GuideArticle;
import zendesk.guidekit.android.model.GuideLocale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000e\u0010\u000bJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzendesk/guidekit/android/GuideKit;", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "articleId", "Lzendesk/guidekit/android/model/GuideLocale;", "guideLocale", "Lu70/q;", "", "sendArticleStatsView-BWLJW6A", "(Ljava/lang/String;JLzendesk/guidekit/android/model/GuideLocale;Lx70/c;)Ljava/lang/Object;", "sendArticleStatsView", "Lzendesk/guidekit/android/model/GuideArticle;", "getArticle-BWLJW6A", "getArticle", "Lzendesk/guidekit/android/model/GuideArticleUrl;", "getGuideArticleLink-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "getGuideArticleLink", "", "isValidGuideUrl", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GuideKit {
    @Nullable
    /* JADX INFO: renamed from: getArticle-BWLJW6A, reason: not valid java name */
    Object mo994getArticleBWLJW6A(@NotNull String str, long j9, @NotNull GuideLocale guideLocale, @NotNull c<? super q<GuideArticle>> cVar);

    @NotNull
    /* JADX INFO: renamed from: getGuideArticleLink-IoAF18A, reason: not valid java name */
    Object mo995getGuideArticleLinkIoAF18A(@NotNull String url);

    @Nullable
    Object isValidGuideUrl(@NotNull String str, @NotNull c<? super Boolean> cVar);

    @Nullable
    /* JADX INFO: renamed from: sendArticleStatsView-BWLJW6A, reason: not valid java name */
    Object mo996sendArticleStatsViewBWLJW6A(@NotNull String str, long j9, @NotNull GuideLocale guideLocale, @NotNull c<? super q<Unit>> cVar);
}
