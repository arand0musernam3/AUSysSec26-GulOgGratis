package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtils;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006HÆ\u0003J\u008d\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000209HÖ\u0001R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019¨\u0006A"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentMethod;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "type", "", PaymentMethod.NAME, PaymentMethod.BRANDS, "", PaymentMethod.BRAND, PaymentMethod.FUNDING_SOURCE, PaymentMethod.ISSUERS, "Lcom/adyen/checkout/components/core/Issuer;", PaymentMethod.CONFIGURATION, "Lcom/adyen/checkout/components/core/Configuration;", "details", "Lcom/adyen/checkout/components/core/InputDetail;", PaymentMethod.APPS, "Lcom/adyen/checkout/components/core/AppData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/adyen/checkout/components/core/Configuration;Ljava/util/List;Ljava/util/List;)V", "getApps", "()Ljava/util/List;", "setApps", "(Ljava/util/List;)V", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "getBrands", "setBrands", "getConfiguration", "()Lcom/adyen/checkout/components/core/Configuration;", "setConfiguration", "(Lcom/adyen/checkout/components/core/Configuration;)V", "getDetails", "setDetails", "getFundingSource", "setFundingSource", "getIssuers", "setIssuers", "getName", "setName", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentMethod extends ModelObject {

    @NotNull
    private static final String APPS = "apps";

    @NotNull
    private static final String BRAND = "brand";

    @NotNull
    private static final String BRANDS = "brands";

    @NotNull
    private static final String CONFIGURATION = "configuration";

    @NotNull
    private static final String DETAILS = "details";

    @NotNull
    private static final String FUNDING_SOURCE = "fundingSource";

    @NotNull
    private static final String ISSUERS = "issuers";

    @NotNull
    private static final String NAME = "name";

    @NotNull
    private static final String TYPE = "type";

    @Nullable
    private List<AppData> apps;

    @Nullable
    private String brand;

    @Nullable
    private List<String> brands;

    @Nullable
    private Configuration configuration;

    @Nullable
    private List<InputDetail> details;

    @Nullable
    private String fundingSource;

    @Nullable
    private List<Issuer> issuers;

    @Nullable
    private String name;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<PaymentMethod> SERIALIZER = new ModelObject.Serializer<PaymentMethod>() { // from class: com.adyen.checkout.components.core.PaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public PaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new PaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "name"), JsonUtils.parseOptStringList(jsonObject.optJSONArray("brands")), JsonUtilsKt.getStringOrNull(jsonObject, "brand"), JsonUtilsKt.getStringOrNull(jsonObject, "fundingSource"), ModelUtils.deserializeOptList(jsonObject.optJSONArray("issuers"), Issuer.SERIALIZER), (Configuration) ModelUtils.deserializeOpt(jsonObject.optJSONObject("configuration"), Configuration.SERIALIZER), ModelUtils.deserializeOptList(jsonObject.optJSONArray(ErrorBundle.DETAIL_ENTRY), InputDetail.SERIALIZER), ModelUtils.deserializeOptList(jsonObject.optJSONArray("apps"), AppData.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull PaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("name", modelObject.getName());
                jSONObject.putOpt("brands", JsonUtils.serializeOptStringList(modelObject.getBrands()));
                jSONObject.putOpt("brand", modelObject.getBrand());
                jSONObject.putOpt("fundingSource", modelObject.getFundingSource());
                jSONObject.putOpt("issuers", ModelUtils.serializeOptList(modelObject.getIssuers(), Issuer.SERIALIZER));
                jSONObject.putOpt("configuration", ModelUtils.serializeOpt(modelObject.getConfiguration(), Configuration.SERIALIZER));
                jSONObject.putOpt(ErrorBundle.DETAIL_ENTRY, ModelUtils.serializeOptList(modelObject.getDetails(), InputDetail.SERIALIZER));
                jSONObject.putOpt("apps", ModelUtils.serializeOptList(modelObject.getApps(), AppData.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(PaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ PaymentMethod(String str, String str2, List list, String str3, String str4, List list2, Configuration configuration, List list3, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : list2, (i11 & 64) != 0 ? null : configuration, (i11 & 128) != 0 ? null : list3, (i11 & 256) != 0 ? null : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, List list, String str3, String str4, List list2, Configuration configuration, List list3, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = paymentMethod.name;
        }
        if ((i11 & 4) != 0) {
            list = paymentMethod.brands;
        }
        if ((i11 & 8) != 0) {
            str3 = paymentMethod.brand;
        }
        if ((i11 & 16) != 0) {
            str4 = paymentMethod.fundingSource;
        }
        if ((i11 & 32) != 0) {
            list2 = paymentMethod.issuers;
        }
        if ((i11 & 64) != 0) {
            configuration = paymentMethod.configuration;
        }
        if ((i11 & 128) != 0) {
            list3 = paymentMethod.details;
        }
        if ((i11 & 256) != 0) {
            list4 = paymentMethod.apps;
        }
        List list5 = list3;
        List list6 = list4;
        List list7 = list2;
        Configuration configuration2 = configuration;
        String str5 = str4;
        List list8 = list;
        return paymentMethod.copy(str, str2, list8, str3, str5, list7, configuration2, list5, list6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<String> component3() {
        return this.brands;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFundingSource() {
        return this.fundingSource;
    }

    @Nullable
    public final List<Issuer> component6() {
        return this.issuers;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    @Nullable
    public final List<InputDetail> component8() {
        return this.details;
    }

    @Nullable
    public final List<AppData> component9() {
        return this.apps;
    }

    @NotNull
    public final PaymentMethod copy(@Nullable String type, @Nullable String name, @Nullable List<String> brands, @Nullable String brand, @Nullable String fundingSource, @Nullable List<Issuer> issuers, @Nullable Configuration configuration, @Nullable List<InputDetail> details, @Nullable List<AppData> apps) {
        return new PaymentMethod(type, name, brands, brand, fundingSource, issuers, configuration, details, apps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.areEqual(this.type, paymentMethod.type) && Intrinsics.areEqual(this.name, paymentMethod.name) && Intrinsics.areEqual(this.brands, paymentMethod.brands) && Intrinsics.areEqual(this.brand, paymentMethod.brand) && Intrinsics.areEqual(this.fundingSource, paymentMethod.fundingSource) && Intrinsics.areEqual(this.issuers, paymentMethod.issuers) && Intrinsics.areEqual(this.configuration, paymentMethod.configuration) && Intrinsics.areEqual(this.details, paymentMethod.details) && Intrinsics.areEqual(this.apps, paymentMethod.apps);
    }

    @Nullable
    public final List<AppData> getApps() {
        return this.apps;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final List<String> getBrands() {
        return this.brands;
    }

    @Nullable
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    @Nullable
    public final List<InputDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final String getFundingSource() {
        return this.fundingSource;
    }

    @Nullable
    public final List<Issuer> getIssuers() {
        return this.issuers;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.brands;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.brand;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fundingSource;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Issuer> list2 = this.issuers;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Configuration configuration = this.configuration;
        int iHashCode7 = (iHashCode6 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        List<InputDetail> list3 = this.details;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AppData> list4 = this.apps;
        return iHashCode8 + (list4 != null ? list4.hashCode() : 0);
    }

    public final void setApps(@Nullable List<AppData> list) {
        this.apps = list;
    }

    public final void setBrand(@Nullable String str) {
        this.brand = str;
    }

    public final void setBrands(@Nullable List<String> list) {
        this.brands = list;
    }

    public final void setConfiguration(@Nullable Configuration configuration) {
        this.configuration = configuration;
    }

    public final void setDetails(@Nullable List<InputDetail> list) {
        this.details = list;
    }

    public final void setFundingSource(@Nullable String str) {
        this.fundingSource = str;
    }

    public final void setIssuers(@Nullable List<Issuer> list) {
        this.issuers = list;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.name;
        List<String> list = this.brands;
        String str3 = this.brand;
        String str4 = this.fundingSource;
        List<Issuer> list2 = this.issuers;
        Configuration configuration = this.configuration;
        List<InputDetail> list3 = this.details;
        List<AppData> list4 = this.apps;
        StringBuilder sbT = f.t("PaymentMethod(type=", str, ", name=", str2, ", brands=");
        sbT.append(list);
        sbT.append(", brand=");
        sbT.append(str3);
        sbT.append(", fundingSource=");
        sbT.append(str4);
        sbT.append(", issuers=");
        sbT.append(list2);
        sbT.append(", configuration=");
        sbT.append(configuration);
        sbT.append(", details=");
        sbT.append(list3);
        sbT.append(", apps=");
        return f.p(sbT, list4, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeStringList(this.brands);
        parcel.writeString(this.brand);
        parcel.writeString(this.fundingSource);
        List<Issuer> list = this.issuers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ = i.q(parcel, 1, list);
            while (itQ.hasNext()) {
                ((Issuer) itQ.next()).writeToParcel(parcel, flags);
            }
        }
        Configuration configuration = this.configuration;
        if (configuration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            configuration.writeToParcel(parcel, flags);
        }
        List<InputDetail> list2 = this.details;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ2 = i.q(parcel, 1, list2);
            while (itQ2.hasNext()) {
                ((InputDetail) itQ2.next()).writeToParcel(parcel, flags);
            }
        }
        List<AppData> list3 = this.apps;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itQ3 = i.q(parcel, 1, list3);
        while (itQ3.hasNext()) {
            ((AppData) itQ3.next()).writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentMethod createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int iC = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int iC2 = 0;
                while (iC2 != i11) {
                    iC2 = i.c(Issuer.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            Configuration configurationCreateFromParcel = parcel.readInt() == 0 ? null : Configuration.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i12 = parcel.readInt();
                arrayList2 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = i.c(InputDetail.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iC != i13) {
                    iC = i.c(AppData.CREATOR, parcel, arrayList4, iC, 1);
                }
                arrayList3 = arrayList4;
            }
            return new PaymentMethod(string, string2, arrayListCreateStringArrayList, string3, string4, arrayList, configurationCreateFromParcel, arrayList2, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentMethod[] newArray(int i11) {
            return new PaymentMethod[i11];
        }
    }

    public PaymentMethod() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public PaymentMethod(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable List<Issuer> list2, @Nullable Configuration configuration, @Nullable List<InputDetail> list3, @Nullable List<AppData> list4) {
        this.type = str;
        this.name = str2;
        this.brands = list;
        this.brand = str3;
        this.fundingSource = str4;
        this.issuers = list2;
        this.configuration = configuration;
        this.details = list3;
        this.apps = list4;
    }
}
