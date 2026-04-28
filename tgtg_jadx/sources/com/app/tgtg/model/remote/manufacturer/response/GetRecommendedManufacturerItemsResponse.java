package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2$$serializer;
import e0.f;
import eu.a;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001d¨\u0006/"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/GetRecommendedManufacturerItemsResponse;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "recommendedItems", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/GetRecommendedManufacturerItemsResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/app/tgtg/model/remote/manufacturer/response/GetRecommendedManufacturerItemsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRecommendedItems", "getRecommendedItems$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class GetRecommendedManufacturerItemsResponse implements Parcelable {

    @Nullable
    private final List<BaseItemMnuV2> recommendedItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GetRecommendedManufacturerItemsResponse> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(23))};

    public /* synthetic */ GetRecommendedManufacturerItemsResponse(int i11, List list, m1 m1Var) {
        if (1 == (i11 & 1)) {
            this.recommendedItems = list;
        } else {
            c1.j(i11, 1, GetRecommendedManufacturerItemsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BaseItemMnuV2$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRecommendedManufacturerItemsResponse copy$default(GetRecommendedManufacturerItemsResponse getRecommendedManufacturerItemsResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = getRecommendedManufacturerItemsResponse.recommendedItems;
        }
        return getRecommendedManufacturerItemsResponse.copy(list);
    }

    @Nullable
    public final List<BaseItemMnuV2> component1() {
        return this.recommendedItems;
    }

    @NotNull
    public final GetRecommendedManufacturerItemsResponse copy(@Nullable List<BaseItemMnuV2> recommendedItems) {
        return new GetRecommendedManufacturerItemsResponse(recommendedItems);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetRecommendedManufacturerItemsResponse) && Intrinsics.areEqual(this.recommendedItems, ((GetRecommendedManufacturerItemsResponse) other).recommendedItems);
    }

    @Nullable
    public final List<BaseItemMnuV2> getRecommendedItems() {
        return this.recommendedItems;
    }

    public int hashCode() {
        List<BaseItemMnuV2> list = this.recommendedItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return f.m("GetRecommendedManufacturerItemsResponse(recommendedItems=", ")", this.recommendedItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        List<BaseItemMnuV2> list = this.recommendedItems;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = i.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((BaseItemMnuV2) itQ.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/GetRecommendedManufacturerItemsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/GetRecommendedManufacturerItemsResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return GetRecommendedManufacturerItemsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetRecommendedManufacturerItemsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetRecommendedManufacturerItemsResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int iC = 0;
                while (iC != i11) {
                    iC = i.c(BaseItemMnuV2.CREATOR, parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new GetRecommendedManufacturerItemsResponse(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetRecommendedManufacturerItemsResponse[] newArray(int i11) {
            return new GetRecommendedManufacturerItemsResponse[i11];
        }
    }

    @g("recommended_items")
    public static /* synthetic */ void getRecommendedItems$annotations() {
    }

    public GetRecommendedManufacturerItemsResponse(@Nullable List<BaseItemMnuV2> list) {
        this.recommendedItems = list;
    }
}
