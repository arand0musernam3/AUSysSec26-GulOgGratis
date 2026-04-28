package com.app.tgtg.model.remote.widgets.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupInterval$$serializer;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002POBY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u0016Jp\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010\u0018J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010:\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010;\u0012\u0004\b@\u0010>\u001a\u0004\b?\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010A\u0012\u0004\bC\u0010>\u001a\u0004\bB\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010A\u0012\u0004\bE\u0010>\u001a\u0004\bD\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010F\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010&R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010\u0016R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\bL\u0010>\u001a\u0004\bK\u0010\u0016R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010;\u0012\u0004\bN\u0010>\u001a\u0004\bM\u0010\u0016¨\u0006Q"}, d2 = {"Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "", "displayName", "Lcom/app/tgtg/model/remote/item/Picture;", "coverPicture", "logoPicture", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "pickupInterval", "storeName", "itemName", "branch", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/PickupInterval;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/PickupInterval;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-RWxzYZM", "component1", "component2", "component3", "()Lcom/app/tgtg/model/remote/item/Picture;", "component4", "component5", "()Lcom/app/tgtg/model/remote/item/PickupInterval;", "component6", "component7", "component8", "copy-4cjq6LE", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/item/PickupInterval;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem;", "copy", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getItemId-RWxzYZM", "getItemId-RWxzYZM$annotations", "()V", "getDisplayName", "getDisplayName$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getCoverPicture", "getCoverPicture$annotations", "getLogoPicture", "getLogoPicture$annotations", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "getPickupInterval", "getPickupInterval$annotations", "getStoreName", "getStoreName$annotations", "getItemName", "getItemName$annotations", "getBranch", "getBranch$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FavouriteWidgetItem implements Parcelable {

    @Nullable
    private final String branch;

    @Nullable
    private final Picture coverPicture;

    @Nullable
    private final String displayName;

    @Nullable
    private final String itemId;

    @Nullable
    private final String itemName;

    @Nullable
    private final Picture logoPicture;

    @Nullable
    private final PickupInterval pickupInterval;

    @Nullable
    private final String storeName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FavouriteWidgetItem> CREATOR = new Creator();

    private /* synthetic */ FavouriteWidgetItem(int i11, String str, String str2, Picture picture, Picture picture2, PickupInterval pickupInterval, String str3, String str4, String str5, m1 m1Var) {
        if (127 != (i11 & 127)) {
            c1.j(i11, 127, FavouriteWidgetItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemId = str;
        this.displayName = str2;
        this.coverPicture = picture;
        this.logoPicture = picture2;
        this.pickupInterval = pickupInterval;
        this.storeName = str3;
        this.itemName = str4;
        if ((i11 & 128) == 0) {
            this.branch = null;
        } else {
            this.branch = str5;
        }
    }

    /* JADX INFO: renamed from: copy-4cjq6LE$default, reason: not valid java name */
    public static /* synthetic */ FavouriteWidgetItem m542copy4cjq6LE$default(FavouriteWidgetItem favouriteWidgetItem, String str, String str2, Picture picture, Picture picture2, PickupInterval pickupInterval, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = favouriteWidgetItem.itemId;
        }
        if ((i11 & 2) != 0) {
            str2 = favouriteWidgetItem.displayName;
        }
        if ((i11 & 4) != 0) {
            picture = favouriteWidgetItem.coverPicture;
        }
        if ((i11 & 8) != 0) {
            picture2 = favouriteWidgetItem.logoPicture;
        }
        if ((i11 & 16) != 0) {
            pickupInterval = favouriteWidgetItem.pickupInterval;
        }
        if ((i11 & 32) != 0) {
            str3 = favouriteWidgetItem.storeName;
        }
        if ((i11 & 64) != 0) {
            str4 = favouriteWidgetItem.itemName;
        }
        if ((i11 & 128) != 0) {
            str5 = favouriteWidgetItem.branch;
        }
        String str6 = str4;
        String str7 = str5;
        PickupInterval pickupInterval2 = pickupInterval;
        String str8 = str3;
        return favouriteWidgetItem.m545copy4cjq6LE(str, str2, picture, picture2, pickupInterval2, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$app(FavouriteWidgetItem self, b output, SerialDescriptor serialDesc) {
        ItemId$$serializer itemId$$serializer = ItemId$$serializer.INSTANCE;
        String str = self.itemId;
        output.r(serialDesc, 0, itemId$$serializer, str != null ? ItemId.m197boximpl(str) : null);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.displayName);
        Picture$$serializer picture$$serializer = Picture$$serializer.INSTANCE;
        output.r(serialDesc, 2, picture$$serializer, self.coverPicture);
        output.r(serialDesc, 3, picture$$serializer, self.logoPicture);
        output.r(serialDesc, 4, PickupInterval$$serializer.INSTANCE, self.pickupInterval);
        output.r(serialDesc, 5, r1Var, self.storeName);
        output.r(serialDesc, 6, r1Var, self.itemName);
        if (!output.C(serialDesc) && self.branch == null) {
            return;
        }
        output.r(serialDesc, 7, r1Var, self.branch);
    }

    @Nullable
    /* JADX INFO: renamed from: component1-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Picture getCoverPicture() {
        return this.coverPicture;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Picture getLogoPicture() {
        return this.logoPicture;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PickupInterval getPickupInterval() {
        return this.pickupInterval;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBranch() {
        return this.branch;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-4cjq6LE, reason: not valid java name */
    public final FavouriteWidgetItem m545copy4cjq6LE(@Nullable String itemId, @Nullable String displayName, @Nullable Picture coverPicture, @Nullable Picture logoPicture, @Nullable PickupInterval pickupInterval, @Nullable String storeName, @Nullable String itemName, @Nullable String branch) {
        return new FavouriteWidgetItem(itemId, displayName, coverPicture, logoPicture, pickupInterval, storeName, itemName, branch, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem r5 = (com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem) r5
            java.lang.String r1 = r4.itemId
            java.lang.String r3 = r5.itemId
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.displayName
            java.lang.String r3 = r5.displayName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            com.app.tgtg.model.remote.item.Picture r1 = r4.coverPicture
            com.app.tgtg.model.remote.item.Picture r3 = r5.coverPicture
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            com.app.tgtg.model.remote.item.Picture r1 = r4.logoPicture
            com.app.tgtg.model.remote.item.Picture r3 = r5.logoPicture
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            com.app.tgtg.model.remote.item.PickupInterval r1 = r4.pickupInterval
            com.app.tgtg.model.remote.item.PickupInterval r3 = r5.pickupInterval
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.storeName
            java.lang.String r3 = r5.storeName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r4.itemName
            java.lang.String r3 = r5.itemName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r4.branch
            java.lang.String r5 = r5.branch
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L6f
            return r2
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final String getBranch() {
        return this.branch;
    }

    @Nullable
    public final Picture getCoverPicture() {
        return this.coverPicture;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m546getItemIdRWxzYZM() {
        return this.itemId;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final Picture getLogoPicture() {
        return this.logoPicture;
    }

    @Nullable
    public final PickupInterval getPickupInterval() {
        return this.pickupInterval;
    }

    @Nullable
    public final String getStoreName() {
        return this.storeName;
    }

    public int hashCode() {
        String str = this.itemId;
        int iM202hashCodeimpl = (str == null ? 0 : ItemId.m202hashCodeimpl(str)) * 31;
        String str2 = this.displayName;
        int iHashCode = (iM202hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        Picture picture = this.coverPicture;
        int iHashCode2 = (iHashCode + (picture == null ? 0 : picture.hashCode())) * 31;
        Picture picture2 = this.logoPicture;
        int iHashCode3 = (iHashCode2 + (picture2 == null ? 0 : picture2.hashCode())) * 31;
        PickupInterval pickupInterval = this.pickupInterval;
        int iHashCode4 = (iHashCode3 + (pickupInterval == null ? 0 : pickupInterval.hashCode())) * 31;
        String str3 = this.storeName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.itemName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.branch;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.itemId == null ? "EmptyItem" : this.displayName;
        return str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        String str = this.itemId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ItemId.m204writeToParcelimpl(str, dest, flags);
        }
        dest.writeString(this.displayName);
        Picture picture = this.coverPicture;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
        Picture picture2 = this.logoPicture;
        if (picture2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture2.writeToParcel(dest, flags);
        }
        PickupInterval pickupInterval = this.pickupInterval;
        if (pickupInterval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pickupInterval.writeToParcel(dest, flags);
        }
        dest.writeString(this.storeName);
        dest.writeString(this.itemName);
        dest.writeString(this.branch);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FavouriteWidgetItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavouriteWidgetItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavouriteWidgetItem createFromParcel(Parcel parcel) {
            String strM205unboximpl;
            PickupInterval pickupIntervalCreateFromParcel;
            parcel.getClass();
            ItemId itemIdCreateFromParcel = parcel.readInt() == 0 ? null : ItemId.CREATOR.createFromParcel(parcel);
            if (itemIdCreateFromParcel != null) {
                strM205unboximpl = itemIdCreateFromParcel.m205unboximpl();
                pickupIntervalCreateFromParcel = null;
            } else {
                strM205unboximpl = null;
                pickupIntervalCreateFromParcel = null;
            }
            String string = parcel.readString();
            Picture picture = (Picture) (parcel.readInt() == 0 ? pickupIntervalCreateFromParcel : Picture.CREATOR.createFromParcel(parcel));
            Picture picture2 = (Picture) (parcel.readInt() == 0 ? pickupIntervalCreateFromParcel : Picture.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() != 0) {
                pickupIntervalCreateFromParcel = PickupInterval.CREATOR.createFromParcel(parcel);
            }
            return new FavouriteWidgetItem(strM205unboximpl, string, picture, picture2, pickupIntervalCreateFromParcel, parcel.readString(), parcel.readString(), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavouriteWidgetItem[] newArray(int i11) {
            return new FavouriteWidgetItem[i11];
        }
    }

    @g("branch_name")
    public static /* synthetic */ void getBranch$annotations() {
    }

    @g("cover_picture")
    public static /* synthetic */ void getCoverPicture$annotations() {
    }

    @g("display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-RWxzYZM$annotations, reason: not valid java name */
    public static /* synthetic */ void m543getItemIdRWxzYZM$annotations() {
    }

    @g("item_name")
    public static /* synthetic */ void getItemName$annotations() {
    }

    @g("logo_picture")
    public static /* synthetic */ void getLogoPicture$annotations() {
    }

    @g("pickup_interval")
    public static /* synthetic */ void getPickupInterval$annotations() {
    }

    @g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    public /* synthetic */ FavouriteWidgetItem(String str, String str2, Picture picture, Picture picture2, PickupInterval pickupInterval, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, picture, picture2, pickupInterval, str3, str4, str5);
    }

    public /* synthetic */ FavouriteWidgetItem(int i11, String str, String str2, Picture picture, Picture picture2, PickupInterval pickupInterval, String str3, String str4, String str5, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, picture, picture2, pickupInterval, str3, str4, str5, m1Var);
    }

    private FavouriteWidgetItem(String str, String str2, Picture picture, Picture picture2, PickupInterval pickupInterval, String str3, String str4, String str5) {
        this.itemId = str;
        this.displayName = str2;
        this.coverPicture = picture;
        this.logoPicture = picture2;
        this.pickupInterval = pickupInterval;
        this.storeName = str3;
        this.itemName = str4;
        this.branch = str5;
    }

    public /* synthetic */ FavouriteWidgetItem(String str, String str2, Picture picture, Picture picture2, PickupInterval pickupInterval, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, picture, picture2, pickupInterval, str3, str4, (i11 & 128) != 0 ? null : str5, null);
    }
}
