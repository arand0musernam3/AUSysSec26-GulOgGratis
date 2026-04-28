package com.app.tgtg.model.remote.order.response;

import com.app.tgtg.model.remote.order.OrderInfo;
import com.app.tgtg.model.remote.order.OrderInfo$$serializer;
import com.app.tgtg.model.remote.serializer.EnumWithUnknownSerializer;
import e0.f;
import i90.g;
import i90.h;
import java.util.List;
import jq.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00045674B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001cR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001e¨\u00068"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse;", "", "Lcom/app/tgtg/model/remote/order/OrderInfo;", "order", "Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;", "state", "", "Lcom/app/tgtg/model/remote/order/response/ItemError;", "itemLevelErrors", "<init>", "(Lcom/app/tgtg/model/remote/order/OrderInfo;Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/OrderInfo;Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/order/OrderInfo;", "component2", "()Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;", "component3", "()Ljava/util/List;", "copy", "(Lcom/app/tgtg/model/remote/order/OrderInfo;Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;Ljava/util/List;)Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/order/OrderInfo;", "getOrder", "getOrder$annotations", "()V", "Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;", "getState", "getState$annotations", "Ljava/util/List;", "getItemLevelErrors", "getItemLevelErrors$annotations", "Companion", "CreateOrderState", "CreateOrderStateSerializer", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CreateOrderResponse {

    @Nullable
    private final List<ItemError> itemLevelErrors;

    @Nullable
    private final OrderInfo order;

    @NotNull
    private final CreateOrderState state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new a(11))};

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderStateSerializer;", "Lcom/app/tgtg/model/remote/serializer/EnumWithUnknownSerializer;", "Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreateOrderStateSerializer extends EnumWithUnknownSerializer<CreateOrderState> {

        @NotNull
        public static final CreateOrderStateSerializer INSTANCE = new CreateOrderStateSerializer();
        public static final int $stable = 8;

        private CreateOrderStateSerializer() {
            super(CreateOrderState.getEntries(), CreateOrderState.UNKNOWN);
        }
    }

    public /* synthetic */ CreateOrderResponse(int i11, OrderInfo orderInfo, CreateOrderState createOrderState, List list, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, CreateOrderResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.order = orderInfo;
        this.state = createOrderState;
        this.itemLevelErrors = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ItemError$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateOrderResponse copy$default(CreateOrderResponse createOrderResponse, OrderInfo orderInfo, CreateOrderState createOrderState, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orderInfo = createOrderResponse.order;
        }
        if ((i11 & 2) != 0) {
            createOrderState = createOrderResponse.state;
        }
        if ((i11 & 4) != 0) {
            list = createOrderResponse.itemLevelErrors;
        }
        return createOrderResponse.copy(orderInfo, createOrderState, list);
    }

    public static final /* synthetic */ void write$Self$app(CreateOrderResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, OrderInfo$$serializer.INSTANCE, self.order);
        output.i(serialDesc, 1, CreateOrderStateSerializer.INSTANCE, self.state);
        output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.itemLevelErrors);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrderInfo getOrder() {
        return this.order;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CreateOrderState getState() {
        return this.state;
    }

    @Nullable
    public final List<ItemError> component3() {
        return this.itemLevelErrors;
    }

    @NotNull
    public final CreateOrderResponse copy(@Nullable OrderInfo order, @NotNull CreateOrderState state, @Nullable List<ItemError> itemLevelErrors) {
        state.getClass();
        return new CreateOrderResponse(order, state, itemLevelErrors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderResponse)) {
            return false;
        }
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) other;
        return Intrinsics.areEqual(this.order, createOrderResponse.order) && this.state == createOrderResponse.state && Intrinsics.areEqual(this.itemLevelErrors, createOrderResponse.itemLevelErrors);
    }

    @Nullable
    public final List<ItemError> getItemLevelErrors() {
        return this.itemLevelErrors;
    }

    @Nullable
    public final OrderInfo getOrder() {
        return this.order;
    }

    @NotNull
    public final CreateOrderState getState() {
        return this.state;
    }

    public int hashCode() {
        OrderInfo orderInfo = this.order;
        int iHashCode = (this.state.hashCode() + ((orderInfo == null ? 0 : orderInfo.hashCode()) * 31)) * 31;
        List<ItemError> list = this.itemLevelErrors;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OrderInfo orderInfo = this.order;
        CreateOrderState createOrderState = this.state;
        List<ItemError> list = this.itemLevelErrors;
        StringBuilder sb2 = new StringBuilder("CreateOrderResponse(order=");
        sb2.append(orderInfo);
        sb2.append(", state=");
        sb2.append(createOrderState);
        sb2.append(", itemLevelErrors=");
        return f.p(sb2, list, ")");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;", "", "<init>", "(Ljava/lang/String;I)V", "USER_BLOCKED", "SALE_CLOSED", "SOLD_OUT", "OVER_USER_WINDOW_LIMIT", "INSUFFICIENT_STOCK", "API_ERROR", "SUCCESS", "BASKET_ITEM_COUNT_EXCEEDED", "MISSING_TAX_DATA", "TAX_SERVICE_DOWN", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h(with = CreateOrderStateSerializer.class)
    public static final class CreateOrderState {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ CreateOrderState[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final CreateOrderState USER_BLOCKED = new CreateOrderState("USER_BLOCKED", 0);
        public static final CreateOrderState SALE_CLOSED = new CreateOrderState("SALE_CLOSED", 1);
        public static final CreateOrderState SOLD_OUT = new CreateOrderState("SOLD_OUT", 2);
        public static final CreateOrderState OVER_USER_WINDOW_LIMIT = new CreateOrderState("OVER_USER_WINDOW_LIMIT", 3);
        public static final CreateOrderState INSUFFICIENT_STOCK = new CreateOrderState("INSUFFICIENT_STOCK", 4);
        public static final CreateOrderState API_ERROR = new CreateOrderState("API_ERROR", 5);
        public static final CreateOrderState SUCCESS = new CreateOrderState("SUCCESS", 6);
        public static final CreateOrderState BASKET_ITEM_COUNT_EXCEEDED = new CreateOrderState("BASKET_ITEM_COUNT_EXCEEDED", 7);
        public static final CreateOrderState MISSING_TAX_DATA = new CreateOrderState("MISSING_TAX_DATA", 8);
        public static final CreateOrderState TAX_SERVICE_DOWN = new CreateOrderState("TAX_SERVICE_DOWN", 9);
        public static final CreateOrderState UNKNOWN = new CreateOrderState("UNKNOWN", 10);

        private static final /* synthetic */ CreateOrderState[] $values() {
            return new CreateOrderState[]{USER_BLOCKED, SALE_CLOSED, SOLD_OUT, OVER_USER_WINDOW_LIMIT, INSUFFICIENT_STOCK, API_ERROR, SUCCESS, BASKET_ITEM_COUNT_EXCEEDED, MISSING_TAX_DATA, TAX_SERVICE_DOWN, UNKNOWN};
        }

        static {
            CreateOrderState[] createOrderStateArr$values = $values();
            $VALUES = createOrderStateArr$values;
            $ENTRIES = n.w(createOrderStateArr$values);
            INSTANCE = new Companion(null);
        }

        private CreateOrderState(String str, int i11) {
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static CreateOrderState valueOf(String str) {
            return (CreateOrderState) Enum.valueOf(CreateOrderState.class, str);
        }

        public static CreateOrderState[] values() {
            return (CreateOrderState[]) $VALUES.clone();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$CreateOrderState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CreateOrderStateSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/response/CreateOrderResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CreateOrderResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("item_level_errors")
    public static /* synthetic */ void getItemLevelErrors$annotations() {
    }

    @g("order")
    public static /* synthetic */ void getOrder$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    public CreateOrderResponse(@Nullable OrderInfo orderInfo, @NotNull CreateOrderState createOrderState, @Nullable List<ItemError> list) {
        createOrderState.getClass();
        this.order = orderInfo;
        this.state = createOrderState;
        this.itemLevelErrors = list;
    }
}
