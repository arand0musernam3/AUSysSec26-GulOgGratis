package zendesk.messaging.android.internal.conversationscreen;

import com.braze.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent;", "", "LaunchConversationExtension", "OpenFileAttachment", "StartPolling", "StopPolling", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$LaunchConversationExtension;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$OpenFileAttachment;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$StartPolling;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$StopPolling;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationScreenEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$LaunchConversationExtension;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "size", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "conversationId", "sourceType", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "<init>", "(Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageActionSize;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageSourceType;)V", "getUrl", "()Ljava/lang/String;", "getSize", "()Lzendesk/core/ui/android/internal/model/MessageActionSize;", "getConversationId", "getSourceType", "()Lzendesk/core/ui/android/internal/model/MessageSourceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchConversationExtension implements ConversationScreenEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final MessageActionSize size;

        @NotNull
        private final MessageSourceType sourceType;

        @NotNull
        private final String url;

        public LaunchConversationExtension(@NotNull String str, @NotNull MessageActionSize messageActionSize, @NotNull String str2, @NotNull MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            this.url = str;
            this.size = messageActionSize;
            this.conversationId = str2;
            this.sourceType = messageSourceType;
        }

        public static /* synthetic */ LaunchConversationExtension copy$default(LaunchConversationExtension launchConversationExtension, String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = launchConversationExtension.url;
            }
            if ((i11 & 2) != 0) {
                messageActionSize = launchConversationExtension.size;
            }
            if ((i11 & 4) != 0) {
                str2 = launchConversationExtension.conversationId;
            }
            if ((i11 & 8) != 0) {
                messageSourceType = launchConversationExtension.sourceType;
            }
            return launchConversationExtension.copy(str, messageActionSize, str2, messageSourceType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageActionSize getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final LaunchConversationExtension copy(@NotNull String url, @NotNull MessageActionSize size, @NotNull String conversationId, @NotNull MessageSourceType sourceType) {
            url.getClass();
            size.getClass();
            conversationId.getClass();
            sourceType.getClass();
            return new LaunchConversationExtension(url, size, conversationId, sourceType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LaunchConversationExtension)) {
                return false;
            }
            LaunchConversationExtension launchConversationExtension = (LaunchConversationExtension) other;
            return Intrinsics.areEqual(this.url, launchConversationExtension.url) && this.size == launchConversationExtension.size && Intrinsics.areEqual(this.conversationId, launchConversationExtension.conversationId) && this.sourceType == launchConversationExtension.sourceType;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final MessageActionSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageSourceType getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.sourceType.hashCode() + l1.b((this.size.hashCode() + (this.url.hashCode() * 31)) * 31, 31, this.conversationId);
        }

        @NotNull
        public String toString() {
            return "LaunchConversationExtension(url=" + this.url + ", size=" + this.size + ", conversationId=" + this.conversationId + ", sourceType=" + this.sourceType + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$OpenFileAttachment;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent;", "file", "Ljava/io/File;", "mimeType", "", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getMimeType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenFileAttachment implements ConversationScreenEvent {

        @NotNull
        private final File file;

        @NotNull
        private final String mimeType;

        public OpenFileAttachment(@NotNull File file, @NotNull String str) {
            file.getClass();
            str.getClass();
            this.file = file;
            this.mimeType = str;
        }

        public static /* synthetic */ OpenFileAttachment copy$default(OpenFileAttachment openFileAttachment, File file, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                file = openFileAttachment.file;
            }
            if ((i11 & 2) != 0) {
                str = openFileAttachment.mimeType;
            }
            return openFileAttachment.copy(file, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        public final OpenFileAttachment copy(@NotNull File file, @NotNull String mimeType) {
            file.getClass();
            mimeType.getClass();
            return new OpenFileAttachment(file, mimeType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenFileAttachment)) {
                return false;
            }
            OpenFileAttachment openFileAttachment = (OpenFileAttachment) other;
            return Intrinsics.areEqual(this.file, openFileAttachment.file) && Intrinsics.areEqual(this.mimeType, openFileAttachment.mimeType);
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }

        @NotNull
        public final String getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            return this.mimeType.hashCode() + (this.file.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OpenFileAttachment(file=" + this.file + ", mimeType=" + this.mimeType + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$StartPolling;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartPolling implements ConversationScreenEvent {

        @NotNull
        public static final StartPolling INSTANCE = new StartPolling();

        private StartPolling() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof StartPolling);
        }

        public int hashCode() {
            return -342571091;
        }

        @NotNull
        public String toString() {
            return "StartPolling";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent$StopPolling;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StopPolling implements ConversationScreenEvent {

        @NotNull
        public static final StopPolling INSTANCE = new StopPolling();

        private StopPolling() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof StopPolling);
        }

        public int hashCode() {
            return 2064221493;
        }

        @NotNull
        public String toString() {
            return "StopPolling";
        }
    }
}
