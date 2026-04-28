package com.app.tgtg.model.remote.user.response.charity;

import i90.g;
import i90.h;
import java.time.DayOfWeek;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import wt.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J0\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityGeneralSchedule;", "", "", "Ljava/time/DayOfWeek;", "usualSchedule", "Lcom/app/tgtg/model/remote/user/response/charity/DiverseDay;", "divergenceDays", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityGeneralSchedule;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/app/tgtg/model/remote/user/response/charity/CharityGeneralSchedule;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getUsualSchedule", "getUsualSchedule$annotations", "()V", "getDivergenceDays", "getDivergenceDays$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CharityGeneralSchedule {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<DiverseDay> divergenceDays;

    @NotNull
    private final List<DayOfWeek> usualSchedule;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(14)), l.a(mVar, new a(15))};
    }

    public CharityGeneralSchedule(int i11, List list, List list2, m1 m1Var) {
        this.usualSchedule = (i11 & 1) == 0 ? n0.f26529a : list;
        if ((i11 & 2) == 0) {
            this.divergenceDays = n0.f26529a;
        } else {
            this.divergenceDays = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        dayOfWeekArrValues.getClass();
        return new d(new i90.a("java.time.DayOfWeek", (Enum[]) dayOfWeekArrValues), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(DiverseDay$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharityGeneralSchedule copy$default(CharityGeneralSchedule charityGeneralSchedule, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = charityGeneralSchedule.usualSchedule;
        }
        if ((i11 & 2) != 0) {
            list2 = charityGeneralSchedule.divergenceDays;
        }
        return charityGeneralSchedule.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$app(CharityGeneralSchedule self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.usualSchedule);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.divergenceDays);
    }

    @NotNull
    public final List<DayOfWeek> component1() {
        return this.usualSchedule;
    }

    @NotNull
    public final List<DiverseDay> component2() {
        return this.divergenceDays;
    }

    @NotNull
    public final CharityGeneralSchedule copy(@NotNull List<? extends DayOfWeek> usualSchedule, @NotNull List<DiverseDay> divergenceDays) {
        usualSchedule.getClass();
        divergenceDays.getClass();
        return new CharityGeneralSchedule(usualSchedule, divergenceDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharityGeneralSchedule)) {
            return false;
        }
        CharityGeneralSchedule charityGeneralSchedule = (CharityGeneralSchedule) other;
        return Intrinsics.areEqual(this.usualSchedule, charityGeneralSchedule.usualSchedule) && Intrinsics.areEqual(this.divergenceDays, charityGeneralSchedule.divergenceDays);
    }

    @NotNull
    public final List<DiverseDay> getDivergenceDays() {
        return this.divergenceDays;
    }

    @NotNull
    public final List<DayOfWeek> getUsualSchedule() {
        return this.usualSchedule;
    }

    public int hashCode() {
        return this.divergenceDays.hashCode() + (this.usualSchedule.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CharityGeneralSchedule(usualSchedule=" + this.usualSchedule + ", divergenceDays=" + this.divergenceDays + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityGeneralSchedule$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityGeneralSchedule;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CharityGeneralSchedule$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("divergence_days")
    public static /* synthetic */ void getDivergenceDays$annotations() {
    }

    @g("usual_schedule")
    public static /* synthetic */ void getUsualSchedule$annotations() {
    }

    public CharityGeneralSchedule() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharityGeneralSchedule(@NotNull List<? extends DayOfWeek> list, @NotNull List<DiverseDay> list2) {
        list.getClass();
        list2.getClass();
        this.usualSchedule = list;
        this.divergenceDays = list2;
    }

    public CharityGeneralSchedule(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? n0.f26529a : list2);
    }
}
