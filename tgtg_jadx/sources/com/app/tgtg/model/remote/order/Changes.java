package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J2\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010 \"\u0004\b0\u00101R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00104\u0012\u0004\b8\u00103\u001a\u0004\b5\u0010\"\"\u0004\b6\u00107R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00109\u0012\u0004\b=\u00103\u001a\u0004\b:\u0010$\"\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/app/tgtg/model/remote/order/Changes;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/order/UpdateNotificationType;", "type", "", "timestamp", "Lcom/app/tgtg/model/remote/order/OldValue;", "oldValue", "<init>", "(Lcom/app/tgtg/model/remote/order/UpdateNotificationType;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OldValue;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/UpdateNotificationType;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OldValue;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/Changes;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/order/UpdateNotificationType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/app/tgtg/model/remote/order/OldValue;", "copy", "(Lcom/app/tgtg/model/remote/order/UpdateNotificationType;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OldValue;)Lcom/app/tgtg/model/remote/order/Changes;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/order/UpdateNotificationType;", "getType", "setType", "(Lcom/app/tgtg/model/remote/order/UpdateNotificationType;)V", "getType$annotations", "()V", "Ljava/lang/String;", "getTimestamp", "setTimestamp", "(Ljava/lang/String;)V", "getTimestamp$annotations", "Lcom/app/tgtg/model/remote/order/OldValue;", "getOldValue", "setOldValue", "(Lcom/app/tgtg/model/remote/order/OldValue;)V", "getOldValue$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Changes implements Parcelable {

    @Nullable
    private OldValue oldValue;

    @Nullable
    private String timestamp;

    @NotNull
    private UpdateNotificationType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Changes> CREATOR = new Creator();

    public /* synthetic */ Changes(int i11, UpdateNotificationType updateNotificationType, String str, OldValue oldValue, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, Changes$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = updateNotificationType;
        if ((i11 & 2) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str;
        }
        if ((i11 & 4) == 0) {
            this.oldValue = null;
        } else {
            this.oldValue = oldValue;
        }
    }

    public static /* synthetic */ Changes copy$default(Changes changes, UpdateNotificationType updateNotificationType, String str, OldValue oldValue, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            updateNotificationType = changes.type;
        }
        if ((i11 & 2) != 0) {
            str = changes.timestamp;
        }
        if ((i11 & 4) != 0) {
            oldValue = changes.oldValue;
        }
        return changes.copy(updateNotificationType, str, oldValue);
    }

    public static final /* synthetic */ void write$Self$app(Changes self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, UpdateNotificationTypeSerializer.INSTANCE, self.type);
        if (output.C(serialDesc) || self.timestamp != null) {
            output.r(serialDesc, 1, r1.f29848a, self.timestamp);
        }
        if (!output.C(serialDesc) && self.oldValue == null) {
            return;
        }
        output.r(serialDesc, 2, OldValue$$serializer.INSTANCE, self.oldValue);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UpdateNotificationType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OldValue getOldValue() {
        return this.oldValue;
    }

    @NotNull
    public final Changes copy(@NotNull UpdateNotificationType type, @Nullable String timestamp, @Nullable OldValue oldValue) {
        type.getClass();
        return new Changes(type, timestamp, oldValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Changes)) {
            return false;
        }
        Changes changes = (Changes) other;
        return this.type == changes.type && Intrinsics.areEqual(this.timestamp, changes.timestamp) && Intrinsics.areEqual(this.oldValue, changes.oldValue);
    }

    @Nullable
    public final OldValue getOldValue() {
        return this.oldValue;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final UpdateNotificationType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.timestamp;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OldValue oldValue = this.oldValue;
        return iHashCode2 + (oldValue != null ? oldValue.hashCode() : 0);
    }

    public final void setOldValue(@Nullable OldValue oldValue) {
        this.oldValue = oldValue;
    }

    public final void setTimestamp(@Nullable String str) {
        this.timestamp = str;
    }

    public final void setType(@NotNull UpdateNotificationType updateNotificationType) {
        updateNotificationType.getClass();
        this.type = updateNotificationType;
    }

    @NotNull
    public String toString() {
        return "Changes(type=" + this.type + ", timestamp=" + this.timestamp + ", oldValue=" + this.oldValue + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.type.name());
        dest.writeString(this.timestamp);
        OldValue oldValue = this.oldValue;
        if (oldValue == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            oldValue.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/Changes$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/Changes;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Changes$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Changes> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Changes createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Changes(UpdateNotificationType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : OldValue.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Changes[] newArray(int i11) {
            return new Changes[i11];
        }
    }

    @g("old_value")
    public static /* synthetic */ void getOldValue$annotations() {
    }

    @g("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public Changes(@NotNull UpdateNotificationType updateNotificationType, @Nullable String str, @Nullable OldValue oldValue) {
        updateNotificationType.getClass();
        this.type = updateNotificationType;
        this.timestamp = str;
        this.oldValue = oldValue;
    }

    public /* synthetic */ Changes(UpdateNotificationType updateNotificationType, String str, OldValue oldValue, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(updateNotificationType, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : oldValue);
    }
}
