package com.app.tgtg.model.remote.order.request;

import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0088\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00106\u0012\u0004\b;\u00109\u001a\u0004\b:\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b=\u00109\u001a\u0004\b<\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010\u0018R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010\u0018R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\bC\u00109\u001a\u0004\bB\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010D\u0012\u0004\bF\u00109\u001a\u0004\bE\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010D\u0012\u0004\bH\u00109\u001a\u0004\bG\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010D\u0012\u0004\bJ\u00109\u001a\u0004\bI\u0010\u001fR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010K\u0012\u0004\bM\u00109\u001a\u0004\bL\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010K\u0012\u0004\bO\u00109\u001a\u0004\bN\u0010#¨\u0006R"}, d2 = {"Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;", "", "Lcom/app/tgtg/model/remote/order/request/RatingCategory;", "overallExperience", "collectionExperience", "foodQuality", "contentsVariety", "foodQuantity", "uspQuestion", "", "hasBoughtMoreOnPickup", "hasShoppedInStoreBefore", "hasVisitedStoreBecauseOfBag", "", "bagContentsDescription", "extraPurchaseAmount", "<init>", "(Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "component1", "()Lcom/app/tgtg/model/remote/order/request/RatingCategory;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "()Ljava/lang/String;", "component11", "copy", "(Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Lcom/app/tgtg/model/remote/order/request/RatingCategory;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/order/request/RatingCategory;", "getOverallExperience", "getOverallExperience$annotations", "()V", "getCollectionExperience", "getCollectionExperience$annotations", "getFoodQuality", "getFoodQuality$annotations", "getContentsVariety", "getContentsVariety$annotations", "getFoodQuantity", "getFoodQuantity$annotations", "getUspQuestion", "getUspQuestion$annotations", "Ljava/lang/Boolean;", "getHasBoughtMoreOnPickup", "getHasBoughtMoreOnPickup$annotations", "getHasShoppedInStoreBefore", "getHasShoppedInStoreBefore$annotations", "getHasVisitedStoreBecauseOfBag", "getHasVisitedStoreBecauseOfBag$annotations", "Ljava/lang/String;", "getBagContentsDescription", "getBagContentsDescription$annotations", "getExtraPurchaseAmount", "getExtraPurchaseAmount$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderRatingRequest {

    @Nullable
    private final String bagContentsDescription;

    @NotNull
    private final RatingCategory collectionExperience;

    @NotNull
    private final RatingCategory contentsVariety;

    @Nullable
    private final String extraPurchaseAmount;

    @NotNull
    private final RatingCategory foodQuality;

    @NotNull
    private final RatingCategory foodQuantity;

    @Nullable
    private final Boolean hasBoughtMoreOnPickup;

    @Nullable
    private final Boolean hasShoppedInStoreBefore;

    @Nullable
    private final Boolean hasVisitedStoreBecauseOfBag;

    @NotNull
    private final RatingCategory overallExperience;

    @NotNull
    private final RatingCategory uspQuestion;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OrderRatingRequest(@NotNull RatingCategory ratingCategory, @NotNull RatingCategory ratingCategory2, @NotNull RatingCategory ratingCategory3, @NotNull RatingCategory ratingCategory4, @NotNull RatingCategory ratingCategory5, @NotNull RatingCategory ratingCategory6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable String str2) {
        ratingCategory.getClass();
        ratingCategory2.getClass();
        ratingCategory3.getClass();
        ratingCategory4.getClass();
        ratingCategory5.getClass();
        ratingCategory6.getClass();
        this.overallExperience = ratingCategory;
        this.collectionExperience = ratingCategory2;
        this.foodQuality = ratingCategory3;
        this.contentsVariety = ratingCategory4;
        this.foodQuantity = ratingCategory5;
        this.uspQuestion = ratingCategory6;
        this.hasBoughtMoreOnPickup = bool;
        this.hasShoppedInStoreBefore = bool2;
        this.hasVisitedStoreBecauseOfBag = bool3;
        this.bagContentsDescription = str;
        this.extraPurchaseAmount = str2;
    }

    public static /* synthetic */ OrderRatingRequest copy$default(OrderRatingRequest orderRatingRequest, RatingCategory ratingCategory, RatingCategory ratingCategory2, RatingCategory ratingCategory3, RatingCategory ratingCategory4, RatingCategory ratingCategory5, RatingCategory ratingCategory6, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ratingCategory = orderRatingRequest.overallExperience;
        }
        if ((i11 & 2) != 0) {
            ratingCategory2 = orderRatingRequest.collectionExperience;
        }
        if ((i11 & 4) != 0) {
            ratingCategory3 = orderRatingRequest.foodQuality;
        }
        if ((i11 & 8) != 0) {
            ratingCategory4 = orderRatingRequest.contentsVariety;
        }
        if ((i11 & 16) != 0) {
            ratingCategory5 = orderRatingRequest.foodQuantity;
        }
        if ((i11 & 32) != 0) {
            ratingCategory6 = orderRatingRequest.uspQuestion;
        }
        if ((i11 & 64) != 0) {
            bool = orderRatingRequest.hasBoughtMoreOnPickup;
        }
        if ((i11 & 128) != 0) {
            bool2 = orderRatingRequest.hasShoppedInStoreBefore;
        }
        if ((i11 & 256) != 0) {
            bool3 = orderRatingRequest.hasVisitedStoreBecauseOfBag;
        }
        if ((i11 & 512) != 0) {
            str = orderRatingRequest.bagContentsDescription;
        }
        if ((i11 & 1024) != 0) {
            str2 = orderRatingRequest.extraPurchaseAmount;
        }
        String str3 = str;
        String str4 = str2;
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        RatingCategory ratingCategory7 = ratingCategory6;
        Boolean bool6 = bool;
        RatingCategory ratingCategory8 = ratingCategory5;
        RatingCategory ratingCategory9 = ratingCategory3;
        return orderRatingRequest.copy(ratingCategory, ratingCategory2, ratingCategory9, ratingCategory4, ratingCategory8, ratingCategory7, bool6, bool4, bool5, str3, str4);
    }

    public static final /* synthetic */ void write$Self$app(OrderRatingRequest self, b output, SerialDescriptor serialDesc) {
        RatingCategory$$serializer ratingCategory$$serializer = RatingCategory$$serializer.INSTANCE;
        output.i(serialDesc, 0, ratingCategory$$serializer, self.overallExperience);
        output.i(serialDesc, 1, ratingCategory$$serializer, self.collectionExperience);
        output.i(serialDesc, 2, ratingCategory$$serializer, self.foodQuality);
        output.i(serialDesc, 3, ratingCategory$$serializer, self.contentsVariety);
        output.i(serialDesc, 4, ratingCategory$$serializer, self.foodQuantity);
        output.i(serialDesc, 5, ratingCategory$$serializer, self.uspQuestion);
        g gVar = g.f29797a;
        output.r(serialDesc, 6, gVar, self.hasBoughtMoreOnPickup);
        output.r(serialDesc, 7, gVar, self.hasShoppedInStoreBefore);
        output.r(serialDesc, 8, gVar, self.hasVisitedStoreBecauseOfBag);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 9, r1Var, self.bagContentsDescription);
        output.r(serialDesc, 10, r1Var, self.extraPurchaseAmount);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RatingCategory getOverallExperience() {
        return this.overallExperience;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBagContentsDescription() {
        return this.bagContentsDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getExtraPurchaseAmount() {
        return this.extraPurchaseAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RatingCategory getCollectionExperience() {
        return this.collectionExperience;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RatingCategory getFoodQuality() {
        return this.foodQuality;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RatingCategory getContentsVariety() {
        return this.contentsVariety;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RatingCategory getFoodQuantity() {
        return this.foodQuantity;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RatingCategory getUspQuestion() {
        return this.uspQuestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getHasBoughtMoreOnPickup() {
        return this.hasBoughtMoreOnPickup;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getHasShoppedInStoreBefore() {
        return this.hasShoppedInStoreBefore;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getHasVisitedStoreBecauseOfBag() {
        return this.hasVisitedStoreBecauseOfBag;
    }

    @NotNull
    public final OrderRatingRequest copy(@NotNull RatingCategory overallExperience, @NotNull RatingCategory collectionExperience, @NotNull RatingCategory foodQuality, @NotNull RatingCategory contentsVariety, @NotNull RatingCategory foodQuantity, @NotNull RatingCategory uspQuestion, @Nullable Boolean hasBoughtMoreOnPickup, @Nullable Boolean hasShoppedInStoreBefore, @Nullable Boolean hasVisitedStoreBecauseOfBag, @Nullable String bagContentsDescription, @Nullable String extraPurchaseAmount) {
        overallExperience.getClass();
        collectionExperience.getClass();
        foodQuality.getClass();
        contentsVariety.getClass();
        foodQuantity.getClass();
        uspQuestion.getClass();
        return new OrderRatingRequest(overallExperience, collectionExperience, foodQuality, contentsVariety, foodQuantity, uspQuestion, hasBoughtMoreOnPickup, hasShoppedInStoreBefore, hasVisitedStoreBecauseOfBag, bagContentsDescription, extraPurchaseAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderRatingRequest)) {
            return false;
        }
        OrderRatingRequest orderRatingRequest = (OrderRatingRequest) other;
        return Intrinsics.areEqual(this.overallExperience, orderRatingRequest.overallExperience) && Intrinsics.areEqual(this.collectionExperience, orderRatingRequest.collectionExperience) && Intrinsics.areEqual(this.foodQuality, orderRatingRequest.foodQuality) && Intrinsics.areEqual(this.contentsVariety, orderRatingRequest.contentsVariety) && Intrinsics.areEqual(this.foodQuantity, orderRatingRequest.foodQuantity) && Intrinsics.areEqual(this.uspQuestion, orderRatingRequest.uspQuestion) && Intrinsics.areEqual(this.hasBoughtMoreOnPickup, orderRatingRequest.hasBoughtMoreOnPickup) && Intrinsics.areEqual(this.hasShoppedInStoreBefore, orderRatingRequest.hasShoppedInStoreBefore) && Intrinsics.areEqual(this.hasVisitedStoreBecauseOfBag, orderRatingRequest.hasVisitedStoreBecauseOfBag) && Intrinsics.areEqual(this.bagContentsDescription, orderRatingRequest.bagContentsDescription) && Intrinsics.areEqual(this.extraPurchaseAmount, orderRatingRequest.extraPurchaseAmount);
    }

    @Nullable
    public final String getBagContentsDescription() {
        return this.bagContentsDescription;
    }

    @NotNull
    public final RatingCategory getCollectionExperience() {
        return this.collectionExperience;
    }

    @NotNull
    public final RatingCategory getContentsVariety() {
        return this.contentsVariety;
    }

    @Nullable
    public final String getExtraPurchaseAmount() {
        return this.extraPurchaseAmount;
    }

    @NotNull
    public final RatingCategory getFoodQuality() {
        return this.foodQuality;
    }

    @NotNull
    public final RatingCategory getFoodQuantity() {
        return this.foodQuantity;
    }

    @Nullable
    public final Boolean getHasBoughtMoreOnPickup() {
        return this.hasBoughtMoreOnPickup;
    }

    @Nullable
    public final Boolean getHasShoppedInStoreBefore() {
        return this.hasShoppedInStoreBefore;
    }

    @Nullable
    public final Boolean getHasVisitedStoreBecauseOfBag() {
        return this.hasVisitedStoreBecauseOfBag;
    }

    @NotNull
    public final RatingCategory getOverallExperience() {
        return this.overallExperience;
    }

    @NotNull
    public final RatingCategory getUspQuestion() {
        return this.uspQuestion;
    }

    public int hashCode() {
        int iHashCode = (this.uspQuestion.hashCode() + ((this.foodQuantity.hashCode() + ((this.contentsVariety.hashCode() + ((this.foodQuality.hashCode() + ((this.collectionExperience.hashCode() + (this.overallExperience.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.hasBoughtMoreOnPickup;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasShoppedInStoreBefore;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasVisitedStoreBecauseOfBag;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.bagContentsDescription;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extraPurchaseAmount;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        RatingCategory ratingCategory = this.overallExperience;
        RatingCategory ratingCategory2 = this.collectionExperience;
        RatingCategory ratingCategory3 = this.foodQuality;
        RatingCategory ratingCategory4 = this.contentsVariety;
        RatingCategory ratingCategory5 = this.foodQuantity;
        RatingCategory ratingCategory6 = this.uspQuestion;
        Boolean bool = this.hasBoughtMoreOnPickup;
        Boolean bool2 = this.hasShoppedInStoreBefore;
        Boolean bool3 = this.hasVisitedStoreBecauseOfBag;
        String str = this.bagContentsDescription;
        String str2 = this.extraPurchaseAmount;
        StringBuilder sb2 = new StringBuilder("OrderRatingRequest(overallExperience=");
        sb2.append(ratingCategory);
        sb2.append(", collectionExperience=");
        sb2.append(ratingCategory2);
        sb2.append(", foodQuality=");
        sb2.append(ratingCategory3);
        sb2.append(", contentsVariety=");
        sb2.append(ratingCategory4);
        sb2.append(", foodQuantity=");
        sb2.append(ratingCategory5);
        sb2.append(", uspQuestion=");
        sb2.append(ratingCategory6);
        sb2.append(", hasBoughtMoreOnPickup=");
        sb2.append(bool);
        sb2.append(", hasShoppedInStoreBefore=");
        sb2.append(bool2);
        sb2.append(", hasVisitedStoreBecauseOfBag=");
        sb2.append(bool3);
        sb2.append(", bagContentsDescription=");
        sb2.append(str);
        sb2.append(", extraPurchaseAmount=");
        return k.p(sb2, str2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderRatingRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @i90.g("bag_contents_description")
    public static /* synthetic */ void getBagContentsDescription$annotations() {
    }

    @i90.g("collection_experience")
    public static /* synthetic */ void getCollectionExperience$annotations() {
    }

    @i90.g("contents_variety")
    public static /* synthetic */ void getContentsVariety$annotations() {
    }

    @i90.g("extra_purchase_amount")
    public static /* synthetic */ void getExtraPurchaseAmount$annotations() {
    }

    @i90.g("food_quality")
    public static /* synthetic */ void getFoodQuality$annotations() {
    }

    @i90.g("food_quantity")
    public static /* synthetic */ void getFoodQuantity$annotations() {
    }

    @i90.g("has_bought_more_on_pickup")
    public static /* synthetic */ void getHasBoughtMoreOnPickup$annotations() {
    }

    @i90.g("has_shopped_in_store_before")
    public static /* synthetic */ void getHasShoppedInStoreBefore$annotations() {
    }

    @i90.g("has_visited_store_because_of_bag")
    public static /* synthetic */ void getHasVisitedStoreBecauseOfBag$annotations() {
    }

    @i90.g("overall_experience")
    public static /* synthetic */ void getOverallExperience$annotations() {
    }

    @i90.g("usp_question")
    public static /* synthetic */ void getUspQuestion$annotations() {
    }

    public /* synthetic */ OrderRatingRequest(int i11, RatingCategory ratingCategory, RatingCategory ratingCategory2, RatingCategory ratingCategory3, RatingCategory ratingCategory4, RatingCategory ratingCategory5, RatingCategory ratingCategory6, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, m1 m1Var) {
        if (2047 != (i11 & 2047)) {
            c1.j(i11, 2047, OrderRatingRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.overallExperience = ratingCategory;
        this.collectionExperience = ratingCategory2;
        this.foodQuality = ratingCategory3;
        this.contentsVariety = ratingCategory4;
        this.foodQuantity = ratingCategory5;
        this.uspQuestion = ratingCategory6;
        this.hasBoughtMoreOnPickup = bool;
        this.hasShoppedInStoreBefore = bool2;
        this.hasVisitedStoreBecauseOfBag = bool3;
        this.bagContentsDescription = str;
        this.extraPurchaseAmount = str2;
    }
}
