package com.app.tgtg.model.remote.user.response.charity;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b+\u0010\u0018¨\u0006."}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/Conflict;", "", "", "orderId", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "store", "date", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/Conflict;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "component3", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/charity/Conflict;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId", "getOrderId$annotations", "()V", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "getStore", "getDate", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Conflict {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String date;

    @NotNull
    private final String orderId;

    @NotNull
    private final CharityDayScheduleStore store;

    public /* synthetic */ Conflict(int i11, String str, CharityDayScheduleStore charityDayScheduleStore, String str2, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, Conflict$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.orderId = str;
        this.store = charityDayScheduleStore;
        this.date = str2;
    }

    public static /* synthetic */ Conflict copy$default(Conflict conflict, String str, CharityDayScheduleStore charityDayScheduleStore, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = conflict.orderId;
        }
        if ((i11 & 2) != 0) {
            charityDayScheduleStore = conflict.store;
        }
        if ((i11 & 4) != 0) {
            str2 = conflict.date;
        }
        return conflict.copy(str, charityDayScheduleStore, str2);
    }

    public static final /* synthetic */ void write$Self$app(Conflict self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.orderId);
        output.i(serialDesc, 1, CharityDayScheduleStore$$serializer.INSTANCE, self.store);
        output.q(serialDesc, 2, self.date);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CharityDayScheduleStore getStore() {
        return this.store;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final Conflict copy(@NotNull String orderId, @NotNull CharityDayScheduleStore store, @NotNull String date) {
        orderId.getClass();
        store.getClass();
        date.getClass();
        return new Conflict(orderId, store, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Conflict)) {
            return false;
        }
        Conflict conflict = (Conflict) other;
        return Intrinsics.areEqual(this.orderId, conflict.orderId) && Intrinsics.areEqual(this.store, conflict.store) && Intrinsics.areEqual(this.date, conflict.date);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final CharityDayScheduleStore getStore() {
        return this.store;
    }

    public int hashCode() {
        return this.date.hashCode() + ((this.store.hashCode() + (this.orderId.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        CharityDayScheduleStore charityDayScheduleStore = this.store;
        String str2 = this.date;
        StringBuilder sb2 = new StringBuilder("Conflict(orderId=");
        sb2.append(str);
        sb2.append(", store=");
        sb2.append(charityDayScheduleStore);
        sb2.append(", date=");
        return k.p(sb2, str2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/Conflict$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/Conflict;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Conflict$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("order_id")
    public static /* synthetic */ void getOrderId$annotations() {
    }

    public Conflict(@NotNull String str, @NotNull CharityDayScheduleStore charityDayScheduleStore, @NotNull String str2) {
        str.getClass();
        charityDayScheduleStore.getClass();
        str2.getClass();
        this.orderId = str;
        this.store = charityDayScheduleStore;
        this.date = str2;
    }
}
