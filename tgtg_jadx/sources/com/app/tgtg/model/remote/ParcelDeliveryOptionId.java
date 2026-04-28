package com.app.tgtg.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\u0003H\u0096\u0080\u0004¢\u0006\u0004\b\t\u0010\u0005J\r\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u000bHÖ\u0081\u0004¢\u0006\u0004\b\u0015\u0010\rJ\u001d\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u001f"}, d2 = {"Lcom/app/tgtg/model/remote/ParcelDeliveryOptionId;", "Landroid/os/Parcelable;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toString", "toString-impl", "describeContents", "", "describeContents-impl", "(Ljava/lang/String;)I", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "$serializer", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ParcelDeliveryOptionId implements Parcelable {

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ParcelDeliveryOptionId> CREATOR = new Creator();

    private /* synthetic */ ParcelDeliveryOptionId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ParcelDeliveryOptionId m221boximpl(String str) {
        return new ParcelDeliveryOptionId(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m222constructorimpl(@NotNull String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: describeContents-impl, reason: not valid java name */
    public static final int m223describeContentsimpl(String str) {
        return 0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m224equalsimpl(String str, Object obj) {
        return (obj instanceof ParcelDeliveryOptionId) && Intrinsics.areEqual(str, ((ParcelDeliveryOptionId) obj).m229unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m225equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m226hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m228writeToParcelimpl(String str, @NotNull Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m223describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m224equalsimpl(this.value, obj);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m226hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m227toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m229unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        parcel.getClass();
        m228writeToParcelimpl(this.value, parcel, i11);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/ParcelDeliveryOptionId$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/ParcelDeliveryOptionId;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ParcelDeliveryOptionId$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ParcelDeliveryOptionId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParcelDeliveryOptionId createFromParcel(Parcel parcel) {
            return ParcelDeliveryOptionId.m221boximpl(m232createFromParcelOXj8ugk(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-OXj8ugk, reason: not valid java name */
        public final String m232createFromParcelOXj8ugk(Parcel parcel) {
            parcel.getClass();
            return ParcelDeliveryOptionId.m222constructorimpl(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParcelDeliveryOptionId[] newArray(int i11) {
            return new ParcelDeliveryOptionId[i11];
        }
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m227toStringimpl(String str) {
        return str;
    }
}
