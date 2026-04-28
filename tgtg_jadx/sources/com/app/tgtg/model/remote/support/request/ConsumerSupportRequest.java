package com.app.tgtg.model.remote.support.request;

import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.braze.models.inappmessage.InAppMessageBase;
import i90.h;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.g;
import m90.k1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr.r;
import u70.j;
import u70.l;
import u70.m;
import wr.b;
import wr.c;
import wr.e;
import wr.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZBs\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bw\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J|\u0010'\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u00107\u0012\u0004\b;\u0010<\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010:R*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010=\u0012\u0004\bA\u0010<\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010@R*\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010=\u0012\u0004\bD\u0010<\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010@R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010E\u0012\u0004\bI\u0010<\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010HR*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010J\u0012\u0004\bN\u0010<\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010MR*\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010=\u0012\u0004\bQ\u0010<\u001a\u0004\bO\u0010\u001a\"\u0004\bP\u0010@R0\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u00107\u0012\u0004\bT\u0010<\u001a\u0004\bR\u0010\u0018\"\u0004\bS\u0010:R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010U\u0012\u0004\bY\u0010<\u001a\u0004\bV\u0010$\"\u0004\bW\u0010X¨\u0006\\"}, d2 = {"Lcom/app/tgtg/model/remote/support/request/ConsumerSupportRequest;", "", "", "", "fileUrls", InAppMessageBase.MESSAGE, "subject", "Lwr/b;", "reason", "Lwr/e;", "topic", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "refundingTypes", "", "confirmationForDuplicateRequests", "<init>", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwr/b;Lwr/e;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(I[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwr/b;Lwr/e;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Boolean;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()[Ljava/lang/String;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lwr/b;", "component5", "()Lwr/e;", "component6-awLnToY", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "copy-TTXvpDM", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwr/b;Lwr/e;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/support/request/ConsumerSupportRequest;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/support/request/ConsumerSupportRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "[Ljava/lang/String;", "getFileUrls", "setFileUrls", "([Ljava/lang/String;)V", "getFileUrls$annotations", "()V", "Ljava/lang/String;", "getMessage", "setMessage", "(Ljava/lang/String;)V", "getMessage$annotations", "getSubject", "setSubject", "getSubject$annotations", "Lwr/b;", "getReason", "setReason", "(Lwr/b;)V", "getReason$annotations", "Lwr/e;", "getTopic", "setTopic", "(Lwr/e;)V", "getTopic$annotations", "getOrderId-awLnToY", "setOrderId-0aItd38", "getOrderId-awLnToY$annotations", "getRefundingTypes", "setRefundingTypes", "getRefundingTypes$annotations", "Ljava/lang/Boolean;", "getConfirmationForDuplicateRequests", "setConfirmationForDuplicateRequests", "(Ljava/lang/Boolean;)V", "getConfirmationForDuplicateRequests$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ConsumerSupportRequest {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private Boolean confirmationForDuplicateRequests;

    @Nullable
    private String[] fileUrls;

    @Nullable
    private String message;

    @Nullable
    private String orderId;

    @Nullable
    private b reason;

    @Nullable
    private String[] refundingTypes;

    @Nullable
    private String subject;

    @Nullable
    private e topic;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new r(5)), null, null, null, null, null, l.a(mVar, new r(6)), null};
    }

    private /* synthetic */ ConsumerSupportRequest(int i11, String[] strArr, String str, String str2, b bVar, e eVar, String str3, String[] strArr2, Boolean bool, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.fileUrls = null;
        } else {
            this.fileUrls = strArr;
        }
        if ((i11 & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i11 & 4) == 0) {
            this.subject = null;
        } else {
            this.subject = str2;
        }
        if ((i11 & 8) == 0) {
            this.reason = null;
        } else {
            this.reason = bVar;
        }
        if ((i11 & 16) == 0) {
            this.topic = null;
        } else {
            this.topic = eVar;
        }
        if ((i11 & 32) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str3;
        }
        if ((i11 & 64) == 0) {
            this.refundingTypes = null;
        } else {
            this.refundingTypes = strArr2;
        }
        if ((i11 & 128) == 0) {
            this.confirmationForDuplicateRequests = null;
        } else {
            this.confirmationForDuplicateRequests = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new k1(Reflection.getOrCreateKotlinClass(String.class), r1.f29848a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new k1(Reflection.getOrCreateKotlinClass(String.class), r1.f29848a);
    }

    /* JADX INFO: renamed from: copy-TTXvpDM$default, reason: not valid java name */
    public static /* synthetic */ ConsumerSupportRequest m498copyTTXvpDM$default(ConsumerSupportRequest consumerSupportRequest, String[] strArr, String str, String str2, b bVar, e eVar, String str3, String[] strArr2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            strArr = consumerSupportRequest.fileUrls;
        }
        if ((i11 & 2) != 0) {
            str = consumerSupportRequest.message;
        }
        if ((i11 & 4) != 0) {
            str2 = consumerSupportRequest.subject;
        }
        if ((i11 & 8) != 0) {
            bVar = consumerSupportRequest.reason;
        }
        if ((i11 & 16) != 0) {
            eVar = consumerSupportRequest.topic;
        }
        if ((i11 & 32) != 0) {
            str3 = consumerSupportRequest.orderId;
        }
        if ((i11 & 64) != 0) {
            strArr2 = consumerSupportRequest.refundingTypes;
        }
        if ((i11 & 128) != 0) {
            bool = consumerSupportRequest.confirmationForDuplicateRequests;
        }
        String[] strArr3 = strArr2;
        Boolean bool2 = bool;
        e eVar2 = eVar;
        String str4 = str3;
        return consumerSupportRequest.m501copyTTXvpDM(strArr, str, str2, bVar, eVar2, str4, strArr3, bool2);
    }

    public static final /* synthetic */ void write$Self$app(ConsumerSupportRequest self, l90.b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.fileUrls != null) {
            output.r(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.fileUrls);
        }
        if (output.C(serialDesc) || self.message != null) {
            output.r(serialDesc, 1, r1.f29848a, self.message);
        }
        if (output.C(serialDesc) || self.subject != null) {
            output.r(serialDesc, 2, r1.f29848a, self.subject);
        }
        if (output.C(serialDesc) || self.reason != null) {
            output.r(serialDesc, 3, c.f43521a, self.reason);
        }
        if (output.C(serialDesc) || self.topic != null) {
            output.r(serialDesc, 4, f.f43522a, self.topic);
        }
        if (output.C(serialDesc) || self.orderId != null) {
            OrderId$$serializer orderId$$serializer = OrderId$$serializer.INSTANCE;
            String str = self.orderId;
            output.r(serialDesc, 5, orderId$$serializer, str != null ? OrderId.m209boximpl(str) : null);
        }
        if (output.C(serialDesc) || self.refundingTypes != null) {
            output.r(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.refundingTypes);
        }
        if (!output.C(serialDesc) && self.confirmationForDuplicateRequests == null) {
            return;
        }
        output.r(serialDesc, 7, g.f29797a, self.confirmationForDuplicateRequests);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String[] getFileUrls() {
        return this.fileUrls;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final b getReason() {
        return this.reason;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final e getTopic() {
        return this.topic;
    }

    @Nullable
    /* JADX INFO: renamed from: component6-awLnToY, reason: not valid java name and from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String[] getRefundingTypes() {
        return this.refundingTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getConfirmationForDuplicateRequests() {
        return this.confirmationForDuplicateRequests;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-TTXvpDM, reason: not valid java name */
    public final ConsumerSupportRequest m501copyTTXvpDM(@Nullable String[] fileUrls, @Nullable String message, @Nullable String subject, @Nullable b reason, @Nullable e topic, @Nullable String orderId, @Nullable String[] refundingTypes, @Nullable Boolean confirmationForDuplicateRequests) {
        return new ConsumerSupportRequest(fileUrls, message, subject, reason, topic, orderId, refundingTypes, confirmationForDuplicateRequests, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
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
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.support.request.ConsumerSupportRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.support.request.ConsumerSupportRequest r5 = (com.app.tgtg.model.remote.support.request.ConsumerSupportRequest) r5
            java.lang.String[] r1 = r4.fileUrls
            java.lang.String[] r3 = r5.fileUrls
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.message
            java.lang.String r3 = r5.message
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.subject
            java.lang.String r3 = r5.subject
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            wr.b r1 = r4.reason
            wr.b r3 = r5.reason
            if (r1 == r3) goto L34
            return r2
        L34:
            wr.e r1 = r4.topic
            wr.e r3 = r5.topic
            if (r1 == r3) goto L3b
            return r2
        L3b:
            java.lang.String r1 = r4.orderId
            java.lang.String r3 = r5.orderId
            if (r1 != 0) goto L47
            if (r3 != 0) goto L45
            r1 = r0
            goto L4e
        L45:
            r1 = r2
            goto L4e
        L47:
            if (r3 != 0) goto L4a
            goto L45
        L4a:
            boolean r1 = com.app.tgtg.model.remote.OrderId.m213equalsimpl0(r1, r3)
        L4e:
            if (r1 != 0) goto L51
            return r2
        L51:
            java.lang.String[] r1 = r4.refundingTypes
            java.lang.String[] r3 = r5.refundingTypes
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.lang.Boolean r1 = r4.confirmationForDuplicateRequests
            java.lang.Boolean r5 = r5.confirmationForDuplicateRequests
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L67
            return r2
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.support.request.ConsumerSupportRequest.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final Boolean getConfirmationForDuplicateRequests() {
        return this.confirmationForDuplicateRequests;
    }

    @Nullable
    public final String[] getFileUrls() {
        return this.fileUrls;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: getOrderId-awLnToY, reason: not valid java name */
    public final String m502getOrderIdawLnToY() {
        return this.orderId;
    }

    @Nullable
    public final b getReason() {
        return this.reason;
    }

    @Nullable
    public final String[] getRefundingTypes() {
        return this.refundingTypes;
    }

    @Nullable
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    public final e getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String[] strArr = this.fileUrls;
        int iHashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subject;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.reason;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e eVar = this.topic;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str3 = this.orderId;
        int iM214hashCodeimpl = (iHashCode5 + (str3 == null ? 0 : OrderId.m214hashCodeimpl(str3))) * 31;
        String[] strArr2 = this.refundingTypes;
        int iHashCode6 = (iM214hashCodeimpl + (strArr2 == null ? 0 : Arrays.hashCode(strArr2))) * 31;
        Boolean bool = this.confirmationForDuplicateRequests;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setConfirmationForDuplicateRequests(@Nullable Boolean bool) {
        this.confirmationForDuplicateRequests = bool;
    }

    public final void setFileUrls(@Nullable String[] strArr) {
        this.fileUrls = strArr;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    /* JADX INFO: renamed from: setOrderId-0aItd38, reason: not valid java name */
    public final void m503setOrderId0aItd38(@Nullable String str) {
        this.orderId = str;
    }

    public final void setReason(@Nullable b bVar) {
        this.reason = bVar;
    }

    public final void setRefundingTypes(@Nullable String[] strArr) {
        this.refundingTypes = strArr;
    }

    public final void setSubject(@Nullable String str) {
        this.subject = str;
    }

    public final void setTopic(@Nullable e eVar) {
        this.topic = eVar;
    }

    @NotNull
    public String toString() {
        String string = Arrays.toString(this.fileUrls);
        String str = this.message;
        String str2 = this.subject;
        b bVar = this.reason;
        e eVar = this.topic;
        String str3 = this.orderId;
        String strM215toStringimpl = str3 == null ? Address.ADDRESS_NULL_PLACEHOLDER : OrderId.m215toStringimpl(str3);
        String string2 = Arrays.toString(this.refundingTypes);
        Boolean bool = this.confirmationForDuplicateRequests;
        StringBuilder sbT = e0.f.t("ConsumerSupportRequest(fileUrls=", string, ", message=", str, ", subject=");
        sbT.append(str2);
        sbT.append(", reason=");
        sbT.append(bVar);
        sbT.append(", topic=");
        sbT.append(eVar);
        sbT.append(", orderId=");
        sbT.append(strM215toStringimpl);
        sbT.append(", refundingTypes=");
        sbT.append(string2);
        sbT.append(", confirmationForDuplicateRequests=");
        sbT.append(bool);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/support/request/ConsumerSupportRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/support/request/ConsumerSupportRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ConsumerSupportRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @i90.g("confirmation_required_for_duplicate_requests")
    public static /* synthetic */ void getConfirmationForDuplicateRequests$annotations() {
    }

    @i90.g("file_urls")
    public static /* synthetic */ void getFileUrls$annotations() {
    }

    @i90.g(InAppMessageBase.MESSAGE)
    public static /* synthetic */ void getMessage$annotations() {
    }

    @i90.g("order_id")
    /* JADX INFO: renamed from: getOrderId-awLnToY$annotations, reason: not valid java name */
    public static /* synthetic */ void m499getOrderIdawLnToY$annotations() {
    }

    @i90.g("reason")
    public static /* synthetic */ void getReason$annotations() {
    }

    @i90.g("refunding_types")
    public static /* synthetic */ void getRefundingTypes$annotations() {
    }

    @i90.g("subject")
    public static /* synthetic */ void getSubject$annotations() {
    }

    @i90.g("topic")
    public static /* synthetic */ void getTopic$annotations() {
    }

    public /* synthetic */ ConsumerSupportRequest(String[] strArr, String str, String str2, b bVar, e eVar, String str3, String[] strArr2, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr, str, str2, bVar, eVar, str3, strArr2, bool);
    }

    public /* synthetic */ ConsumerSupportRequest(int i11, String[] strArr, String str, String str2, b bVar, e eVar, String str3, String[] strArr2, Boolean bool, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, strArr, str, str2, bVar, eVar, str3, strArr2, bool, m1Var);
    }

    private ConsumerSupportRequest(String[] strArr, String str, String str2, b bVar, e eVar, String str3, String[] strArr2, Boolean bool) {
        this.fileUrls = strArr;
        this.message = str;
        this.subject = str2;
        this.reason = bVar;
        this.topic = eVar;
        this.orderId = str3;
        this.refundingTypes = strArr2;
        this.confirmationForDuplicateRequests = bool;
    }

    public /* synthetic */ ConsumerSupportRequest(String[] strArr, String str, String str2, b bVar, e eVar, String str3, String[] strArr2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : strArr, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : bVar, (i11 & 16) != 0 ? null : eVar, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : strArr2, (i11 & 128) == 0 ? bool : null, null);
    }
}
