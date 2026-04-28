package com.app.tgtg.model.local;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0006J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0015R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/app/tgtg/model/local/CollectionTimeModel;", "Landroid/os/Parcelable;", "times", "", "", "is24h", "", "<init>", "(Ljava/util/List;Z)V", "setTimes", "", "setIs24h", "getRawTimes", "getRawStartTime", "getRawEndTime", "isActive", "toString", "", "format", "rawTime", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CollectionTimeModel implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CollectionTimeModel> CREATOR = new Creator();
    private boolean is24h;

    @NotNull
    private List<Float> times;

    public CollectionTimeModel(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? true : z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String format(float r6) {
        /*
            r5 = this;
            int r0 = (int) r6
            r1 = 0
            r2 = 24
            r3 = 12
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1c
            boolean r4 = r5.is24h
            if (r0 == r2) goto L14
            if (r4 == 0) goto L11
            goto L1c
        L11:
            int r4 = r0 % 12
            goto L25
        L14:
            if (r4 == 0) goto L19
            r4 = 23
            goto L25
        L19:
            r4 = 11
            goto L25
        L1c:
            r4 = r0
            goto L25
        L1e:
            boolean r4 = r5.is24h
            if (r4 == 0) goto L24
            r4 = r1
            goto L25
        L24:
            r4 = r3
        L25:
            if (r0 != r2) goto L2a
            r1 = 59
            goto L35
        L2a:
            r2 = 1
            float r2 = (float) r2
            float r6 = r6 % r2
            r2 = 0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L33
            goto L35
        L33:
            r1 = 30
        L35:
            if (r0 < r3) goto L3a
            java.lang.String r6 = "PM"
            goto L3c
        L3a:
            java.lang.String r6 = "AM"
        L3c:
            boolean r0 = r5.is24h
            if (r0 == 0) goto L43
            java.lang.String r0 = "%02d:%02d"
            goto L45
        L43:
            java.lang.String r0 = "%02d:%02d %s"
        L45:
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r1, r6}
            r1 = 3
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            java.lang.String r6 = java.lang.String.format(r2, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.local.CollectionTimeModel.format(float):java.lang.String");
    }

    public static /* synthetic */ void setTimes$default(CollectionTimeModel collectionTimeModel, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        collectionTimeModel.setTimes(list, z11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float getRawEndTime() {
        return this.times.get(1).floatValue();
    }

    public final float getRawStartTime() {
        return this.times.get(0).floatValue();
    }

    @NotNull
    public final List<Float> getRawTimes() {
        return this.times;
    }

    public final boolean isActive() {
        return (getRawStartTime() == 0.0f && getRawEndTime() == 24.0f) ? false : true;
    }

    public final void setIs24h(boolean is24h) {
        this.is24h = is24h;
    }

    public final void setTimes(@NotNull List<Float> times, boolean is24h) {
        times.getClass();
        this.times = times;
        this.is24h = is24h;
    }

    @NotNull
    public String toString() {
        return k.m(format(getRawStartTime()), " - ", format(getRawEndTime()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.times, dest);
        while (itR.hasNext()) {
            dest.writeFloat(((Number) itR.next()).floatValue());
        }
        dest.writeInt(this.is24h ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CollectionTimeModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectionTimeModel createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            return new CollectionTimeModel(arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectionTimeModel[] newArray(int i11) {
            return new CollectionTimeModel[i11];
        }
    }

    public CollectionTimeModel(@NotNull List<Float> list, boolean z11) {
        list.getClass();
        this.times = list;
        this.is24h = z11;
    }

    public CollectionTimeModel() {
        this(null, false, 3, null);
    }
}
