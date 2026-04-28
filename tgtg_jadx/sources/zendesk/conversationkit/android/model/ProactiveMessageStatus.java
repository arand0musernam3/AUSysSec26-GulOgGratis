package zendesk.conversationkit.android.model;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lzendesk/conversationkit/android/model/ProactiveMessageStatus;", "", "<init>", "()V", "NotificationWillDisplay", "NotificationHasBeenDisplayed", "NotificationHasBeenClicked", "ConversationHasBeenRepliedTo", "NotificationCannotBeDisplayed", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus$ConversationHasBeenRepliedTo;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus$NotificationCannotBeDisplayed;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus$NotificationHasBeenClicked;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus$NotificationHasBeenDisplayed;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus$NotificationWillDisplay;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ProactiveMessageStatus {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/model/ProactiveMessageStatus$ConversationHasBeenRepliedTo;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus;", "proactiveMessage", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "<init>", "(Lzendesk/conversationkit/android/model/ProactiveMessage;)V", "getProactiveMessage", "()Lzendesk/conversationkit/android/model/ProactiveMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationHasBeenRepliedTo extends ProactiveMessageStatus {

        @NotNull
        private final ProactiveMessage proactiveMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationHasBeenRepliedTo(@NotNull ProactiveMessage proactiveMessage) {
            super(null);
            proactiveMessage.getClass();
            this.proactiveMessage = proactiveMessage;
        }

        public static /* synthetic */ ConversationHasBeenRepliedTo copy$default(ConversationHasBeenRepliedTo conversationHasBeenRepliedTo, ProactiveMessage proactiveMessage, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                proactiveMessage = conversationHasBeenRepliedTo.proactiveMessage;
            }
            return conversationHasBeenRepliedTo.copy(proactiveMessage);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        @NotNull
        public final ConversationHasBeenRepliedTo copy(@NotNull ProactiveMessage proactiveMessage) {
            proactiveMessage.getClass();
            return new ConversationHasBeenRepliedTo(proactiveMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationHasBeenRepliedTo) && Intrinsics.areEqual(this.proactiveMessage, ((ConversationHasBeenRepliedTo) other).proactiveMessage);
        }

        @NotNull
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        public int hashCode() {
            return this.proactiveMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConversationHasBeenRepliedTo(proactiveMessage=" + this.proactiveMessage + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/model/ProactiveMessageStatus$NotificationCannotBeDisplayed;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus;", "reason", "", "<init>", "(Ljava/lang/Throwable;)V", "getReason", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationCannotBeDisplayed extends ProactiveMessageStatus {

        @NotNull
        private final Throwable reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationCannotBeDisplayed(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.reason = th2;
        }

        public static /* synthetic */ NotificationCannotBeDisplayed copy$default(NotificationCannotBeDisplayed notificationCannotBeDisplayed, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = notificationCannotBeDisplayed.reason;
            }
            return notificationCannotBeDisplayed.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getReason() {
            return this.reason;
        }

        @NotNull
        public final NotificationCannotBeDisplayed copy(@NotNull Throwable reason) {
            reason.getClass();
            return new NotificationCannotBeDisplayed(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotificationCannotBeDisplayed) && Intrinsics.areEqual(this.reason, ((NotificationCannotBeDisplayed) other).reason);
        }

        @NotNull
        public final Throwable getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("NotificationCannotBeDisplayed(reason=", ")", this.reason);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/model/ProactiveMessageStatus$NotificationHasBeenClicked;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus;", "proactiveMessage", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "<init>", "(Lzendesk/conversationkit/android/model/ProactiveMessage;)V", "getProactiveMessage", "()Lzendesk/conversationkit/android/model/ProactiveMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationHasBeenClicked extends ProactiveMessageStatus {

        @NotNull
        private final ProactiveMessage proactiveMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationHasBeenClicked(@NotNull ProactiveMessage proactiveMessage) {
            super(null);
            proactiveMessage.getClass();
            this.proactiveMessage = proactiveMessage;
        }

        public static /* synthetic */ NotificationHasBeenClicked copy$default(NotificationHasBeenClicked notificationHasBeenClicked, ProactiveMessage proactiveMessage, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                proactiveMessage = notificationHasBeenClicked.proactiveMessage;
            }
            return notificationHasBeenClicked.copy(proactiveMessage);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        @NotNull
        public final NotificationHasBeenClicked copy(@NotNull ProactiveMessage proactiveMessage) {
            proactiveMessage.getClass();
            return new NotificationHasBeenClicked(proactiveMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotificationHasBeenClicked) && Intrinsics.areEqual(this.proactiveMessage, ((NotificationHasBeenClicked) other).proactiveMessage);
        }

        @NotNull
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        public int hashCode() {
            return this.proactiveMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotificationHasBeenClicked(proactiveMessage=" + this.proactiveMessage + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/model/ProactiveMessageStatus$NotificationHasBeenDisplayed;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus;", "proactiveMessage", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "<init>", "(Lzendesk/conversationkit/android/model/ProactiveMessage;)V", "getProactiveMessage", "()Lzendesk/conversationkit/android/model/ProactiveMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationHasBeenDisplayed extends ProactiveMessageStatus {

        @NotNull
        private final ProactiveMessage proactiveMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationHasBeenDisplayed(@NotNull ProactiveMessage proactiveMessage) {
            super(null);
            proactiveMessage.getClass();
            this.proactiveMessage = proactiveMessage;
        }

        public static /* synthetic */ NotificationHasBeenDisplayed copy$default(NotificationHasBeenDisplayed notificationHasBeenDisplayed, ProactiveMessage proactiveMessage, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                proactiveMessage = notificationHasBeenDisplayed.proactiveMessage;
            }
            return notificationHasBeenDisplayed.copy(proactiveMessage);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        @NotNull
        public final NotificationHasBeenDisplayed copy(@NotNull ProactiveMessage proactiveMessage) {
            proactiveMessage.getClass();
            return new NotificationHasBeenDisplayed(proactiveMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotificationHasBeenDisplayed) && Intrinsics.areEqual(this.proactiveMessage, ((NotificationHasBeenDisplayed) other).proactiveMessage);
        }

        @NotNull
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        public int hashCode() {
            return this.proactiveMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotificationHasBeenDisplayed(proactiveMessage=" + this.proactiveMessage + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/model/ProactiveMessageStatus$NotificationWillDisplay;", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus;", "proactiveMessage", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "<init>", "(Lzendesk/conversationkit/android/model/ProactiveMessage;)V", "getProactiveMessage", "()Lzendesk/conversationkit/android/model/ProactiveMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationWillDisplay extends ProactiveMessageStatus {

        @NotNull
        private final ProactiveMessage proactiveMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationWillDisplay(@NotNull ProactiveMessage proactiveMessage) {
            super(null);
            proactiveMessage.getClass();
            this.proactiveMessage = proactiveMessage;
        }

        public static /* synthetic */ NotificationWillDisplay copy$default(NotificationWillDisplay notificationWillDisplay, ProactiveMessage proactiveMessage, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                proactiveMessage = notificationWillDisplay.proactiveMessage;
            }
            return notificationWillDisplay.copy(proactiveMessage);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        @NotNull
        public final NotificationWillDisplay copy(@NotNull ProactiveMessage proactiveMessage) {
            proactiveMessage.getClass();
            return new NotificationWillDisplay(proactiveMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotificationWillDisplay) && Intrinsics.areEqual(this.proactiveMessage, ((NotificationWillDisplay) other).proactiveMessage);
        }

        @NotNull
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        public int hashCode() {
            return this.proactiveMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotificationWillDisplay(proactiveMessage=" + this.proactiveMessage + ")";
        }
    }

    public /* synthetic */ ProactiveMessageStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProactiveMessageStatus() {
    }
}
