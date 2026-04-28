package zendesk.faye;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lzendesk/faye/ConnectMessage;", "Lzendesk/faye/BayeuxMessage;", "supportedConnectionTypes", "", "", "handshakeOptionalFields", "Lzendesk/faye/BayeuxOptionalFields;", "connectOptionalFields", "<init>", "(Ljava/util/List;Lzendesk/faye/BayeuxOptionalFields;Lzendesk/faye/BayeuxOptionalFields;)V", "getSupportedConnectionTypes", "()Ljava/util/List;", "getHandshakeOptionalFields", "()Lzendesk/faye/BayeuxOptionalFields;", "getConnectOptionalFields", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConnectMessage implements BayeuxMessage {

    @NotNull
    private final BayeuxOptionalFields connectOptionalFields;

    @NotNull
    private final BayeuxOptionalFields handshakeOptionalFields;

    @NotNull
    private final List<String> supportedConnectionTypes;

    public ConnectMessage(List list, BayeuxOptionalFields bayeuxOptionalFields, BayeuxOptionalFields bayeuxOptionalFields2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? new BayeuxOptionalFields(null, null, 3, null) : bayeuxOptionalFields, (i11 & 4) != 0 ? new BayeuxOptionalFields(null, null, 3, null) : bayeuxOptionalFields2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectMessage copy$default(ConnectMessage connectMessage, List list, BayeuxOptionalFields bayeuxOptionalFields, BayeuxOptionalFields bayeuxOptionalFields2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = connectMessage.supportedConnectionTypes;
        }
        if ((i11 & 2) != 0) {
            bayeuxOptionalFields = connectMessage.handshakeOptionalFields;
        }
        if ((i11 & 4) != 0) {
            bayeuxOptionalFields2 = connectMessage.connectOptionalFields;
        }
        return connectMessage.copy(list, bayeuxOptionalFields, bayeuxOptionalFields2);
    }

    @NotNull
    public final List<String> component1() {
        return this.supportedConnectionTypes;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BayeuxOptionalFields getHandshakeOptionalFields() {
        return this.handshakeOptionalFields;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BayeuxOptionalFields getConnectOptionalFields() {
        return this.connectOptionalFields;
    }

    @NotNull
    public final ConnectMessage copy(@NotNull List<String> supportedConnectionTypes, @NotNull BayeuxOptionalFields handshakeOptionalFields, @NotNull BayeuxOptionalFields connectOptionalFields) {
        supportedConnectionTypes.getClass();
        handshakeOptionalFields.getClass();
        connectOptionalFields.getClass();
        return new ConnectMessage(supportedConnectionTypes, handshakeOptionalFields, connectOptionalFields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectMessage)) {
            return false;
        }
        ConnectMessage connectMessage = (ConnectMessage) other;
        return Intrinsics.areEqual(this.supportedConnectionTypes, connectMessage.supportedConnectionTypes) && Intrinsics.areEqual(this.handshakeOptionalFields, connectMessage.handshakeOptionalFields) && Intrinsics.areEqual(this.connectOptionalFields, connectMessage.connectOptionalFields);
    }

    @NotNull
    public final BayeuxOptionalFields getConnectOptionalFields() {
        return this.connectOptionalFields;
    }

    @NotNull
    public final BayeuxOptionalFields getHandshakeOptionalFields() {
        return this.handshakeOptionalFields;
    }

    @NotNull
    public final List<String> getSupportedConnectionTypes() {
        return this.supportedConnectionTypes;
    }

    public int hashCode() {
        return this.connectOptionalFields.hashCode() + ((this.handshakeOptionalFields.hashCode() + (this.supportedConnectionTypes.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ConnectMessage(supportedConnectionTypes=" + this.supportedConnectionTypes + ", handshakeOptionalFields=" + this.handshakeOptionalFields + ", connectOptionalFields=" + this.connectOptionalFields + ")";
    }

    public ConnectMessage(@NotNull List<String> list, @NotNull BayeuxOptionalFields bayeuxOptionalFields, @NotNull BayeuxOptionalFields bayeuxOptionalFields2) {
        list.getClass();
        bayeuxOptionalFields.getClass();
        bayeuxOptionalFields2.getClass();
        this.supportedConnectionTypes = list;
        this.handshakeOptionalFields = bayeuxOptionalFields;
        this.connectOptionalFields = bayeuxOptionalFields2;
    }

    public ConnectMessage() {
        this(null, null, null, 7, null);
    }
}
