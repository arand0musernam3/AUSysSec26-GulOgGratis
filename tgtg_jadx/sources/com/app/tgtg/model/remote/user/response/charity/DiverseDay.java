package com.app.tgtg.model.remote.user.response.charity;

import i90.g;
import i90.h;
import java.time.LocalDate;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b*\u0010(\u001a\u0004\b\u0005\u0010\u001c¨\u0006-"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/DiverseDay;", "", "", "date", "", "isAvailable", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/DiverseDay;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/user/response/charity/LocalDivergenceDay;", "toLocalDivergenceDay", "()Lcom/app/tgtg/model/remote/user/response/charity/LocalDivergenceDay;", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/user/response/charity/DiverseDay;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getDate$annotations", "()V", "Z", "isAvailable$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DiverseDay {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String date;
    private final boolean isAvailable;

    public /* synthetic */ DiverseDay(int i11, String str, boolean z11, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, DiverseDay$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.date = str;
        this.isAvailable = z11;
    }

    public static /* synthetic */ DiverseDay copy$default(DiverseDay diverseDay, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = diverseDay.date;
        }
        if ((i11 & 2) != 0) {
            z11 = diverseDay.isAvailable;
        }
        return diverseDay.copy(str, z11);
    }

    public static final /* synthetic */ void write$Self$app(DiverseDay self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.date);
        output.p(serialDesc, 1, self.isAvailable);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public final DiverseDay copy(@NotNull String date, boolean isAvailable) {
        date.getClass();
        return new DiverseDay(date, isAvailable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiverseDay)) {
            return false;
        }
        DiverseDay diverseDay = (DiverseDay) other;
        return Intrinsics.areEqual(this.date, diverseDay.date) && this.isAvailable == diverseDay.isAvailable;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAvailable) + (this.date.hashCode() * 31);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public final LocalDivergenceDay toLocalDivergenceDay() {
        LocalDate localDate = LocalDate.parse(this.date);
        localDate.getClass();
        return new LocalDivergenceDay(localDate, this.isAvailable);
    }

    @NotNull
    public String toString() {
        return "DiverseDay(date=" + this.date + ", isAvailable=" + this.isAvailable + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/DiverseDay$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/DiverseDay;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiverseDay$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("date")
    public static /* synthetic */ void getDate$annotations() {
    }

    @g("is_available")
    public static /* synthetic */ void isAvailable$annotations() {
    }

    public DiverseDay(@NotNull String str, boolean z11) {
        str.getClass();
        this.date = str;
        this.isAvailable = z11;
    }
}
