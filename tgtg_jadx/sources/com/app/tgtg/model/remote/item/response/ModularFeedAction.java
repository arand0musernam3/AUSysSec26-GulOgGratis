package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.manufacturer.request.ActionType;
import com.app.tgtg.model.remote.manufacturer.request.ActionTypeSerializer;
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
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J2\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010!R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010!¨\u00067"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "actionType", "", "actionText", "actionData", "<init>", "(Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/manufacturer/request/ActionType;", "getActionType", "getActionType$annotations", "()V", "Ljava/lang/String;", "getActionText", "getActionText$annotations", "getActionData", "getActionData$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ModularFeedAction implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String actionData;

    @Nullable
    private final String actionText;

    @Nullable
    private final ActionType actionType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ModularFeedAction> CREATOR = new Creator();

    public /* synthetic */ ModularFeedAction(int i11, ActionType actionType, String str, String str2, m1 m1Var) {
        this.actionType = (i11 & 1) == 0 ? ActionType.QUERY : actionType;
        if ((i11 & 2) == 0) {
            this.actionText = null;
        } else {
            this.actionText = str;
        }
        if ((i11 & 4) == 0) {
            this.actionData = "";
        } else {
            this.actionData = str2;
        }
    }

    public static /* synthetic */ ModularFeedAction copy$default(ModularFeedAction modularFeedAction, ActionType actionType, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            actionType = modularFeedAction.actionType;
        }
        if ((i11 & 2) != 0) {
            str = modularFeedAction.actionText;
        }
        if ((i11 & 4) != 0) {
            str2 = modularFeedAction.actionData;
        }
        return modularFeedAction.copy(actionType, str, str2);
    }

    public static final /* synthetic */ void write$Self$app(ModularFeedAction self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.actionType != ActionType.QUERY) {
            output.r(serialDesc, 0, ActionTypeSerializer.INSTANCE, self.actionType);
        }
        if (output.C(serialDesc) || self.actionText != null) {
            output.r(serialDesc, 1, r1.f29848a, self.actionText);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.actionData, "")) {
            return;
        }
        output.q(serialDesc, 2, self.actionData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActionText() {
        return this.actionText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActionData() {
        return this.actionData;
    }

    @NotNull
    public final ModularFeedAction copy(@Nullable ActionType actionType, @Nullable String actionText, @NotNull String actionData) {
        actionData.getClass();
        return new ModularFeedAction(actionType, actionText, actionData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModularFeedAction)) {
            return false;
        }
        ModularFeedAction modularFeedAction = (ModularFeedAction) other;
        return this.actionType == modularFeedAction.actionType && Intrinsics.areEqual(this.actionText, modularFeedAction.actionText) && Intrinsics.areEqual(this.actionData, modularFeedAction.actionData);
    }

    @NotNull
    public final String getActionData() {
        return this.actionData;
    }

    @Nullable
    public final String getActionText() {
        return this.actionText;
    }

    @Nullable
    public final ActionType getActionType() {
        return this.actionType;
    }

    public int hashCode() {
        ActionType actionType = this.actionType;
        int iHashCode = (actionType == null ? 0 : actionType.hashCode()) * 31;
        String str = this.actionText;
        return this.actionData.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        ActionType actionType = this.actionType;
        String str = this.actionText;
        String str2 = this.actionData;
        StringBuilder sb2 = new StringBuilder("ModularFeedAction(actionType=");
        sb2.append(actionType);
        sb2.append(", actionText=");
        sb2.append(str);
        sb2.append(", actionData=");
        return k.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        ActionType actionType = this.actionType;
        if (actionType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(actionType.name());
        }
        dest.writeString(this.actionText);
        dest.writeString(this.actionData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ModularFeedAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ModularFeedAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ModularFeedAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModularFeedAction createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ModularFeedAction(parcel.readInt() == 0 ? null : ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModularFeedAction[] newArray(int i11) {
            return new ModularFeedAction[i11];
        }
    }

    @g(Bayeux.KEY_DATA)
    public static /* synthetic */ void getActionData$annotations() {
    }

    @g(TextBundle.TEXT_ENTRY)
    public static /* synthetic */ void getActionText$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getActionType$annotations() {
    }

    public ModularFeedAction() {
        this((ActionType) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public ModularFeedAction(@Nullable ActionType actionType, @Nullable String str, @NotNull String str2) {
        str2.getClass();
        this.actionType = actionType;
        this.actionText = str;
        this.actionData = str2;
    }

    public /* synthetic */ ModularFeedAction(ActionType actionType, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ActionType.QUERY : actionType, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? "" : str2);
    }
}
