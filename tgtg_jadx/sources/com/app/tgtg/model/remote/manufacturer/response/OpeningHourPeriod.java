package com.app.tgtg.model.remote.manufacturer.response;

import eu.a;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R*\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/OpeningHourPeriod;", "", "", "periodName", "", "openingHours", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/OpeningHourPeriod;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/remote/manufacturer/response/OpeningHourPeriod;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriodName", "getPeriodName$annotations", "()V", "Ljava/util/List;", "getOpeningHours", "getOpeningHours$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OpeningHourPeriod {

    @Nullable
    private final List<String> openingHours;

    @Nullable
    private final String periodName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(29))};

    public /* synthetic */ OpeningHourPeriod(int i11, String str, List list, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, OpeningHourPeriod$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.periodName = str;
        this.openingHours = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(f0.B(r1.f29848a), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpeningHourPeriod copy$default(OpeningHourPeriod openingHourPeriod, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = openingHourPeriod.periodName;
        }
        if ((i11 & 2) != 0) {
            list = openingHourPeriod.openingHours;
        }
        return openingHourPeriod.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$app(OpeningHourPeriod self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, r1.f29848a, self.periodName);
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.openingHours);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPeriodName() {
        return this.periodName;
    }

    @Nullable
    public final List<String> component2() {
        return this.openingHours;
    }

    @NotNull
    public final OpeningHourPeriod copy(@Nullable String periodName, @Nullable List<String> openingHours) {
        return new OpeningHourPeriod(periodName, openingHours);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpeningHourPeriod)) {
            return false;
        }
        OpeningHourPeriod openingHourPeriod = (OpeningHourPeriod) other;
        return Intrinsics.areEqual(this.periodName, openingHourPeriod.periodName) && Intrinsics.areEqual(this.openingHours, openingHourPeriod.openingHours);
    }

    @Nullable
    public final List<String> getOpeningHours() {
        return this.openingHours;
    }

    @Nullable
    public final String getPeriodName() {
        return this.periodName;
    }

    public int hashCode() {
        String str = this.periodName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.openingHours;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpeningHourPeriod(periodName=" + this.periodName + ", openingHours=" + this.openingHours + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/OpeningHourPeriod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/OpeningHourPeriod;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OpeningHourPeriod$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("opening_hours")
    public static /* synthetic */ void getOpeningHours$annotations() {
    }

    @g("period_name")
    public static /* synthetic */ void getPeriodName$annotations() {
    }

    public OpeningHourPeriod(@Nullable String str, @Nullable List<String> list) {
        this.periodName = str;
        this.openingHours = list;
    }
}
