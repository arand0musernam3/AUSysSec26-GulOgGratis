package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import com.braze.Constants;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", "", "Load", "RefreshTheme", "Reload", "UpdateTitle", "WebViewError", PantryPageHeaderKt.CLOSE_CONTENT_DESCRIPTION, "UpdateUrl", "LoadingComplete", PantryPageHeaderKt.BACK_CONTENT_DESCRIPTION, "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Back;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Close;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Load;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$LoadingComplete;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$RefreshTheme;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Reload;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$UpdateTitle;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$UpdateUrl;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$WebViewError;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationExtensionAction {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Back;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Back implements ConversationExtensionAction {

        @NotNull
        public static final Back INSTANCE = new Back();

        private Back() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Close;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Close implements ConversationExtensionAction {

        @NotNull
        public static final Close INSTANCE = new Close();

        private Close() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Load;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Load implements ConversationExtensionAction {

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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$LoadingComplete;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadingComplete implements ConversationExtensionAction {

        @NotNull
        public static final LoadingComplete INSTANCE = new LoadingComplete();

        private LoadingComplete() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$RefreshTheme;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", "theme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefreshTheme implements ConversationExtensionAction {

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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Reload;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Reload implements ConversationExtensionAction {

        @NotNull
        public static final Reload INSTANCE = new Reload();

        private Reload() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$UpdateTitle;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", MessageBundle.TITLE_ENTRY, "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateTitle implements ConversationExtensionAction {

        @Nullable
        private final String title;

        public UpdateTitle(@Nullable String str) {
            this.title = str;
        }

        public static /* synthetic */ UpdateTitle copy$default(UpdateTitle updateTitle, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = updateTitle.title;
            }
            return updateTitle.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final UpdateTitle copy(@Nullable String title) {
            return new UpdateTitle(title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateTitle) && Intrinsics.areEqual(this.title, ((UpdateTitle) other).title);
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("UpdateTitle(title=", this.title, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$UpdateUrl;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateUrl implements ConversationExtensionAction {

        @NotNull
        private final String url;

        public UpdateUrl(@NotNull String str) {
            str.getClass();
            this.url = str;
        }

        public static /* synthetic */ UpdateUrl copy$default(UpdateUrl updateUrl, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = updateUrl.url;
            }
            return updateUrl.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final UpdateUrl copy(@NotNull String url) {
            url.getClass();
            return new UpdateUrl(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateUrl) && Intrinsics.areEqual(this.url, ((UpdateUrl) other).url);
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
            return a0.p("UpdateUrl(url=", this.url, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$WebViewError;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebViewError implements ConversationExtensionAction {

        @NotNull
        public static final WebViewError INSTANCE = new WebViewError();

        private WebViewError() {
        }
    }
}
