package com.adyen.checkout.core.internal.data.model;

import android.os.Parcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "Landroid/os/Parcelable;", "()V", "describeContents", "", "Serializer", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ModelObject implements Parcelable {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "T", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "", "deserialize", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "serialize", "modelObject", "(Lcom/adyen/checkout/core/internal/data/model/ModelObject;)Lorg/json/JSONObject;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Serializer<T extends ModelObject> {
        @NotNull
        T deserialize(@NotNull JSONObject jsonObject);

        @NotNull
        JSONObject serialize(@NotNull T modelObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }
}
