package com.app.tgtg.model;

import com.app.tgtg.model.remote.DateSerializer;
import i90.g;
import i90.h;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0003\u0010#\u0012\u0004\b$\u0010%R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0004\u0010#\u0012\u0004\b&\u0010%¨\u0006)"}, d2 = {"Lcom/app/tgtg/model/PickupIntervalDateObject;", "", "Ljava/util/Date;", "pickupStart", "pickupEnd", "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Lm90/m1;)V", "component1", "()Ljava/util/Date;", "component2", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/PickupIntervalDateObject;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "copy", "(Ljava/util/Date;Ljava/util/Date;)Lcom/app/tgtg/model/PickupIntervalDateObject;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getPickupStart$annotations", "()V", "getPickupEnd$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PickupIntervalDateObject {

    @Nullable
    private Date pickupEnd;

    @Nullable
    private Date pickupStart;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ PickupIntervalDateObject(int i11, Date date, Date date2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.pickupStart = null;
        } else {
            this.pickupStart = date;
        }
        if ((i11 & 2) == 0) {
            this.pickupEnd = null;
        } else {
            this.pickupEnd = date2;
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Date getPickupStart() {
        return this.pickupStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Date getPickupEnd() {
        return this.pickupEnd;
    }

    public static /* synthetic */ PickupIntervalDateObject copy$default(PickupIntervalDateObject pickupIntervalDateObject, Date date, Date date2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            date = pickupIntervalDateObject.pickupStart;
        }
        if ((i11 & 2) != 0) {
            date2 = pickupIntervalDateObject.pickupEnd;
        }
        return pickupIntervalDateObject.copy(date, date2);
    }

    public static final /* synthetic */ void write$Self$app(PickupIntervalDateObject self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.pickupStart != null) {
            output.r(serialDesc, 0, DateSerializer.INSTANCE, self.pickupStart);
        }
        if (!output.C(serialDesc) && self.pickupEnd == null) {
            return;
        }
        output.r(serialDesc, 1, DateSerializer.INSTANCE, self.pickupEnd);
    }

    @NotNull
    public final PickupIntervalDateObject copy(@Nullable Date pickupStart, @Nullable Date pickupEnd) {
        return new PickupIntervalDateObject(pickupStart, pickupEnd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupIntervalDateObject)) {
            return false;
        }
        PickupIntervalDateObject pickupIntervalDateObject = (PickupIntervalDateObject) other;
        return Intrinsics.areEqual(this.pickupStart, pickupIntervalDateObject.pickupStart) && Intrinsics.areEqual(this.pickupEnd, pickupIntervalDateObject.pickupEnd);
    }

    public int hashCode() {
        Date date = this.pickupStart;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.pickupEnd;
        return iHashCode + (date2 != null ? date2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PickupIntervalDateObject(pickupStart=" + this.pickupStart + ", pickupEnd=" + this.pickupEnd + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/PickupIntervalDateObject$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/PickupIntervalDateObject;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PickupIntervalDateObject$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @h(with = DateSerializer.class)
    @g("end")
    private static /* synthetic */ void getPickupEnd$annotations() {
    }

    @h(with = DateSerializer.class)
    @g("start")
    private static /* synthetic */ void getPickupStart$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickupIntervalDateObject() {
        this((Date) null, (Date) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public PickupIntervalDateObject(@Nullable Date date, @Nullable Date date2) {
        this.pickupStart = date;
        this.pickupEnd = date2;
    }

    public /* synthetic */ PickupIntervalDateObject(Date date, Date date2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : date, (i11 & 2) != 0 ? null : date2);
    }
}
