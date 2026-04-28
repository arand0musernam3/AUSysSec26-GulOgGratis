package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import com.braze.Constants;
import com.braze.h2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B7\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u0082\u0001\u0004\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;", "", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "size", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", MessageBundle.TITLE_ENTRY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getSize", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "getTitle", "sealedCopy", "Idle", "Error", "Success", "Loading", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState$Error;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState$Idle;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState$Loading;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState$Success;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConversationExtensionState {

    @NotNull
    private final List<String> backStack;

    @NotNull
    private final MessagingTheme messagingTheme;

    @NotNull
    private final String size;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState$Error;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "size", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", MessageBundle.TITLE_ENTRY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getSize", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "getTitle", "sealedCopy", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends ConversationExtensionState {

        @NotNull
        private final List<String> backStack;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final String size;

        @NotNull
        private final String title;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull MessagingTheme messagingTheme, @NotNull String str3) {
            super(list, str, str2, messagingTheme, str3, null);
            list.getClass();
            str.getClass();
            str2.getClass();
            messagingTheme.getClass();
            str3.getClass();
            this.backStack = list;
            this.url = str;
            this.size = str2;
            this.messagingTheme = messagingTheme;
            this.title = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, List list, String str, String str2, MessagingTheme messagingTheme, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = error.backStack;
            }
            if ((i11 & 2) != 0) {
                str = error.url;
            }
            if ((i11 & 4) != 0) {
                str2 = error.size;
            }
            if ((i11 & 8) != 0) {
                messagingTheme = error.messagingTheme;
            }
            if ((i11 & 16) != 0) {
                str3 = error.title;
            }
            String str4 = str3;
            String str5 = str2;
            return error.copy(list, str, str5, messagingTheme, str4);
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
        public final String getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Error copy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title) {
            backStack.getClass();
            url.getClass();
            size.getClass();
            messagingTheme.getClass();
            title.getClass();
            return new Error(backStack, url, size, messagingTheme, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.backStack, error.backStack) && Intrinsics.areEqual(this.url, error.url) && Intrinsics.areEqual(this.size, error.size) && Intrinsics.areEqual(this.messagingTheme, error.messagingTheme) && Intrinsics.areEqual(this.title, error.title);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public List<String> getBackStack() {
            return this.backStack;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getSize() {
            return this.size;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getTitle() {
            return this.title;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.title.hashCode() + ((this.messagingTheme.hashCode() + l1.b(l1.b(this.backStack.hashCode() * 31, 31, this.url), 31, this.size)) * 31);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public ConversationExtensionState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title) {
            backStack.getClass();
            url.getClass();
            size.getClass();
            messagingTheme.getClass();
            title.getClass();
            return copy(backStack, url, size, messagingTheme, title);
        }

        @NotNull
        public String toString() {
            List<String> list = this.backStack;
            String str = this.url;
            String str2 = this.size;
            MessagingTheme messagingTheme = this.messagingTheme;
            String str3 = this.title;
            StringBuilder sb2 = new StringBuilder("Error(backStack=");
            sb2.append(list);
            sb2.append(", url=");
            sb2.append(str);
            sb2.append(", size=");
            sb2.append(str2);
            sb2.append(", messagingTheme=");
            sb2.append(messagingTheme);
            sb2.append(", title=");
            return k.p(sb2, str3, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState$Idle;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "size", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", MessageBundle.TITLE_ENTRY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getSize", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "getTitle", "sealedCopy", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle extends ConversationExtensionState {

        @NotNull
        private final List<String> backStack;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final String size;

        @NotNull
        private final String title;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Idle(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull MessagingTheme messagingTheme, @NotNull String str3) {
            super(list, str, str2, messagingTheme, str3, null);
            list.getClass();
            str.getClass();
            str2.getClass();
            messagingTheme.getClass();
            str3.getClass();
            this.backStack = list;
            this.url = str;
            this.size = str2;
            this.messagingTheme = messagingTheme;
            this.title = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Idle copy$default(Idle idle, List list, String str, String str2, MessagingTheme messagingTheme, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = idle.backStack;
            }
            if ((i11 & 2) != 0) {
                str = idle.url;
            }
            if ((i11 & 4) != 0) {
                str2 = idle.size;
            }
            if ((i11 & 8) != 0) {
                messagingTheme = idle.messagingTheme;
            }
            if ((i11 & 16) != 0) {
                str3 = idle.title;
            }
            String str4 = str3;
            String str5 = str2;
            return idle.copy(list, str, str5, messagingTheme, str4);
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
        public final String getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Idle copy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title) {
            backStack.getClass();
            url.getClass();
            size.getClass();
            messagingTheme.getClass();
            title.getClass();
            return new Idle(backStack, url, size, messagingTheme, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Idle)) {
                return false;
            }
            Idle idle = (Idle) other;
            return Intrinsics.areEqual(this.backStack, idle.backStack) && Intrinsics.areEqual(this.url, idle.url) && Intrinsics.areEqual(this.size, idle.size) && Intrinsics.areEqual(this.messagingTheme, idle.messagingTheme) && Intrinsics.areEqual(this.title, idle.title);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public List<String> getBackStack() {
            return this.backStack;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getSize() {
            return this.size;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getTitle() {
            return this.title;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.title.hashCode() + ((this.messagingTheme.hashCode() + l1.b(l1.b(this.backStack.hashCode() * 31, 31, this.url), 31, this.size)) * 31);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public ConversationExtensionState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title) {
            backStack.getClass();
            url.getClass();
            size.getClass();
            messagingTheme.getClass();
            title.getClass();
            return copy(backStack, url, size, messagingTheme, title);
        }

        @NotNull
        public String toString() {
            List<String> list = this.backStack;
            String str = this.url;
            String str2 = this.size;
            MessagingTheme messagingTheme = this.messagingTheme;
            String str3 = this.title;
            StringBuilder sb2 = new StringBuilder("Idle(backStack=");
            sb2.append(list);
            sb2.append(", url=");
            sb2.append(str);
            sb2.append(", size=");
            sb2.append(str2);
            sb2.append(", messagingTheme=");
            sb2.append(messagingTheme);
            sb2.append(", title=");
            return k.p(sb2, str3, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState$Loading;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "size", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", MessageBundle.TITLE_ENTRY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getSize", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "getTitle", "sealedCopy", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading extends ConversationExtensionState {

        @NotNull
        private final List<String> backStack;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final String size;

        @NotNull
        private final String title;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull MessagingTheme messagingTheme, @NotNull String str3) {
            super(list, str, str2, messagingTheme, str3, null);
            list.getClass();
            str.getClass();
            str2.getClass();
            messagingTheme.getClass();
            str3.getClass();
            this.backStack = list;
            this.url = str;
            this.size = str2;
            this.messagingTheme = messagingTheme;
            this.title = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loading copy$default(Loading loading, List list, String str, String str2, MessagingTheme messagingTheme, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = loading.backStack;
            }
            if ((i11 & 2) != 0) {
                str = loading.url;
            }
            if ((i11 & 4) != 0) {
                str2 = loading.size;
            }
            if ((i11 & 8) != 0) {
                messagingTheme = loading.messagingTheme;
            }
            if ((i11 & 16) != 0) {
                str3 = loading.title;
            }
            String str4 = str3;
            String str5 = str2;
            return loading.copy(list, str, str5, messagingTheme, str4);
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
        public final String getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Loading copy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title) {
            backStack.getClass();
            url.getClass();
            size.getClass();
            messagingTheme.getClass();
            title.getClass();
            return new Loading(backStack, url, size, messagingTheme, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.areEqual(this.backStack, loading.backStack) && Intrinsics.areEqual(this.url, loading.url) && Intrinsics.areEqual(this.size, loading.size) && Intrinsics.areEqual(this.messagingTheme, loading.messagingTheme) && Intrinsics.areEqual(this.title, loading.title);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public List<String> getBackStack() {
            return this.backStack;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getSize() {
            return this.size;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getTitle() {
            return this.title;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.title.hashCode() + ((this.messagingTheme.hashCode() + l1.b(l1.b(this.backStack.hashCode() * 31, 31, this.url), 31, this.size)) * 31);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public ConversationExtensionState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title) {
            backStack.getClass();
            url.getClass();
            size.getClass();
            messagingTheme.getClass();
            title.getClass();
            return copy(backStack, url, size, messagingTheme, title);
        }

        @NotNull
        public String toString() {
            List<String> list = this.backStack;
            String str = this.url;
            String str2 = this.size;
            MessagingTheme messagingTheme = this.messagingTheme;
            String str3 = this.title;
            StringBuilder sb2 = new StringBuilder("Loading(backStack=");
            sb2.append(list);
            sb2.append(", url=");
            sb2.append(str);
            sb2.append(", size=");
            sb2.append(str2);
            sb2.append(", messagingTheme=");
            sb2.append(messagingTheme);
            sb2.append(", title=");
            return k.p(sb2, str3, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState$Success;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;", "backStack", "", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "size", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", MessageBundle.TITLE_ENTRY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;)V", "getBackStack", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "getSize", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "getTitle", "sealedCopy", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends ConversationExtensionState {

        @NotNull
        private final List<String> backStack;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final String size;

        @NotNull
        private final String title;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull MessagingTheme messagingTheme, @NotNull String str3) {
            super(list, str, str2, messagingTheme, str3, null);
            list.getClass();
            str.getClass();
            str2.getClass();
            messagingTheme.getClass();
            str3.getClass();
            this.backStack = list;
            this.url = str;
            this.size = str2;
            this.messagingTheme = messagingTheme;
            this.title = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, String str, String str2, MessagingTheme messagingTheme, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = success.backStack;
            }
            if ((i11 & 2) != 0) {
                str = success.url;
            }
            if ((i11 & 4) != 0) {
                str2 = success.size;
            }
            if ((i11 & 8) != 0) {
                messagingTheme = success.messagingTheme;
            }
            if ((i11 & 16) != 0) {
                str3 = success.title;
            }
            String str4 = str3;
            String str5 = str2;
            return success.copy(list, str, str5, messagingTheme, str4);
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
        public final String getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Success copy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title) {
            backStack.getClass();
            url.getClass();
            size.getClass();
            messagingTheme.getClass();
            title.getClass();
            return new Success(backStack, url, size, messagingTheme, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.backStack, success.backStack) && Intrinsics.areEqual(this.url, success.url) && Intrinsics.areEqual(this.size, success.size) && Intrinsics.areEqual(this.messagingTheme, success.messagingTheme) && Intrinsics.areEqual(this.title, success.title);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public List<String> getBackStack() {
            return this.backStack;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getSize() {
            return this.size;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getTitle() {
            return this.title;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.title.hashCode() + ((this.messagingTheme.hashCode() + l1.b(l1.b(this.backStack.hashCode() * 31, 31, this.url), 31, this.size)) * 31);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState
        @NotNull
        public ConversationExtensionState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title) {
            backStack.getClass();
            url.getClass();
            size.getClass();
            messagingTheme.getClass();
            title.getClass();
            return copy(backStack, url, size, messagingTheme, title);
        }

        @NotNull
        public String toString() {
            List<String> list = this.backStack;
            String str = this.url;
            String str2 = this.size;
            MessagingTheme messagingTheme = this.messagingTheme;
            String str3 = this.title;
            StringBuilder sb2 = new StringBuilder("Success(backStack=");
            sb2.append(list);
            sb2.append(", url=");
            sb2.append(str);
            sb2.append(", size=");
            sb2.append(str2);
            sb2.append(", messagingTheme=");
            sb2.append(messagingTheme);
            sb2.append(", title=");
            return k.p(sb2, str3, ")");
        }
    }

    private ConversationExtensionState(List<String> list, String str, String str2, MessagingTheme messagingTheme, String str3) {
        this.backStack = list;
        this.url = str;
        this.size = str2;
        this.messagingTheme = messagingTheme;
        this.title = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationExtensionState sealedCopy$default(ConversationExtensionState conversationExtensionState, List list, String str, String str2, MessagingTheme messagingTheme, String str3, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: sealedCopy");
            return null;
        }
        if ((i11 & 1) != 0) {
            list = conversationExtensionState.getBackStack();
        }
        if ((i11 & 2) != 0) {
            str = conversationExtensionState.getUrl();
        }
        if ((i11 & 4) != 0) {
            str2 = conversationExtensionState.getSize();
        }
        if ((i11 & 8) != 0) {
            messagingTheme = conversationExtensionState.getMessagingTheme();
        }
        if ((i11 & 16) != 0) {
            str3 = conversationExtensionState.getTitle();
        }
        String str4 = str3;
        String str5 = str2;
        return conversationExtensionState.sealedCopy(list, str, str5, messagingTheme, str4);
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
    public String getSize() {
        return this.size;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    @NotNull
    public String getUrl() {
        return this.url;
    }

    @NotNull
    public abstract ConversationExtensionState sealedCopy(@NotNull List<String> backStack, @NotNull String url, @NotNull String size, @NotNull MessagingTheme messagingTheme, @NotNull String title);

    public /* synthetic */ ConversationExtensionState(List list, String str, String str2, MessagingTheme messagingTheme, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, messagingTheme, str3);
    }
}
