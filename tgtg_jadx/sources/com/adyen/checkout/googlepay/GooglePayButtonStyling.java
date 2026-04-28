package com.adyen.checkout.googlepay;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;", "Landroid/os/Parcelable;", "buttonTheme", "Lcom/adyen/checkout/googlepay/GooglePayButtonTheme;", "buttonType", "Lcom/adyen/checkout/googlepay/GooglePayButtonType;", "cornerRadius", "", "(Lcom/adyen/checkout/googlepay/GooglePayButtonTheme;Lcom/adyen/checkout/googlepay/GooglePayButtonType;Ljava/lang/Integer;)V", "getButtonTheme", "()Lcom/adyen/checkout/googlepay/GooglePayButtonTheme;", "getButtonType", "()Lcom/adyen/checkout/googlepay/GooglePayButtonType;", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/adyen/checkout/googlepay/GooglePayButtonTheme;Lcom/adyen/checkout/googlepay/GooglePayButtonType;Ljava/lang/Integer;)Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GooglePayButtonStyling implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GooglePayButtonStyling> CREATOR = new Creator();

    @Nullable
    private final GooglePayButtonTheme buttonTheme;

    @Nullable
    private final GooglePayButtonType buttonType;

    @Nullable
    private final Integer cornerRadius;

    public /* synthetic */ GooglePayButtonStyling(GooglePayButtonTheme googlePayButtonTheme, GooglePayButtonType googlePayButtonType, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : googlePayButtonTheme, (i11 & 2) != 0 ? null : googlePayButtonType, (i11 & 4) != 0 ? null : num);
    }

    public static /* synthetic */ GooglePayButtonStyling copy$default(GooglePayButtonStyling googlePayButtonStyling, GooglePayButtonTheme googlePayButtonTheme, GooglePayButtonType googlePayButtonType, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            googlePayButtonTheme = googlePayButtonStyling.buttonTheme;
        }
        if ((i11 & 2) != 0) {
            googlePayButtonType = googlePayButtonStyling.buttonType;
        }
        if ((i11 & 4) != 0) {
            num = googlePayButtonStyling.cornerRadius;
        }
        return googlePayButtonStyling.copy(googlePayButtonTheme, googlePayButtonType, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GooglePayButtonTheme getButtonTheme() {
        return this.buttonTheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GooglePayButtonType getButtonType() {
        return this.buttonType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final GooglePayButtonStyling copy(@Nullable GooglePayButtonTheme buttonTheme, @Nullable GooglePayButtonType buttonType, @Nullable Integer cornerRadius) {
        return new GooglePayButtonStyling(buttonTheme, buttonType, cornerRadius);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayButtonStyling)) {
            return false;
        }
        GooglePayButtonStyling googlePayButtonStyling = (GooglePayButtonStyling) other;
        return this.buttonTheme == googlePayButtonStyling.buttonTheme && this.buttonType == googlePayButtonStyling.buttonType && Intrinsics.areEqual(this.cornerRadius, googlePayButtonStyling.cornerRadius);
    }

    @Nullable
    public final GooglePayButtonTheme getButtonTheme() {
        return this.buttonTheme;
    }

    @Nullable
    public final GooglePayButtonType getButtonType() {
        return this.buttonType;
    }

    @Nullable
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        GooglePayButtonTheme googlePayButtonTheme = this.buttonTheme;
        int iHashCode = (googlePayButtonTheme == null ? 0 : googlePayButtonTheme.hashCode()) * 31;
        GooglePayButtonType googlePayButtonType = this.buttonType;
        int iHashCode2 = (iHashCode + (googlePayButtonType == null ? 0 : googlePayButtonType.hashCode())) * 31;
        Integer num = this.cornerRadius;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        GooglePayButtonTheme googlePayButtonTheme = this.buttonTheme;
        GooglePayButtonType googlePayButtonType = this.buttonType;
        Integer num = this.cornerRadius;
        StringBuilder sb2 = new StringBuilder("GooglePayButtonStyling(buttonTheme=");
        sb2.append(googlePayButtonTheme);
        sb2.append(", buttonType=");
        sb2.append(googlePayButtonType);
        sb2.append(", cornerRadius=");
        return i.m(sb2, num, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        GooglePayButtonTheme googlePayButtonTheme = this.buttonTheme;
        if (googlePayButtonTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(googlePayButtonTheme.name());
        }
        GooglePayButtonType googlePayButtonType = this.buttonType;
        if (googlePayButtonType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(googlePayButtonType.name());
        }
        Integer num = this.cornerRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePayButtonStyling> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GooglePayButtonStyling createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new GooglePayButtonStyling(parcel.readInt() == 0 ? null : GooglePayButtonTheme.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : GooglePayButtonType.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GooglePayButtonStyling[] newArray(int i11) {
            return new GooglePayButtonStyling[i11];
        }
    }

    public GooglePayButtonStyling(@Nullable GooglePayButtonTheme googlePayButtonTheme, @Nullable GooglePayButtonType googlePayButtonType, @Nullable Integer num) {
        this.buttonTheme = googlePayButtonTheme;
        this.buttonType = googlePayButtonType;
        this.cornerRadius = num;
    }

    public GooglePayButtonStyling() {
        this(null, null, null, 7, null);
    }
}
