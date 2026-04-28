package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import com.app.tgtg.model.remote.manufacturer.request.ActionType;
import com.app.tgtg.model.remote.manufacturer.request.ActionTypeSerializer;
import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"JH\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\b:\u00105\u001a\u0004\b9\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b=\u00105\u001a\u0004\b<\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b?\u00105\u001a\u0004\b>\u0010\"¨\u0006B"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CategoryNavigationCard;", "Landroid/os/Parcelable;", "", "id", MessageBundle.TITLE_ENTRY, "Lcom/app/tgtg/model/remote/item/Picture;", "picture", "Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "actionType", "actionData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/CategoryNavigationCard;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/app/tgtg/model/remote/item/Picture;", "component4", "()Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/response/CategoryNavigationCard;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getPicture", "getPicture$annotations", "Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "getActionType", "getActionType$annotations", "getActionData", "getActionData$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CategoryNavigationCard implements Parcelable {

    @Nullable
    private final String actionData;

    @NotNull
    private final ActionType actionType;

    @NotNull
    private final String id;

    @Nullable
    private final Picture picture;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CategoryNavigationCard> CREATOR = new Creator();

    public /* synthetic */ CategoryNavigationCard(int i11, String str, String str2, Picture picture, ActionType actionType, String str3, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, CategoryNavigationCard$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.title = str2;
        this.picture = picture;
        this.actionType = actionType;
        this.actionData = str3;
    }

    public static /* synthetic */ CategoryNavigationCard copy$default(CategoryNavigationCard categoryNavigationCard, String str, String str2, Picture picture, ActionType actionType, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = categoryNavigationCard.id;
        }
        if ((i11 & 2) != 0) {
            str2 = categoryNavigationCard.title;
        }
        if ((i11 & 4) != 0) {
            picture = categoryNavigationCard.picture;
        }
        if ((i11 & 8) != 0) {
            actionType = categoryNavigationCard.actionType;
        }
        if ((i11 & 16) != 0) {
            str3 = categoryNavigationCard.actionData;
        }
        String str4 = str3;
        Picture picture2 = picture;
        return categoryNavigationCard.copy(str, str2, picture2, actionType, str4);
    }

    public static final /* synthetic */ void write$Self$app(CategoryNavigationCard self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.title);
        output.r(serialDesc, 2, Picture$$serializer.INSTANCE, self.picture);
        output.i(serialDesc, 3, ActionTypeSerializer.INSTANCE, self.actionType);
        output.r(serialDesc, 4, r1Var, self.actionData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Picture getPicture() {
        return this.picture;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActionData() {
        return this.actionData;
    }

    @NotNull
    public final CategoryNavigationCard copy(@NotNull String id2, @Nullable String title, @Nullable Picture picture, @NotNull ActionType actionType, @Nullable String actionData) {
        id2.getClass();
        actionType.getClass();
        return new CategoryNavigationCard(id2, title, picture, actionType, actionData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryNavigationCard)) {
            return false;
        }
        CategoryNavigationCard categoryNavigationCard = (CategoryNavigationCard) other;
        return Intrinsics.areEqual(this.id, categoryNavigationCard.id) && Intrinsics.areEqual(this.title, categoryNavigationCard.title) && Intrinsics.areEqual(this.picture, categoryNavigationCard.picture) && this.actionType == categoryNavigationCard.actionType && Intrinsics.areEqual(this.actionData, categoryNavigationCard.actionData);
    }

    @Nullable
    public final String getActionData() {
        return this.actionData;
    }

    @NotNull
    public final ActionType getActionType() {
        return this.actionType;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Picture getPicture() {
        return this.picture;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Picture picture = this.picture;
        int iHashCode3 = (this.actionType.hashCode() + ((iHashCode2 + (picture == null ? 0 : picture.hashCode())) * 31)) * 31;
        String str2 = this.actionData;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        Picture picture = this.picture;
        ActionType actionType = this.actionType;
        String str3 = this.actionData;
        StringBuilder sbT = f.t("CategoryNavigationCard(id=", str, ", title=", str2, ", picture=");
        sbT.append(picture);
        sbT.append(", actionType=");
        sbT.append(actionType);
        sbT.append(", actionData=");
        return k.p(sbT, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.title);
        Picture picture = this.picture;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
        dest.writeString(this.actionType.name());
        dest.writeString(this.actionData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CategoryNavigationCard$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/CategoryNavigationCard;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CategoryNavigationCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryNavigationCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryNavigationCard createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CategoryNavigationCard(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel), ActionType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryNavigationCard[] newArray(int i11) {
            return new CategoryNavigationCard[i11];
        }
    }

    @g("action_data")
    public static /* synthetic */ void getActionData$annotations() {
    }

    @g("action_type")
    public static /* synthetic */ void getActionType$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g(InAppMessageBase.ICON)
    public static /* synthetic */ void getPicture$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public CategoryNavigationCard(@NotNull String str, @Nullable String str2, @Nullable Picture picture, @NotNull ActionType actionType, @Nullable String str3) {
        str.getClass();
        actionType.getClass();
        this.id = str;
        this.title = str2;
        this.picture = picture;
        this.actionType = actionType;
        this.actionData = str3;
    }
}
