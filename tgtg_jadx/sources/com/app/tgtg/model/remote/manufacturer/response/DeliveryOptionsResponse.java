package com.app.tgtg.model.remote.manufacturer.response;

import eu.a;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u001e¨\u00064"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionsResponse;", "", "", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption;", "deliveryOptions", "", "preselectedDeliveryOptionId", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "firstDeliveryMethodShown", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionsResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;)Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDeliveryOptions", "getDeliveryOptions$annotations", "()V", "Ljava/lang/String;", "getPreselectedDeliveryOptionId", "getPreselectedDeliveryOptionId$annotations", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "getFirstDeliveryMethodShown", "getFirstDeliveryMethodShown$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DeliveryOptionsResponse {

    @Nullable
    private final List<DeliveryOption> deliveryOptions;

    @Nullable
    private final DeliveryOptionMethod firstDeliveryMethodShown;

    @Nullable
    private final String preselectedDeliveryOptionId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(21)), null, null};

    public /* synthetic */ DeliveryOptionsResponse(int i11, List list, String str, DeliveryOptionMethod deliveryOptionMethod, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, DeliveryOptionsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.deliveryOptions = list;
        this.preselectedDeliveryOptionId = str;
        this.firstDeliveryMethodShown = deliveryOptionMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(DeliveryOption$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryOptionsResponse copy$default(DeliveryOptionsResponse deliveryOptionsResponse, List list, String str, DeliveryOptionMethod deliveryOptionMethod, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = deliveryOptionsResponse.deliveryOptions;
        }
        if ((i11 & 2) != 0) {
            str = deliveryOptionsResponse.preselectedDeliveryOptionId;
        }
        if ((i11 & 4) != 0) {
            deliveryOptionMethod = deliveryOptionsResponse.firstDeliveryMethodShown;
        }
        return deliveryOptionsResponse.copy(list, str, deliveryOptionMethod);
    }

    public static final /* synthetic */ void write$Self$app(DeliveryOptionsResponse self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.deliveryOptions);
        output.r(serialDesc, 1, r1.f29848a, self.preselectedDeliveryOptionId);
        output.r(serialDesc, 2, DeliveryOptionMethodSerializer.INSTANCE, self.firstDeliveryMethodShown);
    }

    @Nullable
    public final List<DeliveryOption> component1() {
        return this.deliveryOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreselectedDeliveryOptionId() {
        return this.preselectedDeliveryOptionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeliveryOptionMethod getFirstDeliveryMethodShown() {
        return this.firstDeliveryMethodShown;
    }

    @NotNull
    public final DeliveryOptionsResponse copy(@Nullable List<DeliveryOption> deliveryOptions, @Nullable String preselectedDeliveryOptionId, @Nullable DeliveryOptionMethod firstDeliveryMethodShown) {
        return new DeliveryOptionsResponse(deliveryOptions, preselectedDeliveryOptionId, firstDeliveryMethodShown);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOptionsResponse)) {
            return false;
        }
        DeliveryOptionsResponse deliveryOptionsResponse = (DeliveryOptionsResponse) other;
        return Intrinsics.areEqual(this.deliveryOptions, deliveryOptionsResponse.deliveryOptions) && Intrinsics.areEqual(this.preselectedDeliveryOptionId, deliveryOptionsResponse.preselectedDeliveryOptionId) && this.firstDeliveryMethodShown == deliveryOptionsResponse.firstDeliveryMethodShown;
    }

    @Nullable
    public final List<DeliveryOption> getDeliveryOptions() {
        return this.deliveryOptions;
    }

    @Nullable
    public final DeliveryOptionMethod getFirstDeliveryMethodShown() {
        return this.firstDeliveryMethodShown;
    }

    @Nullable
    public final String getPreselectedDeliveryOptionId() {
        return this.preselectedDeliveryOptionId;
    }

    public int hashCode() {
        List<DeliveryOption> list = this.deliveryOptions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.preselectedDeliveryOptionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryOptionMethod deliveryOptionMethod = this.firstDeliveryMethodShown;
        return iHashCode2 + (deliveryOptionMethod != null ? deliveryOptionMethod.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryOptionsResponse(deliveryOptions=" + this.deliveryOptions + ", preselectedDeliveryOptionId=" + this.preselectedDeliveryOptionId + ", firstDeliveryMethodShown=" + this.firstDeliveryMethodShown + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionsResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DeliveryOptionsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("delivery_options")
    public static /* synthetic */ void getDeliveryOptions$annotations() {
    }

    @g("first_delivery_method_shown")
    public static /* synthetic */ void getFirstDeliveryMethodShown$annotations() {
    }

    @g("preselected_delivery_option_id")
    public static /* synthetic */ void getPreselectedDeliveryOptionId$annotations() {
    }

    public DeliveryOptionsResponse(@Nullable List<DeliveryOption> list, @Nullable String str, @Nullable DeliveryOptionMethod deliveryOptionMethod) {
        this.deliveryOptions = list;
        this.preselectedDeliveryOptionId = str;
        this.firstDeliveryMethodShown = deliveryOptionMethod;
    }
}
