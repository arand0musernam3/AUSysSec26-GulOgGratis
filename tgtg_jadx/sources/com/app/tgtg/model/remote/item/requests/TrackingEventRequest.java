package com.app.tgtg.model.remote.item.requests;

import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import n90.n;
import n90.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000289B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010'\u0012\u0004\b+\u0010,\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010*R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u00100R(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010'\u0012\u0004\b4\u0010,\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010*R(\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010'\u0012\u0004\b7\u0010,\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010*¨\u0006:"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/TrackingEventRequest;", "", "", "eventType", "Ln90/n;", "payload", "timeStampUtc", "timeStampLocal", "<init>", "(Ljava/lang/String;Ln90/n;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ln90/n;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/TrackingEventRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ln90/n;", "component3", "component4", "copy", "(Ljava/lang/String;Ln90/n;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/requests/TrackingEventRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventType", "setEventType", "(Ljava/lang/String;)V", "getEventType$annotations", "()V", "Ln90/n;", "getPayload", "setPayload", "(Ln90/n;)V", "getPayload$annotations", "getTimeStampUtc", "setTimeStampUtc", "getTimeStampUtc$annotations", "getTimeStampLocal", "setTimeStampLocal", "getTimeStampLocal$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TrackingEventRequest {

    @NotNull
    public static final String HEARTBEAT = "HEARTBEAT";

    @NotNull
    public static final String IMPRESSIONS = "IMPRESSIONS";

    @NotNull
    private String eventType;

    @Nullable
    private n payload;

    @NotNull
    private String timeStampLocal;

    @NotNull
    private String timeStampUtc;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ TrackingEventRequest(int i11, String str, n nVar, String str2, String str3, m1 m1Var) {
        if (13 != (i11 & 13)) {
            c1.j(i11, 13, TrackingEventRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventType = str;
        if ((i11 & 2) == 0) {
            this.payload = null;
        } else {
            this.payload = nVar;
        }
        this.timeStampUtc = str2;
        this.timeStampLocal = str3;
    }

    public static /* synthetic */ TrackingEventRequest copy$default(TrackingEventRequest trackingEventRequest, String str, n nVar, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trackingEventRequest.eventType;
        }
        if ((i11 & 2) != 0) {
            nVar = trackingEventRequest.payload;
        }
        if ((i11 & 4) != 0) {
            str2 = trackingEventRequest.timeStampUtc;
        }
        if ((i11 & 8) != 0) {
            str3 = trackingEventRequest.timeStampLocal;
        }
        return trackingEventRequest.copy(str, nVar, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(TrackingEventRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.eventType);
        if (output.C(serialDesc) || self.payload != null) {
            output.r(serialDesc, 1, q.f30781a, self.payload);
        }
        output.q(serialDesc, 2, self.timeStampUtc);
        output.q(serialDesc, 3, self.timeStampLocal);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final n getPayload() {
        return this.payload;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeStampUtc() {
        return this.timeStampUtc;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeStampLocal() {
        return this.timeStampLocal;
    }

    @NotNull
    public final TrackingEventRequest copy(@NotNull String eventType, @Nullable n payload, @NotNull String timeStampUtc, @NotNull String timeStampLocal) {
        eventType.getClass();
        timeStampUtc.getClass();
        timeStampLocal.getClass();
        return new TrackingEventRequest(eventType, payload, timeStampUtc, timeStampLocal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingEventRequest)) {
            return false;
        }
        TrackingEventRequest trackingEventRequest = (TrackingEventRequest) other;
        return Intrinsics.areEqual(this.eventType, trackingEventRequest.eventType) && Intrinsics.areEqual(this.payload, trackingEventRequest.payload) && Intrinsics.areEqual(this.timeStampUtc, trackingEventRequest.timeStampUtc) && Intrinsics.areEqual(this.timeStampLocal, trackingEventRequest.timeStampLocal);
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final n getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getTimeStampLocal() {
        return this.timeStampLocal;
    }

    @NotNull
    public final String getTimeStampUtc() {
        return this.timeStampUtc;
    }

    public int hashCode() {
        int iHashCode = this.eventType.hashCode() * 31;
        n nVar = this.payload;
        return this.timeStampLocal.hashCode() + l1.b((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.timeStampUtc);
    }

    public final void setEventType(@NotNull String str) {
        str.getClass();
        this.eventType = str;
    }

    public final void setPayload(@Nullable n nVar) {
        this.payload = nVar;
    }

    public final void setTimeStampLocal(@NotNull String str) {
        str.getClass();
        this.timeStampLocal = str;
    }

    public final void setTimeStampUtc(@NotNull String str) {
        str.getClass();
        this.timeStampUtc = str;
    }

    @NotNull
    public String toString() {
        String str = this.eventType;
        n nVar = this.payload;
        String str2 = this.timeStampUtc;
        String str3 = this.timeStampLocal;
        StringBuilder sb2 = new StringBuilder("TrackingEventRequest(eventType=");
        sb2.append(str);
        sb2.append(", payload=");
        sb2.append(nVar);
        sb2.append(", timeStampUtc=");
        return f.o(sb2, str2, ", timeStampLocal=", str3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/TrackingEventRequest$Companion;", "", "<init>", "()V", TrackingEventRequest.HEARTBEAT, "", TrackingEventRequest.IMPRESSIONS, "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/TrackingEventRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TrackingEventRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("event_type")
    public static /* synthetic */ void getEventType$annotations() {
    }

    @g("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @g("timestamp_local")
    public static /* synthetic */ void getTimeStampLocal$annotations() {
    }

    @g("timestamp_utc")
    public static /* synthetic */ void getTimeStampUtc$annotations() {
    }

    public TrackingEventRequest(@NotNull String str, @Nullable n nVar, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.eventType = str;
        this.payload = nVar;
        this.timeStampUtc = str2;
        this.timeStampLocal = str3;
    }

    public /* synthetic */ TrackingEventRequest(String str, n nVar, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : nVar, str2, str3);
    }
}
