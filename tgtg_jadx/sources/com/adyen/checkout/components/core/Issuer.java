package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006!"}, d2 = {"Lcom/adyen/checkout/components/core/Issuer;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "id", "", Issuer.NAME, "isDisabled", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setDisabled", "(Z)V", "getName", "setName", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Issuer extends ModelObject {

    @NotNull
    private static final String DISABLED = "disabled";

    @NotNull
    private static final String ID = "id";

    @NotNull
    private static final String NAME = "name";

    @Nullable
    private String id;
    private boolean isDisabled;

    @Nullable
    private String name;

    @NotNull
    public static final Parcelable.Creator<Issuer> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<Issuer> SERIALIZER = new ModelObject.Serializer<Issuer>() { // from class: com.adyen.checkout.components.core.Issuer$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Issuer deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "id");
            String stringOrNull2 = JsonUtilsKt.getStringOrNull(jsonObject, "name");
            Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "disabled");
            return new Issuer(stringOrNull, stringOrNull2, booleanOrNull != null ? booleanOrNull.booleanValue() : false);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Issuer modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("id", modelObject.getId());
                jSONObject.putOpt("name", modelObject.getName());
                jSONObject.putOpt("disabled", Boolean.valueOf(modelObject.isDisabled()));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(Issuer.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ Issuer(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11);
    }

    public static /* synthetic */ Issuer copy$default(Issuer issuer, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = issuer.id;
        }
        if ((i11 & 2) != 0) {
            str2 = issuer.name;
        }
        if ((i11 & 4) != 0) {
            z11 = issuer.isDisabled;
        }
        return issuer.copy(str, str2, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public final Issuer copy(@Nullable String id2, @Nullable String name, boolean isDisabled) {
        return new Issuer(id2, name, isDisabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Issuer)) {
            return false;
        }
        Issuer issuer = (Issuer) other;
        return Intrinsics.areEqual(this.id, issuer.id) && Intrinsics.areEqual(this.name, issuer.name) && this.isDisabled == issuer.isDisabled;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return Boolean.hashCode(this.isDisabled) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final void setDisabled(boolean z11) {
        this.isDisabled = z11;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return s.o(f.t("Issuer(id=", str, ", name=", str2, ", isDisabled="), this.isDisabled, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.isDisabled ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Issuer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Issuer createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Issuer(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Issuer[] newArray(int i11) {
            return new Issuer[i11];
        }
    }

    public Issuer() {
        this(null, null, false, 7, null);
    }

    public Issuer(@Nullable String str, @Nullable String str2, boolean z11) {
        this.id = str;
        this.name = str2;
        this.isDisabled = z11;
    }
}
