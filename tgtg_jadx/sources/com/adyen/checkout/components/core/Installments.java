package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/components/core/Installments;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", Installments.PLAN, "", "value", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getPlan", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/adyen/checkout/components/core/Installments;", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Installments extends ModelObject {

    @NotNull
    private static final String PLAN = "plan";

    @NotNull
    private static final String VALUE = "value";

    @Nullable
    private final String plan;

    @Nullable
    private final Integer value;

    @NotNull
    public static final Parcelable.Creator<Installments> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<Installments> SERIALIZER = new ModelObject.Serializer<Installments>() { // from class: com.adyen.checkout.components.core.Installments$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Installments deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String string = jsonObject.getString("plan");
                Integer intOrNull = JsonUtilsKt.getIntOrNull(jsonObject, "value");
                return new Installments(string, Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 1));
            } catch (JSONException e5) {
                w.j(Installments.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Installments modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("plan", modelObject.getPlan());
                jSONObject.putOpt("value", modelObject.getValue());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(Installments.class, e5);
                return null;
            }
        }
    };

    public Installments(@Nullable String str, @Nullable Integer num) {
        this.plan = str;
        this.value = num;
    }

    public static /* synthetic */ Installments copy$default(Installments installments, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = installments.plan;
        }
        if ((i11 & 2) != 0) {
            num = installments.value;
        }
        return installments.copy(str, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlan() {
        return this.plan;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    @NotNull
    public final Installments copy(@Nullable String plan, @Nullable Integer value) {
        return new Installments(plan, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Installments)) {
            return false;
        }
        Installments installments = (Installments) other;
        return Intrinsics.areEqual(this.plan, installments.plan) && Intrinsics.areEqual(this.value, installments.value);
    }

    @Nullable
    public final String getPlan() {
        return this.plan;
    }

    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.plan;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.value;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Installments(plan=" + this.plan + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.plan);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Installments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Installments createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Installments(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Installments[] newArray(int i11) {
            return new Installments[i11];
        }
    }
}
