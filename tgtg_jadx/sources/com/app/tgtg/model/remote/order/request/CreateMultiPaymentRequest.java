package com.app.tgtg.model.remote.order.request;

import com.app.tgtg.model.remote.order.Authorization;
import com.app.tgtg.model.remote.order.Authorization$$serializer;
import com.app.tgtg.model.remote.order.DiscountPayment;
import com.app.tgtg.model.remote.order.DiscountPayment$$serializer;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J2\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/app/tgtg/model/remote/order/request/CreateMultiPaymentRequest;", "", "", "Lcom/app/tgtg/model/remote/order/Authorization;", "authorizations", "Lcom/app/tgtg/model/remote/order/DiscountPayment;", "userDiscounts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/request/CreateMultiPaymentRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/app/tgtg/model/remote/order/request/CreateMultiPaymentRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAuthorizations", "getAuthorizations$annotations", "()V", "getUserDiscounts", "getUserDiscounts$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CreateMultiPaymentRequest {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<Authorization> authorizations;

    @Nullable
    private final List<DiscountPayment> userDiscounts;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(1)), l.a(mVar, new a(2))};
    }

    public /* synthetic */ CreateMultiPaymentRequest(int i11, List list, List list2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, CreateMultiPaymentRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.authorizations = list;
        this.userDiscounts = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Authorization$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(DiscountPayment$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateMultiPaymentRequest copy$default(CreateMultiPaymentRequest createMultiPaymentRequest, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = createMultiPaymentRequest.authorizations;
        }
        if ((i11 & 2) != 0) {
            list2 = createMultiPaymentRequest.userDiscounts;
        }
        return createMultiPaymentRequest.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$app(CreateMultiPaymentRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.authorizations);
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.userDiscounts);
    }

    @NotNull
    public final List<Authorization> component1() {
        return this.authorizations;
    }

    @Nullable
    public final List<DiscountPayment> component2() {
        return this.userDiscounts;
    }

    @NotNull
    public final CreateMultiPaymentRequest copy(@NotNull List<Authorization> authorizations, @Nullable List<DiscountPayment> userDiscounts) {
        authorizations.getClass();
        return new CreateMultiPaymentRequest(authorizations, userDiscounts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateMultiPaymentRequest)) {
            return false;
        }
        CreateMultiPaymentRequest createMultiPaymentRequest = (CreateMultiPaymentRequest) other;
        return Intrinsics.areEqual(this.authorizations, createMultiPaymentRequest.authorizations) && Intrinsics.areEqual(this.userDiscounts, createMultiPaymentRequest.userDiscounts);
    }

    @NotNull
    public final List<Authorization> getAuthorizations() {
        return this.authorizations;
    }

    @Nullable
    public final List<DiscountPayment> getUserDiscounts() {
        return this.userDiscounts;
    }

    public int hashCode() {
        int iHashCode = this.authorizations.hashCode() * 31;
        List<DiscountPayment> list = this.userDiscounts;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreateMultiPaymentRequest(authorizations=" + this.authorizations + ", userDiscounts=" + this.userDiscounts + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/request/CreateMultiPaymentRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/request/CreateMultiPaymentRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CreateMultiPaymentRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("authorizations")
    public static /* synthetic */ void getAuthorizations$annotations() {
    }

    @g("user_discounts")
    public static /* synthetic */ void getUserDiscounts$annotations() {
    }

    public CreateMultiPaymentRequest(@NotNull List<Authorization> list, @Nullable List<DiscountPayment> list2) {
        list.getClass();
        this.authorizations = list;
        this.userDiscounts = list2;
    }
}
