package zendesk.messaging.android.internal.conversationscreen;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;
import zendesk.messaging.android.internal.model.LoadMoreStatus;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.messaging.android.internal.model.TypingUser;
import zendesk.ui.android.conversation.form.DisplayedForm;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\u0015\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020\u000e\u0012\b\b\u0002\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010W\u001a\u00020\u000eHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010Y\u001a\u00020\u000eHÆ\u0003J\t\u0010Z\u001a\u00020\u000eHÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\t\u0010]\u001a\u00020\u0018HÆ\u0003J\t\u0010^\u001a\u00020\u000eHÆ\u0003J\t\u0010_\u001a\u00020\u001bHÆ\u0003J\t\u0010`\u001a\u00020\u000eHÆ\u0003J\t\u0010a\u001a\u00020\u000eHÆ\u0003J\t\u0010b\u001a\u00020\u000eHÆ\u0003J\t\u0010c\u001a\u00020 HÆ\u0003J\t\u0010d\u001a\u00020\u000eHÆ\u0003J\u0015\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\u0015HÆ\u0003J\t\u0010f\u001a\u00020\u000eHÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010i\u001a\u00020(HÆ\u0003J\t\u0010j\u001a\u00020\u000eHÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J»\u0002\u0010l\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u000e2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\u00152\b\b\u0002\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020\u0005HÆ\u0001J\u0013\u0010m\u001a\u00020\u000e2\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020pHÖ\u0001J\t\u0010q\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0019\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bB\u00108R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u001c\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u00108R\u0011\u0010\u001d\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u0011\u0010\u001e\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u00108R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010!\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bI\u00108R\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\u0015¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0011\u0010$\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bK\u00108R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u00100R\u0013\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u00100R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010)\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u00108R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u00100¨\u0006r"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", MessageBundle.TITLE_ENTRY, "", "description", "toolbarImageUrl", "messageLog", "", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "blockChatInput", "", "connectionStatus", "Lzendesk/conversationkit/android/ConnectionStatus;", "gallerySupported", "cameraSupported", "composerText", "mapOfDisplayedForms", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "typingUser", "Lzendesk/messaging/android/internal/model/TypingUser;", "showDeniedPermission", "loadMoreStatus", "Lzendesk/messaging/android/internal/model/LoadMoreStatus;", "shouldAnnounceMessage", "shouldSeeLatestViewVisible", "isAttachmentsEnabled", "status", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenStatus;", "scrollToTheBottom", "mapOfDisplayedPostbackStatuses", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenPostbackStatus;", "showPostbackErrorBanner", "postbackErrorText", "authorizationToken", "waitTimeBannerType", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "isFormFocused", "accessibilityTitle", "<init>", "(Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/model/Conversation;ZLzendesk/conversationkit/android/ConnectionStatus;ZZLjava/lang/String;Ljava/util/Map;Lzendesk/messaging/android/internal/model/TypingUser;ZLzendesk/messaging/android/internal/model/LoadMoreStatus;ZZZLzendesk/messaging/android/internal/conversationscreen/ConversationScreenStatus;ZLjava/util/Map;ZLjava/lang/String;Ljava/lang/String;Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;ZLjava/lang/String;)V", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "getTitle", "()Ljava/lang/String;", "getDescription", "getToolbarImageUrl", "getMessageLog", "()Ljava/util/List;", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "getBlockChatInput", "()Z", "getConnectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "getGallerySupported", "getCameraSupported", "getComposerText", "getMapOfDisplayedForms", "()Ljava/util/Map;", "getTypingUser", "()Lzendesk/messaging/android/internal/model/TypingUser;", "getShowDeniedPermission", "getLoadMoreStatus", "()Lzendesk/messaging/android/internal/model/LoadMoreStatus;", "getShouldAnnounceMessage", "getShouldSeeLatestViewVisible", "getStatus", "()Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenStatus;", "getScrollToTheBottom", "getMapOfDisplayedPostbackStatuses", "getShowPostbackErrorBanner", "getPostbackErrorText", "getAuthorizationToken", "getWaitTimeBannerType", "()Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "getAccessibilityTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "equals", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationScreenState {

    @NotNull
    private final String accessibilityTitle;

    @Nullable
    private final String authorizationToken;
    private final boolean blockChatInput;
    private final boolean cameraSupported;

    @NotNull
    private final String composerText;

    @Nullable
    private final ConnectionStatus connectionStatus;

    @Nullable
    private final Conversation conversation;

    @NotNull
    private final String description;
    private final boolean gallerySupported;
    private final boolean isAttachmentsEnabled;
    private final boolean isFormFocused;

    @NotNull
    private final LoadMoreStatus loadMoreStatus;

    @NotNull
    private final Map<String, DisplayedForm> mapOfDisplayedForms;

    @NotNull
    private final Map<String, ConversationScreenPostbackStatus> mapOfDisplayedPostbackStatuses;

    @NotNull
    private final List<MessageLogEntry> messageLog;

    @NotNull
    private final MessagingTheme messagingTheme;

    @NotNull
    private final String postbackErrorText;
    private final boolean scrollToTheBottom;
    private final boolean shouldAnnounceMessage;
    private final boolean shouldSeeLatestViewVisible;
    private final boolean showDeniedPermission;
    private final boolean showPostbackErrorBanner;

    @NotNull
    private final ConversationScreenStatus status;

    @NotNull
    private final String title;

    @NotNull
    private final String toolbarImageUrl;

    @NotNull
    private final TypingUser typingUser;

    @NotNull
    private final WaitTimeBannerType waitTimeBannerType;

    public ConversationScreenState(MessagingTheme messagingTheme, String str, String str2, String str3, List list, Conversation conversation, boolean z11, ConnectionStatus connectionStatus, boolean z12, boolean z13, String str4, Map map, TypingUser typingUser, boolean z14, LoadMoreStatus loadMoreStatus, boolean z15, boolean z16, boolean z17, ConversationScreenStatus conversationScreenStatus, boolean z18, Map map2, boolean z19, String str5, String str6, WaitTimeBannerType waitTimeBannerType, boolean z21, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessagingTheme.INSTANCE.getDEFAULT() : messagingTheme, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? n0.f26529a : list, (i11 & 32) != 0 ? null : conversation, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? null : connectionStatus, (i11 & 256) != 0 ? true : z12, (i11 & 512) == 0 ? z13 : true, (i11 & 1024) != 0 ? "" : str4, (i11 & NewHope.SENDB_BYTES) != 0 ? new LinkedHashMap() : map, (i11 & 4096) != 0 ? TypingUser.None.INSTANCE : typingUser, (i11 & 8192) != 0 ? false : z14, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? LoadMoreStatus.NONE : loadMoreStatus, (i11 & 32768) != 0 ? false : z15, (i11 & 65536) != 0 ? false : z16, (i11 & 131072) != 0 ? false : z17, (i11 & 262144) != 0 ? ConversationScreenStatus.IDLE : conversationScreenStatus, (i11 & 524288) != 0 ? false : z18, (i11 & 1048576) != 0 ? new LinkedHashMap() : map2, (i11 & 2097152) != 0 ? false : z19, (i11 & 4194304) != 0 ? "" : str5, (i11 & 8388608) != 0 ? null : str6, (i11 & 16777216) != 0 ? WaitTimeBannerType.Cleared.INSTANCE : waitTimeBannerType, (i11 & 33554432) != 0 ? false : z21, (i11 & 67108864) != 0 ? "" : str7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationScreenState copy$default(ConversationScreenState conversationScreenState, MessagingTheme messagingTheme, String str, String str2, String str3, List list, Conversation conversation, boolean z11, ConnectionStatus connectionStatus, boolean z12, boolean z13, String str4, Map map, TypingUser typingUser, boolean z14, LoadMoreStatus loadMoreStatus, boolean z15, boolean z16, boolean z17, ConversationScreenStatus conversationScreenStatus, boolean z18, Map map2, boolean z19, String str5, String str6, WaitTimeBannerType waitTimeBannerType, boolean z21, String str7, int i11, Object obj) {
        String str8;
        boolean z22;
        MessagingTheme messagingTheme2 = (i11 & 1) != 0 ? conversationScreenState.messagingTheme : messagingTheme;
        String str9 = (i11 & 2) != 0 ? conversationScreenState.title : str;
        String str10 = (i11 & 4) != 0 ? conversationScreenState.description : str2;
        String str11 = (i11 & 8) != 0 ? conversationScreenState.toolbarImageUrl : str3;
        List list2 = (i11 & 16) != 0 ? conversationScreenState.messageLog : list;
        Conversation conversation2 = (i11 & 32) != 0 ? conversationScreenState.conversation : conversation;
        boolean z23 = (i11 & 64) != 0 ? conversationScreenState.blockChatInput : z11;
        ConnectionStatus connectionStatus2 = (i11 & 128) != 0 ? conversationScreenState.connectionStatus : connectionStatus;
        boolean z24 = (i11 & 256) != 0 ? conversationScreenState.gallerySupported : z12;
        boolean z25 = (i11 & 512) != 0 ? conversationScreenState.cameraSupported : z13;
        String str12 = (i11 & 1024) != 0 ? conversationScreenState.composerText : str4;
        Map map3 = (i11 & NewHope.SENDB_BYTES) != 0 ? conversationScreenState.mapOfDisplayedForms : map;
        TypingUser typingUser2 = (i11 & 4096) != 0 ? conversationScreenState.typingUser : typingUser;
        boolean z26 = (i11 & 8192) != 0 ? conversationScreenState.showDeniedPermission : z14;
        MessagingTheme messagingTheme3 = messagingTheme2;
        LoadMoreStatus loadMoreStatus2 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationScreenState.loadMoreStatus : loadMoreStatus;
        boolean z27 = (i11 & 32768) != 0 ? conversationScreenState.shouldAnnounceMessage : z15;
        boolean z28 = (i11 & 65536) != 0 ? conversationScreenState.shouldSeeLatestViewVisible : z16;
        boolean z29 = (i11 & 131072) != 0 ? conversationScreenState.isAttachmentsEnabled : z17;
        ConversationScreenStatus conversationScreenStatus2 = (i11 & 262144) != 0 ? conversationScreenState.status : conversationScreenStatus;
        boolean z31 = (i11 & 524288) != 0 ? conversationScreenState.scrollToTheBottom : z18;
        Map map4 = (i11 & 1048576) != 0 ? conversationScreenState.mapOfDisplayedPostbackStatuses : map2;
        boolean z32 = (i11 & 2097152) != 0 ? conversationScreenState.showPostbackErrorBanner : z19;
        String str13 = (i11 & 4194304) != 0 ? conversationScreenState.postbackErrorText : str5;
        String str14 = (i11 & 8388608) != 0 ? conversationScreenState.authorizationToken : str6;
        WaitTimeBannerType waitTimeBannerType2 = (i11 & 16777216) != 0 ? conversationScreenState.waitTimeBannerType : waitTimeBannerType;
        boolean z33 = (i11 & 33554432) != 0 ? conversationScreenState.isFormFocused : z21;
        if ((i11 & 67108864) != 0) {
            z22 = z33;
            str8 = conversationScreenState.accessibilityTitle;
        } else {
            str8 = str7;
            z22 = z33;
        }
        return conversationScreenState.copy(messagingTheme3, str9, str10, str11, list2, conversation2, z23, connectionStatus2, z24, z25, str12, map3, typingUser2, z26, loadMoreStatus2, z27, z28, z29, conversationScreenStatus2, z31, map4, z32, str13, str14, waitTimeBannerType2, z22, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getCameraSupported() {
        return this.cameraSupported;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getComposerText() {
        return this.composerText;
    }

    @NotNull
    public final Map<String, DisplayedForm> component12() {
        return this.mapOfDisplayedForms;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TypingUser getTypingUser() {
        return this.typingUser;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShowDeniedPermission() {
        return this.showDeniedPermission;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getShouldAnnounceMessage() {
        return this.shouldAnnounceMessage;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getShouldSeeLatestViewVisible() {
        return this.shouldSeeLatestViewVisible;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsAttachmentsEnabled() {
        return this.isAttachmentsEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final ConversationScreenStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getScrollToTheBottom() {
        return this.scrollToTheBottom;
    }

    @NotNull
    public final Map<String, ConversationScreenPostbackStatus> component21() {
        return this.mapOfDisplayedPostbackStatuses;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getShowPostbackErrorBanner() {
        return this.showPostbackErrorBanner;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getPostbackErrorText() {
        return this.postbackErrorText;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getAuthorizationToken() {
        return this.authorizationToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final WaitTimeBannerType getWaitTimeBannerType() {
        return this.waitTimeBannerType;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsFormFocused() {
        return this.isFormFocused;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getAccessibilityTitle() {
        return this.accessibilityTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToolbarImageUrl() {
        return this.toolbarImageUrl;
    }

    @NotNull
    public final List<MessageLogEntry> component5() {
        return this.messageLog;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Conversation getConversation() {
        return this.conversation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getBlockChatInput() {
        return this.blockChatInput;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getGallerySupported() {
        return this.gallerySupported;
    }

    @NotNull
    public final ConversationScreenState copy(@NotNull MessagingTheme messagingTheme, @NotNull String title, @NotNull String description, @NotNull String toolbarImageUrl, @NotNull List<? extends MessageLogEntry> messageLog, @Nullable Conversation conversation, boolean blockChatInput, @Nullable ConnectionStatus connectionStatus, boolean gallerySupported, boolean cameraSupported, @NotNull String composerText, @NotNull Map<String, DisplayedForm> mapOfDisplayedForms, @NotNull TypingUser typingUser, boolean showDeniedPermission, @NotNull LoadMoreStatus loadMoreStatus, boolean shouldAnnounceMessage, boolean shouldSeeLatestViewVisible, boolean isAttachmentsEnabled, @NotNull ConversationScreenStatus status, boolean scrollToTheBottom, @NotNull Map<String, ConversationScreenPostbackStatus> mapOfDisplayedPostbackStatuses, boolean showPostbackErrorBanner, @NotNull String postbackErrorText, @Nullable String authorizationToken, @NotNull WaitTimeBannerType waitTimeBannerType, boolean isFormFocused, @NotNull String accessibilityTitle) {
        messagingTheme.getClass();
        title.getClass();
        description.getClass();
        toolbarImageUrl.getClass();
        messageLog.getClass();
        composerText.getClass();
        mapOfDisplayedForms.getClass();
        typingUser.getClass();
        loadMoreStatus.getClass();
        status.getClass();
        mapOfDisplayedPostbackStatuses.getClass();
        postbackErrorText.getClass();
        waitTimeBannerType.getClass();
        accessibilityTitle.getClass();
        return new ConversationScreenState(messagingTheme, title, description, toolbarImageUrl, messageLog, conversation, blockChatInput, connectionStatus, gallerySupported, cameraSupported, composerText, mapOfDisplayedForms, typingUser, showDeniedPermission, loadMoreStatus, shouldAnnounceMessage, shouldSeeLatestViewVisible, isAttachmentsEnabled, status, scrollToTheBottom, mapOfDisplayedPostbackStatuses, showPostbackErrorBanner, postbackErrorText, authorizationToken, waitTimeBannerType, isFormFocused, accessibilityTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationScreenState)) {
            return false;
        }
        ConversationScreenState conversationScreenState = (ConversationScreenState) other;
        return Intrinsics.areEqual(this.messagingTheme, conversationScreenState.messagingTheme) && Intrinsics.areEqual(this.title, conversationScreenState.title) && Intrinsics.areEqual(this.description, conversationScreenState.description) && Intrinsics.areEqual(this.toolbarImageUrl, conversationScreenState.toolbarImageUrl) && Intrinsics.areEqual(this.messageLog, conversationScreenState.messageLog) && Intrinsics.areEqual(this.conversation, conversationScreenState.conversation) && this.blockChatInput == conversationScreenState.blockChatInput && this.connectionStatus == conversationScreenState.connectionStatus && this.gallerySupported == conversationScreenState.gallerySupported && this.cameraSupported == conversationScreenState.cameraSupported && Intrinsics.areEqual(this.composerText, conversationScreenState.composerText) && Intrinsics.areEqual(this.mapOfDisplayedForms, conversationScreenState.mapOfDisplayedForms) && Intrinsics.areEqual(this.typingUser, conversationScreenState.typingUser) && this.showDeniedPermission == conversationScreenState.showDeniedPermission && this.loadMoreStatus == conversationScreenState.loadMoreStatus && this.shouldAnnounceMessage == conversationScreenState.shouldAnnounceMessage && this.shouldSeeLatestViewVisible == conversationScreenState.shouldSeeLatestViewVisible && this.isAttachmentsEnabled == conversationScreenState.isAttachmentsEnabled && this.status == conversationScreenState.status && this.scrollToTheBottom == conversationScreenState.scrollToTheBottom && Intrinsics.areEqual(this.mapOfDisplayedPostbackStatuses, conversationScreenState.mapOfDisplayedPostbackStatuses) && this.showPostbackErrorBanner == conversationScreenState.showPostbackErrorBanner && Intrinsics.areEqual(this.postbackErrorText, conversationScreenState.postbackErrorText) && Intrinsics.areEqual(this.authorizationToken, conversationScreenState.authorizationToken) && Intrinsics.areEqual(this.waitTimeBannerType, conversationScreenState.waitTimeBannerType) && this.isFormFocused == conversationScreenState.isFormFocused && Intrinsics.areEqual(this.accessibilityTitle, conversationScreenState.accessibilityTitle);
    }

    @NotNull
    public final String getAccessibilityTitle() {
        return this.accessibilityTitle;
    }

    @Nullable
    public final String getAuthorizationToken() {
        return this.authorizationToken;
    }

    public final boolean getBlockChatInput() {
        return this.blockChatInput;
    }

    public final boolean getCameraSupported() {
        return this.cameraSupported;
    }

    @NotNull
    public final String getComposerText() {
        return this.composerText;
    }

    @Nullable
    public final ConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    @Nullable
    public final Conversation getConversation() {
        return this.conversation;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getGallerySupported() {
        return this.gallerySupported;
    }

    @NotNull
    public final LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    @NotNull
    public final Map<String, DisplayedForm> getMapOfDisplayedForms() {
        return this.mapOfDisplayedForms;
    }

    @NotNull
    public final Map<String, ConversationScreenPostbackStatus> getMapOfDisplayedPostbackStatuses() {
        return this.mapOfDisplayedPostbackStatuses;
    }

    @NotNull
    public final List<MessageLogEntry> getMessageLog() {
        return this.messageLog;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @NotNull
    public final String getPostbackErrorText() {
        return this.postbackErrorText;
    }

    public final boolean getScrollToTheBottom() {
        return this.scrollToTheBottom;
    }

    public final boolean getShouldAnnounceMessage() {
        return this.shouldAnnounceMessage;
    }

    public final boolean getShouldSeeLatestViewVisible() {
        return this.shouldSeeLatestViewVisible;
    }

    public final boolean getShowDeniedPermission() {
        return this.showDeniedPermission;
    }

    public final boolean getShowPostbackErrorBanner() {
        return this.showPostbackErrorBanner;
    }

    @NotNull
    public final ConversationScreenStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getToolbarImageUrl() {
        return this.toolbarImageUrl;
    }

    @NotNull
    public final TypingUser getTypingUser() {
        return this.typingUser;
    }

    @NotNull
    public final WaitTimeBannerType getWaitTimeBannerType() {
        return this.waitTimeBannerType;
    }

    public int hashCode() {
        int iC = e0.f.c(this.messageLog, l1.b(l1.b(l1.b(this.messagingTheme.hashCode() * 31, 31, this.title), 31, this.description), 31, this.toolbarImageUrl), 31);
        Conversation conversation = this.conversation;
        int iE = r8.k.e((iC + (conversation == null ? 0 : conversation.hashCode())) * 31, 31, this.blockChatInput);
        ConnectionStatus connectionStatus = this.connectionStatus;
        int iB = l1.b(r8.k.e(a0.f(this.mapOfDisplayedPostbackStatuses, r8.k.e((this.status.hashCode() + r8.k.e(r8.k.e(r8.k.e((this.loadMoreStatus.hashCode() + r8.k.e((this.typingUser.hashCode() + a0.f(this.mapOfDisplayedForms, l1.b(r8.k.e(r8.k.e((iE + (connectionStatus == null ? 0 : connectionStatus.hashCode())) * 31, 31, this.gallerySupported), 31, this.cameraSupported), 31, this.composerText), 31)) * 31, 31, this.showDeniedPermission)) * 31, 31, this.shouldAnnounceMessage), 31, this.shouldSeeLatestViewVisible), 31, this.isAttachmentsEnabled)) * 31, 31, this.scrollToTheBottom), 31), 31, this.showPostbackErrorBanner), 31, this.postbackErrorText);
        String str = this.authorizationToken;
        return this.accessibilityTitle.hashCode() + r8.k.e((this.waitTimeBannerType.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.isFormFocused);
    }

    public final boolean isAttachmentsEnabled() {
        return this.isAttachmentsEnabled;
    }

    public final boolean isFormFocused() {
        return this.isFormFocused;
    }

    @NotNull
    public String toString() {
        MessagingTheme messagingTheme = this.messagingTheme;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.toolbarImageUrl;
        List<MessageLogEntry> list = this.messageLog;
        Conversation conversation = this.conversation;
        boolean z11 = this.blockChatInput;
        ConnectionStatus connectionStatus = this.connectionStatus;
        boolean z12 = this.gallerySupported;
        boolean z13 = this.cameraSupported;
        String str4 = this.composerText;
        Map<String, DisplayedForm> map = this.mapOfDisplayedForms;
        TypingUser typingUser = this.typingUser;
        boolean z14 = this.showDeniedPermission;
        LoadMoreStatus loadMoreStatus = this.loadMoreStatus;
        boolean z15 = this.shouldAnnounceMessage;
        boolean z16 = this.shouldSeeLatestViewVisible;
        boolean z17 = this.isAttachmentsEnabled;
        ConversationScreenStatus conversationScreenStatus = this.status;
        boolean z18 = this.scrollToTheBottom;
        Map<String, ConversationScreenPostbackStatus> map2 = this.mapOfDisplayedPostbackStatuses;
        boolean z19 = this.showPostbackErrorBanner;
        String str5 = this.postbackErrorText;
        String str6 = this.authorizationToken;
        WaitTimeBannerType waitTimeBannerType = this.waitTimeBannerType;
        boolean z21 = this.isFormFocused;
        String str7 = this.accessibilityTitle;
        StringBuilder sb2 = new StringBuilder("ConversationScreenState(messagingTheme=");
        sb2.append(messagingTheme);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", description=");
        j4.s.A(sb2, str2, ", toolbarImageUrl=", str3, ", messageLog=");
        sb2.append(list);
        sb2.append(", conversation=");
        sb2.append(conversation);
        sb2.append(", blockChatInput=");
        sb2.append(z11);
        sb2.append(", connectionStatus=");
        sb2.append(connectionStatus);
        sb2.append(", gallerySupported=");
        b3.i.C(sb2, z12, ", cameraSupported=", z13, ", composerText=");
        sb2.append(str4);
        sb2.append(", mapOfDisplayedForms=");
        sb2.append(map);
        sb2.append(", typingUser=");
        sb2.append(typingUser);
        sb2.append(", showDeniedPermission=");
        sb2.append(z14);
        sb2.append(", loadMoreStatus=");
        sb2.append(loadMoreStatus);
        sb2.append(", shouldAnnounceMessage=");
        sb2.append(z15);
        sb2.append(", shouldSeeLatestViewVisible=");
        b3.i.C(sb2, z16, ", isAttachmentsEnabled=", z17, ", status=");
        sb2.append(conversationScreenStatus);
        sb2.append(", scrollToTheBottom=");
        sb2.append(z18);
        sb2.append(", mapOfDisplayedPostbackStatuses=");
        sb2.append(map2);
        sb2.append(", showPostbackErrorBanner=");
        sb2.append(z19);
        sb2.append(", postbackErrorText=");
        j4.s.A(sb2, str5, ", authorizationToken=", str6, ", waitTimeBannerType=");
        sb2.append(waitTimeBannerType);
        sb2.append(", isFormFocused=");
        sb2.append(z21);
        sb2.append(", accessibilityTitle=");
        return r8.k.p(sb2, str7, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenState(@NotNull MessagingTheme messagingTheme, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends MessageLogEntry> list, @Nullable Conversation conversation, boolean z11, @Nullable ConnectionStatus connectionStatus, boolean z12, boolean z13, @NotNull String str4, @NotNull Map<String, DisplayedForm> map, @NotNull TypingUser typingUser, boolean z14, @NotNull LoadMoreStatus loadMoreStatus, boolean z15, boolean z16, boolean z17, @NotNull ConversationScreenStatus conversationScreenStatus, boolean z18, @NotNull Map<String, ConversationScreenPostbackStatus> map2, boolean z19, @NotNull String str5, @Nullable String str6, @NotNull WaitTimeBannerType waitTimeBannerType, boolean z21, @NotNull String str7) {
        messagingTheme.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        map.getClass();
        typingUser.getClass();
        loadMoreStatus.getClass();
        conversationScreenStatus.getClass();
        map2.getClass();
        str5.getClass();
        waitTimeBannerType.getClass();
        str7.getClass();
        this.messagingTheme = messagingTheme;
        this.title = str;
        this.description = str2;
        this.toolbarImageUrl = str3;
        this.messageLog = list;
        this.conversation = conversation;
        this.blockChatInput = z11;
        this.connectionStatus = connectionStatus;
        this.gallerySupported = z12;
        this.cameraSupported = z13;
        this.composerText = str4;
        this.mapOfDisplayedForms = map;
        this.typingUser = typingUser;
        this.showDeniedPermission = z14;
        this.loadMoreStatus = loadMoreStatus;
        this.shouldAnnounceMessage = z15;
        this.shouldSeeLatestViewVisible = z16;
        this.isAttachmentsEnabled = z17;
        this.status = conversationScreenStatus;
        this.scrollToTheBottom = z18;
        this.mapOfDisplayedPostbackStatuses = map2;
        this.showPostbackErrorBanner = z19;
        this.postbackErrorText = str5;
        this.authorizationToken = str6;
        this.waitTimeBannerType = waitTimeBannerType;
        this.isFormFocused = z21;
        this.accessibilityTitle = str7;
    }

    public ConversationScreenState() {
        this(null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 134217727, null);
    }
}
