package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001cHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006$"}, d2 = {"Lcom/adyen/checkout/components/core/ShopperName;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "firstName", "", ShopperName.INFIX, "lastName", ShopperName.GENDER, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getGender", "setGender", "getInfix", "setInfix", "getLastName", "setLastName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ShopperName extends ModelObject {

    @NotNull
    private static final String FIRST_NAME = "firstName";

    @NotNull
    private static final String GENDER = "gender";

    @NotNull
    private static final String INFIX = "infix";

    @NotNull
    private static final String LAST_NAME = "lastName";

    @Nullable
    private String firstName;

    @Nullable
    private String gender;

    @Nullable
    private String infix;

    @Nullable
    private String lastName;

    @NotNull
    public static final Parcelable.Creator<ShopperName> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<ShopperName> SERIALIZER = new ModelObject.Serializer<ShopperName>() { // from class: com.adyen.checkout.components.core.ShopperName$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public ShopperName deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new ShopperName(JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.FIRST_NAME), JsonUtilsKt.getStringOrNull(jsonObject, "infix"), JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.LAST_NAME), JsonUtilsKt.getStringOrNull(jsonObject, "gender"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull ShopperName modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(EContextPaymentMethod.FIRST_NAME, modelObject.getFirstName());
                jSONObject.putOpt("infix", modelObject.getInfix());
                jSONObject.putOpt(EContextPaymentMethod.LAST_NAME, modelObject.getLastName());
                jSONObject.putOpt("gender", modelObject.getGender());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(ShopperName.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ ShopperName(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ ShopperName copy$default(ShopperName shopperName, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shopperName.firstName;
        }
        if ((i11 & 2) != 0) {
            str2 = shopperName.infix;
        }
        if ((i11 & 4) != 0) {
            str3 = shopperName.lastName;
        }
        if ((i11 & 8) != 0) {
            str4 = shopperName.gender;
        }
        return shopperName.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInfix() {
        return this.infix;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    public final ShopperName copy(@Nullable String firstName, @Nullable String infix, @Nullable String lastName, @Nullable String gender) {
        return new ShopperName(firstName, infix, lastName, gender);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopperName)) {
            return false;
        }
        ShopperName shopperName = (ShopperName) other;
        return Intrinsics.areEqual(this.firstName, shopperName.firstName) && Intrinsics.areEqual(this.infix, shopperName.infix) && Intrinsics.areEqual(this.lastName, shopperName.lastName) && Intrinsics.areEqual(this.gender, shopperName.gender);
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getInfix() {
        return this.infix;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.infix;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gender;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setFirstName(@Nullable String str) {
        this.firstName = str;
    }

    public final void setGender(@Nullable String str) {
        this.gender = str;
    }

    public final void setInfix(@Nullable String str) {
        this.infix = str;
    }

    public final void setLastName(@Nullable String str) {
        this.lastName = str;
    }

    @NotNull
    public String toString() {
        String str = this.firstName;
        String str2 = this.infix;
        return f.o(f.t("ShopperName(firstName=", str, ", infix=", str2, ", lastName="), this.lastName, ", gender=", this.gender, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.firstName);
        parcel.writeString(this.infix);
        parcel.writeString(this.lastName);
        parcel.writeString(this.gender);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShopperName> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShopperName createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new ShopperName(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShopperName[] newArray(int i11) {
            return new ShopperName[i11];
        }
    }

    public ShopperName() {
        this(null, null, null, null, 15, null);
    }

    public ShopperName(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.firstName = str;
        this.infix = str2;
        this.lastName = str3;
        this.gender = str4;
    }
}
