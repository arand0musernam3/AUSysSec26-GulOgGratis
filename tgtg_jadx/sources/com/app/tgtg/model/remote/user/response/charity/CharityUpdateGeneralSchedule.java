package com.app.tgtg.model.remote.user.response.charity;

import e0.f;
import i90.h;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityUpdateGeneralSchedule;", "", "", "Lcom/app/tgtg/model/remote/user/response/charity/Conflict;", "conflicts", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/CharityUpdateGeneralSchedule;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/app/tgtg/model/remote/user/response/charity/CharityUpdateGeneralSchedule;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConflicts", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CharityUpdateGeneralSchedule {

    @NotNull
    private final List<Conflict> conflicts;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(23))};

    public CharityUpdateGeneralSchedule(int i11, List list, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.conflicts = n0.f26529a;
        } else {
            this.conflicts = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Conflict$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharityUpdateGeneralSchedule copy$default(CharityUpdateGeneralSchedule charityUpdateGeneralSchedule, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = charityUpdateGeneralSchedule.conflicts;
        }
        return charityUpdateGeneralSchedule.copy(list);
    }

    public static final void write$Self$app(CharityUpdateGeneralSchedule self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.conflicts, n0.f26529a)) {
            return;
        }
        output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.conflicts);
    }

    @NotNull
    public final List<Conflict> component1() {
        return this.conflicts;
    }

    @NotNull
    public final CharityUpdateGeneralSchedule copy(@NotNull List<Conflict> conflicts) {
        conflicts.getClass();
        return new CharityUpdateGeneralSchedule(conflicts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CharityUpdateGeneralSchedule) && Intrinsics.areEqual(this.conflicts, ((CharityUpdateGeneralSchedule) other).conflicts);
    }

    @NotNull
    public final List<Conflict> getConflicts() {
        return this.conflicts;
    }

    public int hashCode() {
        return this.conflicts.hashCode();
    }

    @NotNull
    public String toString() {
        return f.m("CharityUpdateGeneralSchedule(conflicts=", ")", this.conflicts);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/CharityUpdateGeneralSchedule$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityUpdateGeneralSchedule;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CharityUpdateGeneralSchedule$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CharityUpdateGeneralSchedule() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public CharityUpdateGeneralSchedule(@NotNull List<Conflict> list) {
        list.getClass();
        this.conflicts = list;
    }

    public CharityUpdateGeneralSchedule(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list);
    }
}
