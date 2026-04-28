package com.adyen.checkout.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/EmptyResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "()V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EmptyResponse extends ModelObject {

    @NotNull
    public static final Parcelable.Creator<EmptyResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<EmptyResponse> SERIALIZER = new ModelObject.Serializer<EmptyResponse>() { // from class: com.adyen.checkout.core.internal.data.model.EmptyResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public EmptyResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new EmptyResponse();
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull EmptyResponse modelObject) {
            modelObject.getClass();
            return new JSONObject();
        }
    };

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(1);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmptyResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final EmptyResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return new EmptyResponse();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final EmptyResponse[] newArray(int i11) {
            return new EmptyResponse[i11];
        }
    }
}
