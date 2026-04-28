package com.app.tgtg.model.remote.profile.response;

import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.Order$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.profile.ProfileCO2Saved;
import com.app.tgtg.model.remote.profile.ProfileCO2Saved$$serializer;
import e0.f;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(Jb\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010#R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010%\"\u0004\b@\u0010AR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010%R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bF\u00107\u001a\u0004\bE\u0010(¨\u0006I"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse;", "", "Lcom/app/tgtg/model/remote/order/Order;", "latestCompletedOrder", "Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;", "co2eSaved", "Lcom/app/tgtg/model/remote/payment/Price;", "moneySaved", "", "pendingOrders", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;", "profileFeatures", "Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;", "voucherTooltip", "<init>", "(Lcom/app/tgtg/model/remote/order/Order;Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/Order;Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/order/Order;", "component2", "()Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;", "component3", "()Lcom/app/tgtg/model/remote/payment/Price;", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;", "copy", "(Lcom/app/tgtg/model/remote/order/Order;Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;)Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/order/Order;", "getLatestCompletedOrder", "getLatestCompletedOrder$annotations", "()V", "Lcom/app/tgtg/model/remote/profile/ProfileCO2Saved;", "getCo2eSaved", "getCo2eSaved$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getMoneySaved", "getMoneySaved$annotations", "Ljava/util/List;", "getPendingOrders", "setPendingOrders", "(Ljava/util/List;)V", "getProfileFeatures", "getProfileFeatures$annotations", "Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;", "getVoucherTooltip", "getVoucherTooltip$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProfileScreenResponse {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final ProfileCO2Saved co2eSaved;

    @Nullable
    private final Order latestCompletedOrder;

    @Nullable
    private final Price moneySaved;

    @Nullable
    private List<Order> pendingOrders;

    @NotNull
    private final List<ProfileFeature> profileFeatures;

    @Nullable
    private final ProfileVoucherTooltip voucherTooltip;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, l.a(mVar, new a(13)), l.a(mVar, new a(14)), null};
    }

    public /* synthetic */ ProfileScreenResponse(int i11, Order order, ProfileCO2Saved profileCO2Saved, Price price, List list, List list2, ProfileVoucherTooltip profileVoucherTooltip, m1 m1Var) {
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, ProfileScreenResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.latestCompletedOrder = order;
        this.co2eSaved = profileCO2Saved;
        this.moneySaved = price;
        this.pendingOrders = list;
        this.profileFeatures = list2;
        this.voucherTooltip = profileVoucherTooltip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Order$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(ProfileFeature$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileScreenResponse copy$default(ProfileScreenResponse profileScreenResponse, Order order, ProfileCO2Saved profileCO2Saved, Price price, List list, List list2, ProfileVoucherTooltip profileVoucherTooltip, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            order = profileScreenResponse.latestCompletedOrder;
        }
        if ((i11 & 2) != 0) {
            profileCO2Saved = profileScreenResponse.co2eSaved;
        }
        if ((i11 & 4) != 0) {
            price = profileScreenResponse.moneySaved;
        }
        if ((i11 & 8) != 0) {
            list = profileScreenResponse.pendingOrders;
        }
        if ((i11 & 16) != 0) {
            list2 = profileScreenResponse.profileFeatures;
        }
        if ((i11 & 32) != 0) {
            profileVoucherTooltip = profileScreenResponse.voucherTooltip;
        }
        List list3 = list2;
        ProfileVoucherTooltip profileVoucherTooltip2 = profileVoucherTooltip;
        return profileScreenResponse.copy(order, profileCO2Saved, price, list, list3, profileVoucherTooltip2);
    }

    public static final /* synthetic */ void write$Self$app(ProfileScreenResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, Order$$serializer.INSTANCE, self.latestCompletedOrder);
        output.r(serialDesc, 1, ProfileCO2Saved$$serializer.INSTANCE, self.co2eSaved);
        output.r(serialDesc, 2, Price$$serializer.INSTANCE, self.moneySaved);
        output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.pendingOrders);
        output.i(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.profileFeatures);
        output.r(serialDesc, 5, ProfileVoucherTooltip$$serializer.INSTANCE, self.voucherTooltip);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Order getLatestCompletedOrder() {
        return this.latestCompletedOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProfileCO2Saved getCo2eSaved() {
        return this.co2eSaved;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Price getMoneySaved() {
        return this.moneySaved;
    }

    @Nullable
    public final List<Order> component4() {
        return this.pendingOrders;
    }

    @NotNull
    public final List<ProfileFeature> component5() {
        return this.profileFeatures;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProfileVoucherTooltip getVoucherTooltip() {
        return this.voucherTooltip;
    }

    @NotNull
    public final ProfileScreenResponse copy(@Nullable Order latestCompletedOrder, @Nullable ProfileCO2Saved co2eSaved, @Nullable Price moneySaved, @Nullable List<Order> pendingOrders, @NotNull List<ProfileFeature> profileFeatures, @Nullable ProfileVoucherTooltip voucherTooltip) {
        profileFeatures.getClass();
        return new ProfileScreenResponse(latestCompletedOrder, co2eSaved, moneySaved, pendingOrders, profileFeatures, voucherTooltip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileScreenResponse)) {
            return false;
        }
        ProfileScreenResponse profileScreenResponse = (ProfileScreenResponse) other;
        return Intrinsics.areEqual(this.latestCompletedOrder, profileScreenResponse.latestCompletedOrder) && Intrinsics.areEqual(this.co2eSaved, profileScreenResponse.co2eSaved) && Intrinsics.areEqual(this.moneySaved, profileScreenResponse.moneySaved) && Intrinsics.areEqual(this.pendingOrders, profileScreenResponse.pendingOrders) && Intrinsics.areEqual(this.profileFeatures, profileScreenResponse.profileFeatures) && Intrinsics.areEqual(this.voucherTooltip, profileScreenResponse.voucherTooltip);
    }

    @Nullable
    public final ProfileCO2Saved getCo2eSaved() {
        return this.co2eSaved;
    }

    @Nullable
    public final Order getLatestCompletedOrder() {
        return this.latestCompletedOrder;
    }

    @Nullable
    public final Price getMoneySaved() {
        return this.moneySaved;
    }

    @Nullable
    public final List<Order> getPendingOrders() {
        return this.pendingOrders;
    }

    @NotNull
    public final List<ProfileFeature> getProfileFeatures() {
        return this.profileFeatures;
    }

    @Nullable
    public final ProfileVoucherTooltip getVoucherTooltip() {
        return this.voucherTooltip;
    }

    public int hashCode() {
        Order order = this.latestCompletedOrder;
        int iHashCode = (order == null ? 0 : order.hashCode()) * 31;
        ProfileCO2Saved profileCO2Saved = this.co2eSaved;
        int iHashCode2 = (iHashCode + (profileCO2Saved == null ? 0 : profileCO2Saved.hashCode())) * 31;
        Price price = this.moneySaved;
        int iHashCode3 = (iHashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        List<Order> list = this.pendingOrders;
        int iC = f.c(this.profileFeatures, (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31);
        ProfileVoucherTooltip profileVoucherTooltip = this.voucherTooltip;
        return iC + (profileVoucherTooltip != null ? profileVoucherTooltip.hashCode() : 0);
    }

    public final void setPendingOrders(@Nullable List<Order> list) {
        this.pendingOrders = list;
    }

    @NotNull
    public String toString() {
        return "ProfileScreenResponse(latestCompletedOrder=" + this.latestCompletedOrder + ", co2eSaved=" + this.co2eSaved + ", moneySaved=" + this.moneySaved + ", pendingOrders=" + this.pendingOrders + ", profileFeatures=" + this.profileFeatures + ", voucherTooltip=" + this.voucherTooltip + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("co2e_saved")
    public static /* synthetic */ void getCo2eSaved$annotations() {
    }

    @g("latest_completed_order")
    public static /* synthetic */ void getLatestCompletedOrder$annotations() {
    }

    @g("money_saved")
    public static /* synthetic */ void getMoneySaved$annotations() {
    }

    @g("feature_details")
    public static /* synthetic */ void getProfileFeatures$annotations() {
    }

    @g("voucher_tooltip")
    public static /* synthetic */ void getVoucherTooltip$annotations() {
    }

    public ProfileScreenResponse(@Nullable Order order, @Nullable ProfileCO2Saved profileCO2Saved, @Nullable Price price, @Nullable List<Order> list, @NotNull List<ProfileFeature> list2, @Nullable ProfileVoucherTooltip profileVoucherTooltip) {
        list2.getClass();
        this.latestCompletedOrder = order;
        this.co2eSaved = profileCO2Saved;
        this.moneySaved = price;
        this.pendingOrders = list;
        this.profileFeatures = list2;
        this.voucherTooltip = profileVoucherTooltip;
    }
}
