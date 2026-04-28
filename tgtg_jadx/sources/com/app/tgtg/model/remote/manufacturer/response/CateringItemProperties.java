package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!JF\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010!R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010!¨\u0006<"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/CateringItemProperties;", "Landroid/os/Parcelable;", "", "estimatedDelivery", "", "Lcom/app/tgtg/model/remote/manufacturer/response/ItemDetailsFaqItem;", "faqList", "deliveryMethod", "deliveryArea", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/CateringItemProperties;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/manufacturer/response/CateringItemProperties;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEstimatedDelivery", "getEstimatedDelivery$annotations", "()V", "Ljava/util/List;", "getFaqList", "getFaqList$annotations", "getDeliveryMethod", "getDeliveryMethod$annotations", "getDeliveryArea", "getDeliveryArea$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CateringItemProperties implements Parcelable {

    @Nullable
    private final String deliveryArea;

    @Nullable
    private final String deliveryMethod;

    @Nullable
    private final String estimatedDelivery;

    @Nullable
    private final List<ItemDetailsFaqItem> faqList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CateringItemProperties> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(19)), null, null};

    public /* synthetic */ CateringItemProperties(int i11, String str, List list, String str2, String str3, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.estimatedDelivery = null;
        } else {
            this.estimatedDelivery = str;
        }
        if ((i11 & 2) == 0) {
            this.faqList = null;
        } else {
            this.faqList = list;
        }
        if ((i11 & 4) == 0) {
            this.deliveryMethod = null;
        } else {
            this.deliveryMethod = str2;
        }
        if ((i11 & 8) == 0) {
            this.deliveryArea = null;
        } else {
            this.deliveryArea = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ItemDetailsFaqItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CateringItemProperties copy$default(CateringItemProperties cateringItemProperties, String str, List list, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cateringItemProperties.estimatedDelivery;
        }
        if ((i11 & 2) != 0) {
            list = cateringItemProperties.faqList;
        }
        if ((i11 & 4) != 0) {
            str2 = cateringItemProperties.deliveryMethod;
        }
        if ((i11 & 8) != 0) {
            str3 = cateringItemProperties.deliveryArea;
        }
        return cateringItemProperties.copy(str, list, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(CateringItemProperties self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.estimatedDelivery != null) {
            output.r(serialDesc, 0, r1.f29848a, self.estimatedDelivery);
        }
        if (output.C(serialDesc) || self.faqList != null) {
            output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.faqList);
        }
        if (output.C(serialDesc) || self.deliveryMethod != null) {
            output.r(serialDesc, 2, r1.f29848a, self.deliveryMethod);
        }
        if (!output.C(serialDesc) && self.deliveryArea == null) {
            return;
        }
        output.r(serialDesc, 3, r1.f29848a, self.deliveryArea);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    public final List<ItemDetailsFaqItem> component2() {
        return this.faqList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeliveryArea() {
        return this.deliveryArea;
    }

    @NotNull
    public final CateringItemProperties copy(@Nullable String estimatedDelivery, @Nullable List<ItemDetailsFaqItem> faqList, @Nullable String deliveryMethod, @Nullable String deliveryArea) {
        return new CateringItemProperties(estimatedDelivery, faqList, deliveryMethod, deliveryArea);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CateringItemProperties)) {
            return false;
        }
        CateringItemProperties cateringItemProperties = (CateringItemProperties) other;
        return Intrinsics.areEqual(this.estimatedDelivery, cateringItemProperties.estimatedDelivery) && Intrinsics.areEqual(this.faqList, cateringItemProperties.faqList) && Intrinsics.areEqual(this.deliveryMethod, cateringItemProperties.deliveryMethod) && Intrinsics.areEqual(this.deliveryArea, cateringItemProperties.deliveryArea);
    }

    @Nullable
    public final String getDeliveryArea() {
        return this.deliveryArea;
    }

    @Nullable
    public final String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @Nullable
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    public final List<ItemDetailsFaqItem> getFaqList() {
        return this.faqList;
    }

    public int hashCode() {
        String str = this.estimatedDelivery;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ItemDetailsFaqItem> list = this.faqList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.deliveryMethod;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deliveryArea;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.estimatedDelivery;
        List<ItemDetailsFaqItem> list = this.faqList;
        String str2 = this.deliveryMethod;
        String str3 = this.deliveryArea;
        StringBuilder sb2 = new StringBuilder("CateringItemProperties(estimatedDelivery=");
        sb2.append(str);
        sb2.append(", faqList=");
        sb2.append(list);
        sb2.append(", deliveryMethod=");
        return f.o(sb2, str2, ", deliveryArea=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.estimatedDelivery);
        List<ItemDetailsFaqItem> list = this.faqList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((ItemDetailsFaqItem) itQ.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.deliveryMethod);
        dest.writeString(this.deliveryArea);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/CateringItemProperties$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/CateringItemProperties;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CateringItemProperties$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CateringItemProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CateringItemProperties createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int iC = 0;
                while (iC != i11) {
                    iC = i.c(ItemDetailsFaqItem.CREATOR, parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new CateringItemProperties(string, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CateringItemProperties[] newArray(int i11) {
            return new CateringItemProperties[i11];
        }
    }

    @g("delivery_area")
    public static /* synthetic */ void getDeliveryArea$annotations() {
    }

    @g("delivery_method")
    public static /* synthetic */ void getDeliveryMethod$annotations() {
    }

    @g("estimated_delivery")
    public static /* synthetic */ void getEstimatedDelivery$annotations() {
    }

    @g("faq_list")
    public static /* synthetic */ void getFaqList$annotations() {
    }

    public CateringItemProperties() {
        this((String) null, (List) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public CateringItemProperties(@Nullable String str, @Nullable List<ItemDetailsFaqItem> list, @Nullable String str2, @Nullable String str3) {
        this.estimatedDelivery = str;
        this.faqList = list;
        this.deliveryMethod = str2;
        this.deliveryArea = str3;
    }

    public /* synthetic */ CateringItemProperties(String str, List list, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
