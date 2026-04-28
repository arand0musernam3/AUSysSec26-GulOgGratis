package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer;

import com.braze.Constants;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", "", PantryPageHeaderKt.BACK_CONTENT_DESCRIPTION, "BackRestrictedArticle", "Load", "RefreshTheme", "Reload", "OpenAttachment", "Share", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Back;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$BackRestrictedArticle;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Load;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$OpenAttachment;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$RefreshTheme;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Reload;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Share;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GuideArticleViewerAction {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Back;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Back implements GuideArticleViewerAction {

        @NotNull
        public static final Back INSTANCE = new Back();

        private Back() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$BackRestrictedArticle;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BackRestrictedArticle implements GuideArticleViewerAction {

        @NotNull
        public static final BackRestrictedArticle INSTANCE = new BackRestrictedArticle();

        private BackRestrictedArticle() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Load;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Load implements GuideArticleViewerAction {

        @NotNull
        private final String url;

        public Load(@NotNull String str) {
            str.getClass();
            this.url = str;
        }

        public static /* synthetic */ Load copy$default(Load load, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = load.url;
            }
            return load.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Load copy(@NotNull String url) {
            url.getClass();
            return new Load(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Load) && Intrinsics.areEqual(this.url, ((Load) other).url);
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
            return a0.p("Load(url=", this.url, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$OpenAttachment;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", "attachment", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "<init>", "(Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;)V", "getAttachment", "()Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenAttachment implements GuideArticleViewerAction {

        @NotNull
        private final ArticleAttachmentItem attachment;

        public OpenAttachment(@NotNull ArticleAttachmentItem articleAttachmentItem) {
            articleAttachmentItem.getClass();
            this.attachment = articleAttachmentItem;
        }

        public static /* synthetic */ OpenAttachment copy$default(OpenAttachment openAttachment, ArticleAttachmentItem articleAttachmentItem, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                articleAttachmentItem = openAttachment.attachment;
            }
            return openAttachment.copy(articleAttachmentItem);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ArticleAttachmentItem getAttachment() {
            return this.attachment;
        }

        @NotNull
        public final OpenAttachment copy(@NotNull ArticleAttachmentItem attachment) {
            attachment.getClass();
            return new OpenAttachment(attachment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenAttachment) && Intrinsics.areEqual(this.attachment, ((OpenAttachment) other).attachment);
        }

        @NotNull
        public final ArticleAttachmentItem getAttachment() {
            return this.attachment;
        }

        public int hashCode() {
            return this.attachment.hashCode();
        }

        @NotNull
        public String toString() {
            return "OpenAttachment(attachment=" + this.attachment + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$RefreshTheme;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", "theme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefreshTheme implements GuideArticleViewerAction {

        @NotNull
        private final MessagingTheme theme;

        public RefreshTheme(@NotNull MessagingTheme messagingTheme) {
            messagingTheme.getClass();
            this.theme = messagingTheme;
        }

        public static /* synthetic */ RefreshTheme copy$default(RefreshTheme refreshTheme, MessagingTheme messagingTheme, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                messagingTheme = refreshTheme.theme;
            }
            return refreshTheme.copy(messagingTheme);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessagingTheme getTheme() {
            return this.theme;
        }

        @NotNull
        public final RefreshTheme copy(@NotNull MessagingTheme theme) {
            theme.getClass();
            return new RefreshTheme(theme);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RefreshTheme) && Intrinsics.areEqual(this.theme, ((RefreshTheme) other).theme);
        }

        @NotNull
        public final MessagingTheme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return this.theme.hashCode();
        }

        @NotNull
        public String toString() {
            return "RefreshTheme(theme=" + this.theme + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Reload;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Reload implements GuideArticleViewerAction {

        @NotNull
        public static final Reload INSTANCE = new Reload();

        private Reload() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Share;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Share implements GuideArticleViewerAction {

        @NotNull
        public static final Share INSTANCE = new Share();

        private Share() {
        }
    }
}
