package com.adyen.checkout.cse;

import android.os.Parcel;
import android.os.Parcelable;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/cse/EncryptedCard;", "Landroid/os/Parcelable;", "encryptedCardNumber", "", "encryptedExpiryMonth", "encryptedExpiryYear", "encryptedSecurityCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEncryptedCardNumber", "()Ljava/lang/String;", "getEncryptedExpiryMonth", "getEncryptedExpiryYear", "getEncryptedSecurityCode", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EncryptedCard implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EncryptedCard> CREATOR = new Creator();

    @Nullable
    private final String encryptedCardNumber;

    @Nullable
    private final String encryptedExpiryMonth;

    @Nullable
    private final String encryptedExpiryYear;

    @Nullable
    private final String encryptedSecurityCode;

    public EncryptedCard(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.encryptedCardNumber = str;
        this.encryptedExpiryMonth = str2;
        this.encryptedExpiryYear = str3;
        this.encryptedSecurityCode = str4;
    }

    public static /* synthetic */ EncryptedCard copy$default(EncryptedCard encryptedCard, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = encryptedCard.encryptedCardNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = encryptedCard.encryptedExpiryMonth;
        }
        if ((i11 & 4) != 0) {
            str3 = encryptedCard.encryptedExpiryYear;
        }
        if ((i11 & 8) != 0) {
            str4 = encryptedCard.encryptedSecurityCode;
        }
        return encryptedCard.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    @NotNull
    public final EncryptedCard copy(@Nullable String encryptedCardNumber, @Nullable String encryptedExpiryMonth, @Nullable String encryptedExpiryYear, @Nullable String encryptedSecurityCode) {
        return new EncryptedCard(encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedCard)) {
            return false;
        }
        EncryptedCard encryptedCard = (EncryptedCard) other;
        return Intrinsics.areEqual(this.encryptedCardNumber, encryptedCard.encryptedCardNumber) && Intrinsics.areEqual(this.encryptedExpiryMonth, encryptedCard.encryptedExpiryMonth) && Intrinsics.areEqual(this.encryptedExpiryYear, encryptedCard.encryptedExpiryYear) && Intrinsics.areEqual(this.encryptedSecurityCode, encryptedCard.encryptedSecurityCode);
    }

    @Nullable
    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    @Nullable
    public final String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    @Nullable
    public final String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    @Nullable
    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    public int hashCode() {
        String str = this.encryptedCardNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.encryptedExpiryMonth;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encryptedExpiryYear;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encryptedSecurityCode;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.encryptedCardNumber;
        String str2 = this.encryptedExpiryMonth;
        return f.o(f.t("EncryptedCard(encryptedCardNumber=", str, ", encryptedExpiryMonth=", str2, ", encryptedExpiryYear="), this.encryptedExpiryYear, ", encryptedSecurityCode=", this.encryptedSecurityCode, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.encryptedCardNumber);
        parcel.writeString(this.encryptedExpiryMonth);
        parcel.writeString(this.encryptedExpiryYear);
        parcel.writeString(this.encryptedSecurityCode);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EncryptedCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final EncryptedCard createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new EncryptedCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final EncryptedCard[] newArray(int i11) {
            return new EncryptedCard[i11];
        }
    }
}
