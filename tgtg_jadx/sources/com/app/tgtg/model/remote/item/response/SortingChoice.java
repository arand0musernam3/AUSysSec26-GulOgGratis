package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.manufacturer.request.ActionType;
import com.app.tgtg.model.remote.manufacturer.request.ActionTypeSerializer;
import e0.f;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(JH\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u001a\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010(¨\u0006A"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/SortingChoice;", "Landroid/os/Parcelable;", "", "id", MessageBundle.TITLE_ENTRY, "Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "actionType", "actionData", "", "alreadySelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/SortingChoice;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/item/response/SortingChoice;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "getActionType", "getActionType$annotations", "getActionData", "getActionData$annotations", "Ljava/lang/Boolean;", "getAlreadySelected", "getAlreadySelected$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SortingChoice implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String actionData;

    @NotNull
    private final ActionType actionType;

    @Nullable
    private final Boolean alreadySelected;

    @NotNull
    private final String id;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<SortingChoice> CREATOR = new Creator();

    public /* synthetic */ SortingChoice(int i11, String str, String str2, ActionType actionType, String str3, Boolean bool, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, SortingChoice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.title = str2;
        this.actionType = actionType;
        this.actionData = str3;
        this.alreadySelected = bool;
    }

    public static /* synthetic */ SortingChoice copy$default(SortingChoice sortingChoice, String str, String str2, ActionType actionType, String str3, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sortingChoice.id;
        }
        if ((i11 & 2) != 0) {
            str2 = sortingChoice.title;
        }
        if ((i11 & 4) != 0) {
            actionType = sortingChoice.actionType;
        }
        if ((i11 & 8) != 0) {
            str3 = sortingChoice.actionData;
        }
        if ((i11 & 16) != 0) {
            bool = sortingChoice.alreadySelected;
        }
        Boolean bool2 = bool;
        ActionType actionType2 = actionType;
        return sortingChoice.copy(str, str2, actionType2, str3, bool2);
    }

    public static final /* synthetic */ void write$Self$app(SortingChoice self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.title);
        output.i(serialDesc, 2, ActionTypeSerializer.INSTANCE, self.actionType);
        output.r(serialDesc, 3, r1Var, self.actionData);
        output.r(serialDesc, 4, g.f29797a, self.alreadySelected);
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

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActionData() {
        return this.actionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getAlreadySelected() {
        return this.alreadySelected;
    }

    @NotNull
    public final SortingChoice copy(@NotNull String id2, @Nullable String title, @NotNull ActionType actionType, @Nullable String actionData, @Nullable Boolean alreadySelected) {
        id2.getClass();
        actionType.getClass();
        return new SortingChoice(id2, title, actionType, actionData, alreadySelected);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortingChoice)) {
            return false;
        }
        SortingChoice sortingChoice = (SortingChoice) other;
        return Intrinsics.areEqual(this.id, sortingChoice.id) && Intrinsics.areEqual(this.title, sortingChoice.title) && this.actionType == sortingChoice.actionType && Intrinsics.areEqual(this.actionData, sortingChoice.actionData) && Intrinsics.areEqual(this.alreadySelected, sortingChoice.alreadySelected);
    }

    @Nullable
    public final String getActionData() {
        return this.actionData;
    }

    @NotNull
    public final ActionType getActionType() {
        return this.actionType;
    }

    @Nullable
    public final Boolean getAlreadySelected() {
        return this.alreadySelected;
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
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (this.actionType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.actionData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.alreadySelected;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        ActionType actionType = this.actionType;
        String str3 = this.actionData;
        Boolean bool = this.alreadySelected;
        StringBuilder sbT = f.t("SortingChoice(id=", str, ", title=", str2, ", actionType=");
        sbT.append(actionType);
        sbT.append(", actionData=");
        sbT.append(str3);
        sbT.append(", alreadySelected=");
        sbT.append(bool);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.actionType.name());
        dest.writeString(this.actionData);
        Boolean bool = this.alreadySelected;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/SortingChoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/SortingChoice;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SortingChoice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SortingChoice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SortingChoice createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ActionType actionTypeValueOf = ActionType.valueOf(parcel.readString());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SortingChoice(string, string2, actionTypeValueOf, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SortingChoice[] newArray(int i11) {
            return new SortingChoice[i11];
        }
    }

    @i90.g("action_data")
    public static /* synthetic */ void getActionData$annotations() {
    }

    @i90.g("action_type")
    public static /* synthetic */ void getActionType$annotations() {
    }

    @i90.g("already_selected")
    public static /* synthetic */ void getAlreadySelected$annotations() {
    }

    @i90.g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @i90.g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public SortingChoice(@NotNull String str, @Nullable String str2, @NotNull ActionType actionType, @Nullable String str3, @Nullable Boolean bool) {
        str.getClass();
        actionType.getClass();
        this.id = str;
        this.title = str2;
        this.actionType = actionType;
        this.actionData = str3;
        this.alreadySelected = bool;
    }
}
