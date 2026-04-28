package zendesk.messaging.android.internal.conversationscreen;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.Message;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.UploadFile;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "", "<init>", "()V", "SendTextMessage", "UploadFiles", "UploadFilesForRestoredUris", "ResendFailedMessage", "SendFormResponse", "SendActivityData", "RetryConnection", "ShowDeniedPermission", "HideDeniedPermission", "SeeLatestViewClicked", "PersistComposerText", "LoadMoreMessages", "RetryLoadConversation", "SendPostbackMessage", "PostbackBannerDismissed", "FormFocusChanged", "ViewAttachment", "CheckPollingStatus", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$CheckPollingStatus;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$FormFocusChanged;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$HideDeniedPermission;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$LoadMoreMessages;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$PersistComposerText;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$PostbackBannerDismissed;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$ResendFailedMessage;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$RetryConnection;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$RetryLoadConversation;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SeeLatestViewClicked;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendActivityData;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendFormResponse;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendPostbackMessage;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendTextMessage;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$ShowDeniedPermission;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$UploadFiles;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$UploadFilesForRestoredUris;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$ViewAttachment;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConversationScreenAction {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$CheckPollingStatus;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckPollingStatus extends ConversationScreenAction {

        @NotNull
        public static final CheckPollingStatus INSTANCE = new CheckPollingStatus();

        private CheckPollingStatus() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CheckPollingStatus);
        }

        public int hashCode() {
            return -1575307891;
        }

        @NotNull
        public String toString() {
            return "CheckPollingStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$FormFocusChanged;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "isFocused", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormFocusChanged extends ConversationScreenAction {
        private final boolean isFocused;

        public FormFocusChanged(boolean z11) {
            super(null);
            this.isFocused = z11;
        }

        public static /* synthetic */ FormFocusChanged copy$default(FormFocusChanged formFocusChanged, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = formFocusChanged.isFocused;
            }
            return formFocusChanged.copy(z11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsFocused() {
            return this.isFocused;
        }

        @NotNull
        public final FormFocusChanged copy(boolean isFocused) {
            return new FormFocusChanged(isFocused);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FormFocusChanged) && this.isFocused == ((FormFocusChanged) other).isFocused;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFocused);
        }

        public final boolean isFocused() {
            return this.isFocused;
        }

        @NotNull
        public String toString() {
            return org.bouncycastle.jcajce.provider.asymmetric.a.f("FormFocusChanged(isFocused=", ")", this.isFocused);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$HideDeniedPermission;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HideDeniedPermission extends ConversationScreenAction {

        @NotNull
        public static final HideDeniedPermission INSTANCE = new HideDeniedPermission();

        private HideDeniedPermission() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$LoadMoreMessages;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "conversationId", "", "beforeTimestamp", "", "<init>", "(Ljava/lang/String;D)V", "getConversationId", "()Ljava/lang/String;", "getBeforeTimestamp", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadMoreMessages extends ConversationScreenAction {
        private final double beforeTimestamp;

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMoreMessages(@NotNull String str, double d3) {
            super(null);
            str.getClass();
            this.conversationId = str;
            this.beforeTimestamp = d3;
        }

        public static /* synthetic */ LoadMoreMessages copy$default(LoadMoreMessages loadMoreMessages, String str, double d3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = loadMoreMessages.conversationId;
            }
            if ((i11 & 2) != 0) {
                d3 = loadMoreMessages.beforeTimestamp;
            }
            return loadMoreMessages.copy(str, d3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getBeforeTimestamp() {
            return this.beforeTimestamp;
        }

        @NotNull
        public final LoadMoreMessages copy(@NotNull String conversationId, double beforeTimestamp) {
            conversationId.getClass();
            return new LoadMoreMessages(conversationId, beforeTimestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMoreMessages)) {
                return false;
            }
            LoadMoreMessages loadMoreMessages = (LoadMoreMessages) other;
            return Intrinsics.areEqual(this.conversationId, loadMoreMessages.conversationId) && Double.compare(this.beforeTimestamp, loadMoreMessages.beforeTimestamp) == 0;
        }

        public final double getBeforeTimestamp() {
            return this.beforeTimestamp;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return Double.hashCode(this.beforeTimestamp) + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "LoadMoreMessages(conversationId=" + this.conversationId + ", beforeTimestamp=" + this.beforeTimestamp + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$PersistComposerText;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "conversationId", "", "composerText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getComposerText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PersistComposerText extends ConversationScreenAction {

        @NotNull
        private final String composerText;

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersistComposerText(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.conversationId = str;
            this.composerText = str2;
        }

        public static /* synthetic */ PersistComposerText copy$default(PersistComposerText persistComposerText, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = persistComposerText.conversationId;
            }
            if ((i11 & 2) != 0) {
                str2 = persistComposerText.composerText;
            }
            return persistComposerText.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getComposerText() {
            return this.composerText;
        }

        @NotNull
        public final PersistComposerText copy(@NotNull String conversationId, @NotNull String composerText) {
            conversationId.getClass();
            composerText.getClass();
            return new PersistComposerText(conversationId, composerText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersistComposerText)) {
                return false;
            }
            PersistComposerText persistComposerText = (PersistComposerText) other;
            return Intrinsics.areEqual(this.conversationId, persistComposerText.conversationId) && Intrinsics.areEqual(this.composerText, persistComposerText.composerText);
        }

        @NotNull
        public final String getComposerText() {
            return this.composerText;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.composerText.hashCode() + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return org.bouncycastle.jcajce.provider.asymmetric.a.d("PersistComposerText(conversationId=", this.conversationId, ", composerText=", this.composerText, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$PostbackBannerDismissed;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PostbackBannerDismissed extends ConversationScreenAction {

        @NotNull
        public static final PostbackBannerDismissed INSTANCE = new PostbackBannerDismissed();

        private PostbackBannerDismissed() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$ResendFailedMessage;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "failedMessage", "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", "<init>", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;)V", "getFailedMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ResendFailedMessage extends ConversationScreenAction {

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message failedMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResendFailedMessage(@NotNull Message message, @NotNull String str) {
            super(null);
            message.getClass();
            str.getClass();
            this.failedMessage = message;
            this.conversationId = str;
        }

        public static /* synthetic */ ResendFailedMessage copy$default(ResendFailedMessage resendFailedMessage, Message message, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = resendFailedMessage.failedMessage;
            }
            if ((i11 & 2) != 0) {
                str = resendFailedMessage.conversationId;
            }
            return resendFailedMessage.copy(message, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getFailedMessage() {
            return this.failedMessage;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final ResendFailedMessage copy(@NotNull Message failedMessage, @NotNull String conversationId) {
            failedMessage.getClass();
            conversationId.getClass();
            return new ResendFailedMessage(failedMessage, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResendFailedMessage)) {
                return false;
            }
            ResendFailedMessage resendFailedMessage = (ResendFailedMessage) other;
            return Intrinsics.areEqual(this.failedMessage, resendFailedMessage.failedMessage) && Intrinsics.areEqual(this.conversationId, resendFailedMessage.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Message getFailedMessage() {
            return this.failedMessage;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.failedMessage.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ResendFailedMessage(failedMessage=" + this.failedMessage + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$RetryConnection;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RetryConnection extends ConversationScreenAction {

        @NotNull
        public static final RetryConnection INSTANCE = new RetryConnection();

        private RetryConnection() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$RetryLoadConversation;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RetryLoadConversation extends ConversationScreenAction {

        @NotNull
        public static final RetryLoadConversation INSTANCE = new RetryLoadConversation();

        private RetryLoadConversation() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SeeLatestViewClicked;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SeeLatestViewClicked extends ConversationScreenAction {

        @NotNull
        public static final SeeLatestViewClicked INSTANCE = new SeeLatestViewClicked();

        private SeeLatestViewClicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendActivityData;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "activityData", "Lzendesk/conversationkit/android/model/ActivityData;", "conversationId", "", "<init>", "(Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;)V", "getActivityData", "()Lzendesk/conversationkit/android/model/ActivityData;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendActivityData extends ConversationScreenAction {

        @NotNull
        private final ActivityData activityData;

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendActivityData(@NotNull ActivityData activityData, @NotNull String str) {
            super(null);
            activityData.getClass();
            str.getClass();
            this.activityData = activityData;
            this.conversationId = str;
        }

        public static /* synthetic */ SendActivityData copy$default(SendActivityData sendActivityData, ActivityData activityData, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                activityData = sendActivityData.activityData;
            }
            if ((i11 & 2) != 0) {
                str = sendActivityData.conversationId;
            }
            return sendActivityData.copy(activityData, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ActivityData getActivityData() {
            return this.activityData;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final SendActivityData copy(@NotNull ActivityData activityData, @NotNull String conversationId) {
            activityData.getClass();
            conversationId.getClass();
            return new SendActivityData(activityData, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendActivityData)) {
                return false;
            }
            SendActivityData sendActivityData = (SendActivityData) other;
            return this.activityData == sendActivityData.activityData && Intrinsics.areEqual(this.conversationId, sendActivityData.conversationId);
        }

        @NotNull
        public final ActivityData getActivityData() {
            return this.activityData;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.activityData.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SendActivityData(activityData=" + this.activityData + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendFormResponse;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "fields", "", "Lzendesk/conversationkit/android/model/Field;", "formMessageContainer", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "conversationId", "", "<init>", "(Ljava/util/List;Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;Ljava/lang/String;)V", "getFields", "()Ljava/util/List;", "getFormMessageContainer", "()Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendFormResponse extends ConversationScreenAction {

        @NotNull
        private final String conversationId;

        @NotNull
        private final List<Field> fields;

        @NotNull
        private final MessageLogEntry.FormMessageContainer formMessageContainer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SendFormResponse(@NotNull List<? extends Field> list, @NotNull MessageLogEntry.FormMessageContainer formMessageContainer, @NotNull String str) {
            super(null);
            list.getClass();
            formMessageContainer.getClass();
            str.getClass();
            this.fields = list;
            this.formMessageContainer = formMessageContainer;
            this.conversationId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SendFormResponse copy$default(SendFormResponse sendFormResponse, List list, MessageLogEntry.FormMessageContainer formMessageContainer, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = sendFormResponse.fields;
            }
            if ((i11 & 2) != 0) {
                formMessageContainer = sendFormResponse.formMessageContainer;
            }
            if ((i11 & 4) != 0) {
                str = sendFormResponse.conversationId;
            }
            return sendFormResponse.copy(list, formMessageContainer, str);
        }

        @NotNull
        public final List<Field> component1() {
            return this.fields;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageLogEntry.FormMessageContainer getFormMessageContainer() {
            return this.formMessageContainer;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final SendFormResponse copy(@NotNull List<? extends Field> fields, @NotNull MessageLogEntry.FormMessageContainer formMessageContainer, @NotNull String conversationId) {
            fields.getClass();
            formMessageContainer.getClass();
            conversationId.getClass();
            return new SendFormResponse(fields, formMessageContainer, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendFormResponse)) {
                return false;
            }
            SendFormResponse sendFormResponse = (SendFormResponse) other;
            return Intrinsics.areEqual(this.fields, sendFormResponse.fields) && Intrinsics.areEqual(this.formMessageContainer, sendFormResponse.formMessageContainer) && Intrinsics.areEqual(this.conversationId, sendFormResponse.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final List<Field> getFields() {
            return this.fields;
        }

        @NotNull
        public final MessageLogEntry.FormMessageContainer getFormMessageContainer() {
            return this.formMessageContainer;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + ((this.formMessageContainer.hashCode() + (this.fields.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            List<Field> list = this.fields;
            MessageLogEntry.FormMessageContainer formMessageContainer = this.formMessageContainer;
            String str = this.conversationId;
            StringBuilder sb2 = new StringBuilder("SendFormResponse(fields=");
            sb2.append(list);
            sb2.append(", formMessageContainer=");
            sb2.append(formMessageContainer);
            sb2.append(", conversationId=");
            return r8.k.p(sb2, str, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendPostbackMessage;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "conversationId", "", "actionId", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getActionId", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendPostbackMessage extends ConversationScreenAction {

        @NotNull
        private final String actionId;

        @NotNull
        private final String conversationId;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendPostbackMessage(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            a0.C(str, str2, str3);
            this.conversationId = str;
            this.actionId = str2;
            this.text = str3;
        }

        public static /* synthetic */ SendPostbackMessage copy$default(SendPostbackMessage sendPostbackMessage, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sendPostbackMessage.conversationId;
            }
            if ((i11 & 2) != 0) {
                str2 = sendPostbackMessage.actionId;
            }
            if ((i11 & 4) != 0) {
                str3 = sendPostbackMessage.text;
            }
            return sendPostbackMessage.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final SendPostbackMessage copy(@NotNull String conversationId, @NotNull String actionId, @NotNull String text) {
            conversationId.getClass();
            actionId.getClass();
            text.getClass();
            return new SendPostbackMessage(conversationId, actionId, text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendPostbackMessage)) {
                return false;
            }
            SendPostbackMessage sendPostbackMessage = (SendPostbackMessage) other;
            return Intrinsics.areEqual(this.conversationId, sendPostbackMessage.conversationId) && Intrinsics.areEqual(this.actionId, sendPostbackMessage.actionId) && Intrinsics.areEqual(this.text, sendPostbackMessage.text);
        }

        @NotNull
        public final String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + l1.b(this.conversationId.hashCode() * 31, 31, this.actionId);
        }

        @NotNull
        public String toString() {
            String str = this.conversationId;
            String str2 = this.actionId;
            return r8.k.p(e0.f.t("SendPostbackMessage(conversationId=", str, ", actionId=", str2, ", text="), this.text, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$ShowDeniedPermission;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowDeniedPermission extends ConversationScreenAction {

        @NotNull
        public static final ShowDeniedPermission INSTANCE = new ShowDeniedPermission();

        private ShowDeniedPermission() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$UploadFiles;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "uploads", "", "Lzendesk/messaging/android/internal/model/UploadFile;", "conversationId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getUploads", "()Ljava/util/List;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UploadFiles extends ConversationScreenAction {

        @NotNull
        private final String conversationId;

        @NotNull
        private final List<UploadFile> uploads;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadFiles(@NotNull List<UploadFile> list, @NotNull String str) {
            super(null);
            list.getClass();
            str.getClass();
            this.uploads = list;
            this.conversationId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UploadFiles copy$default(UploadFiles uploadFiles, List list, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = uploadFiles.uploads;
            }
            if ((i11 & 2) != 0) {
                str = uploadFiles.conversationId;
            }
            return uploadFiles.copy(list, str);
        }

        @NotNull
        public final List<UploadFile> component1() {
            return this.uploads;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final UploadFiles copy(@NotNull List<UploadFile> uploads, @NotNull String conversationId) {
            uploads.getClass();
            conversationId.getClass();
            return new UploadFiles(uploads, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadFiles)) {
                return false;
            }
            UploadFiles uploadFiles = (UploadFiles) other;
            return Intrinsics.areEqual(this.uploads, uploadFiles.uploads) && Intrinsics.areEqual(this.conversationId, uploadFiles.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final List<UploadFile> getUploads() {
            return this.uploads;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.uploads.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UploadFiles(uploads=" + this.uploads + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$UploadFilesForRestoredUris;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UploadFilesForRestoredUris extends ConversationScreenAction {

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadFilesForRestoredUris(@NotNull String str) {
            super(null);
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ UploadFilesForRestoredUris copy$default(UploadFilesForRestoredUris uploadFilesForRestoredUris, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uploadFilesForRestoredUris.conversationId;
            }
            return uploadFilesForRestoredUris.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final UploadFilesForRestoredUris copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new UploadFilesForRestoredUris(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadFilesForRestoredUris) && Intrinsics.areEqual(this.conversationId, ((UploadFilesForRestoredUris) other).conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("UploadFilesForRestoredUris(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$ViewAttachment;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "<init>", "(Lzendesk/conversationkit/android/model/Message;)V", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewAttachment extends ConversationScreenAction {

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewAttachment(@NotNull Message message) {
            super(null);
            message.getClass();
            this.message = message;
        }

        public static /* synthetic */ ViewAttachment copy$default(ViewAttachment viewAttachment, Message message, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = viewAttachment.message;
            }
            return viewAttachment.copy(message);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final ViewAttachment copy(@NotNull Message message) {
            message.getClass();
            return new ViewAttachment(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewAttachment) && Intrinsics.areEqual(this.message, ((ViewAttachment) other).message);
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "ViewAttachment(message=" + this.message + ")";
        }
    }

    public /* synthetic */ ConversationScreenAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConversationScreenAction() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendTextMessage;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction;", "textMessage", "", "payload", "metadata", "", "", "conversationId", "messageSource", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendTextMessage$TextMessageSource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendTextMessage$TextMessageSource;)V", "getTextMessage", "()Ljava/lang/String;", "getPayload", "getMetadata", "()Ljava/util/Map;", "getConversationId", "getMessageSource", "()Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendTextMessage$TextMessageSource;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TextMessageSource", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendTextMessage extends ConversationScreenAction {

        @NotNull
        private final String conversationId;

        @NotNull
        private final TextMessageSource messageSource;

        @NotNull
        private final Map<String, Object> metadata;

        @Nullable
        private final String payload;

        @NotNull
        private final String textMessage;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenAction$SendTextMessage$TextMessageSource;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT_FIELD", "QUICK_REPLY", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TextMessageSource {
            private static final /* synthetic */ a80.a $ENTRIES;
            private static final /* synthetic */ TextMessageSource[] $VALUES;
            public static final TextMessageSource INPUT_FIELD = new TextMessageSource("INPUT_FIELD", 0);
            public static final TextMessageSource QUICK_REPLY = new TextMessageSource("QUICK_REPLY", 1);

            private static final /* synthetic */ TextMessageSource[] $values() {
                return new TextMessageSource[]{INPUT_FIELD, QUICK_REPLY};
            }

            static {
                TextMessageSource[] textMessageSourceArr$values = $values();
                $VALUES = textMessageSourceArr$values;
                $ENTRIES = v0.n.w(textMessageSourceArr$values);
            }

            private TextMessageSource(String str, int i11) {
            }

            @NotNull
            public static a80.a getEntries() {
                return $ENTRIES;
            }

            public static TextMessageSource valueOf(String str) {
                return (TextMessageSource) Enum.valueOf(TextMessageSource.class, str);
            }

            public static TextMessageSource[] values() {
                return (TextMessageSource[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendTextMessage(@NotNull String str, @Nullable String str2, @NotNull Map<String, ? extends Object> map, @NotNull String str3, @NotNull TextMessageSource textMessageSource) {
            super(null);
            str.getClass();
            map.getClass();
            str3.getClass();
            textMessageSource.getClass();
            this.textMessage = str;
            this.payload = str2;
            this.metadata = map;
            this.conversationId = str3;
            this.messageSource = textMessageSource;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SendTextMessage copy$default(SendTextMessage sendTextMessage, String str, String str2, Map map, String str3, TextMessageSource textMessageSource, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sendTextMessage.textMessage;
            }
            if ((i11 & 2) != 0) {
                str2 = sendTextMessage.payload;
            }
            if ((i11 & 4) != 0) {
                map = sendTextMessage.metadata;
            }
            if ((i11 & 8) != 0) {
                str3 = sendTextMessage.conversationId;
            }
            if ((i11 & 16) != 0) {
                textMessageSource = sendTextMessage.messageSource;
            }
            TextMessageSource textMessageSource2 = textMessageSource;
            Map map2 = map;
            return sendTextMessage.copy(str, str2, map2, str3, textMessageSource2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTextMessage() {
            return this.textMessage;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        @NotNull
        public final Map<String, Object> component3() {
            return this.metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TextMessageSource getMessageSource() {
            return this.messageSource;
        }

        @NotNull
        public final SendTextMessage copy(@NotNull String textMessage, @Nullable String payload, @NotNull Map<String, ? extends Object> metadata, @NotNull String conversationId, @NotNull TextMessageSource messageSource) {
            textMessage.getClass();
            metadata.getClass();
            conversationId.getClass();
            messageSource.getClass();
            return new SendTextMessage(textMessage, payload, metadata, conversationId, messageSource);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendTextMessage)) {
                return false;
            }
            SendTextMessage sendTextMessage = (SendTextMessage) other;
            return Intrinsics.areEqual(this.textMessage, sendTextMessage.textMessage) && Intrinsics.areEqual(this.payload, sendTextMessage.payload) && Intrinsics.areEqual(this.metadata, sendTextMessage.metadata) && Intrinsics.areEqual(this.conversationId, sendTextMessage.conversationId) && this.messageSource == sendTextMessage.messageSource;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final TextMessageSource getMessageSource() {
            return this.messageSource;
        }

        @NotNull
        public final Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @Nullable
        public final String getPayload() {
            return this.payload;
        }

        @NotNull
        public final String getTextMessage() {
            return this.textMessage;
        }

        public int hashCode() {
            int iHashCode = this.textMessage.hashCode() * 31;
            String str = this.payload;
            return this.messageSource.hashCode() + l1.b(a0.f(this.metadata, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.conversationId);
        }

        @NotNull
        public String toString() {
            String str = this.textMessage;
            String str2 = this.payload;
            Map<String, Object> map = this.metadata;
            String str3 = this.conversationId;
            TextMessageSource textMessageSource = this.messageSource;
            StringBuilder sbT = e0.f.t("SendTextMessage(textMessage=", str, ", payload=", str2, ", metadata=");
            sbT.append(map);
            sbT.append(", conversationId=");
            sbT.append(str3);
            sbT.append(", messageSource=");
            sbT.append(textMessageSource);
            sbT.append(")");
            return sbT.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SendTextMessage(String str, String str2, Map map, String str3, TextMessageSource textMessageSource, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            String str4 = (i11 & 2) != 0 ? null : str2;
            if ((i11 & 4) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            this(str, str4, map, str3, textMessageSource);
        }
    }
}
