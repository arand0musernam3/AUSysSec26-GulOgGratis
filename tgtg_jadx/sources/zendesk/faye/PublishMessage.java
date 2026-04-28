package zendesk.faye;

import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lzendesk/faye/PublishMessage;", "Lzendesk/faye/BayeuxMessage;", "channel", "", InAppMessageBase.MESSAGE, "optionalFields", "Lzendesk/faye/BayeuxOptionalFields;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/faye/BayeuxOptionalFields;)V", "getChannel", "()Ljava/lang/String;", "getMessage", "getOptionalFields", "()Lzendesk/faye/BayeuxOptionalFields;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PublishMessage implements BayeuxMessage {

    @NotNull
    private final String channel;

    @NotNull
    private final String message;

    @NotNull
    private final BayeuxOptionalFields optionalFields;

    public PublishMessage(@NotNull String str, @NotNull String str2, @NotNull BayeuxOptionalFields bayeuxOptionalFields) {
        str.getClass();
        str2.getClass();
        bayeuxOptionalFields.getClass();
        this.channel = str;
        this.message = str2;
        this.optionalFields = bayeuxOptionalFields;
    }

    public static /* synthetic */ PublishMessage copy$default(PublishMessage publishMessage, String str, String str2, BayeuxOptionalFields bayeuxOptionalFields, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = publishMessage.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = publishMessage.message;
        }
        if ((i11 & 4) != 0) {
            bayeuxOptionalFields = publishMessage.optionalFields;
        }
        return publishMessage.copy(str, str2, bayeuxOptionalFields);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BayeuxOptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    @NotNull
    public final PublishMessage copy(@NotNull String channel, @NotNull String message, @NotNull BayeuxOptionalFields optionalFields) {
        channel.getClass();
        message.getClass();
        optionalFields.getClass();
        return new PublishMessage(channel, message, optionalFields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishMessage)) {
            return false;
        }
        PublishMessage publishMessage = (PublishMessage) other;
        return Intrinsics.areEqual(this.channel, publishMessage.channel) && Intrinsics.areEqual(this.message, publishMessage.message) && Intrinsics.areEqual(this.optionalFields, publishMessage.optionalFields);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final BayeuxOptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    public int hashCode() {
        return this.optionalFields.hashCode() + l1.b(this.channel.hashCode() * 31, 31, this.message);
    }

    @NotNull
    public String toString() {
        String str = this.channel;
        String str2 = this.message;
        BayeuxOptionalFields bayeuxOptionalFields = this.optionalFields;
        StringBuilder sbT = f.t("PublishMessage(channel=", str, ", message=", str2, ", optionalFields=");
        sbT.append(bayeuxOptionalFields);
        sbT.append(")");
        return sbT.toString();
    }

    public /* synthetic */ PublishMessage(String str, String str2, BayeuxOptionalFields bayeuxOptionalFields, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? new BayeuxOptionalFields(null, null, 3, null) : bayeuxOptionalFields);
    }
}
