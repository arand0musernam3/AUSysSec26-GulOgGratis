package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer;

import com.braze.Constants;
import com.braze.h2;
import e0.f;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B'\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState;", "", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "sealedCopy", "Idle", "Loading", "Error", "SuccessGuideArticle", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Error;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Idle;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Loading;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$SuccessGuideArticle;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class GuideArticleViewerState {

    @NotNull
    private final List<String> backStack;

    @NotNull
    private final MessagingTheme messagingTheme;

    @NotNull
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Error;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState;", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "sealedCopy", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends GuideArticleViewerState {

        @NotNull
        private final List<String> backStack;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull List<String> list, @NotNull String str, @NotNull MessagingTheme messagingTheme) {
            super(list, str, messagingTheme, null);
            list.getClass();
            str.getClass();
            messagingTheme.getClass();
            this.backStack = list;
            this.url = str;
            this.messagingTheme = messagingTheme;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, List list, String str, MessagingTheme messagingTheme, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = error.backStack;
            }
            if ((i11 & 2) != 0) {
                str = error.url;
            }
            if ((i11 & 4) != 0) {
                messagingTheme = error.messagingTheme;
            }
            return error.copy(list, str, messagingTheme);
        }

        @NotNull
        public final List<String> component1() {
            return this.backStack;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        public final Error copy(@NotNull List<String> backStack, @NotNull String url, @NotNull MessagingTheme messagingTheme) {
            backStack.getClass();
            url.getClass();
            messagingTheme.getClass();
            return new Error(backStack, url, messagingTheme);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.backStack, error.backStack) && Intrinsics.areEqual(this.url, error.url) && Intrinsics.areEqual(this.messagingTheme, error.messagingTheme);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public List<String> getBackStack() {
            return this.backStack;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.messagingTheme.hashCode() + l1.b(this.backStack.hashCode() * 31, 31, this.url);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public GuideArticleViewerState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull MessagingTheme messagingTheme) {
            backStack.getClass();
            url.getClass();
            messagingTheme.getClass();
            return copy(backStack, url, messagingTheme);
        }

        @NotNull
        public String toString() {
            return "Error(backStack=" + this.backStack + ", url=" + this.url + ", messagingTheme=" + this.messagingTheme + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Idle;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState;", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "sealedCopy", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle extends GuideArticleViewerState {

        @NotNull
        private final List<String> backStack;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Idle(@NotNull List<String> list, @NotNull String str, @NotNull MessagingTheme messagingTheme) {
            super(list, str, messagingTheme, null);
            list.getClass();
            str.getClass();
            messagingTheme.getClass();
            this.backStack = list;
            this.url = str;
            this.messagingTheme = messagingTheme;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Idle copy$default(Idle idle, List list, String str, MessagingTheme messagingTheme, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = idle.backStack;
            }
            if ((i11 & 2) != 0) {
                str = idle.url;
            }
            if ((i11 & 4) != 0) {
                messagingTheme = idle.messagingTheme;
            }
            return idle.copy(list, str, messagingTheme);
        }

        @NotNull
        public final List<String> component1() {
            return this.backStack;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        public final Idle copy(@NotNull List<String> backStack, @NotNull String url, @NotNull MessagingTheme messagingTheme) {
            backStack.getClass();
            url.getClass();
            messagingTheme.getClass();
            return new Idle(backStack, url, messagingTheme);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Idle)) {
                return false;
            }
            Idle idle = (Idle) other;
            return Intrinsics.areEqual(this.backStack, idle.backStack) && Intrinsics.areEqual(this.url, idle.url) && Intrinsics.areEqual(this.messagingTheme, idle.messagingTheme);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public List<String> getBackStack() {
            return this.backStack;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.messagingTheme.hashCode() + l1.b(this.backStack.hashCode() * 31, 31, this.url);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public GuideArticleViewerState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull MessagingTheme messagingTheme) {
            backStack.getClass();
            url.getClass();
            messagingTheme.getClass();
            return copy(backStack, url, messagingTheme);
        }

        @NotNull
        public String toString() {
            return "Idle(backStack=" + this.backStack + ", url=" + this.url + ", messagingTheme=" + this.messagingTheme + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Loading;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState;", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "sealedCopy", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading extends GuideArticleViewerState {

        @NotNull
        private final List<String> backStack;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(@NotNull List<String> list, @NotNull String str, @NotNull MessagingTheme messagingTheme) {
            super(list, str, messagingTheme, null);
            list.getClass();
            str.getClass();
            messagingTheme.getClass();
            this.backStack = list;
            this.url = str;
            this.messagingTheme = messagingTheme;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loading copy$default(Loading loading, List list, String str, MessagingTheme messagingTheme, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = loading.backStack;
            }
            if ((i11 & 2) != 0) {
                str = loading.url;
            }
            if ((i11 & 4) != 0) {
                messagingTheme = loading.messagingTheme;
            }
            return loading.copy(list, str, messagingTheme);
        }

        @NotNull
        public final List<String> component1() {
            return this.backStack;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        public final Loading copy(@NotNull List<String> backStack, @NotNull String url, @NotNull MessagingTheme messagingTheme) {
            backStack.getClass();
            url.getClass();
            messagingTheme.getClass();
            return new Loading(backStack, url, messagingTheme);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.areEqual(this.backStack, loading.backStack) && Intrinsics.areEqual(this.url, loading.url) && Intrinsics.areEqual(this.messagingTheme, loading.messagingTheme);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public List<String> getBackStack() {
            return this.backStack;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.messagingTheme.hashCode() + l1.b(this.backStack.hashCode() * 31, 31, this.url);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public GuideArticleViewerState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull MessagingTheme messagingTheme) {
            backStack.getClass();
            url.getClass();
            messagingTheme.getClass();
            return copy(backStack, url, messagingTheme);
        }

        @NotNull
        public String toString() {
            return "Loading(backStack=" + this.backStack + ", url=" + this.url + ", messagingTheme=" + this.messagingTheme + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$SuccessGuideArticle;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState;", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, MessageBundle.TITLE_ENTRY, "htmlBody", "attachments", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getTitle", "getHtmlBody", "getAttachments", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "sealedCopy", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SuccessGuideArticle extends GuideArticleViewerState {

        @NotNull
        private final List<ArticleAttachmentItem> attachments;

        @NotNull
        private final List<String> backStack;

        @NotNull
        private final String htmlBody;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final String title;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessGuideArticle(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<ArticleAttachmentItem> list2, @NotNull MessagingTheme messagingTheme) {
            super(list, str, messagingTheme, null);
            list.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            list2.getClass();
            messagingTheme.getClass();
            this.backStack = list;
            this.url = str;
            this.title = str2;
            this.htmlBody = str3;
            this.attachments = list2;
            this.messagingTheme = messagingTheme;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuccessGuideArticle copy$default(SuccessGuideArticle successGuideArticle, List list, String str, String str2, String str3, List list2, MessagingTheme messagingTheme, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = successGuideArticle.backStack;
            }
            if ((i11 & 2) != 0) {
                str = successGuideArticle.url;
            }
            if ((i11 & 4) != 0) {
                str2 = successGuideArticle.title;
            }
            if ((i11 & 8) != 0) {
                str3 = successGuideArticle.htmlBody;
            }
            if ((i11 & 16) != 0) {
                list2 = successGuideArticle.attachments;
            }
            if ((i11 & 32) != 0) {
                messagingTheme = successGuideArticle.messagingTheme;
            }
            List list3 = list2;
            MessagingTheme messagingTheme2 = messagingTheme;
            return successGuideArticle.copy(list, str, str2, str3, list3, messagingTheme2);
        }

        @NotNull
        public final List<String> component1() {
            return this.backStack;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getHtmlBody() {
            return this.htmlBody;
        }

        @NotNull
        public final List<ArticleAttachmentItem> component5() {
            return this.attachments;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        public final SuccessGuideArticle copy(@NotNull List<String> backStack, @NotNull String url, @NotNull String title, @NotNull String htmlBody, @NotNull List<ArticleAttachmentItem> attachments, @NotNull MessagingTheme messagingTheme) {
            backStack.getClass();
            url.getClass();
            title.getClass();
            htmlBody.getClass();
            attachments.getClass();
            messagingTheme.getClass();
            return new SuccessGuideArticle(backStack, url, title, htmlBody, attachments, messagingTheme);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessGuideArticle)) {
                return false;
            }
            SuccessGuideArticle successGuideArticle = (SuccessGuideArticle) other;
            return Intrinsics.areEqual(this.backStack, successGuideArticle.backStack) && Intrinsics.areEqual(this.url, successGuideArticle.url) && Intrinsics.areEqual(this.title, successGuideArticle.title) && Intrinsics.areEqual(this.htmlBody, successGuideArticle.htmlBody) && Intrinsics.areEqual(this.attachments, successGuideArticle.attachments) && Intrinsics.areEqual(this.messagingTheme, successGuideArticle.messagingTheme);
        }

        @NotNull
        public final List<ArticleAttachmentItem> getAttachments() {
            return this.attachments;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public List<String> getBackStack() {
            return this.backStack;
        }

        @NotNull
        public final String getHtmlBody() {
            return this.htmlBody;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.messagingTheme.hashCode() + f.c(this.attachments, l1.b(l1.b(l1.b(this.backStack.hashCode() * 31, 31, this.url), 31, this.title), 31, this.htmlBody), 31);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState
        @NotNull
        public GuideArticleViewerState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull MessagingTheme messagingTheme) {
            backStack.getClass();
            url.getClass();
            messagingTheme.getClass();
            return copy$default(this, backStack, url, null, null, null, messagingTheme, 28, null);
        }

        @NotNull
        public String toString() {
            List<String> list = this.backStack;
            String str = this.url;
            String str2 = this.title;
            String str3 = this.htmlBody;
            List<ArticleAttachmentItem> list2 = this.attachments;
            MessagingTheme messagingTheme = this.messagingTheme;
            StringBuilder sb2 = new StringBuilder("SuccessGuideArticle(backStack=");
            sb2.append(list);
            sb2.append(", url=");
            sb2.append(str);
            sb2.append(", title=");
            s.A(sb2, str2, ", htmlBody=", str3, ", attachments=");
            sb2.append(list2);
            sb2.append(", messagingTheme=");
            sb2.append(messagingTheme);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private GuideArticleViewerState(List<String> list, String str, MessagingTheme messagingTheme) {
        this.backStack = list;
        this.url = str;
        this.messagingTheme = messagingTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuideArticleViewerState sealedCopy$default(GuideArticleViewerState guideArticleViewerState, List list, String str, MessagingTheme messagingTheme, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: sealedCopy");
            return null;
        }
        if ((i11 & 1) != 0) {
            list = guideArticleViewerState.getBackStack();
        }
        if ((i11 & 2) != 0) {
            str = guideArticleViewerState.getUrl();
        }
        if ((i11 & 4) != 0) {
            messagingTheme = guideArticleViewerState.getMessagingTheme();
        }
        return guideArticleViewerState.sealedCopy(list, str, messagingTheme);
    }

    @NotNull
    public List<String> getBackStack() {
        return this.backStack;
    }

    @NotNull
    public MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @NotNull
    public String getUrl() {
        return this.url;
    }

    @NotNull
    public abstract GuideArticleViewerState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull MessagingTheme messagingTheme);

    public /* synthetic */ GuideArticleViewerState(List list, String str, MessagingTheme messagingTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, messagingTheme);
    }
}
