package com.adyen.checkout.sessions.core;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtils;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J>\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionSetupInstallmentOptions.PLANS, "", "", SessionSetupInstallmentOptions.PRESELECTED_VALUE, "", SessionSetupInstallmentOptions.VALUES, "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)V", "getPlans", "()Ljava/util/List;", "getPreselectedValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValues", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionSetupInstallmentOptions extends ModelObject {

    @NotNull
    private static final String PLANS = "plans";

    @NotNull
    private static final String PRESELECTED_VALUE = "preselectedValue";

    @NotNull
    private static final String VALUES = "values";

    @Nullable
    private final List<String> plans;

    @Nullable
    private final Integer preselectedValue;

    @Nullable
    private final List<Integer> values;

    @NotNull
    public static final Parcelable.Creator<SessionSetupInstallmentOptions> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionSetupInstallmentOptions> SERIALIZER = new ModelObject.Serializer<SessionSetupInstallmentOptions>() { // from class: com.adyen.checkout.sessions.core.SessionSetupInstallmentOptions$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionSetupInstallmentOptions deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                List listOptStringList = JsonUtilsKt.optStringList(jsonObject, "plans");
                if (listOptStringList == null) {
                    listOptStringList = n0.f26529a;
                }
                return new SessionSetupInstallmentOptions(listOptStringList, JsonUtilsKt.getIntOrNull(jsonObject, "preselectedValue"), JsonUtilsKt.optIntList(jsonObject, "values"));
            } catch (JSONException e5) {
                w.j(SessionSetupConfiguration.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionSetupInstallmentOptions modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("plans", JsonUtils.serializeOptStringList(modelObject.getPlans()));
                jSONObject.putOpt("preselectedValue", modelObject.getPreselectedValue());
                jSONObject.putOpt("values", JsonUtils.serializeOptIntegerList(modelObject.getValues()));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionSetupResponse.class, e5);
                return null;
            }
        }
    };

    public SessionSetupInstallmentOptions(@Nullable List<String> list, @Nullable Integer num, @Nullable List<Integer> list2) {
        this.plans = list;
        this.preselectedValue = num;
        this.values = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionSetupInstallmentOptions copy$default(SessionSetupInstallmentOptions sessionSetupInstallmentOptions, List list, Integer num, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sessionSetupInstallmentOptions.plans;
        }
        if ((i11 & 2) != 0) {
            num = sessionSetupInstallmentOptions.preselectedValue;
        }
        if ((i11 & 4) != 0) {
            list2 = sessionSetupInstallmentOptions.values;
        }
        return sessionSetupInstallmentOptions.copy(list, num, list2);
    }

    @Nullable
    public final List<String> component1() {
        return this.plans;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPreselectedValue() {
        return this.preselectedValue;
    }

    @Nullable
    public final List<Integer> component3() {
        return this.values;
    }

    @NotNull
    public final SessionSetupInstallmentOptions copy(@Nullable List<String> plans, @Nullable Integer preselectedValue, @Nullable List<Integer> values) {
        return new SessionSetupInstallmentOptions(plans, preselectedValue, values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSetupInstallmentOptions)) {
            return false;
        }
        SessionSetupInstallmentOptions sessionSetupInstallmentOptions = (SessionSetupInstallmentOptions) other;
        return Intrinsics.areEqual(this.plans, sessionSetupInstallmentOptions.plans) && Intrinsics.areEqual(this.preselectedValue, sessionSetupInstallmentOptions.preselectedValue) && Intrinsics.areEqual(this.values, sessionSetupInstallmentOptions.values);
    }

    @Nullable
    public final List<String> getPlans() {
        return this.plans;
    }

    @Nullable
    public final Integer getPreselectedValue() {
        return this.preselectedValue;
    }

    @Nullable
    public final List<Integer> getValues() {
        return this.values;
    }

    public int hashCode() {
        List<String> list = this.plans;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.preselectedValue;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.values;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<String> list = this.plans;
        Integer num = this.preselectedValue;
        List<Integer> list2 = this.values;
        StringBuilder sb2 = new StringBuilder("SessionSetupInstallmentOptions(plans=");
        sb2.append(list);
        sb2.append(", preselectedValue=");
        sb2.append(num);
        sb2.append(", values=");
        return f.p(sb2, list2, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeStringList(this.plans);
        Integer num = this.preselectedValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num);
        }
        List<Integer> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itQ = i.q(parcel, 1, list);
        while (itQ.hasNext()) {
            parcel.writeInt(((Number) itQ.next()).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionSetupInstallmentOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionSetupInstallmentOptions createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new SessionSetupInstallmentOptions(arrayListCreateStringArrayList, numValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionSetupInstallmentOptions[] newArray(int i11) {
            return new SessionSetupInstallmentOptions[i11];
        }
    }
}
