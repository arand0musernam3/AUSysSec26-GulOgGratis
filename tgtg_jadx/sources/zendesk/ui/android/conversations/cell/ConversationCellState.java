package zendesk.ui.android.conversations.cell;

import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import zendesk.ui.android.conversation.avatar.AvatarImageState;
import zendesk.ui.android.conversation.composer.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0011HÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u000bHÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003JÇ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u000b2\b\b\u0003\u0010\u0013\u001a\u00020\u000b2\b\b\u0003\u0010\u0014\u001a\u00020\u000b2\b\b\u0003\u0010\u0015\u001a\u00020\u000b2\b\b\u0003\u0010\u0016\u001a\u00020\u000b2\b\b\u0003\u0010\u0017\u001a\u00020\u000b2\b\b\u0003\u0010\u0018\u001a\u00020\u000b2\b\b\u0003\u0010\u0019\u001a\u00020\u000bHÆ\u0001J\u0013\u0010E\u001a\u00020\u00112\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u000bHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010)R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%¨\u0006I"}, d2 = {"Lzendesk/ui/android/conversations/cell/ConversationCellState;", "", "participants", "", "conversationTitle", "lastMessage", "lastMessageOwner", "avatarImageState", "Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "dateTimeStamp", "unreadMessagesCount", "", "clickListener", "Lkotlin/Function0;", "", "accessibilityTitle", "isEnded", "", "unreadMessagesCountBackgroundColor", "unreadMessagesCountTextColor", "dateTimestampTextColor", "lastMessageTextColor", "conversationParticipantsTextColor", "conversationTitleTextColor", "conversationCellDividerColor", "endedLabelColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/ui/android/conversation/avatar/AvatarImageState;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Ljava/lang/String;ZIIIIIIII)V", "getParticipants", "()Ljava/lang/String;", "getConversationTitle", "getLastMessage", "getLastMessageOwner", "getAvatarImageState", "()Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "getDateTimeStamp", "getUnreadMessagesCount", "()I", "getClickListener", "()Lkotlin/jvm/functions/Function0;", "getAccessibilityTitle", "()Z", "getUnreadMessagesCountBackgroundColor", "getUnreadMessagesCountTextColor", "getDateTimestampTextColor", "getLastMessageTextColor", "getConversationParticipantsTextColor", "getConversationTitleTextColor", "getConversationCellDividerColor", "getEndedLabelColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationCellState {
    public static final int $stable = 8;

    @NotNull
    private final String accessibilityTitle;

    @Nullable
    private final AvatarImageState avatarImageState;

    @NotNull
    private final Function0<Unit> clickListener;
    private final int conversationCellDividerColor;
    private final int conversationParticipantsTextColor;

    @NotNull
    private final String conversationTitle;
    private final int conversationTitleTextColor;

    @NotNull
    private final String dateTimeStamp;
    private final int dateTimestampTextColor;
    private final int endedLabelColor;
    private final boolean isEnded;

    @NotNull
    private final String lastMessage;

    @Nullable
    private final String lastMessageOwner;
    private final int lastMessageTextColor;

    @NotNull
    private final String participants;
    private final int unreadMessagesCount;
    private final int unreadMessagesCountBackgroundColor;
    private final int unreadMessagesCountTextColor;

    public /* synthetic */ ConversationCellState(String str, String str2, String str3, String str4, AvatarImageState avatarImageState, String str5, int i11, Function0 function0, String str6, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? "" : str, (i21 & 2) != 0 ? "" : str2, (i21 & 4) != 0 ? "" : str3, (i21 & 8) != 0 ? null : str4, (i21 & 16) == 0 ? avatarImageState : null, (i21 & 32) != 0 ? "" : str5, (i21 & 64) != 0 ? 0 : i11, (i21 & 128) != 0 ? new b(8) : function0, (i21 & 256) == 0 ? str6 : "", (i21 & 512) != 0 ? false : z11, (i21 & 1024) != 0 ? 0 : i12, (i21 & NewHope.SENDB_BYTES) != 0 ? 0 : i13, (i21 & 4096) != 0 ? 0 : i14, (i21 & 8192) != 0 ? 0 : i15, (i21 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? 0 : i16, (i21 & 32768) != 0 ? 0 : i17, (i21 & 65536) != 0 ? 0 : i18, (i21 & 131072) != 0 ? 0 : i19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationCellState copy$default(ConversationCellState conversationCellState, String str, String str2, String str3, String str4, AvatarImageState avatarImageState, String str5, int i11, Function0 function0, String str6, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, Object obj) {
        int i22;
        int i23;
        String str7 = (i21 & 1) != 0 ? conversationCellState.participants : str;
        String str8 = (i21 & 2) != 0 ? conversationCellState.conversationTitle : str2;
        String str9 = (i21 & 4) != 0 ? conversationCellState.lastMessage : str3;
        String str10 = (i21 & 8) != 0 ? conversationCellState.lastMessageOwner : str4;
        AvatarImageState avatarImageState2 = (i21 & 16) != 0 ? conversationCellState.avatarImageState : avatarImageState;
        String str11 = (i21 & 32) != 0 ? conversationCellState.dateTimeStamp : str5;
        int i24 = (i21 & 64) != 0 ? conversationCellState.unreadMessagesCount : i11;
        Function0 function02 = (i21 & 128) != 0 ? conversationCellState.clickListener : function0;
        String str12 = (i21 & 256) != 0 ? conversationCellState.accessibilityTitle : str6;
        boolean z12 = (i21 & 512) != 0 ? conversationCellState.isEnded : z11;
        int i25 = (i21 & 1024) != 0 ? conversationCellState.unreadMessagesCountBackgroundColor : i12;
        int i26 = (i21 & NewHope.SENDB_BYTES) != 0 ? conversationCellState.unreadMessagesCountTextColor : i13;
        int i27 = (i21 & 4096) != 0 ? conversationCellState.dateTimestampTextColor : i14;
        int i28 = (i21 & 8192) != 0 ? conversationCellState.lastMessageTextColor : i15;
        String str13 = str7;
        int i29 = (i21 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationCellState.conversationParticipantsTextColor : i16;
        int i31 = (i21 & 32768) != 0 ? conversationCellState.conversationTitleTextColor : i17;
        int i32 = (i21 & 65536) != 0 ? conversationCellState.conversationCellDividerColor : i18;
        if ((i21 & 131072) != 0) {
            i23 = i32;
            i22 = conversationCellState.endedLabelColor;
        } else {
            i22 = i19;
            i23 = i32;
        }
        return conversationCellState.copy(str13, str8, str9, str10, avatarImageState2, str11, i24, function02, str12, z12, i25, i26, i27, i28, i29, i31, i23, i22);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParticipants() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsEnded() {
        return this.isEnded;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getUnreadMessagesCountBackgroundColor() {
        return this.unreadMessagesCountBackgroundColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getUnreadMessagesCountTextColor() {
        return this.unreadMessagesCountTextColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getDateTimestampTextColor() {
        return this.dateTimestampTextColor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getLastMessageTextColor() {
        return this.lastMessageTextColor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getConversationParticipantsTextColor() {
        return this.conversationParticipantsTextColor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getConversationTitleTextColor() {
        return this.conversationTitleTextColor;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getConversationCellDividerColor() {
        return this.conversationCellDividerColor;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getEndedLabelColor() {
        return this.endedLabelColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastMessage() {
        return this.lastMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastMessageOwner() {
        return this.lastMessageOwner;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AvatarImageState getAvatarImageState() {
        return this.avatarImageState;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDateTimeStamp() {
        return this.dateTimeStamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getUnreadMessagesCount() {
        return this.unreadMessagesCount;
    }

    @NotNull
    public final Function0<Unit> component8() {
        return this.clickListener;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAccessibilityTitle() {
        return this.accessibilityTitle;
    }

    @NotNull
    public final ConversationCellState copy(@NotNull String participants, @NotNull String conversationTitle, @NotNull String lastMessage, @Nullable String lastMessageOwner, @Nullable AvatarImageState avatarImageState, @NotNull String dateTimeStamp, int unreadMessagesCount, @NotNull Function0<Unit> clickListener, @NotNull String accessibilityTitle, boolean isEnded, int unreadMessagesCountBackgroundColor, int unreadMessagesCountTextColor, int dateTimestampTextColor, int lastMessageTextColor, int conversationParticipantsTextColor, int conversationTitleTextColor, int conversationCellDividerColor, int endedLabelColor) {
        participants.getClass();
        conversationTitle.getClass();
        lastMessage.getClass();
        dateTimeStamp.getClass();
        clickListener.getClass();
        accessibilityTitle.getClass();
        return new ConversationCellState(participants, conversationTitle, lastMessage, lastMessageOwner, avatarImageState, dateTimeStamp, unreadMessagesCount, clickListener, accessibilityTitle, isEnded, unreadMessagesCountBackgroundColor, unreadMessagesCountTextColor, dateTimestampTextColor, lastMessageTextColor, conversationParticipantsTextColor, conversationTitleTextColor, conversationCellDividerColor, endedLabelColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationCellState)) {
            return false;
        }
        ConversationCellState conversationCellState = (ConversationCellState) other;
        return Intrinsics.areEqual(this.participants, conversationCellState.participants) && Intrinsics.areEqual(this.conversationTitle, conversationCellState.conversationTitle) && Intrinsics.areEqual(this.lastMessage, conversationCellState.lastMessage) && Intrinsics.areEqual(this.lastMessageOwner, conversationCellState.lastMessageOwner) && Intrinsics.areEqual(this.avatarImageState, conversationCellState.avatarImageState) && Intrinsics.areEqual(this.dateTimeStamp, conversationCellState.dateTimeStamp) && this.unreadMessagesCount == conversationCellState.unreadMessagesCount && Intrinsics.areEqual(this.clickListener, conversationCellState.clickListener) && Intrinsics.areEqual(this.accessibilityTitle, conversationCellState.accessibilityTitle) && this.isEnded == conversationCellState.isEnded && this.unreadMessagesCountBackgroundColor == conversationCellState.unreadMessagesCountBackgroundColor && this.unreadMessagesCountTextColor == conversationCellState.unreadMessagesCountTextColor && this.dateTimestampTextColor == conversationCellState.dateTimestampTextColor && this.lastMessageTextColor == conversationCellState.lastMessageTextColor && this.conversationParticipantsTextColor == conversationCellState.conversationParticipantsTextColor && this.conversationTitleTextColor == conversationCellState.conversationTitleTextColor && this.conversationCellDividerColor == conversationCellState.conversationCellDividerColor && this.endedLabelColor == conversationCellState.endedLabelColor;
    }

    @NotNull
    public final String getAccessibilityTitle() {
        return this.accessibilityTitle;
    }

    @Nullable
    public final AvatarImageState getAvatarImageState() {
        return this.avatarImageState;
    }

    @NotNull
    public final Function0<Unit> getClickListener() {
        return this.clickListener;
    }

    public final int getConversationCellDividerColor() {
        return this.conversationCellDividerColor;
    }

    public final int getConversationParticipantsTextColor() {
        return this.conversationParticipantsTextColor;
    }

    @NotNull
    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    public final int getConversationTitleTextColor() {
        return this.conversationTitleTextColor;
    }

    @NotNull
    public final String getDateTimeStamp() {
        return this.dateTimeStamp;
    }

    public final int getDateTimestampTextColor() {
        return this.dateTimestampTextColor;
    }

    public final int getEndedLabelColor() {
        return this.endedLabelColor;
    }

    @NotNull
    public final String getLastMessage() {
        return this.lastMessage;
    }

    @Nullable
    public final String getLastMessageOwner() {
        return this.lastMessageOwner;
    }

    public final int getLastMessageTextColor() {
        return this.lastMessageTextColor;
    }

    @NotNull
    public final String getParticipants() {
        return this.participants;
    }

    public final int getUnreadMessagesCount() {
        return this.unreadMessagesCount;
    }

    public final int getUnreadMessagesCountBackgroundColor() {
        return this.unreadMessagesCountBackgroundColor;
    }

    public final int getUnreadMessagesCountTextColor() {
        return this.unreadMessagesCountTextColor;
    }

    public int hashCode() {
        int iB = l1.b(l1.b(this.participants.hashCode() * 31, 31, this.conversationTitle), 31, this.lastMessage);
        String str = this.lastMessageOwner;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        AvatarImageState avatarImageState = this.avatarImageState;
        return Integer.hashCode(this.endedLabelColor) + k.b(this.conversationCellDividerColor, k.b(this.conversationTitleTextColor, k.b(this.conversationParticipantsTextColor, k.b(this.lastMessageTextColor, k.b(this.dateTimestampTextColor, k.b(this.unreadMessagesCountTextColor, k.b(this.unreadMessagesCountBackgroundColor, k.e(l1.b((this.clickListener.hashCode() + k.b(this.unreadMessagesCount, l1.b((iHashCode + (avatarImageState != null ? avatarImageState.hashCode() : 0)) * 31, 31, this.dateTimeStamp), 31)) * 31, 31, this.accessibilityTitle), 31, this.isEnded), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isEnded() {
        return this.isEnded;
    }

    @NotNull
    public String toString() {
        String str = this.participants;
        String str2 = this.conversationTitle;
        String str3 = this.lastMessage;
        String str4 = this.lastMessageOwner;
        AvatarImageState avatarImageState = this.avatarImageState;
        String str5 = this.dateTimeStamp;
        int i11 = this.unreadMessagesCount;
        Function0<Unit> function0 = this.clickListener;
        String str6 = this.accessibilityTitle;
        boolean z11 = this.isEnded;
        int i12 = this.unreadMessagesCountBackgroundColor;
        int i13 = this.unreadMessagesCountTextColor;
        int i14 = this.dateTimestampTextColor;
        int i15 = this.lastMessageTextColor;
        int i16 = this.conversationParticipantsTextColor;
        int i17 = this.conversationTitleTextColor;
        int i18 = this.conversationCellDividerColor;
        int i19 = this.endedLabelColor;
        StringBuilder sbT = f.t("ConversationCellState(participants=", str, ", conversationTitle=", str2, ", lastMessage=");
        s.A(sbT, str3, ", lastMessageOwner=", str4, ", avatarImageState=");
        sbT.append(avatarImageState);
        sbT.append(", dateTimeStamp=");
        sbT.append(str5);
        sbT.append(", unreadMessagesCount=");
        sbT.append(i11);
        sbT.append(", clickListener=");
        sbT.append(function0);
        sbT.append(", accessibilityTitle=");
        k.z(sbT, str6, ", isEnded=", z11, ", unreadMessagesCountBackgroundColor=");
        f.C(sbT, i12, ", unreadMessagesCountTextColor=", i13, ", dateTimestampTextColor=");
        f.C(sbT, i14, ", lastMessageTextColor=", i15, ", conversationParticipantsTextColor=");
        f.C(sbT, i16, ", conversationTitleTextColor=", i17, ", conversationCellDividerColor=");
        sbT.append(i18);
        sbT.append(", endedLabelColor=");
        sbT.append(i19);
        sbT.append(")");
        return sbT.toString();
    }

    public ConversationCellState(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable AvatarImageState avatarImageState, @NotNull String str5, int i11, @NotNull Function0<Unit> function0, @NotNull String str6, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        function0.getClass();
        str6.getClass();
        this.participants = str;
        this.conversationTitle = str2;
        this.lastMessage = str3;
        this.lastMessageOwner = str4;
        this.avatarImageState = avatarImageState;
        this.dateTimeStamp = str5;
        this.unreadMessagesCount = i11;
        this.clickListener = function0;
        this.accessibilityTitle = str6;
        this.isEnded = z11;
        this.unreadMessagesCountBackgroundColor = i12;
        this.unreadMessagesCountTextColor = i13;
        this.dateTimestampTextColor = i14;
        this.lastMessageTextColor = i15;
        this.conversationParticipantsTextColor = i16;
        this.conversationTitleTextColor = i17;
        this.conversationCellDividerColor = i18;
        this.endedLabelColor = i19;
    }

    public ConversationCellState() {
        this(null, null, null, null, null, null, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 262143, null);
    }
}
