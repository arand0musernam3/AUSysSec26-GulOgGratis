package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0001&BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003JW\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006'"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "channel", "", AnalyticsTrackRequest.PLATFORM, AnalyticsTrackRequest.INFO, "", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", AnalyticsTrackRequest.LOGS, "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", AnalyticsTrackRequest.ERRORS, "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackError;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getChannel", "()Ljava/lang/String;", "getErrors", "()Ljava/util/List;", "getInfo", "getLogs", "getPlatform", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsTrackRequest extends ModelObject {

    @NotNull
    private static final String CHANNEL = "channel";

    @NotNull
    private static final String ERRORS = "errors";

    @NotNull
    private static final String INFO = "info";

    @NotNull
    private static final String LOGS = "logs";

    @NotNull
    private static final String PLATFORM = "platform";

    @Nullable
    private final String channel;

    @Nullable
    private final List<AnalyticsTrackError> errors;

    @Nullable
    private final List<AnalyticsTrackInfo> info;

    @Nullable
    private final List<AnalyticsTrackLog> logs;

    @Nullable
    private final String platform;

    @NotNull
    public static final Parcelable.Creator<AnalyticsTrackRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<AnalyticsTrackRequest> SERIALIZER = new ModelObject.Serializer<AnalyticsTrackRequest>() { // from class: com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public AnalyticsTrackRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new AnalyticsTrackRequest(JsonUtilsKt.getStringOrNull(jsonObject, "channel"), JsonUtilsKt.getStringOrNull(jsonObject, "platform"), ModelUtils.deserializeOptList(jsonObject.getJSONArray("info"), AnalyticsTrackInfo.SERIALIZER), ModelUtils.deserializeOptList(jsonObject.getJSONArray("logs"), AnalyticsTrackLog.SERIALIZER), ModelUtils.deserializeOptList(jsonObject.getJSONArray("errors"), AnalyticsTrackError.SERIALIZER));
            } catch (JSONException e5) {
                w.j(AnalyticsTrackRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull AnalyticsTrackRequest modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("channel", modelObject.getChannel());
                jSONObject.putOpt("platform", modelObject.getPlatform());
                jSONObject.putOpt("info", ModelUtils.serializeOptList(modelObject.getInfo(), AnalyticsTrackInfo.SERIALIZER));
                jSONObject.putOpt("logs", ModelUtils.serializeOptList(modelObject.getLogs(), AnalyticsTrackLog.SERIALIZER));
                jSONObject.putOpt("errors", ModelUtils.serializeOptList(modelObject.getErrors(), AnalyticsTrackError.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(AnalyticsTrackRequest.class, e5);
                return null;
            }
        }
    };

    public AnalyticsTrackRequest(@Nullable String str, @Nullable String str2, @Nullable List<AnalyticsTrackInfo> list, @Nullable List<AnalyticsTrackLog> list2, @Nullable List<AnalyticsTrackError> list3) {
        this.channel = str;
        this.platform = str2;
        this.info = list;
        this.logs = list2;
        this.errors = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsTrackRequest copy$default(AnalyticsTrackRequest analyticsTrackRequest, String str, String str2, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsTrackRequest.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = analyticsTrackRequest.platform;
        }
        if ((i11 & 4) != 0) {
            list = analyticsTrackRequest.info;
        }
        if ((i11 & 8) != 0) {
            list2 = analyticsTrackRequest.logs;
        }
        if ((i11 & 16) != 0) {
            list3 = analyticsTrackRequest.errors;
        }
        List list4 = list3;
        List list5 = list;
        return analyticsTrackRequest.copy(str, str2, list5, list2, list4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final List<AnalyticsTrackInfo> component3() {
        return this.info;
    }

    @Nullable
    public final List<AnalyticsTrackLog> component4() {
        return this.logs;
    }

    @Nullable
    public final List<AnalyticsTrackError> component5() {
        return this.errors;
    }

    @NotNull
    public final AnalyticsTrackRequest copy(@Nullable String channel, @Nullable String platform, @Nullable List<AnalyticsTrackInfo> info, @Nullable List<AnalyticsTrackLog> logs, @Nullable List<AnalyticsTrackError> errors) {
        return new AnalyticsTrackRequest(channel, platform, info, logs, errors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsTrackRequest)) {
            return false;
        }
        AnalyticsTrackRequest analyticsTrackRequest = (AnalyticsTrackRequest) other;
        return Intrinsics.areEqual(this.channel, analyticsTrackRequest.channel) && Intrinsics.areEqual(this.platform, analyticsTrackRequest.platform) && Intrinsics.areEqual(this.info, analyticsTrackRequest.info) && Intrinsics.areEqual(this.logs, analyticsTrackRequest.logs) && Intrinsics.areEqual(this.errors, analyticsTrackRequest.errors);
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final List<AnalyticsTrackError> getErrors() {
        return this.errors;
    }

    @Nullable
    public final List<AnalyticsTrackInfo> getInfo() {
        return this.info;
    }

    @Nullable
    public final List<AnalyticsTrackLog> getLogs() {
        return this.logs;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        String str = this.channel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AnalyticsTrackInfo> list = this.info;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AnalyticsTrackLog> list2 = this.logs;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AnalyticsTrackError> list3 = this.errors;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.channel;
        String str2 = this.platform;
        List<AnalyticsTrackInfo> list = this.info;
        List<AnalyticsTrackLog> list2 = this.logs;
        List<AnalyticsTrackError> list3 = this.errors;
        StringBuilder sbT = f.t("AnalyticsTrackRequest(channel=", str, ", platform=", str2, ", info=");
        sbT.append(list);
        sbT.append(", logs=");
        sbT.append(list2);
        sbT.append(", errors=");
        return f.p(sbT, list3, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.channel);
        parcel.writeString(this.platform);
        List<AnalyticsTrackInfo> list = this.info;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ = i.q(parcel, 1, list);
            while (itQ.hasNext()) {
                ((AnalyticsTrackInfo) itQ.next()).writeToParcel(parcel, flags);
            }
        }
        List<AnalyticsTrackLog> list2 = this.logs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ2 = i.q(parcel, 1, list2);
            while (itQ2.hasNext()) {
                ((AnalyticsTrackLog) itQ2.next()).writeToParcel(parcel, flags);
            }
        }
        List<AnalyticsTrackError> list3 = this.errors;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itQ3 = i.q(parcel, 1, list3);
        while (itQ3.hasNext()) {
            ((AnalyticsTrackError) itQ3.next()).writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsTrackRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsTrackRequest createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int iC2 = 0;
                while (iC2 != i11) {
                    iC2 = i.c(AnalyticsTrackInfo.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i12 = parcel.readInt();
                arrayList2 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = i.c(AnalyticsTrackLog.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList3 = new ArrayList(i13);
                while (iC != i13) {
                    iC = i.c(AnalyticsTrackError.CREATOR, parcel, arrayList3, iC, 1);
                }
            }
            return new AnalyticsTrackRequest(string, string2, arrayList, arrayList2, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsTrackRequest[] newArray(int i11) {
            return new AnalyticsTrackRequest[i11];
        }
    }
}
