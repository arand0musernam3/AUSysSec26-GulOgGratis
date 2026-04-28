package com.braze.events;

import com.braze.requests.f;
import com.braze.requests.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0010R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent;", "", "Lcom/braze/requests/o;", "brazeRequest", "Lcom/braze/communication/d;", "httpConnectorResult", "<init>", "(Lcom/braze/requests/o;Lcom/braze/communication/d;)V", "component1", "()Lcom/braze/requests/o;", "component2", "()Lcom/braze/communication/d;", "copy", "(Lcom/braze/requests/o;Lcom/braze/communication/d;)Lcom/braze/events/BrazeNetworkFailureEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/braze/requests/o;", "Lcom/braze/communication/d;", "responseCode", "I", "getResponseCode", "", "responseHeaders", "Ljava/util/Map;", "getResponseHeaders", "()Ljava/util/Map;", "", "requestInitiationTime", "Ljava/lang/Long;", "getRequestInitiationTime", "()Ljava/lang/Long;", "requestUrl", "Ljava/lang/String;", "getRequestUrl", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "requestType", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "getRequestType", "()Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "RequestType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BrazeNetworkFailureEvent {
    private final o brazeRequest;
    private final com.braze.communication.d httpConnectorResult;
    private final Long requestInitiationTime;
    private final RequestType requestType;
    private final String requestUrl;
    private final int responseCode;
    private final Map<String, String> responseHeaders;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT_CARDS_SYNC", "OTHER", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequestType {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ RequestType[] $VALUES;
        public static final RequestType CONTENT_CARDS_SYNC = new RequestType("CONTENT_CARDS_SYNC", 0);
        public static final RequestType OTHER = new RequestType("OTHER", 1);

        private static final /* synthetic */ RequestType[] $values() {
            return new RequestType[]{CONTENT_CARDS_SYNC, OTHER};
        }

        static {
            RequestType[] requestTypeArr$values = $values();
            $VALUES = requestTypeArr$values;
            $ENTRIES = n.w(requestTypeArr$values);
        }

        private RequestType(String str, int i11) {
        }

        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static RequestType valueOf(String str) {
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }

        public static RequestType[] values() {
            return (RequestType[]) $VALUES.clone();
        }
    }

    public BrazeNetworkFailureEvent(o oVar, com.braze.communication.d dVar) {
        oVar.getClass();
        dVar.getClass();
        this.brazeRequest = oVar;
        this.httpConnectorResult = dVar;
        this.responseCode = dVar.f9592a;
        this.responseHeaders = dVar.f9593b;
        com.braze.requests.b bVar = (com.braze.requests.b) oVar;
        this.requestInitiationTime = bVar.f10359e;
        this.requestUrl = bVar.e().f10479a;
        this.requestType = oVar instanceof f ? RequestType.CONTENT_CARDS_SYNC : RequestType.OTHER;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final o getBrazeRequest() {
        return this.brazeRequest;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final com.braze.communication.d getHttpConnectorResult() {
        return this.httpConnectorResult;
    }

    public static /* synthetic */ BrazeNetworkFailureEvent copy$default(BrazeNetworkFailureEvent brazeNetworkFailureEvent, o oVar, com.braze.communication.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            oVar = brazeNetworkFailureEvent.brazeRequest;
        }
        if ((i11 & 2) != 0) {
            dVar = brazeNetworkFailureEvent.httpConnectorResult;
        }
        return brazeNetworkFailureEvent.copy(oVar, dVar);
    }

    public final BrazeNetworkFailureEvent copy(o brazeRequest, com.braze.communication.d httpConnectorResult) {
        brazeRequest.getClass();
        httpConnectorResult.getClass();
        return new BrazeNetworkFailureEvent(brazeRequest, httpConnectorResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrazeNetworkFailureEvent)) {
            return false;
        }
        BrazeNetworkFailureEvent brazeNetworkFailureEvent = (BrazeNetworkFailureEvent) other;
        return Intrinsics.areEqual(this.brazeRequest, brazeNetworkFailureEvent.brazeRequest) && Intrinsics.areEqual(this.httpConnectorResult, brazeNetworkFailureEvent.httpConnectorResult);
    }

    public final Long getRequestInitiationTime() {
        return this.requestInitiationTime;
    }

    public final RequestType getRequestType() {
        return this.requestType;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public int hashCode() {
        return this.httpConnectorResult.hashCode() + (this.brazeRequest.hashCode() * 31);
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(brazeRequest=" + this.brazeRequest + ", httpConnectorResult=" + this.httpConnectorResult + ")";
    }
}
