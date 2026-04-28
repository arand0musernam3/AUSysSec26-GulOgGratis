package com.adyen.checkout.card.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", BinLookupResponse.BRANDS, "", "Lcom/adyen/checkout/card/internal/data/model/Brand;", BinLookupResponse.ISSUING_COUNTRY_CODE, "", BinLookupResponse.REQUEST_ID, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getBrands", "()Ljava/util/List;", "getIssuingCountryCode", "()Ljava/lang/String;", "getRequestId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BinLookupResponse extends ModelObject {

    @NotNull
    private static final String BRANDS = "brands";

    @NotNull
    private static final String ISSUING_COUNTRY_CODE = "issuingCountryCode";

    @NotNull
    private static final String REQUEST_ID = "requestId";

    @Nullable
    private final List<Brand> brands;

    @Nullable
    private final String issuingCountryCode;

    @Nullable
    private final String requestId;

    @NotNull
    public static final Parcelable.Creator<BinLookupResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<BinLookupResponse> SERIALIZER = new ModelObject.Serializer<BinLookupResponse>() { // from class: com.adyen.checkout.card.internal.data.model.BinLookupResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public BinLookupResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new BinLookupResponse(ModelUtils.deserializeOptList(jsonObject.optJSONArray("brands"), Brand.SERIALIZER), JsonUtilsKt.getStringOrNull(jsonObject, "issuingCountryCode"), JsonUtilsKt.getStringOrNull(jsonObject, "requestId"));
            } catch (JSONException e5) {
                w.j(BinLookupResponse.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull BinLookupResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("brands", ModelUtils.serializeOptList(modelObject.getBrands(), Brand.SERIALIZER));
                jSONObject.putOpt("issuingCountryCode", modelObject.getIssuingCountryCode());
                jSONObject.putOpt("requestId", modelObject.getRequestId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(BinLookupResponse.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ BinLookupResponse(List list, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BinLookupResponse copy$default(BinLookupResponse binLookupResponse, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = binLookupResponse.brands;
        }
        if ((i11 & 2) != 0) {
            str = binLookupResponse.issuingCountryCode;
        }
        if ((i11 & 4) != 0) {
            str2 = binLookupResponse.requestId;
        }
        return binLookupResponse.copy(list, str, str2);
    }

    @Nullable
    public final List<Brand> component1() {
        return this.brands;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuingCountryCode() {
        return this.issuingCountryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final BinLookupResponse copy(@Nullable List<Brand> brands, @Nullable String issuingCountryCode, @Nullable String requestId) {
        return new BinLookupResponse(brands, issuingCountryCode, requestId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinLookupResponse)) {
            return false;
        }
        BinLookupResponse binLookupResponse = (BinLookupResponse) other;
        return Intrinsics.areEqual(this.brands, binLookupResponse.brands) && Intrinsics.areEqual(this.issuingCountryCode, binLookupResponse.issuingCountryCode) && Intrinsics.areEqual(this.requestId, binLookupResponse.requestId);
    }

    @Nullable
    public final List<Brand> getBrands() {
        return this.brands;
    }

    @Nullable
    public final String getIssuingCountryCode() {
        return this.issuingCountryCode;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        List<Brand> list = this.brands;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.issuingCountryCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Brand> list = this.brands;
        String str = this.issuingCountryCode;
        String str2 = this.requestId;
        StringBuilder sb2 = new StringBuilder("BinLookupResponse(brands=");
        sb2.append(list);
        sb2.append(", issuingCountryCode=");
        sb2.append(str);
        sb2.append(", requestId=");
        return k.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        List<Brand> list = this.brands;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ = i.q(parcel, 1, list);
            while (itQ.hasNext()) {
                ((Brand) itQ.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.issuingCountryCode);
        parcel.writeString(this.requestId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BinLookupResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BinLookupResponse createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int iC = 0;
                while (iC != i11) {
                    iC = i.c(Brand.CREATOR, parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new BinLookupResponse(arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BinLookupResponse[] newArray(int i11) {
            return new BinLookupResponse[i11];
        }
    }

    public BinLookupResponse() {
        this(null, null, null, 7, null);
    }

    public BinLookupResponse(@Nullable List<Brand> list, @Nullable String str, @Nullable String str2) {
        this.brands = list;
        this.issuingCountryCode = str;
        this.requestId = str2;
    }
}
