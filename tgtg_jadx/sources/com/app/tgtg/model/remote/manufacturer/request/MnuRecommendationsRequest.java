package com.app.tgtg.model.remote.manufacturer.request;

import e0.f;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBO\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001cR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001f¨\u00067"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/MnuRecommendationsRequest;", "", "", "countryId", "", "basedOnItemIds", "excludeItemIds", "Lcom/app/tgtg/model/remote/manufacturer/request/RecommendationScreenScenario;", "recommendationScreenScenario", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/RecommendationScreenScenario;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/RecommendationScreenScenario;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/request/MnuRecommendationsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/app/tgtg/model/remote/manufacturer/request/RecommendationScreenScenario;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/manufacturer/request/RecommendationScreenScenario;)Lcom/app/tgtg/model/remote/manufacturer/request/MnuRecommendationsRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryId", "getCountryId$annotations", "()V", "Ljava/util/List;", "getBasedOnItemIds", "getBasedOnItemIds$annotations", "getExcludeItemIds", "getExcludeItemIds$annotations", "Lcom/app/tgtg/model/remote/manufacturer/request/RecommendationScreenScenario;", "getRecommendationScreenScenario", "getRecommendationScreenScenario$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MnuRecommendationsRequest {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<String> basedOnItemIds;

    @NotNull
    private final String countryId;

    @Nullable
    private final List<String> excludeItemIds;

    @Nullable
    private final RecommendationScreenScenario recommendationScreenScenario;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, l.a(mVar, new a(3)), l.a(mVar, new a(4)), l.a(mVar, new a(5))};
    }

    public /* synthetic */ MnuRecommendationsRequest(int i11, String str, List list, List list2, RecommendationScreenScenario recommendationScreenScenario, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, MnuRecommendationsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.countryId = str;
        this.basedOnItemIds = list;
        this.excludeItemIds = list2;
        this.recommendationScreenScenario = recommendationScreenScenario;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$1() {
        RecommendationScreenScenario[] recommendationScreenScenarioArrValues = RecommendationScreenScenario.values();
        recommendationScreenScenarioArrValues.getClass();
        return new i90.a("com.app.tgtg.model.remote.manufacturer.request.RecommendationScreenScenario", (Enum[]) recommendationScreenScenarioArrValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MnuRecommendationsRequest copy$default(MnuRecommendationsRequest mnuRecommendationsRequest, String str, List list, List list2, RecommendationScreenScenario recommendationScreenScenario, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mnuRecommendationsRequest.countryId;
        }
        if ((i11 & 2) != 0) {
            list = mnuRecommendationsRequest.basedOnItemIds;
        }
        if ((i11 & 4) != 0) {
            list2 = mnuRecommendationsRequest.excludeItemIds;
        }
        if ((i11 & 8) != 0) {
            recommendationScreenScenario = mnuRecommendationsRequest.recommendationScreenScenario;
        }
        return mnuRecommendationsRequest.copy(str, list, list2, recommendationScreenScenario);
    }

    public static final /* synthetic */ void write$Self$app(MnuRecommendationsRequest self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.countryId);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.basedOnItemIds);
        output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.excludeItemIds);
        output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.recommendationScreenScenario);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final List<String> component2() {
        return this.basedOnItemIds;
    }

    @Nullable
    public final List<String> component3() {
        return this.excludeItemIds;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecommendationScreenScenario getRecommendationScreenScenario() {
        return this.recommendationScreenScenario;
    }

    @NotNull
    public final MnuRecommendationsRequest copy(@NotNull String countryId, @NotNull List<String> basedOnItemIds, @Nullable List<String> excludeItemIds, @Nullable RecommendationScreenScenario recommendationScreenScenario) {
        countryId.getClass();
        basedOnItemIds.getClass();
        return new MnuRecommendationsRequest(countryId, basedOnItemIds, excludeItemIds, recommendationScreenScenario);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MnuRecommendationsRequest)) {
            return false;
        }
        MnuRecommendationsRequest mnuRecommendationsRequest = (MnuRecommendationsRequest) other;
        return Intrinsics.areEqual(this.countryId, mnuRecommendationsRequest.countryId) && Intrinsics.areEqual(this.basedOnItemIds, mnuRecommendationsRequest.basedOnItemIds) && Intrinsics.areEqual(this.excludeItemIds, mnuRecommendationsRequest.excludeItemIds) && this.recommendationScreenScenario == mnuRecommendationsRequest.recommendationScreenScenario;
    }

    @NotNull
    public final List<String> getBasedOnItemIds() {
        return this.basedOnItemIds;
    }

    @NotNull
    public final String getCountryId() {
        return this.countryId;
    }

    @Nullable
    public final List<String> getExcludeItemIds() {
        return this.excludeItemIds;
    }

    @Nullable
    public final RecommendationScreenScenario getRecommendationScreenScenario() {
        return this.recommendationScreenScenario;
    }

    public int hashCode() {
        int iC = f.c(this.basedOnItemIds, this.countryId.hashCode() * 31, 31);
        List<String> list = this.excludeItemIds;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        RecommendationScreenScenario recommendationScreenScenario = this.recommendationScreenScenario;
        return iHashCode + (recommendationScreenScenario != null ? recommendationScreenScenario.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MnuRecommendationsRequest(countryId=" + this.countryId + ", basedOnItemIds=" + this.basedOnItemIds + ", excludeItemIds=" + this.excludeItemIds + ", recommendationScreenScenario=" + this.recommendationScreenScenario + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/MnuRecommendationsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/MnuRecommendationsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MnuRecommendationsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("based_on_item_ids")
    public static /* synthetic */ void getBasedOnItemIds$annotations() {
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("exclude_item_ids")
    public static /* synthetic */ void getExcludeItemIds$annotations() {
    }

    @g("scenario")
    public static /* synthetic */ void getRecommendationScreenScenario$annotations() {
    }

    public MnuRecommendationsRequest(@NotNull String str, @NotNull List<String> list, @Nullable List<String> list2, @Nullable RecommendationScreenScenario recommendationScreenScenario) {
        str.getClass();
        list.getClass();
        this.countryId = str;
        this.basedOnItemIds = list;
        this.excludeItemIds = list2;
        this.recommendationScreenScenario = recommendationScreenScenario;
    }
}
