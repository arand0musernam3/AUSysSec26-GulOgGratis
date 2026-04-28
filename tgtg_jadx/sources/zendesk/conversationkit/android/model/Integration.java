package zendesk.conversationkit.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lzendesk/conversationkit/android/model/Integration;", "", "id", "", "canUserCreateMoreConversations", "", "canUserSeeConversationList", "waitTimeConfig", "Lzendesk/conversationkit/android/model/WaitTimeConfig;", "<init>", "(Ljava/lang/String;ZZLzendesk/conversationkit/android/model/WaitTimeConfig;)V", "getId", "()Ljava/lang/String;", "getCanUserCreateMoreConversations", "()Z", "getCanUserSeeConversationList", "getWaitTimeConfig", "()Lzendesk/conversationkit/android/model/WaitTimeConfig;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Integration {
    private final boolean canUserCreateMoreConversations;
    private final boolean canUserSeeConversationList;

    @NotNull
    private final String id;

    @NotNull
    private final WaitTimeConfig waitTimeConfig;

    public Integration(@NotNull String str, boolean z11, boolean z12, @NotNull WaitTimeConfig waitTimeConfig) {
        str.getClass();
        waitTimeConfig.getClass();
        this.id = str;
        this.canUserCreateMoreConversations = z11;
        this.canUserSeeConversationList = z12;
        this.waitTimeConfig = waitTimeConfig;
    }

    public static /* synthetic */ Integration copy$default(Integration integration, String str, boolean z11, boolean z12, WaitTimeConfig waitTimeConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = integration.id;
        }
        if ((i11 & 2) != 0) {
            z11 = integration.canUserCreateMoreConversations;
        }
        if ((i11 & 4) != 0) {
            z12 = integration.canUserSeeConversationList;
        }
        if ((i11 & 8) != 0) {
            waitTimeConfig = integration.waitTimeConfig;
        }
        return integration.copy(str, z11, z12, waitTimeConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WaitTimeConfig getWaitTimeConfig() {
        return this.waitTimeConfig;
    }

    @NotNull
    public final Integration copy(@NotNull String id2, boolean canUserCreateMoreConversations, boolean canUserSeeConversationList, @NotNull WaitTimeConfig waitTimeConfig) {
        id2.getClass();
        waitTimeConfig.getClass();
        return new Integration(id2, canUserCreateMoreConversations, canUserSeeConversationList, waitTimeConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Integration)) {
            return false;
        }
        Integration integration = (Integration) other;
        return Intrinsics.areEqual(this.id, integration.id) && this.canUserCreateMoreConversations == integration.canUserCreateMoreConversations && this.canUserSeeConversationList == integration.canUserSeeConversationList && Intrinsics.areEqual(this.waitTimeConfig, integration.waitTimeConfig);
    }

    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final WaitTimeConfig getWaitTimeConfig() {
        return this.waitTimeConfig;
    }

    public int hashCode() {
        return this.waitTimeConfig.hashCode() + k.e(k.e(this.id.hashCode() * 31, 31, this.canUserCreateMoreConversations), 31, this.canUserSeeConversationList);
    }

    @NotNull
    public String toString() {
        return "Integration(id=" + this.id + ", canUserCreateMoreConversations=" + this.canUserCreateMoreConversations + ", canUserSeeConversationList=" + this.canUserSeeConversationList + ", waitTimeConfig=" + this.waitTimeConfig + ")";
    }
}
