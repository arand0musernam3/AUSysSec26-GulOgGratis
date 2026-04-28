package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
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
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(JV\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b9\u00105\u001a\u0004\b8\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010\"R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b=\u00105\u001a\u0004\b<\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010(¨\u0006C"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CategoryCard;", "Landroid/os/Parcelable;", "", MessageBundle.TITLE_ENTRY, "body", "action", "actionData", "id", "Lcom/app/tgtg/model/remote/item/Picture;", "categoryImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/CategoryCard;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/app/tgtg/model/remote/item/Picture;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;)Lcom/app/tgtg/model/remote/item/response/CategoryCard;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getBody", "getBody$annotations", "getAction", "getAction$annotations", "getActionData", "getActionData$annotations", "getId", "getId$annotations", "Lcom/app/tgtg/model/remote/item/Picture;", "getCategoryImage", "getCategoryImage$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CategoryCard implements Parcelable {

    @Nullable
    private final String action;

    @Nullable
    private final String actionData;

    @Nullable
    private final String body;

    @Nullable
    private final Picture categoryImage;

    @NotNull
    private final String id;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CategoryCard> CREATOR = new Creator();

    public /* synthetic */ CategoryCard(int i11, String str, String str2, String str3, String str4, String str5, Picture picture, m1 m1Var) {
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, CategoryCard$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.body = str2;
        this.action = str3;
        this.actionData = str4;
        this.id = str5;
        this.categoryImage = picture;
    }

    public static /* synthetic */ CategoryCard copy$default(CategoryCard categoryCard, String str, String str2, String str3, String str4, String str5, Picture picture, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = categoryCard.title;
        }
        if ((i11 & 2) != 0) {
            str2 = categoryCard.body;
        }
        if ((i11 & 4) != 0) {
            str3 = categoryCard.action;
        }
        if ((i11 & 8) != 0) {
            str4 = categoryCard.actionData;
        }
        if ((i11 & 16) != 0) {
            str5 = categoryCard.id;
        }
        if ((i11 & 32) != 0) {
            picture = categoryCard.categoryImage;
        }
        String str6 = str5;
        Picture picture2 = picture;
        return categoryCard.copy(str, str2, str3, str4, str6, picture2);
    }

    public static final /* synthetic */ void write$Self$app(CategoryCard self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.title);
        output.r(serialDesc, 1, r1Var, self.body);
        output.r(serialDesc, 2, r1Var, self.action);
        output.r(serialDesc, 3, r1Var, self.actionData);
        output.q(serialDesc, 4, self.id);
        output.r(serialDesc, 5, Picture$$serializer.INSTANCE, self.categoryImage);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActionData() {
        return this.actionData;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Picture getCategoryImage() {
        return this.categoryImage;
    }

    @NotNull
    public final CategoryCard copy(@Nullable String title, @Nullable String body, @Nullable String action, @Nullable String actionData, @NotNull String id2, @Nullable Picture categoryImage) {
        id2.getClass();
        return new CategoryCard(title, body, action, actionData, id2, categoryImage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryCard)) {
            return false;
        }
        CategoryCard categoryCard = (CategoryCard) other;
        return Intrinsics.areEqual(this.title, categoryCard.title) && Intrinsics.areEqual(this.body, categoryCard.body) && Intrinsics.areEqual(this.action, categoryCard.action) && Intrinsics.areEqual(this.actionData, categoryCard.actionData) && Intrinsics.areEqual(this.id, categoryCard.id) && Intrinsics.areEqual(this.categoryImage, categoryCard.categoryImage);
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getActionData() {
        return this.actionData;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final Picture getCategoryImage() {
        return this.categoryImage;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.action;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionData;
        int iB = l1.b((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.id);
        Picture picture = this.categoryImage;
        return iB + (picture != null ? picture.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.body;
        String str3 = this.action;
        String str4 = this.actionData;
        String str5 = this.id;
        Picture picture = this.categoryImage;
        StringBuilder sbT = f.t("CategoryCard(title=", str, ", body=", str2, ", action=");
        s.A(sbT, str3, ", actionData=", str4, ", id=");
        sbT.append(str5);
        sbT.append(", categoryImage=");
        sbT.append(picture);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.action);
        dest.writeString(this.actionData);
        dest.writeString(this.id);
        Picture picture = this.categoryImage;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CategoryCard$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/CategoryCard;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CategoryCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryCard createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CategoryCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryCard[] newArray(int i11) {
            return new CategoryCard[i11];
        }
    }

    @g("action")
    public static /* synthetic */ void getAction$annotations() {
    }

    @g("action_data")
    public static /* synthetic */ void getActionData$annotations() {
    }

    @g("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @g("image")
    public static /* synthetic */ void getCategoryImage$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public CategoryCard(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable Picture picture) {
        str5.getClass();
        this.title = str;
        this.body = str2;
        this.action = str3;
        this.actionData = str4;
        this.id = str5;
        this.categoryImage = picture;
    }
}
