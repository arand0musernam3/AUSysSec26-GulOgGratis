package zendesk.guidekit.android.internal.rest;

import com.braze.Constants;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.f;
import ra0.o;
import ra0.t;
import ra0.y;
import x70.c;
import zendesk.guidekit.android.internal.rest.model.ArticleResponseDto;
import zendesk.guidekit.android.internal.rest.model.AttachmentResponseDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzendesk/guidekit/android/internal/rest/HelpCenterApi;", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "Lzendesk/guidekit/android/internal/rest/model/ArticleResponseDto;", "getArticle", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "", "perPage", "Lzendesk/guidekit/android/internal/rest/model/AttachmentResponseDto;", "getAttachments", "(Ljava/lang/String;ILx70/c;)Ljava/lang/Object;", "origin", "", "sendArticleStatsView", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Companion", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface HelpCenterApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Deprecated
    @NotNull
    public static final String ORIGIN = "mobile_sdk";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/guidekit/android/internal/rest/HelpCenterApi$Companion;", "", "<init>", "()V", "ORIGIN", "", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String ORIGIN = "mobile_sdk";

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAttachments$default(HelpCenterApi helpCenterApi, String str, int i11, c cVar, int i12, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: getAttachments");
                return null;
            }
            if ((i12 & 2) != 0) {
                i11 = 100;
            }
            return helpCenterApi.getAttachments(str, i11, cVar);
        }

        public static /* synthetic */ Object sendArticleStatsView$default(HelpCenterApi helpCenterApi, String str, String str2, c cVar, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: sendArticleStatsView");
                return null;
            }
            if ((i11 & 2) != 0) {
                str2 = "mobile_sdk";
            }
            return helpCenterApi.sendArticleStatsView(str, str2, cVar);
        }
    }

    @f
    @Nullable
    Object getArticle(@NotNull @y String str, @NotNull c<? super ArticleResponseDto> cVar);

    @f
    @Nullable
    Object getAttachments(@NotNull @y String str, @t("per_page") int i11, @NotNull c<? super AttachmentResponseDto> cVar);

    @o
    @Nullable
    Object sendArticleStatsView(@NotNull @y String str, @t("origin") @NotNull String str2, @NotNull c<? super Unit> cVar);
}
