package com.app.tgtg.model.remote.voucher;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J4\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010/R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010,\u0012\u0004\b4\u00101\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010/R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00105\u0012\u0004\b9\u00101\u001a\u0004\b6\u0010\"\"\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/FilteredStore;", "Landroid/os/Parcelable;", "", "id", "name", "Lcom/app/tgtg/model/remote/item/Picture;", "storeLogo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/FilteredStore;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/app/tgtg/model/remote/item/Picture;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;)Lcom/app/tgtg/model/remote/voucher/FilteredStore;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getId$annotations", "()V", "getName", "setName", "getName$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getStoreLogo", "setStoreLogo", "(Lcom/app/tgtg/model/remote/item/Picture;)V", "getStoreLogo$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FilteredStore implements Parcelable {

    @Nullable
    private String id;

    @Nullable
    private String name;

    @Nullable
    private Picture storeLogo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FilteredStore> CREATOR = new Creator();

    public /* synthetic */ FilteredStore(int i11, String str, String str2, Picture picture, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i11 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i11 & 4) == 0) {
            this.storeLogo = null;
        } else {
            this.storeLogo = picture;
        }
    }

    public static /* synthetic */ FilteredStore copy$default(FilteredStore filteredStore, String str, String str2, Picture picture, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = filteredStore.id;
        }
        if ((i11 & 2) != 0) {
            str2 = filteredStore.name;
        }
        if ((i11 & 4) != 0) {
            picture = filteredStore.storeLogo;
        }
        return filteredStore.copy(str, str2, picture);
    }

    public static final /* synthetic */ void write$Self$app(FilteredStore self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.id != null) {
            output.r(serialDesc, 0, r1.f29848a, self.id);
        }
        if (output.C(serialDesc) || self.name != null) {
            output.r(serialDesc, 1, r1.f29848a, self.name);
        }
        if (!output.C(serialDesc) && self.storeLogo == null) {
            return;
        }
        output.r(serialDesc, 2, Picture$$serializer.INSTANCE, self.storeLogo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Picture getStoreLogo() {
        return this.storeLogo;
    }

    @NotNull
    public final FilteredStore copy(@Nullable String id2, @Nullable String name, @Nullable Picture storeLogo) {
        return new FilteredStore(id2, name, storeLogo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilteredStore)) {
            return false;
        }
        FilteredStore filteredStore = (FilteredStore) other;
        return Intrinsics.areEqual(this.id, filteredStore.id) && Intrinsics.areEqual(this.name, filteredStore.name) && Intrinsics.areEqual(this.storeLogo, filteredStore.storeLogo);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Picture getStoreLogo() {
        return this.storeLogo;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Picture picture = this.storeLogo;
        return iHashCode2 + (picture != null ? picture.hashCode() : 0);
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setStoreLogo(@Nullable Picture picture) {
        this.storeLogo = picture;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        Picture picture = this.storeLogo;
        StringBuilder sbT = f.t("FilteredStore(id=", str, ", name=", str2, ", storeLogo=");
        sbT.append(picture);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.name);
        Picture picture = this.storeLogo;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/FilteredStore$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/FilteredStore;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FilteredStore$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilteredStore> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilteredStore createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new FilteredStore(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilteredStore[] newArray(int i11) {
            return new FilteredStore[i11];
        }
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("store_logo")
    public static /* synthetic */ void getStoreLogo$annotations() {
    }

    public FilteredStore() {
        this((String) null, (String) null, (Picture) null, 7, (DefaultConstructorMarker) null);
    }

    public FilteredStore(@Nullable String str, @Nullable String str2, @Nullable Picture picture) {
        this.id = str;
        this.name = str2;
        this.storeLogo = picture;
    }

    public /* synthetic */ FilteredStore(String str, String str2, Picture picture, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : picture);
    }
}
