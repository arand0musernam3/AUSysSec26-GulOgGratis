package zendesk.android.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lzendesk/android/events/ConversationUnreadCountChange;", "", "totalUnreadMessagesCount", "", "conversationId", "", "unreadCountInConversation", "<init>", "(ILjava/lang/String;I)V", "getTotalUnreadMessagesCount", "()I", "getConversationId", "()Ljava/lang/String;", "getUnreadCountInConversation", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationUnreadCountChange {

    @NotNull
    private final String conversationId;
    private final int totalUnreadMessagesCount;
    private final int unreadCountInConversation;

    @InternalZendeskApi
    public ConversationUnreadCountChange(int i11, @NotNull String str, int i12) {
        str.getClass();
        this.totalUnreadMessagesCount = i11;
        this.conversationId = str;
        this.unreadCountInConversation = i12;
    }

    public static /* synthetic */ ConversationUnreadCountChange copy$default(ConversationUnreadCountChange conversationUnreadCountChange, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = conversationUnreadCountChange.totalUnreadMessagesCount;
        }
        if ((i13 & 2) != 0) {
            str = conversationUnreadCountChange.conversationId;
        }
        if ((i13 & 4) != 0) {
            i12 = conversationUnreadCountChange.unreadCountInConversation;
        }
        return conversationUnreadCountChange.copy(i11, str, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalUnreadMessagesCount() {
        return this.totalUnreadMessagesCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUnreadCountInConversation() {
        return this.unreadCountInConversation;
    }

    @NotNull
    public final ConversationUnreadCountChange copy(int totalUnreadMessagesCount, @NotNull String conversationId, int unreadCountInConversation) {
        conversationId.getClass();
        return new ConversationUnreadCountChange(totalUnreadMessagesCount, conversationId, unreadCountInConversation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationUnreadCountChange)) {
            return false;
        }
        ConversationUnreadCountChange conversationUnreadCountChange = (ConversationUnreadCountChange) other;
        return this.totalUnreadMessagesCount == conversationUnreadCountChange.totalUnreadMessagesCount && Intrinsics.areEqual(this.conversationId, conversationUnreadCountChange.conversationId) && this.unreadCountInConversation == conversationUnreadCountChange.unreadCountInConversation;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getTotalUnreadMessagesCount() {
        return this.totalUnreadMessagesCount;
    }

    public final int getUnreadCountInConversation() {
        return this.unreadCountInConversation;
    }

    public int hashCode() {
        return Integer.hashCode(this.unreadCountInConversation) + l1.b(Integer.hashCode(this.totalUnreadMessagesCount) * 31, 31, this.conversationId);
    }

    @NotNull
    public String toString() {
        int i11 = this.totalUnreadMessagesCount;
        String str = this.conversationId;
        int i12 = this.unreadCountInConversation;
        StringBuilder sb2 = new StringBuilder("ConversationUnreadCountChange(totalUnreadMessagesCount=");
        sb2.append(i11);
        sb2.append(", conversationId=");
        sb2.append(str);
        sb2.append(", unreadCountInConversation=");
        return k.i(i12, ")", sb2);
    }
}
