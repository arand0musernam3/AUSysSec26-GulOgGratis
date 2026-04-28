package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/components/core/InputDetail;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", InputDetail.ITEMS, "", "Lcom/adyen/checkout/components/core/Item;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InputDetail extends ModelObject {

    @NotNull
    private static final String ITEMS = "items";

    @Nullable
    private List<Item> items;

    @NotNull
    public static final Parcelable.Creator<InputDetail> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<InputDetail> SERIALIZER = new ModelObject.Serializer<InputDetail>() { // from class: com.adyen.checkout.components.core.InputDetail$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public InputDetail deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new InputDetail(ModelUtils.deserializeOptList(jsonObject.optJSONArray("items"), Item.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull InputDetail modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("items", ModelUtils.serializeOptList(modelObject.getItems(), Item.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(InputDetail.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ InputDetail(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputDetail copy$default(InputDetail inputDetail, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = inputDetail.items;
        }
        return inputDetail.copy(list);
    }

    @Nullable
    public final List<Item> component1() {
        return this.items;
    }

    @NotNull
    public final InputDetail copy(@Nullable List<Item> items) {
        return new InputDetail(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InputDetail) && Intrinsics.areEqual(this.items, ((InputDetail) other).items);
    }

    @Nullable
    public final List<Item> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<Item> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setItems(@Nullable List<Item> list) {
        this.items = list;
    }

    @NotNull
    public String toString() {
        return f.m("InputDetail(items=", ")", this.items);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        List<Item> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itQ = i.q(parcel, 1, list);
        while (itQ.hasNext()) {
            ((Item) itQ.next()).writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InputDetail createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int iC = 0;
                while (iC != i11) {
                    iC = i.c(Item.CREATOR, parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new InputDetail(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InputDetail[] newArray(int i11) {
            return new InputDetail[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputDetail() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public InputDetail(@Nullable List<Item> list) {
        this.items = list;
    }
}
