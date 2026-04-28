package zendesk.android.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/android/events/PostbackButtonClickedDetails;", "", "conversationId", "", "actionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getActionName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PostbackButtonClickedDetails {

    @NotNull
    private final String actionName;

    @NotNull
    private final String conversationId;

    @InternalZendeskApi
    public PostbackButtonClickedDetails(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.conversationId = str;
        this.actionName = str2;
    }

    public static /* synthetic */ PostbackButtonClickedDetails copy$default(PostbackButtonClickedDetails postbackButtonClickedDetails, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = postbackButtonClickedDetails.conversationId;
        }
        if ((i11 & 2) != 0) {
            str2 = postbackButtonClickedDetails.actionName;
        }
        return postbackButtonClickedDetails.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    @NotNull
    public final PostbackButtonClickedDetails copy(@NotNull String conversationId, @NotNull String actionName) {
        conversationId.getClass();
        actionName.getClass();
        return new PostbackButtonClickedDetails(conversationId, actionName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostbackButtonClickedDetails)) {
            return false;
        }
        PostbackButtonClickedDetails postbackButtonClickedDetails = (PostbackButtonClickedDetails) other;
        return Intrinsics.areEqual(this.conversationId, postbackButtonClickedDetails.conversationId) && Intrinsics.areEqual(this.actionName, postbackButtonClickedDetails.actionName);
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    public int hashCode() {
        return this.actionName.hashCode() + (this.conversationId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("PostbackButtonClickedDetails(conversationId=", this.conversationId, ", actionName=", this.actionName, ")");
    }
}
