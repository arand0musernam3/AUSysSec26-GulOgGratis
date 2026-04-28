package com.adyen.checkout.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.braze.models.inappmessage.InAppMessageBase;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", ErrorResponseBody.STATUS, "", ErrorResponseBody.ERROR_CODE, "", "message", ErrorResponseBody.ERROR_TYPE, ErrorResponseBody.PSP_REFERENCE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorType", "getMessage", "getPspReference", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ErrorResponseBody extends ModelObject {

    @NotNull
    private static final String ERROR_CODE = "errorCode";

    @NotNull
    private static final String ERROR_TYPE = "errorType";

    @NotNull
    private static final String MESSAGE = "message";

    @NotNull
    private static final String PSP_REFERENCE = "pspReference";

    @NotNull
    private static final String STATUS = "status";

    @Nullable
    private final String errorCode;

    @Nullable
    private final String errorType;

    @Nullable
    private final String message;

    @Nullable
    private final String pspReference;

    @Nullable
    private final Integer status;

    @NotNull
    public static final Parcelable.Creator<ErrorResponseBody> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<ErrorResponseBody> SERIALIZER = new ModelObject.Serializer<ErrorResponseBody>() { // from class: com.adyen.checkout.core.internal.data.model.ErrorResponseBody$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public ErrorResponseBody deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new ErrorResponseBody(JsonUtilsKt.getIntOrNull(jsonObject, "status"), JsonUtilsKt.getStringOrNull(jsonObject, "errorCode"), JsonUtilsKt.getStringOrNull(jsonObject, InAppMessageBase.MESSAGE), JsonUtilsKt.getStringOrNull(jsonObject, "errorType"), JsonUtilsKt.getStringOrNull(jsonObject, "pspReference"));
            } catch (JSONException e5) {
                w.j(ErrorResponseBody.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull ErrorResponseBody modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("status", modelObject.getStatus());
                jSONObject.putOpt("errorCode", modelObject.getErrorCode());
                jSONObject.putOpt(InAppMessageBase.MESSAGE, modelObject.getMessage());
                jSONObject.putOpt("errorType", modelObject.getErrorType());
                jSONObject.putOpt("pspReference", modelObject.getPspReference());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(ErrorResponseBody.class, e5);
                return null;
            }
        }
    };

    public ErrorResponseBody(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.status = num;
        this.errorCode = str;
        this.message = str2;
        this.errorType = str3;
        this.pspReference = str4;
    }

    public static /* synthetic */ ErrorResponseBody copy$default(ErrorResponseBody errorResponseBody, Integer num, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = errorResponseBody.status;
        }
        if ((i11 & 2) != 0) {
            str = errorResponseBody.errorCode;
        }
        if ((i11 & 4) != 0) {
            str2 = errorResponseBody.message;
        }
        if ((i11 & 8) != 0) {
            str3 = errorResponseBody.errorType;
        }
        if ((i11 & 16) != 0) {
            str4 = errorResponseBody.pspReference;
        }
        String str5 = str4;
        String str6 = str2;
        return errorResponseBody.copy(num, str, str6, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPspReference() {
        return this.pspReference;
    }

    @NotNull
    public final ErrorResponseBody copy(@Nullable Integer status, @Nullable String errorCode, @Nullable String message, @Nullable String errorType, @Nullable String pspReference) {
        return new ErrorResponseBody(status, errorCode, message, errorType, pspReference);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponseBody)) {
            return false;
        }
        ErrorResponseBody errorResponseBody = (ErrorResponseBody) other;
        return Intrinsics.areEqual(this.status, errorResponseBody.status) && Intrinsics.areEqual(this.errorCode, errorResponseBody.errorCode) && Intrinsics.areEqual(this.message, errorResponseBody.message) && Intrinsics.areEqual(this.errorType, errorResponseBody.errorType) && Intrinsics.areEqual(this.pspReference, errorResponseBody.pspReference);
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getPspReference() {
        return this.pspReference;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pspReference;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.status;
        String str = this.errorCode;
        String str2 = this.message;
        String str3 = this.errorType;
        String str4 = this.pspReference;
        StringBuilder sb2 = new StringBuilder("ErrorResponseBody(status=");
        sb2.append(num);
        sb2.append(", errorCode=");
        sb2.append(str);
        sb2.append(", message=");
        s.A(sb2, str2, ", errorType=", str3, ", pspReference=");
        return k.p(sb2, str4, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num);
        }
        parcel.writeString(this.errorCode);
        parcel.writeString(this.message);
        parcel.writeString(this.errorType);
        parcel.writeString(this.pspReference);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ErrorResponseBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ErrorResponseBody createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new ErrorResponseBody(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ErrorResponseBody[] newArray(int i11) {
            return new ErrorResponseBody[i11];
        }
    }
}
