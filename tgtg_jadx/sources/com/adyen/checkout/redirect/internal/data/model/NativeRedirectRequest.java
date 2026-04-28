package com.adyen.checkout.redirect.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/redirect/internal/data/model/NativeRedirectRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", NativeRedirectRequest.REDIRECT_DATA, "", NativeRedirectRequest.RETURN_QUERY_STRING, "(Ljava/lang/String;Ljava/lang/String;)V", "getRedirectData", "()Ljava/lang/String;", "getReturnQueryString", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NativeRedirectRequest extends ModelObject {

    @NotNull
    private static final String REDIRECT_DATA = "redirectData";

    @NotNull
    private static final String RETURN_QUERY_STRING = "returnQueryString";

    @Nullable
    private final String redirectData;

    @NotNull
    private final String returnQueryString;

    @NotNull
    public static final Parcelable.Creator<NativeRedirectRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<NativeRedirectRequest> SERIALIZER = new ModelObject.Serializer<NativeRedirectRequest>() { // from class: com.adyen.checkout.redirect.internal.data.model.NativeRedirectRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public NativeRedirectRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String string = jsonObject.getString("redirectData");
                String string2 = jsonObject.getString("returnQueryString");
                string2.getClass();
                return new NativeRedirectRequest(string, string2);
            } catch (JSONException e5) {
                w.j(NativeRedirectRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull NativeRedirectRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("redirectData", modelObject.getRedirectData());
                jSONObject.putOpt("returnQueryString", modelObject.getReturnQueryString());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(NativeRedirectRequest.class, e5);
                return null;
            }
        }
    };

    public NativeRedirectRequest(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        this.redirectData = str;
        this.returnQueryString = str2;
    }

    public static /* synthetic */ NativeRedirectRequest copy$default(NativeRedirectRequest nativeRedirectRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nativeRedirectRequest.redirectData;
        }
        if ((i11 & 2) != 0) {
            str2 = nativeRedirectRequest.returnQueryString;
        }
        return nativeRedirectRequest.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedirectData() {
        return this.redirectData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReturnQueryString() {
        return this.returnQueryString;
    }

    @NotNull
    public final NativeRedirectRequest copy(@Nullable String redirectData, @NotNull String returnQueryString) {
        returnQueryString.getClass();
        return new NativeRedirectRequest(redirectData, returnQueryString);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeRedirectRequest)) {
            return false;
        }
        NativeRedirectRequest nativeRedirectRequest = (NativeRedirectRequest) other;
        return Intrinsics.areEqual(this.redirectData, nativeRedirectRequest.redirectData) && Intrinsics.areEqual(this.returnQueryString, nativeRedirectRequest.returnQueryString);
    }

    @Nullable
    public final String getRedirectData() {
        return this.redirectData;
    }

    @NotNull
    public final String getReturnQueryString() {
        return this.returnQueryString;
    }

    public int hashCode() {
        String str = this.redirectData;
        return this.returnQueryString.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return a.d("NativeRedirectRequest(redirectData=", this.redirectData, ", returnQueryString=", this.returnQueryString, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.redirectData);
        parcel.writeString(this.returnQueryString);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NativeRedirectRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NativeRedirectRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new NativeRedirectRequest(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NativeRedirectRequest[] newArray(int i11) {
            return new NativeRedirectRequest[i11];
        }
    }
}
