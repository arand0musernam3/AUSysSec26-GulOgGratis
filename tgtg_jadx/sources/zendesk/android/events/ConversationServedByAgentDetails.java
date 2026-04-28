package zendesk.android.events;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ConversationServedByAgentDetails;", "", "agentDisplayName", "", "agentId", "agentMessageSource", "Lzendesk/android/events/AgentMessageSource;", "conversationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/android/events/AgentMessageSource;Ljava/lang/String;)V", "getAgentDisplayName", "()Ljava/lang/String;", "getAgentId", "getAgentMessageSource", "()Lzendesk/android/events/AgentMessageSource;", "getConversationId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationServedByAgentDetails {

    @NotNull
    private final String agentDisplayName;

    @NotNull
    private final String agentId;

    @NotNull
    private final AgentMessageSource agentMessageSource;

    @NotNull
    private final String conversationId;

    @InternalZendeskApi
    public ConversationServedByAgentDetails(@NotNull String str, @NotNull String str2, @NotNull AgentMessageSource agentMessageSource, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        agentMessageSource.getClass();
        str3.getClass();
        this.agentDisplayName = str;
        this.agentId = str2;
        this.agentMessageSource = agentMessageSource;
        this.conversationId = str3;
    }

    public static /* synthetic */ ConversationServedByAgentDetails copy$default(ConversationServedByAgentDetails conversationServedByAgentDetails, String str, String str2, AgentMessageSource agentMessageSource, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = conversationServedByAgentDetails.agentDisplayName;
        }
        if ((i11 & 2) != 0) {
            str2 = conversationServedByAgentDetails.agentId;
        }
        if ((i11 & 4) != 0) {
            agentMessageSource = conversationServedByAgentDetails.agentMessageSource;
        }
        if ((i11 & 8) != 0) {
            str3 = conversationServedByAgentDetails.conversationId;
        }
        return conversationServedByAgentDetails.copy(str, str2, agentMessageSource, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentDisplayName() {
        return this.agentDisplayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AgentMessageSource getAgentMessageSource() {
        return this.agentMessageSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final ConversationServedByAgentDetails copy(@NotNull String agentDisplayName, @NotNull String agentId, @NotNull AgentMessageSource agentMessageSource, @NotNull String conversationId) {
        agentDisplayName.getClass();
        agentId.getClass();
        agentMessageSource.getClass();
        conversationId.getClass();
        return new ConversationServedByAgentDetails(agentDisplayName, agentId, agentMessageSource, conversationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationServedByAgentDetails)) {
            return false;
        }
        ConversationServedByAgentDetails conversationServedByAgentDetails = (ConversationServedByAgentDetails) other;
        return Intrinsics.areEqual(this.agentDisplayName, conversationServedByAgentDetails.agentDisplayName) && Intrinsics.areEqual(this.agentId, conversationServedByAgentDetails.agentId) && this.agentMessageSource == conversationServedByAgentDetails.agentMessageSource && Intrinsics.areEqual(this.conversationId, conversationServedByAgentDetails.conversationId);
    }

    @NotNull
    public final String getAgentDisplayName() {
        return this.agentDisplayName;
    }

    @NotNull
    public final String getAgentId() {
        return this.agentId;
    }

    @NotNull
    public final AgentMessageSource getAgentMessageSource() {
        return this.agentMessageSource;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    public int hashCode() {
        return this.conversationId.hashCode() + ((this.agentMessageSource.hashCode() + l1.b(this.agentDisplayName.hashCode() * 31, 31, this.agentId)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.agentDisplayName;
        String str2 = this.agentId;
        AgentMessageSource agentMessageSource = this.agentMessageSource;
        String str3 = this.conversationId;
        StringBuilder sbT = f.t("ConversationServedByAgentDetails(agentDisplayName=", str, ", agentId=", str2, ", agentMessageSource=");
        sbT.append(agentMessageSource);
        sbT.append(", conversationId=");
        sbT.append(str3);
        sbT.append(")");
        return sbT.toString();
    }
}
