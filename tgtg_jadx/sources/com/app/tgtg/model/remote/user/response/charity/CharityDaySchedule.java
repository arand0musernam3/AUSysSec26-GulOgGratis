package com.app.tgtg.model.remote.user.response.charity;

import i90.f;
import i90.g;
import i90.h;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w.a0;
import wt.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0004\u0016\u0017\u0018\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule;", "", "<init>", "()V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getDate", "()Ljava/lang/String;", "date", "Companion", "Unavailable", "NoPickups", "Available", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Available;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$NoPickups;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Unavailable;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class CharityDaySchedule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(12));

    public /* synthetic */ CharityDaySchedule(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule", Reflection.getOrCreateKotlinClass(CharityDaySchedule.class), new KClass[]{Reflection.getOrCreateKotlinClass(Available.class), Reflection.getOrCreateKotlinClass(NoPickups.class), Reflection.getOrCreateKotlinClass(Unavailable.class)}, new KSerializer[]{CharityDaySchedule$Available$$serializer.INSTANCE, CharityDaySchedule$NoPickups$$serializer.INSTANCE, CharityDaySchedule$Unavailable$$serializer.INSTANCE}, new Annotation[0]);
    }

    @NotNull
    public abstract String getDate();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Available;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule;", "", "date", "", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "stores", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Available;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Available;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getDate$annotations", "()V", "Ljava/util/List;", "getStores", "getStores$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    @g("AVAILABLE_STORES")
    public static final /* data */ class Available extends CharityDaySchedule {

        @NotNull
        private final String date;

        @NotNull
        private final List<CharityDayScheduleStore> stores;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @NotNull
        private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(13))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Available(int i11, String str, List list, m1 m1Var) {
            super(i11, m1Var);
            if (3 != (i11 & 3)) {
                c1.j(i11, 3, CharityDaySchedule$Available$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.date = str;
            this.stores = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new d(CharityDayScheduleStore$$serializer.INSTANCE, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Available copy$default(Available available, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = available.date;
            }
            if ((i11 & 2) != 0) {
                list = available.stores;
            }
            return available.copy(str, list);
        }

        public static final /* synthetic */ void write$Self$app(Available self, b output, SerialDescriptor serialDesc) {
            CharityDaySchedule.write$Self(self, output, serialDesc);
            j[] jVarArr = $childSerializers;
            output.q(serialDesc, 0, self.getDate());
            output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.stores);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        @NotNull
        public final List<CharityDayScheduleStore> component2() {
            return this.stores;
        }

        @NotNull
        public final Available copy(@NotNull String date, @NotNull List<CharityDayScheduleStore> stores) {
            date.getClass();
            stores.getClass();
            return new Available(date, stores);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Available)) {
                return false;
            }
            Available available = (Available) other;
            return Intrinsics.areEqual(this.date, available.date) && Intrinsics.areEqual(this.stores, available.stores);
        }

        @Override // com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule
        @NotNull
        public String getDate() {
            return this.date;
        }

        @NotNull
        public final List<CharityDayScheduleStore> getStores() {
            return this.stores;
        }

        public int hashCode() {
            return this.stores.hashCode() + (this.date.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Available(date=" + this.date + ", stores=" + this.stores + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Available$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Available;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CharityDaySchedule$Available$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @g("date")
        public static /* synthetic */ void getDate$annotations() {
        }

        @g("stores")
        public static /* synthetic */ void getStores$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(@NotNull String str, @NotNull List<CharityDayScheduleStore> list) {
            super(null);
            str.getClass();
            list.getClass();
            this.date = str;
            this.stores = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015¨\u0006&"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$NoPickups;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule;", "", "date", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$NoPickups;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$NoPickups;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getDate$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    @g("NO_PICKUPS_PLANNED")
    public static final /* data */ class NoPickups extends CharityDaySchedule {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NoPickups(int i11, String str, m1 m1Var) {
            super(i11, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, CharityDaySchedule$NoPickups$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.date = str;
        }

        public static /* synthetic */ NoPickups copy$default(NoPickups noPickups, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = noPickups.date;
            }
            return noPickups.copy(str);
        }

        public static final /* synthetic */ void write$Self$app(NoPickups self, b output, SerialDescriptor serialDesc) {
            CharityDaySchedule.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.getDate());
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        @NotNull
        public final NoPickups copy(@NotNull String date) {
            date.getClass();
            return new NoPickups(date);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoPickups) && Intrinsics.areEqual(this.date, ((NoPickups) other).date);
        }

        @Override // com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule
        @NotNull
        public String getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("NoPickups(date=", this.date, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$NoPickups$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$NoPickups;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CharityDaySchedule$NoPickups$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @g("date")
        public static /* synthetic */ void getDate$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoPickups(@NotNull String str) {
            super(null);
            str.getClass();
            this.date = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015¨\u0006&"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Unavailable;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule;", "", "date", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Unavailable;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Unavailable;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getDate$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    @g("MARKED_AS_UNAVAILABLE")
    public static final /* data */ class Unavailable extends CharityDaySchedule {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unavailable(int i11, String str, m1 m1Var) {
            super(i11, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, CharityDaySchedule$Unavailable$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.date = str;
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unavailable.date;
            }
            return unavailable.copy(str);
        }

        public static final /* synthetic */ void write$Self$app(Unavailable self, b output, SerialDescriptor serialDesc) {
            CharityDaySchedule.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.getDate());
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        @NotNull
        public final Unavailable copy(@NotNull String date) {
            date.getClass();
            return new Unavailable(date);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unavailable) && Intrinsics.areEqual(this.date, ((Unavailable) other).date);
        }

        @Override // com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule
        @NotNull
        public String getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Unavailable(date=", this.date, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Unavailable$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Unavailable;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CharityDaySchedule$Unavailable$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @g("date")
        public static /* synthetic */ void getDate$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unavailable(@NotNull String str) {
            super(null);
            str.getClass();
            this.date = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CharityDaySchedule.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private CharityDaySchedule() {
    }

    public /* synthetic */ CharityDaySchedule(int i11, m1 m1Var) {
    }

    public static final /* synthetic */ void write$Self(CharityDaySchedule self, b output, SerialDescriptor serialDesc) {
    }
}
