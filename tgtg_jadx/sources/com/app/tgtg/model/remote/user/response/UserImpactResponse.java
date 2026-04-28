package com.app.tgtg.model.remote.user.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u001a\u0010-\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010/\u0012\u0004\b3\u00104\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u00102R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010/\u0012\u0004\b7\u00104\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u00102R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00108\u0012\u0004\b<\u00104\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010;R(\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010=\u0012\u0004\bA\u00104\u001a\u0004\b>\u0010$\"\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/UserImpactResponse;", "Landroid/os/Parcelable;", "", "magicBagCount", "co2eSaved", "Lcom/app/tgtg/model/remote/payment/Price;", "moneySaved", "", "hasClickedOnImpactPrompt", "<init>", "(IILcom/app/tgtg/model/remote/payment/Price;Z)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIILcom/app/tgtg/model/remote/payment/Price;ZLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/UserImpactResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "()Lcom/app/tgtg/model/remote/payment/Price;", "component4", "()Z", "copy", "(IILcom/app/tgtg/model/remote/payment/Price;Z)Lcom/app/tgtg/model/remote/user/response/UserImpactResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getMagicBagCount", "setMagicBagCount", "(I)V", "getMagicBagCount$annotations", "()V", "getCo2eSaved", "setCo2eSaved", "getCo2eSaved$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getMoneySaved", "setMoneySaved", "(Lcom/app/tgtg/model/remote/payment/Price;)V", "getMoneySaved$annotations", "Z", "getHasClickedOnImpactPrompt", "setHasClickedOnImpactPrompt", "(Z)V", "getHasClickedOnImpactPrompt$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UserImpactResponse implements Parcelable {
    private int co2eSaved;
    private boolean hasClickedOnImpactPrompt;
    private int magicBagCount;

    @Nullable
    private Price moneySaved;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UserImpactResponse> CREATOR = new Creator();

    public /* synthetic */ UserImpactResponse(int i11, int i12, int i13, Price price, boolean z11, m1 m1Var) {
        if (11 != (i11 & 11)) {
            c1.j(i11, 11, UserImpactResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.magicBagCount = i12;
        this.co2eSaved = i13;
        if ((i11 & 4) == 0) {
            this.moneySaved = null;
        } else {
            this.moneySaved = price;
        }
        this.hasClickedOnImpactPrompt = z11;
    }

    public static /* synthetic */ UserImpactResponse copy$default(UserImpactResponse userImpactResponse, int i11, int i12, Price price, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = userImpactResponse.magicBagCount;
        }
        if ((i13 & 2) != 0) {
            i12 = userImpactResponse.co2eSaved;
        }
        if ((i13 & 4) != 0) {
            price = userImpactResponse.moneySaved;
        }
        if ((i13 & 8) != 0) {
            z11 = userImpactResponse.hasClickedOnImpactPrompt;
        }
        return userImpactResponse.copy(i11, i12, price, z11);
    }

    public static final /* synthetic */ void write$Self$app(UserImpactResponse self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.magicBagCount, serialDesc);
        output.m(1, self.co2eSaved, serialDesc);
        if (output.C(serialDesc) || self.moneySaved != null) {
            output.r(serialDesc, 2, Price$$serializer.INSTANCE, self.moneySaved);
        }
        output.p(serialDesc, 3, self.hasClickedOnImpactPrompt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMagicBagCount() {
        return this.magicBagCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCo2eSaved() {
        return this.co2eSaved;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Price getMoneySaved() {
        return this.moneySaved;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasClickedOnImpactPrompt() {
        return this.hasClickedOnImpactPrompt;
    }

    @NotNull
    public final UserImpactResponse copy(int magicBagCount, int co2eSaved, @Nullable Price moneySaved, boolean hasClickedOnImpactPrompt) {
        return new UserImpactResponse(magicBagCount, co2eSaved, moneySaved, hasClickedOnImpactPrompt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserImpactResponse)) {
            return false;
        }
        UserImpactResponse userImpactResponse = (UserImpactResponse) other;
        return this.magicBagCount == userImpactResponse.magicBagCount && this.co2eSaved == userImpactResponse.co2eSaved && Intrinsics.areEqual(this.moneySaved, userImpactResponse.moneySaved) && this.hasClickedOnImpactPrompt == userImpactResponse.hasClickedOnImpactPrompt;
    }

    public final int getCo2eSaved() {
        return this.co2eSaved;
    }

    public final boolean getHasClickedOnImpactPrompt() {
        return this.hasClickedOnImpactPrompt;
    }

    public final int getMagicBagCount() {
        return this.magicBagCount;
    }

    @Nullable
    public final Price getMoneySaved() {
        return this.moneySaved;
    }

    public int hashCode() {
        int iB = k.b(this.co2eSaved, Integer.hashCode(this.magicBagCount) * 31, 31);
        Price price = this.moneySaved;
        return Boolean.hashCode(this.hasClickedOnImpactPrompt) + ((iB + (price == null ? 0 : price.hashCode())) * 31);
    }

    public final void setCo2eSaved(int i11) {
        this.co2eSaved = i11;
    }

    public final void setHasClickedOnImpactPrompt(boolean z11) {
        this.hasClickedOnImpactPrompt = z11;
    }

    public final void setMagicBagCount(int i11) {
        this.magicBagCount = i11;
    }

    public final void setMoneySaved(@Nullable Price price) {
        this.moneySaved = price;
    }

    @NotNull
    public String toString() {
        int i11 = this.magicBagCount;
        int i12 = this.co2eSaved;
        Price price = this.moneySaved;
        boolean z11 = this.hasClickedOnImpactPrompt;
        StringBuilder sbR = k.r(i11, i12, "UserImpactResponse(magicBagCount=", ", co2eSaved=", ", moneySaved=");
        sbR.append(price);
        sbR.append(", hasClickedOnImpactPrompt=");
        sbR.append(z11);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.magicBagCount);
        dest.writeInt(this.co2eSaved);
        Price price = this.moneySaved;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        dest.writeInt(this.hasClickedOnImpactPrompt ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/UserImpactResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/UserImpactResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserImpactResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserImpactResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserImpactResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new UserImpactResponse(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserImpactResponse[] newArray(int i11) {
            return new UserImpactResponse[i11];
        }
    }

    @g("co2e_saved")
    public static /* synthetic */ void getCo2eSaved$annotations() {
    }

    @g("has_clicked_on_impact_prompt")
    public static /* synthetic */ void getHasClickedOnImpactPrompt$annotations() {
    }

    @g("magic_bag_count")
    public static /* synthetic */ void getMagicBagCount$annotations() {
    }

    @g("money_saved")
    public static /* synthetic */ void getMoneySaved$annotations() {
    }

    public UserImpactResponse(int i11, int i12, @Nullable Price price, boolean z11) {
        this.magicBagCount = i11;
        this.co2eSaved = i12;
        this.moneySaved = price;
        this.hasClickedOnImpactPrompt = z11;
    }

    public /* synthetic */ UserImpactResponse(int i11, int i12, Price price, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i13 & 4) != 0 ? null : price, z11);
    }
}
