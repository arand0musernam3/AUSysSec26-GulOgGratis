package com.app.tgtg.model.remote.order.request;

import i90.g;
import i90.h;
import java.util.List;
import jq.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.l0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001c¨\u00062"}, d2 = {"Lcom/app/tgtg/model/remote/order/request/RatingCategory;", "", "", "rating", "", "", "reasons", "userFeedback", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/request/RatingCategory;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/app/tgtg/model/remote/order/request/RatingCategory;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getRating", "getRating$annotations", "()V", "Ljava/util/List;", "getReasons", "getReasons$annotations", "Ljava/lang/String;", "getUserFeedback", "getUserFeedback$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RatingCategory {

    @Nullable
    private final Integer rating;

    @Nullable
    private final List<String> reasons;

    @Nullable
    private final String userFeedback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(3)), null};

    public /* synthetic */ RatingCategory(int i11, Integer num, List list, String str, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.rating = null;
        } else {
            this.rating = num;
        }
        if ((i11 & 2) == 0) {
            this.reasons = null;
        } else {
            this.reasons = list;
        }
        if ((i11 & 4) == 0) {
            this.userFeedback = null;
        } else {
            this.userFeedback = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingCategory copy$default(RatingCategory ratingCategory, Integer num, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = ratingCategory.rating;
        }
        if ((i11 & 2) != 0) {
            list = ratingCategory.reasons;
        }
        if ((i11 & 4) != 0) {
            str = ratingCategory.userFeedback;
        }
        return ratingCategory.copy(num, list, str);
    }

    public static final /* synthetic */ void write$Self$app(RatingCategory self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.rating != null) {
            output.r(serialDesc, 0, l0.f29821a, self.rating);
        }
        if (output.C(serialDesc) || self.reasons != null) {
            output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.reasons);
        }
        if (!output.C(serialDesc) && self.userFeedback == null) {
            return;
        }
        output.r(serialDesc, 2, r1.f29848a, self.userFeedback);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRating() {
        return this.rating;
    }

    @Nullable
    public final List<String> component2() {
        return this.reasons;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserFeedback() {
        return this.userFeedback;
    }

    @NotNull
    public final RatingCategory copy(@Nullable Integer rating, @Nullable List<String> reasons, @Nullable String userFeedback) {
        return new RatingCategory(rating, reasons, userFeedback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingCategory)) {
            return false;
        }
        RatingCategory ratingCategory = (RatingCategory) other;
        return Intrinsics.areEqual(this.rating, ratingCategory.rating) && Intrinsics.areEqual(this.reasons, ratingCategory.reasons) && Intrinsics.areEqual(this.userFeedback, ratingCategory.userFeedback);
    }

    @Nullable
    public final Integer getRating() {
        return this.rating;
    }

    @Nullable
    public final List<String> getReasons() {
        return this.reasons;
    }

    @Nullable
    public final String getUserFeedback() {
        return this.userFeedback;
    }

    public int hashCode() {
        Integer num = this.rating;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.reasons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.userFeedback;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.rating;
        List<String> list = this.reasons;
        String str = this.userFeedback;
        StringBuilder sb2 = new StringBuilder("RatingCategory(rating=");
        sb2.append(num);
        sb2.append(", reasons=");
        sb2.append(list);
        sb2.append(", userFeedback=");
        return k.p(sb2, str, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/request/RatingCategory$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/request/RatingCategory;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RatingCategory$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("score")
    public static /* synthetic */ void getRating$annotations() {
    }

    @g("sub_categories")
    public static /* synthetic */ void getReasons$annotations() {
    }

    @g("extra_explanation")
    public static /* synthetic */ void getUserFeedback$annotations() {
    }

    public RatingCategory() {
        this((Integer) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public RatingCategory(@Nullable Integer num, @Nullable List<String> list, @Nullable String str) {
        this.rating = num;
        this.reasons = list;
        this.userFeedback = str;
    }

    public /* synthetic */ RatingCategory(Integer num, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str);
    }
}
