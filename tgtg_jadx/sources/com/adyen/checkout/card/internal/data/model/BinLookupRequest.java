package com.adyen.checkout.card.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtils;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/BinLookupRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", BinLookupRequest.ENCRYPTED_BIN, "", BinLookupRequest.REQUEST_ID, BinLookupRequest.SUPPORTED_BRANDS, "", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getEncryptedBin", "()Ljava/lang/String;", "getRequestId", "getSupportedBrands", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BinLookupRequest extends ModelObject {

    @NotNull
    private static final String ENCRYPTED_BIN = "encryptedBin";

    @NotNull
    private static final String REQUEST_ID = "requestId";

    @NotNull
    private static final String SUPPORTED_BRANDS = "supportedBrands";

    @NotNull
    private static final String TYPE = "type";

    @Nullable
    private final String encryptedBin;

    @Nullable
    private final String requestId;

    @Nullable
    private final List<String> supportedBrands;

    @Nullable
    private final String type;

    @NotNull
    public static final Parcelable.Creator<BinLookupRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<BinLookupRequest> SERIALIZER = new ModelObject.Serializer<BinLookupRequest>() { // from class: com.adyen.checkout.card.internal.data.model.BinLookupRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public BinLookupRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new BinLookupRequest(JsonUtilsKt.getStringOrNull(jsonObject, "encryptedBin"), JsonUtilsKt.getStringOrNull(jsonObject, "requestId"), JsonUtilsKt.optStringList(jsonObject, "supportedBrands"), JsonUtilsKt.getStringOrNull(jsonObject, "type"));
            } catch (JSONException e5) {
                w.j(BinLookupRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull BinLookupRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("encryptedBin", modelObject.getEncryptedBin());
                jSONObject.putOpt("requestId", modelObject.getRequestId());
                jSONObject.putOpt("supportedBrands", JsonUtils.serializeOptStringList(modelObject.getSupportedBrands()));
                jSONObject.putOpt("type", modelObject.getType());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(BinLookupRequest.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ BinLookupRequest(String str, String str2, List list, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BinLookupRequest copy$default(BinLookupRequest binLookupRequest, String str, String str2, List list, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = binLookupRequest.encryptedBin;
        }
        if ((i11 & 2) != 0) {
            str2 = binLookupRequest.requestId;
        }
        if ((i11 & 4) != 0) {
            list = binLookupRequest.supportedBrands;
        }
        if ((i11 & 8) != 0) {
            str3 = binLookupRequest.type;
        }
        return binLookupRequest.copy(str, str2, list, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncryptedBin() {
        return this.encryptedBin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final List<String> component3() {
        return this.supportedBrands;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final BinLookupRequest copy(@Nullable String encryptedBin, @Nullable String requestId, @Nullable List<String> supportedBrands, @Nullable String type) {
        return new BinLookupRequest(encryptedBin, requestId, supportedBrands, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinLookupRequest)) {
            return false;
        }
        BinLookupRequest binLookupRequest = (BinLookupRequest) other;
        return Intrinsics.areEqual(this.encryptedBin, binLookupRequest.encryptedBin) && Intrinsics.areEqual(this.requestId, binLookupRequest.requestId) && Intrinsics.areEqual(this.supportedBrands, binLookupRequest.supportedBrands) && Intrinsics.areEqual(this.type, binLookupRequest.type);
    }

    @Nullable
    public final String getEncryptedBin() {
        return this.encryptedBin;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final List<String> getSupportedBrands() {
        return this.supportedBrands;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.encryptedBin;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.requestId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.supportedBrands;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.type;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.encryptedBin;
        String str2 = this.requestId;
        List<String> list = this.supportedBrands;
        String str3 = this.type;
        StringBuilder sbT = f.t("BinLookupRequest(encryptedBin=", str, ", requestId=", str2, ", supportedBrands=");
        sbT.append(list);
        sbT.append(", type=");
        sbT.append(str3);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.encryptedBin);
        parcel.writeString(this.requestId);
        parcel.writeStringList(this.supportedBrands);
        parcel.writeString(this.type);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BinLookupRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BinLookupRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new BinLookupRequest(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BinLookupRequest[] newArray(int i11) {
            return new BinLookupRequest[i11];
        }
    }

    public BinLookupRequest() {
        this(null, null, null, null, 15, null);
    }

    public BinLookupRequest(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3) {
        this.encryptedBin = str;
        this.requestId = str2;
        this.supportedBrands = list;
        this.type = str3;
    }
}
