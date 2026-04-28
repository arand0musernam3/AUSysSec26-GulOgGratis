package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.h;
import iu.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.g;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002dcBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0088\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b1\u0010'J\u0010\u00102\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b2\u0010\u0019J\u001a\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010>\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b<\u0010=R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010?\u0012\u0004\bC\u0010D\u001a\u0004\b@\u0010!\"\u0004\bA\u0010BR(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010?\u0012\u0004\bG\u0010D\u001a\u0004\bE\u0010!\"\u0004\bF\u0010BR(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010?\u0012\u0004\bJ\u0010D\u001a\u0004\bH\u0010!\"\u0004\bI\u0010BR0\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010K\u0012\u0004\bO\u0010D\u001a\u0004\bL\u0010%\"\u0004\bM\u0010NR*\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010P\u0012\u0004\bT\u0010D\u001a\u0004\bQ\u0010'\"\u0004\bR\u0010SR*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010U\u0012\u0004\bY\u0010D\u001a\u0004\bV\u0010)\"\u0004\bW\u0010XR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010Z\u0012\u0004\b\\\u0010D\u001a\u0004\b[\u0010+R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010Z\u0012\u0004\b^\u0010D\u001a\u0004\b]\u0010+R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010P\u0012\u0004\b`\u0010D\u001a\u0004\b_\u0010'R\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Z\u0012\u0004\bb\u0010D\u001a\u0004\ba\u0010+¨\u0006e"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderRatingItem;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/order/Rating;", "overall", "content", "service", "", "", "positiveReasons", "bagContentsDescription", "Lcom/app/tgtg/model/remote/order/NpsRating;", "npsRating", "", "shoppedBefore", "boughtMore", "extraPurchaseAmount", "hasVisitedStoreBecauseOfBag", "<init>", "(Lcom/app/tgtg/model/remote/order/Rating;Lcom/app/tgtg/model/remote/order/Rating;Lcom/app/tgtg/model/remote/order/Rating;Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/NpsRating;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/Rating;Lcom/app/tgtg/model/remote/order/Rating;Lcom/app/tgtg/model/remote/order/Rating;Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/NpsRating;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/order/Rating;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/app/tgtg/model/remote/order/NpsRating;", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "copy", "(Lcom/app/tgtg/model/remote/order/Rating;Lcom/app/tgtg/model/remote/order/Rating;Lcom/app/tgtg/model/remote/order/Rating;Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/NpsRating;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/order/OrderRatingItem;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/OrderRatingItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/order/Rating;", "getOverall", "setOverall", "(Lcom/app/tgtg/model/remote/order/Rating;)V", "getOverall$annotations", "()V", "getContent", "setContent", "getContent$annotations", "getService", "setService", "getService$annotations", "Ljava/util/List;", "getPositiveReasons", "setPositiveReasons", "(Ljava/util/List;)V", "getPositiveReasons$annotations", "Ljava/lang/String;", "getBagContentsDescription", "setBagContentsDescription", "(Ljava/lang/String;)V", "getBagContentsDescription$annotations", "Lcom/app/tgtg/model/remote/order/NpsRating;", "getNpsRating", "setNpsRating", "(Lcom/app/tgtg/model/remote/order/NpsRating;)V", "getNpsRating$annotations", "Ljava/lang/Boolean;", "getShoppedBefore", "getShoppedBefore$annotations", "getBoughtMore", "getBoughtMore$annotations", "getExtraPurchaseAmount", "getExtraPurchaseAmount$annotations", "getHasVisitedStoreBecauseOfBag", "getHasVisitedStoreBecauseOfBag$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderRatingItem implements Parcelable {

    @Nullable
    private String bagContentsDescription;

    @Nullable
    private final Boolean boughtMore;

    @NotNull
    private Rating content;

    @Nullable
    private final String extraPurchaseAmount;

    @Nullable
    private final Boolean hasVisitedStoreBecauseOfBag;

    @Nullable
    private NpsRating npsRating;

    @NotNull
    private Rating overall;

    @Nullable
    private List<String> positiveReasons;

    @NotNull
    private Rating service;

    @Nullable
    private final Boolean shoppedBefore;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OrderRatingItem> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, l.a(m.PUBLICATION, new a(4)), null, null, null, null, null, null};

    public /* synthetic */ OrderRatingItem(int i11, Rating rating, Rating rating2, Rating rating3, List list, String str, NpsRating npsRating, Boolean bool, Boolean bool2, String str2, Boolean bool3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, OrderRatingItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.overall = rating;
        this.content = rating2;
        this.service = rating3;
        if ((i11 & 8) == 0) {
            this.positiveReasons = null;
        } else {
            this.positiveReasons = list;
        }
        if ((i11 & 16) == 0) {
            this.bagContentsDescription = null;
        } else {
            this.bagContentsDescription = str;
        }
        if ((i11 & 32) == 0) {
            this.npsRating = null;
        } else {
            this.npsRating = npsRating;
        }
        if ((i11 & 64) == 0) {
            this.shoppedBefore = null;
        } else {
            this.shoppedBefore = bool;
        }
        if ((i11 & 128) == 0) {
            this.boughtMore = null;
        } else {
            this.boughtMore = bool2;
        }
        if ((i11 & 256) == 0) {
            this.extraPurchaseAmount = null;
        } else {
            this.extraPurchaseAmount = str2;
        }
        if ((i11 & 512) == 0) {
            this.hasVisitedStoreBecauseOfBag = null;
        } else {
            this.hasVisitedStoreBecauseOfBag = bool3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderRatingItem copy$default(OrderRatingItem orderRatingItem, Rating rating, Rating rating2, Rating rating3, List list, String str, NpsRating npsRating, Boolean bool, Boolean bool2, String str2, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rating = orderRatingItem.overall;
        }
        if ((i11 & 2) != 0) {
            rating2 = orderRatingItem.content;
        }
        if ((i11 & 4) != 0) {
            rating3 = orderRatingItem.service;
        }
        if ((i11 & 8) != 0) {
            list = orderRatingItem.positiveReasons;
        }
        if ((i11 & 16) != 0) {
            str = orderRatingItem.bagContentsDescription;
        }
        if ((i11 & 32) != 0) {
            npsRating = orderRatingItem.npsRating;
        }
        if ((i11 & 64) != 0) {
            bool = orderRatingItem.shoppedBefore;
        }
        if ((i11 & 128) != 0) {
            bool2 = orderRatingItem.boughtMore;
        }
        if ((i11 & 256) != 0) {
            str2 = orderRatingItem.extraPurchaseAmount;
        }
        if ((i11 & 512) != 0) {
            bool3 = orderRatingItem.hasVisitedStoreBecauseOfBag;
        }
        String str3 = str2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool;
        Boolean bool6 = bool2;
        String str4 = str;
        NpsRating npsRating2 = npsRating;
        return orderRatingItem.copy(rating, rating2, rating3, list, str4, npsRating2, bool5, bool6, str3, bool4);
    }

    public static final /* synthetic */ void write$Self$app(OrderRatingItem self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        Rating$$serializer rating$$serializer = Rating$$serializer.INSTANCE;
        output.i(serialDesc, 0, rating$$serializer, self.overall);
        output.i(serialDesc, 1, rating$$serializer, self.content);
        output.i(serialDesc, 2, rating$$serializer, self.service);
        if (output.C(serialDesc) || self.positiveReasons != null) {
            output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.positiveReasons);
        }
        if (output.C(serialDesc) || self.bagContentsDescription != null) {
            output.r(serialDesc, 4, r1.f29848a, self.bagContentsDescription);
        }
        if (output.C(serialDesc) || self.npsRating != null) {
            output.r(serialDesc, 5, NpsRating$$serializer.INSTANCE, self.npsRating);
        }
        if (output.C(serialDesc) || self.shoppedBefore != null) {
            output.r(serialDesc, 6, g.f29797a, self.shoppedBefore);
        }
        if (output.C(serialDesc) || self.boughtMore != null) {
            output.r(serialDesc, 7, g.f29797a, self.boughtMore);
        }
        if (output.C(serialDesc) || self.extraPurchaseAmount != null) {
            output.r(serialDesc, 8, r1.f29848a, self.extraPurchaseAmount);
        }
        if (!output.C(serialDesc) && self.hasVisitedStoreBecauseOfBag == null) {
            return;
        }
        output.r(serialDesc, 9, g.f29797a, self.hasVisitedStoreBecauseOfBag);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Rating getOverall() {
        return this.overall;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getHasVisitedStoreBecauseOfBag() {
        return this.hasVisitedStoreBecauseOfBag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Rating getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Rating getService() {
        return this.service;
    }

    @Nullable
    public final List<String> component4() {
        return this.positiveReasons;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBagContentsDescription() {
        return this.bagContentsDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NpsRating getNpsRating() {
        return this.npsRating;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getShoppedBefore() {
        return this.shoppedBefore;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getBoughtMore() {
        return this.boughtMore;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExtraPurchaseAmount() {
        return this.extraPurchaseAmount;
    }

    @NotNull
    public final OrderRatingItem copy(@NotNull Rating overall, @NotNull Rating content, @NotNull Rating service, @Nullable List<String> positiveReasons, @Nullable String bagContentsDescription, @Nullable NpsRating npsRating, @Nullable Boolean shoppedBefore, @Nullable Boolean boughtMore, @Nullable String extraPurchaseAmount, @Nullable Boolean hasVisitedStoreBecauseOfBag) {
        overall.getClass();
        content.getClass();
        service.getClass();
        return new OrderRatingItem(overall, content, service, positiveReasons, bagContentsDescription, npsRating, shoppedBefore, boughtMore, extraPurchaseAmount, hasVisitedStoreBecauseOfBag);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderRatingItem)) {
            return false;
        }
        OrderRatingItem orderRatingItem = (OrderRatingItem) other;
        return Intrinsics.areEqual(this.overall, orderRatingItem.overall) && Intrinsics.areEqual(this.content, orderRatingItem.content) && Intrinsics.areEqual(this.service, orderRatingItem.service) && Intrinsics.areEqual(this.positiveReasons, orderRatingItem.positiveReasons) && Intrinsics.areEqual(this.bagContentsDescription, orderRatingItem.bagContentsDescription) && Intrinsics.areEqual(this.npsRating, orderRatingItem.npsRating) && Intrinsics.areEqual(this.shoppedBefore, orderRatingItem.shoppedBefore) && Intrinsics.areEqual(this.boughtMore, orderRatingItem.boughtMore) && Intrinsics.areEqual(this.extraPurchaseAmount, orderRatingItem.extraPurchaseAmount) && Intrinsics.areEqual(this.hasVisitedStoreBecauseOfBag, orderRatingItem.hasVisitedStoreBecauseOfBag);
    }

    @Nullable
    public final String getBagContentsDescription() {
        return this.bagContentsDescription;
    }

    @Nullable
    public final Boolean getBoughtMore() {
        return this.boughtMore;
    }

    @NotNull
    public final Rating getContent() {
        return this.content;
    }

    @Nullable
    public final String getExtraPurchaseAmount() {
        return this.extraPurchaseAmount;
    }

    @Nullable
    public final Boolean getHasVisitedStoreBecauseOfBag() {
        return this.hasVisitedStoreBecauseOfBag;
    }

    @Nullable
    public final NpsRating getNpsRating() {
        return this.npsRating;
    }

    @NotNull
    public final Rating getOverall() {
        return this.overall;
    }

    @Nullable
    public final List<String> getPositiveReasons() {
        return this.positiveReasons;
    }

    @NotNull
    public final Rating getService() {
        return this.service;
    }

    @Nullable
    public final Boolean getShoppedBefore() {
        return this.shoppedBefore;
    }

    public int hashCode() {
        int iHashCode = (this.service.hashCode() + ((this.content.hashCode() + (this.overall.hashCode() * 31)) * 31)) * 31;
        List<String> list = this.positiveReasons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.bagContentsDescription;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        NpsRating npsRating = this.npsRating;
        int iHashCode4 = (iHashCode3 + (npsRating == null ? 0 : npsRating.hashCode())) * 31;
        Boolean bool = this.shoppedBefore;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.boughtMore;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.extraPurchaseAmount;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.hasVisitedStoreBecauseOfBag;
        return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final void setBagContentsDescription(@Nullable String str) {
        this.bagContentsDescription = str;
    }

    public final void setContent(@NotNull Rating rating) {
        rating.getClass();
        this.content = rating;
    }

    public final void setNpsRating(@Nullable NpsRating npsRating) {
        this.npsRating = npsRating;
    }

    public final void setOverall(@NotNull Rating rating) {
        rating.getClass();
        this.overall = rating;
    }

    public final void setPositiveReasons(@Nullable List<String> list) {
        this.positiveReasons = list;
    }

    public final void setService(@NotNull Rating rating) {
        rating.getClass();
        this.service = rating;
    }

    @NotNull
    public String toString() {
        return "OrderRatingItem(overall=" + this.overall + ", content=" + this.content + ", service=" + this.service + ", positiveReasons=" + this.positiveReasons + ", bagContentsDescription=" + this.bagContentsDescription + ", npsRating=" + this.npsRating + ", shoppedBefore=" + this.shoppedBefore + ", boughtMore=" + this.boughtMore + ", extraPurchaseAmount=" + this.extraPurchaseAmount + ", hasVisitedStoreBecauseOfBag=" + this.hasVisitedStoreBecauseOfBag + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.overall.writeToParcel(dest, flags);
        this.content.writeToParcel(dest, flags);
        this.service.writeToParcel(dest, flags);
        dest.writeStringList(this.positiveReasons);
        dest.writeString(this.bagContentsDescription);
        NpsRating npsRating = this.npsRating;
        if (npsRating == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            npsRating.writeToParcel(dest, flags);
        }
        Boolean bool = this.shoppedBefore;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        Boolean bool2 = this.boughtMore;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool2);
        }
        dest.writeString(this.extraPurchaseAmount);
        Boolean bool3 = this.hasVisitedStoreBecauseOfBag;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderRatingItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderRatingItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderRatingItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderRatingItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderRatingItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            Parcelable.Creator<Rating> creator = Rating.CREATOR;
            Rating ratingCreateFromParcel = creator.createFromParcel(parcel);
            Rating ratingCreateFromParcel2 = creator.createFromParcel(parcel);
            Rating ratingCreateFromParcel3 = creator.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            Boolean boolValueOf3 = null;
            NpsRating npsRatingCreateFromParcel = parcel.readInt() == 0 ? null : NpsRating.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OrderRatingItem(ratingCreateFromParcel, ratingCreateFromParcel2, ratingCreateFromParcel3, arrayListCreateStringArrayList, string, npsRatingCreateFromParcel, boolValueOf, boolValueOf2, string2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderRatingItem[] newArray(int i11) {
            return new OrderRatingItem[i11];
        }
    }

    @i90.g("bag_contents_description")
    public static /* synthetic */ void getBagContentsDescription$annotations() {
    }

    @i90.g("has_bought_more_on_pickup")
    public static /* synthetic */ void getBoughtMore$annotations() {
    }

    @i90.g("bag_content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @i90.g("extra_purchase_amount")
    public static /* synthetic */ void getExtraPurchaseAmount$annotations() {
    }

    @i90.g("has_visited_store_because_of_bag")
    public static /* synthetic */ void getHasVisitedStoreBecauseOfBag$annotations() {
    }

    @i90.g("nps_rating")
    public static /* synthetic */ void getNpsRating$annotations() {
    }

    @i90.g("overall")
    public static /* synthetic */ void getOverall$annotations() {
    }

    @i90.g("positive_feedback")
    public static /* synthetic */ void getPositiveReasons$annotations() {
    }

    @i90.g("service")
    public static /* synthetic */ void getService$annotations() {
    }

    @i90.g("has_shopped_in_store_before")
    public static /* synthetic */ void getShoppedBefore$annotations() {
    }

    public OrderRatingItem(@NotNull Rating rating, @NotNull Rating rating2, @NotNull Rating rating3, @Nullable List<String> list, @Nullable String str, @Nullable NpsRating npsRating, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str2, @Nullable Boolean bool3) {
        rating.getClass();
        rating2.getClass();
        rating3.getClass();
        this.overall = rating;
        this.content = rating2;
        this.service = rating3;
        this.positiveReasons = list;
        this.bagContentsDescription = str;
        this.npsRating = npsRating;
        this.shoppedBefore = bool;
        this.boughtMore = bool2;
        this.extraPurchaseAmount = str2;
        this.hasVisitedStoreBecauseOfBag = bool3;
    }

    public /* synthetic */ OrderRatingItem(Rating rating, Rating rating2, Rating rating3, List list, String str, NpsRating npsRating, Boolean bool, Boolean bool2, String str2, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(rating, rating2, rating3, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : npsRating, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : bool2, (i11 & 256) != 0 ? null : str2, (i11 & 512) != 0 ? null : bool3);
    }
}
