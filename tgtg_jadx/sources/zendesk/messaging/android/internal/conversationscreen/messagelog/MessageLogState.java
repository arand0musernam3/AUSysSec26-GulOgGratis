package zendesk.messaging.android.internal.conversationscreen.messagelog;

import b3.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.form.DisplayedForm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001<Bu\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\"\u001a\u00020#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÀ\u0003¢\u0006\u0002\b%J\u000e\u0010&\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b'J\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÀ\u0003¢\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b5Jw\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u00107\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\f\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\r\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001e¨\u0006="}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;", "", "messageLogEntryList", "", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "shouldScrollToBottom", "", "mapOfDisplayedFields", "", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "shouldAnnounceMessage", "shouldSeeLatestViewVisible", "showPostbackErrorBanner", "postbackErrorText", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "authorizationToken", "<init>", "(Ljava/util/List;ZLjava/util/Map;ZZZLjava/lang/String;Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;)V", "getMessageLogEntryList$zendesk_messaging_messaging_android", "()Ljava/util/List;", "getShouldScrollToBottom$zendesk_messaging_messaging_android", "()Z", "getMapOfDisplayedFields$zendesk_messaging_messaging_android", "()Ljava/util/Map;", "getShouldAnnounceMessage$zendesk_messaging_messaging_android", "getShouldSeeLatestViewVisible$zendesk_messaging_messaging_android", "getShowPostbackErrorBanner$zendesk_messaging_messaging_android", "getPostbackErrorText$zendesk_messaging_messaging_android", "()Ljava/lang/String;", "getMessagingTheme$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "getAuthorizationToken$zendesk_messaging_messaging_android", "toBuilder", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState$Builder;", "component1", "component1$zendesk_messaging_messaging_android", "component2", "component2$zendesk_messaging_messaging_android", "component3", "component3$zendesk_messaging_messaging_android", "component4", "component4$zendesk_messaging_messaging_android", "component5", "component5$zendesk_messaging_messaging_android", "component6", "component6$zendesk_messaging_messaging_android", "component7", "component7$zendesk_messaging_messaging_android", "component8", "component8$zendesk_messaging_messaging_android", "component9", "component9$zendesk_messaging_messaging_android", "copy", "equals", "other", "hashCode", "", "toString", "Builder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageLogState {

    @Nullable
    private final String authorizationToken;

    @NotNull
    private final Map<String, DisplayedForm> mapOfDisplayedFields;

    @NotNull
    private final List<MessageLogEntry> messageLogEntryList;

    @NotNull
    private final MessagingTheme messagingTheme;

    @NotNull
    private final String postbackErrorText;
    private final boolean shouldAnnounceMessage;
    private final boolean shouldScrollToBottom;
    private final boolean shouldSeeLatestViewVisible;
    private final boolean showPostbackErrorBanner;

    public MessageLogState(List list, boolean z11, Map map, boolean z12, boolean z13, boolean z14, String str, MessagingTheme messagingTheme, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? new LinkedHashMap() : map, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? false : z14, (i11 & 64) != 0 ? "" : str, (i11 & 128) != 0 ? MessagingTheme.INSTANCE.getDEFAULT() : messagingTheme, (i11 & 256) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageLogState copy$default(MessageLogState messageLogState, List list, boolean z11, Map map, boolean z12, boolean z13, boolean z14, String str, MessagingTheme messagingTheme, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = messageLogState.messageLogEntryList;
        }
        if ((i11 & 2) != 0) {
            z11 = messageLogState.shouldScrollToBottom;
        }
        if ((i11 & 4) != 0) {
            map = messageLogState.mapOfDisplayedFields;
        }
        if ((i11 & 8) != 0) {
            z12 = messageLogState.shouldAnnounceMessage;
        }
        if ((i11 & 16) != 0) {
            z13 = messageLogState.shouldSeeLatestViewVisible;
        }
        if ((i11 & 32) != 0) {
            z14 = messageLogState.showPostbackErrorBanner;
        }
        if ((i11 & 64) != 0) {
            str = messageLogState.postbackErrorText;
        }
        if ((i11 & 128) != 0) {
            messagingTheme = messageLogState.messagingTheme;
        }
        if ((i11 & 256) != 0) {
            str2 = messageLogState.authorizationToken;
        }
        MessagingTheme messagingTheme2 = messagingTheme;
        String str3 = str2;
        boolean z15 = z14;
        String str4 = str;
        boolean z16 = z13;
        Map map2 = map;
        return messageLogState.copy(list, z11, map2, z12, z16, z15, str4, messagingTheme2, str3);
    }

    @NotNull
    public final List<MessageLogEntry> component1$zendesk_messaging_messaging_android() {
        return this.messageLogEntryList;
    }

    /* JADX INFO: renamed from: component2$zendesk_messaging_messaging_android, reason: from getter */
    public final boolean getShouldScrollToBottom() {
        return this.shouldScrollToBottom;
    }

    @NotNull
    public final Map<String, DisplayedForm> component3$zendesk_messaging_messaging_android() {
        return this.mapOfDisplayedFields;
    }

    /* JADX INFO: renamed from: component4$zendesk_messaging_messaging_android, reason: from getter */
    public final boolean getShouldAnnounceMessage() {
        return this.shouldAnnounceMessage;
    }

    /* JADX INFO: renamed from: component5$zendesk_messaging_messaging_android, reason: from getter */
    public final boolean getShouldSeeLatestViewVisible() {
        return this.shouldSeeLatestViewVisible;
    }

    /* JADX INFO: renamed from: component6$zendesk_messaging_messaging_android, reason: from getter */
    public final boolean getShowPostbackErrorBanner() {
        return this.showPostbackErrorBanner;
    }

    @NotNull
    /* JADX INFO: renamed from: component7$zendesk_messaging_messaging_android, reason: from getter */
    public final String getPostbackErrorText() {
        return this.postbackErrorText;
    }

    @NotNull
    /* JADX INFO: renamed from: component8$zendesk_messaging_messaging_android, reason: from getter */
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component9$zendesk_messaging_messaging_android, reason: from getter */
    public final String getAuthorizationToken() {
        return this.authorizationToken;
    }

    @NotNull
    public final MessageLogState copy(@NotNull List<? extends MessageLogEntry> messageLogEntryList, boolean shouldScrollToBottom, @NotNull Map<String, DisplayedForm> mapOfDisplayedFields, boolean shouldAnnounceMessage, boolean shouldSeeLatestViewVisible, boolean showPostbackErrorBanner, @NotNull String postbackErrorText, @NotNull MessagingTheme messagingTheme, @Nullable String authorizationToken) {
        messageLogEntryList.getClass();
        mapOfDisplayedFields.getClass();
        postbackErrorText.getClass();
        messagingTheme.getClass();
        return new MessageLogState(messageLogEntryList, shouldScrollToBottom, mapOfDisplayedFields, shouldAnnounceMessage, shouldSeeLatestViewVisible, showPostbackErrorBanner, postbackErrorText, messagingTheme, authorizationToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageLogState)) {
            return false;
        }
        MessageLogState messageLogState = (MessageLogState) other;
        return Intrinsics.areEqual(this.messageLogEntryList, messageLogState.messageLogEntryList) && this.shouldScrollToBottom == messageLogState.shouldScrollToBottom && Intrinsics.areEqual(this.mapOfDisplayedFields, messageLogState.mapOfDisplayedFields) && this.shouldAnnounceMessage == messageLogState.shouldAnnounceMessage && this.shouldSeeLatestViewVisible == messageLogState.shouldSeeLatestViewVisible && this.showPostbackErrorBanner == messageLogState.showPostbackErrorBanner && Intrinsics.areEqual(this.postbackErrorText, messageLogState.postbackErrorText) && Intrinsics.areEqual(this.messagingTheme, messageLogState.messagingTheme) && Intrinsics.areEqual(this.authorizationToken, messageLogState.authorizationToken);
    }

    @Nullable
    public final String getAuthorizationToken$zendesk_messaging_messaging_android() {
        return this.authorizationToken;
    }

    @NotNull
    public final Map<String, DisplayedForm> getMapOfDisplayedFields$zendesk_messaging_messaging_android() {
        return this.mapOfDisplayedFields;
    }

    @NotNull
    public final List<MessageLogEntry> getMessageLogEntryList$zendesk_messaging_messaging_android() {
        return this.messageLogEntryList;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme$zendesk_messaging_messaging_android() {
        return this.messagingTheme;
    }

    @NotNull
    public final String getPostbackErrorText$zendesk_messaging_messaging_android() {
        return this.postbackErrorText;
    }

    public final boolean getShouldAnnounceMessage$zendesk_messaging_messaging_android() {
        return this.shouldAnnounceMessage;
    }

    public final boolean getShouldScrollToBottom$zendesk_messaging_messaging_android() {
        return this.shouldScrollToBottom;
    }

    public final boolean getShouldSeeLatestViewVisible$zendesk_messaging_messaging_android() {
        return this.shouldSeeLatestViewVisible;
    }

    public final boolean getShowPostbackErrorBanner$zendesk_messaging_messaging_android() {
        return this.showPostbackErrorBanner;
    }

    public int hashCode() {
        int iHashCode = (this.messagingTheme.hashCode() + l1.b(k.e(k.e(k.e(a0.f(this.mapOfDisplayedFields, k.e(this.messageLogEntryList.hashCode() * 31, 31, this.shouldScrollToBottom), 31), 31, this.shouldAnnounceMessage), 31, this.shouldSeeLatestViewVisible), 31, this.showPostbackErrorBanner), 31, this.postbackErrorText)) * 31;
        String str = this.authorizationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    @NotNull
    public String toString() {
        List<MessageLogEntry> list = this.messageLogEntryList;
        boolean z11 = this.shouldScrollToBottom;
        Map<String, DisplayedForm> map = this.mapOfDisplayedFields;
        boolean z12 = this.shouldAnnounceMessage;
        boolean z13 = this.shouldSeeLatestViewVisible;
        boolean z14 = this.showPostbackErrorBanner;
        String str = this.postbackErrorText;
        MessagingTheme messagingTheme = this.messagingTheme;
        String str2 = this.authorizationToken;
        StringBuilder sb2 = new StringBuilder("MessageLogState(messageLogEntryList=");
        sb2.append(list);
        sb2.append(", shouldScrollToBottom=");
        sb2.append(z11);
        sb2.append(", mapOfDisplayedFields=");
        sb2.append(map);
        sb2.append(", shouldAnnounceMessage=");
        sb2.append(z12);
        sb2.append(", shouldSeeLatestViewVisible=");
        i.C(sb2, z13, ", showPostbackErrorBanner=", z14, ", postbackErrorText=");
        sb2.append(str);
        sb2.append(", messagingTheme=");
        sb2.append(messagingTheme);
        sb2.append(", authorizationToken=");
        return k.p(sb2, str2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState$Builder;", "", "<init>", "()V", "state", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;", "(Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;)V", "messageLogEntryList", "", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "mapOfDisplayedFields", "", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "shouldScrollToBottom", "", "shouldAnnounceMessage", "shouldSeeLatestViewVisible", "build", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private MessageLogState state;

        public Builder() {
            this.state = new MessageLogState(null, false, null, false, false, false, null, null, null, 511, null);
        }

        @NotNull
        /* JADX INFO: renamed from: build, reason: from getter */
        public final MessageLogState getState() {
            return this.state;
        }

        @NotNull
        public final Builder mapOfDisplayedFields(@NotNull Map<String, DisplayedForm> mapOfDisplayedFields) {
            mapOfDisplayedFields.getClass();
            this.state = MessageLogState.copy$default(this.state, null, false, mapOfDisplayedFields, false, false, false, null, null, null, 507, null);
            return this;
        }

        @NotNull
        public final Builder messageLogEntryList(@NotNull List<? extends MessageLogEntry> messageLogEntryList) {
            messageLogEntryList.getClass();
            this.state = MessageLogState.copy$default(this.state, messageLogEntryList, false, null, false, false, false, null, null, null, 510, null);
            return this;
        }

        @NotNull
        public final Builder shouldAnnounceMessage(boolean shouldAnnounceMessage) {
            this.state = MessageLogState.copy$default(this.state, null, false, null, shouldAnnounceMessage, false, false, null, null, null, 503, null);
            return this;
        }

        @NotNull
        public final Builder shouldScrollToBottom(boolean shouldScrollToBottom) {
            this.state = MessageLogState.copy$default(this.state, null, shouldScrollToBottom, null, false, false, false, null, null, null, 509, null);
            return this;
        }

        @NotNull
        public final Builder shouldSeeLatestViewVisible(boolean shouldSeeLatestViewVisible) {
            this.state = MessageLogState.copy$default(this.state, null, false, null, false, shouldSeeLatestViewVisible, false, null, null, null, 495, null);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull MessageLogState messageLogState) {
            this();
            messageLogState.getClass();
            this.state = messageLogState;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageLogState(@NotNull List<? extends MessageLogEntry> list, boolean z11, @NotNull Map<String, DisplayedForm> map, boolean z12, boolean z13, boolean z14, @NotNull String str, @NotNull MessagingTheme messagingTheme, @Nullable String str2) {
        list.getClass();
        map.getClass();
        str.getClass();
        messagingTheme.getClass();
        this.messageLogEntryList = list;
        this.shouldScrollToBottom = z11;
        this.mapOfDisplayedFields = map;
        this.shouldAnnounceMessage = z12;
        this.shouldSeeLatestViewVisible = z13;
        this.showPostbackErrorBanner = z14;
        this.postbackErrorText = str;
        this.messagingTheme = messagingTheme;
        this.authorizationToken = str2;
    }

    public MessageLogState() {
        this(null, false, null, false, false, false, null, null, null, 511, null);
    }
}
