package com.app.tgtg.model.remote.profile;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.Order$$serializer;
import com.braze.Constants;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import m90.r1;
import n90.c;
import n90.p;
import nv.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00029:B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J:\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010\u001bJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0019R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010%¨\u0006;"}, d2 = {"Lcom/app/tgtg/model/remote/profile/ProfilePageOrders;", "Landroid/os/Parcelable;", "", "currentTime", "", "Lcom/app/tgtg/model/remote/order/Order;", "pendingOrders", "latestCompletedOrder", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/order/Order;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/order/Order;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/ProfilePageOrders;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toJson", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/util/List;", "component3", "()Lcom/app/tgtg/model/remote/order/Order;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/app/tgtg/model/remote/order/Order;)Lcom/app/tgtg/model/remote/profile/ProfilePageOrders;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentTime", "getCurrentTime$annotations", "()V", "Ljava/util/List;", "getPendingOrders", "getPendingOrders$annotations", "Lcom/app/tgtg/model/remote/order/Order;", "getLatestCompletedOrder", "getLatestCompletedOrder$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProfilePageOrders implements Parcelable {

    @Nullable
    private final String currentTime;

    @Nullable
    private final Order latestCompletedOrder;

    @Nullable
    private final List<Order> pendingOrders;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProfilePageOrders> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new p(22)), null};

    @NotNull
    private static final c json = w.h(new a(7));

    public /* synthetic */ ProfilePageOrders(int i11, String str, List list, Order order, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.currentTime = null;
        } else {
            this.currentTime = str;
        }
        if ((i11 & 2) == 0) {
            this.pendingOrders = null;
        } else {
            this.pendingOrders = list;
        }
        if ((i11 & 4) == 0) {
            this.latestCompletedOrder = null;
        } else {
            this.latestCompletedOrder = order;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Order$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfilePageOrders copy$default(ProfilePageOrders profilePageOrders, String str, List list, Order order, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = profilePageOrders.currentTime;
        }
        if ((i11 & 2) != 0) {
            list = profilePageOrders.pendingOrders;
        }
        if ((i11 & 4) != 0) {
            order = profilePageOrders.latestCompletedOrder;
        }
        return profilePageOrders.copy(str, list, order);
    }

    @NotNull
    public static final ProfilePageOrders fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(n90.h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    public static final /* synthetic */ void write$Self$app(ProfilePageOrders self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.currentTime != null) {
            output.r(serialDesc, 0, r1.f29848a, self.currentTime);
        }
        if (output.C(serialDesc) || self.pendingOrders != null) {
            output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.pendingOrders);
        }
        if (!output.C(serialDesc) && self.latestCompletedOrder == null) {
            return;
        }
        output.r(serialDesc, 2, Order$$serializer.INSTANCE, self.latestCompletedOrder);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    public final List<Order> component2() {
        return this.pendingOrders;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Order getLatestCompletedOrder() {
        return this.latestCompletedOrder;
    }

    @NotNull
    public final ProfilePageOrders copy(@Nullable String currentTime, @Nullable List<Order> pendingOrders, @Nullable Order latestCompletedOrder) {
        return new ProfilePageOrders(currentTime, pendingOrders, latestCompletedOrder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfilePageOrders)) {
            return false;
        }
        ProfilePageOrders profilePageOrders = (ProfilePageOrders) other;
        return Intrinsics.areEqual(this.currentTime, profilePageOrders.currentTime) && Intrinsics.areEqual(this.pendingOrders, profilePageOrders.pendingOrders) && Intrinsics.areEqual(this.latestCompletedOrder, profilePageOrders.latestCompletedOrder);
    }

    @Nullable
    public final String getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    public final Order getLatestCompletedOrder() {
        return this.latestCompletedOrder;
    }

    @Nullable
    public final List<Order> getPendingOrders() {
        return this.pendingOrders;
    }

    public int hashCode() {
        String str = this.currentTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Order> list = this.pendingOrders;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Order order = this.latestCompletedOrder;
        return iHashCode2 + (order != null ? order.hashCode() : 0);
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        return "ProfilePageOrders(currentTime=" + this.currentTime + ", pendingOrders=" + this.pendingOrders + ", latestCompletedOrder=" + this.latestCompletedOrder + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.currentTime);
        List<Order> list = this.pendingOrders;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Order) itQ.next()).writeToParcel(dest, flags);
            }
        }
        Order order = this.latestCompletedOrder;
        if (order == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            order.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/profile/ProfilePageOrders$Companion;", "", "<init>", "()V", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lcom/app/tgtg/model/remote/profile/ProfilePageOrders;", "fromJson", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/profile/ProfilePageOrders;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ln90/c;", "json", "Ln90/c;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProfilePageOrders fromJson(@NotNull String s7) {
            s7.getClass();
            return (ProfilePageOrders) ProfilePageOrders.json.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfilePageOrders$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProfilePageOrders> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfilePageOrders createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int iC = 0;
                while (iC != i11) {
                    iC = i.c(Order.CREATOR, parcel, arrayList, iC, 1);
                }
            }
            return new ProfilePageOrders(string, arrayList, parcel.readInt() != 0 ? Order.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfilePageOrders[] newArray(int i11) {
            return new ProfilePageOrders[i11];
        }
    }

    @g("current_time")
    public static /* synthetic */ void getCurrentTime$annotations() {
    }

    @g("latest_completed_order")
    public static /* synthetic */ void getLatestCompletedOrder$annotations() {
    }

    @g("pending_orders")
    public static /* synthetic */ void getPendingOrders$annotations() {
    }

    public ProfilePageOrders() {
        this((String) null, (List) null, (Order) null, 7, (DefaultConstructorMarker) null);
    }

    public ProfilePageOrders(@Nullable String str, @Nullable List<Order> list, @Nullable Order order) {
        this.currentTime = str;
        this.pendingOrders = list;
        this.latestCompletedOrder = order;
    }

    public /* synthetic */ ProfilePageOrders(String str, List list, Order order, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : order);
    }
}
