package com.app.tgtg.model.remote.item.requests;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import db0.c;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010'\u0012\u0004\b+\u0010,\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010*R0\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/TrackingEventsRequest;", "", "Lcom/app/tgtg/model/remote/UserId;", "userId", "", "Lcom/app/tgtg/model/remote/item/requests/TrackingEventRequest;", "events", "<init>", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/TrackingEventsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-4FZwupo", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "copy-ao2lPlI", "(Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/remote/item/requests/TrackingEventsRequest;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId-4FZwupo", "setUserId-XWRqcnw", "(Ljava/lang/String;)V", "getUserId-4FZwupo$annotations", "()V", "Ljava/util/List;", "getEvents", "setEvents", "(Ljava/util/List;)V", "getEvents$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TrackingEventsRequest {

    @Nullable
    private List<TrackingEventRequest> events;

    @Nullable
    private String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new c(16))};

    private /* synthetic */ TrackingEventsRequest(int i11, String str, List list, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.userId = null;
        } else {
            this.userId = str;
        }
        if ((i11 & 2) == 0) {
            this.events = null;
        } else {
            this.events = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(TrackingEventRequest$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-ao2lPlI$default, reason: not valid java name */
    public static /* synthetic */ TrackingEventsRequest m383copyao2lPlI$default(TrackingEventsRequest trackingEventsRequest, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trackingEventsRequest.userId;
        }
        if ((i11 & 2) != 0) {
            list = trackingEventsRequest.events;
        }
        return trackingEventsRequest.m386copyao2lPlI(str, list);
    }

    public static final /* synthetic */ void write$Self$app(TrackingEventsRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.userId != null) {
            UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
            String str = self.userId;
            output.r(serialDesc, 0, userId$$serializer, str != null ? UserId.m286boximpl(str) : null);
        }
        if (!output.C(serialDesc) && self.events == null) {
            return;
        }
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.events);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-4FZwupo, reason: not valid java name and from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final List<TrackingEventRequest> component2() {
        return this.events;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ao2lPlI, reason: not valid java name */
    public final TrackingEventsRequest m386copyao2lPlI(@Nullable String userId, @Nullable List<TrackingEventRequest> events) {
        return new TrackingEventsRequest(userId, events, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.item.requests.TrackingEventsRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.item.requests.TrackingEventsRequest r5 = (com.app.tgtg.model.remote.item.requests.TrackingEventsRequest) r5
            java.lang.String r1 = r4.userId
            java.lang.String r3 = r5.userId
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.app.tgtg.model.remote.UserId.m290equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List<com.app.tgtg.model.remote.item.requests.TrackingEventRequest> r1 = r4.events
            java.util.List<com.app.tgtg.model.remote.item.requests.TrackingEventRequest> r5 = r5.events
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.requests.TrackingEventsRequest.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final List<TrackingEventRequest> getEvents() {
        return this.events;
    }

    @Nullable
    /* JADX INFO: renamed from: getUserId-4FZwupo, reason: not valid java name */
    public final String m387getUserId4FZwupo() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iM291hashCodeimpl = (str == null ? 0 : UserId.m291hashCodeimpl(str)) * 31;
        List<TrackingEventRequest> list = this.events;
        return iM291hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    public final void setEvents(@Nullable List<TrackingEventRequest> list) {
        this.events = list;
    }

    /* JADX INFO: renamed from: setUserId-XWRqcnw, reason: not valid java name */
    public final void m388setUserIdXWRqcnw(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        return "TrackingEventsRequest(userId=" + (str == null ? Address.ADDRESS_NULL_PLACEHOLDER : UserId.m292toStringimpl(str)) + ", events=" + this.events + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/TrackingEventsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/TrackingEventsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TrackingEventsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("events")
    public static /* synthetic */ void getEvents$annotations() {
    }

    @g("user_id")
    /* JADX INFO: renamed from: getUserId-4FZwupo$annotations, reason: not valid java name */
    public static /* synthetic */ void m384getUserId4FZwupo$annotations() {
    }

    public /* synthetic */ TrackingEventsRequest(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    public /* synthetic */ TrackingEventsRequest(int i11, String str, List list, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, list, m1Var);
    }

    private TrackingEventsRequest(String str, List<TrackingEventRequest> list) {
        this.userId = str;
        this.events = list;
    }

    public /* synthetic */ TrackingEventsRequest(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, null);
    }
}
