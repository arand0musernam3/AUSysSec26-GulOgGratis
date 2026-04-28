package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2$$serializer;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J,\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010!¨\u00064"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/MnuRecommendationsResponse;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "recommendedItems", "", "recommendationType", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/MnuRecommendationsResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/app/tgtg/model/remote/manufacturer/response/MnuRecommendationsResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRecommendedItems", "getRecommendedItems$annotations", "()V", "Ljava/lang/String;", "getRecommendationType", "getRecommendationType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MnuRecommendationsResponse implements Parcelable {

    @NotNull
    private final String recommendationType;

    @Nullable
    private final List<BaseItemMnuV2> recommendedItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MnuRecommendationsResponse> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(28)), null};

    public /* synthetic */ MnuRecommendationsResponse(int i11, List list, String str, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, MnuRecommendationsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.recommendedItems = list;
        this.recommendationType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BaseItemMnuV2$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MnuRecommendationsResponse copy$default(MnuRecommendationsResponse mnuRecommendationsResponse, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mnuRecommendationsResponse.recommendedItems;
        }
        if ((i11 & 2) != 0) {
            str = mnuRecommendationsResponse.recommendationType;
        }
        return mnuRecommendationsResponse.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$app(MnuRecommendationsResponse self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.recommendedItems);
        output.q(serialDesc, 1, self.recommendationType);
    }

    @Nullable
    public final List<BaseItemMnuV2> component1() {
        return this.recommendedItems;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecommendationType() {
        return this.recommendationType;
    }

    @NotNull
    public final MnuRecommendationsResponse copy(@Nullable List<BaseItemMnuV2> recommendedItems, @NotNull String recommendationType) {
        recommendationType.getClass();
        return new MnuRecommendationsResponse(recommendedItems, recommendationType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MnuRecommendationsResponse)) {
            return false;
        }
        MnuRecommendationsResponse mnuRecommendationsResponse = (MnuRecommendationsResponse) other;
        return Intrinsics.areEqual(this.recommendedItems, mnuRecommendationsResponse.recommendedItems) && Intrinsics.areEqual(this.recommendationType, mnuRecommendationsResponse.recommendationType);
    }

    @NotNull
    public final String getRecommendationType() {
        return this.recommendationType;
    }

    @Nullable
    public final List<BaseItemMnuV2> getRecommendedItems() {
        return this.recommendedItems;
    }

    public int hashCode() {
        List<BaseItemMnuV2> list = this.recommendedItems;
        return this.recommendationType.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "MnuRecommendationsResponse(recommendedItems=" + this.recommendedItems + ", recommendationType=" + this.recommendationType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        List<BaseItemMnuV2> list = this.recommendedItems;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((BaseItemMnuV2) itQ.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.recommendationType);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/MnuRecommendationsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/MnuRecommendationsResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MnuRecommendationsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MnuRecommendationsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MnuRecommendationsResponse createFromParcel(Parcel parcel) {
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
            return new MnuRecommendationsResponse(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MnuRecommendationsResponse[] newArray(int i11) {
            return new MnuRecommendationsResponse[i11];
        }
    }

    @g("recommendation_type")
    public static /* synthetic */ void getRecommendationType$annotations() {
    }

    @g("recommended_items")
    public static /* synthetic */ void getRecommendedItems$annotations() {
    }

    public MnuRecommendationsResponse(@Nullable List<BaseItemMnuV2> list, @NotNull String str) {
        str.getClass();
        this.recommendedItems = list;
        this.recommendationType = str;
    }
}
