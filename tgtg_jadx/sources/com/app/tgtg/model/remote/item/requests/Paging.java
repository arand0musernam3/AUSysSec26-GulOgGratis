package com.app.tgtg.model.remote.item.requests;

import b3.i;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u0018¨\u0006/"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/Paging;", "", "", "size", "nextPageYear", "nextPageMonth", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/Paging;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/item/requests/Paging;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSize", "getSize$annotations", "()V", "Ljava/lang/Integer;", "getNextPageYear", "getNextPageYear$annotations", "getNextPageMonth", "getNextPageMonth$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Paging {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer nextPageMonth;

    @Nullable
    private final Integer nextPageYear;
    private final int size;

    public /* synthetic */ Paging(int i11, int i12, Integer num, Integer num2, m1 m1Var) {
        if (6 != (i11 & 6)) {
            c1.j(i11, 6, Paging$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.size = 20;
        } else {
            this.size = i12;
        }
        this.nextPageYear = num;
        this.nextPageMonth = num2;
    }

    public static /* synthetic */ Paging copy$default(Paging paging, int i11, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = paging.size;
        }
        if ((i12 & 2) != 0) {
            num = paging.nextPageYear;
        }
        if ((i12 & 4) != 0) {
            num2 = paging.nextPageMonth;
        }
        return paging.copy(i11, num, num2);
    }

    public static final /* synthetic */ void write$Self$app(Paging self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.size, serialDesc);
        l0 l0Var = l0.f29821a;
        output.r(serialDesc, 1, l0Var, self.nextPageYear);
        output.r(serialDesc, 2, l0Var, self.nextPageMonth);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getNextPageYear() {
        return this.nextPageYear;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getNextPageMonth() {
        return this.nextPageMonth;
    }

    @NotNull
    public final Paging copy(int size, @Nullable Integer nextPageYear, @Nullable Integer nextPageMonth) {
        return new Paging(size, nextPageYear, nextPageMonth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Paging)) {
            return false;
        }
        Paging paging = (Paging) other;
        return this.size == paging.size && Intrinsics.areEqual(this.nextPageYear, paging.nextPageYear) && Intrinsics.areEqual(this.nextPageMonth, paging.nextPageMonth);
    }

    @Nullable
    public final Integer getNextPageMonth() {
        return this.nextPageMonth;
    }

    @Nullable
    public final Integer getNextPageYear() {
        return this.nextPageYear;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.size) * 31;
        Integer num = this.nextPageYear;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextPageMonth;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.size;
        Integer num = this.nextPageYear;
        Integer num2 = this.nextPageMonth;
        StringBuilder sb2 = new StringBuilder("Paging(size=");
        sb2.append(i11);
        sb2.append(", nextPageYear=");
        sb2.append(num);
        sb2.append(", nextPageMonth=");
        return i.m(sb2, num2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/Paging$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/Paging;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Paging$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("next_page_month")
    public static /* synthetic */ void getNextPageMonth$annotations() {
    }

    @g("next_page_year")
    public static /* synthetic */ void getNextPageYear$annotations() {
    }

    @g("size")
    public static /* synthetic */ void getSize$annotations() {
    }

    public Paging(int i11, @Nullable Integer num, @Nullable Integer num2) {
        this.size = i11;
        this.nextPageYear = num;
        this.nextPageMonth = num2;
    }

    public /* synthetic */ Paging(int i11, Integer num, Integer num2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 20 : i11, num, num2);
    }
}
