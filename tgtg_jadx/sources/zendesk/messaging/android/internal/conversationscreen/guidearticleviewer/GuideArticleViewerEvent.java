package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer;

import com.braze.Constants;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent;", "", "LoadUrlInBrowser", "ShareUrl", PantryPageHeaderKt.CLOSE_CONTENT_DESCRIPTION, "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent$Close;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent$LoadUrlInBrowser;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent$ShareUrl;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GuideArticleViewerEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent$Close;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Close implements GuideArticleViewerEvent {

        @NotNull
        public static final Close INSTANCE = new Close();

        private Close() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent$LoadUrlInBrowser;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadUrlInBrowser implements GuideArticleViewerEvent {

        @NotNull
        private final String url;

        public LoadUrlInBrowser(@NotNull String str) {
            str.getClass();
            this.url = str;
        }

        public static /* synthetic */ LoadUrlInBrowser copy$default(LoadUrlInBrowser loadUrlInBrowser, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = loadUrlInBrowser.url;
            }
            return loadUrlInBrowser.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final LoadUrlInBrowser copy(@NotNull String url) {
            url.getClass();
            return new LoadUrlInBrowser(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadUrlInBrowser) && Intrinsics.areEqual(this.url, ((LoadUrlInBrowser) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("LoadUrlInBrowser(url=", this.url, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent$ShareUrl;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShareUrl implements GuideArticleViewerEvent {

        @NotNull
        private final String url;

        public ShareUrl(@NotNull String str) {
            str.getClass();
            this.url = str;
        }

        public static /* synthetic */ ShareUrl copy$default(ShareUrl shareUrl, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = shareUrl.url;
            }
            return shareUrl.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final ShareUrl copy(@NotNull String url) {
            url.getClass();
            return new ShareUrl(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShareUrl) && Intrinsics.areEqual(this.url, ((ShareUrl) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("ShareUrl(url=", this.url, ")");
        }
    }
}
