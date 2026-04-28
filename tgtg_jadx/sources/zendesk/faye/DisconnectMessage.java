package zendesk.faye;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/faye/DisconnectMessage;", "Lzendesk/faye/BayeuxMessage;", "optionalFields", "Lzendesk/faye/BayeuxOptionalFields;", "<init>", "(Lzendesk/faye/BayeuxOptionalFields;)V", "getOptionalFields", "()Lzendesk/faye/BayeuxOptionalFields;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DisconnectMessage implements BayeuxMessage {

    @NotNull
    private final BayeuxOptionalFields optionalFields;

    public /* synthetic */ DisconnectMessage(BayeuxOptionalFields bayeuxOptionalFields, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new BayeuxOptionalFields(null, null, 3, null) : bayeuxOptionalFields);
    }

    public static /* synthetic */ DisconnectMessage copy$default(DisconnectMessage disconnectMessage, BayeuxOptionalFields bayeuxOptionalFields, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bayeuxOptionalFields = disconnectMessage.optionalFields;
        }
        return disconnectMessage.copy(bayeuxOptionalFields);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BayeuxOptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    @NotNull
    public final DisconnectMessage copy(@NotNull BayeuxOptionalFields optionalFields) {
        optionalFields.getClass();
        return new DisconnectMessage(optionalFields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DisconnectMessage) && Intrinsics.areEqual(this.optionalFields, ((DisconnectMessage) other).optionalFields);
    }

    @NotNull
    public final BayeuxOptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    public int hashCode() {
        return this.optionalFields.hashCode();
    }

    @NotNull
    public String toString() {
        return "DisconnectMessage(optionalFields=" + this.optionalFields + ")";
    }

    public DisconnectMessage(@NotNull BayeuxOptionalFields bayeuxOptionalFields) {
        bayeuxOptionalFields.getClass();
        this.optionalFields = bayeuxOptionalFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DisconnectMessage() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
