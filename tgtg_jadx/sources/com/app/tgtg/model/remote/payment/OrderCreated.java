package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/app/tgtg/model/remote/payment/OrderCreated;", "Landroid/os/Parcelable;", "withRecurring", "", "<init>", "(Z)V", "getWithRecurring", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderCreated implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OrderCreated> CREATOR = new Creator();
    private final boolean withRecurring;

    public OrderCreated(boolean z11) {
        this.withRecurring = z11;
    }

    public static /* synthetic */ OrderCreated copy$default(OrderCreated orderCreated, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = orderCreated.withRecurring;
        }
        return orderCreated.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getWithRecurring() {
        return this.withRecurring;
    }

    @NotNull
    public final OrderCreated copy(boolean withRecurring) {
        return new OrderCreated(withRecurring);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderCreated) && this.withRecurring == ((OrderCreated) other).withRecurring;
    }

    public final boolean getWithRecurring() {
        return this.withRecurring;
    }

    public int hashCode() {
        return Boolean.hashCode(this.withRecurring);
    }

    @NotNull
    public String toString() {
        return a.f("OrderCreated(withRecurring=", ")", this.withRecurring);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.withRecurring ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderCreated> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderCreated createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OrderCreated(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderCreated[] newArray(int i11) {
            return new OrderCreated[i11];
        }
    }
}
