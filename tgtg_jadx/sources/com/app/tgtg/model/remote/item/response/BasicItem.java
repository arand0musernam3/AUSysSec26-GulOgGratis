package com.app.tgtg.model.remote.item.response;

import android.os.Parcelable;
import cg.e;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.Ingredients;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupLocation;
import com.app.tgtg.model.remote.item.StoreInformation;
import i90.d;
import i90.f;
import i90.h;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import n90.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i(discriminator = "item_type")
@h
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0001oB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0003\u0010\rJ'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R6\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u0015\u0012\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u00020\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010)\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001e\u00107\u001a\u0004\u0018\u0001028&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010;\u001a\u0004\u0018\u00010\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010:R\u001e\u0010>\u001a\u0004\u0018\u00010\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010:R\u001c\u0010C\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010F\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u001e\u0010I\u001a\u0004\u0018\u00010\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010\u001d\"\u0004\bH\u0010:R\u001c\u0010L\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u0010&\"\u0004\bK\u0010(R\u001e\u0010O\u001a\u0004\u0018\u00010\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u0010\u001d\"\u0004\bN\u0010:R\u001c\u0010U\u001a\u00020P8&@&X¦\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010[\u001a\u0004\u0018\u00010V8&@&X¦\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001c\u0010^\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010@\"\u0004\b]\u0010BR\u001c\u0010c\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0016\u0010g\u001a\u0004\u0018\u00010d8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010k\u001a\u0004\u0018\u00010h8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010n\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m\u0082\u0001\u0006pqrstu¨\u0006v"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/BasicItem;", "Landroid/os/Parcelable;", "Lmq/a;", "<init>", "()V", "", "seen0", "Lkotlin/Function1;", "", "", "onFavoriteChangedListener", "Lm90/m1;", "serializationConstructorMarker", "(ILkotlin/jvm/functions/Function1;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self", "(Lcom/app/tgtg/model/remote/item/response/BasicItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlin/jvm/functions/Function1;", "getOnFavoriteChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "getOnFavoriteChangedListener$annotations", "", "getDisplayName", "()Ljava/lang/String;", "displayName", "", "getDistance", "()D", "setDistance", "(D)V", "distance", "getItemsAvailable", "()I", "setItemsAvailable", "(I)V", "itemsAvailable", "Lcom/app/tgtg/model/remote/item/BasicItemInformation;", "getInformation", "()Lcom/app/tgtg/model/remote/item/BasicItemInformation;", "information", "Lcom/app/tgtg/model/remote/item/PickupLocation;", "getPickupLocation", "()Lcom/app/tgtg/model/remote/item/PickupLocation;", "pickupLocation", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "getPickupIntervalOrNull", "()Lcom/app/tgtg/model/remote/item/PickupInterval;", "setPickupIntervalOrNull", "(Lcom/app/tgtg/model/remote/item/PickupInterval;)V", "pickupIntervalOrNull", "getPurchaseEnd", "setPurchaseEnd", "(Ljava/lang/String;)V", "purchaseEnd", "getSoldOutAt", "setSoldOutAt", "soldOutAt", "getFavorite", "()Z", "setFavorite", "(Z)V", "favorite", "getSubscribedForNotification", "setSubscribedForNotification", "subscribedForNotification", "getSharingUrl", "setSharingUrl", "sharingUrl", "getUserPurchaseLimit", "setUserPurchaseLimit", "userPurchaseLimit", "getNextSalesWindowPurchaseStart", "setNextSalesWindowPurchaseStart", "nextSalesWindowPurchaseStart", "Lcom/app/tgtg/model/remote/item/response/ItemType;", "getItemType", "()Lcom/app/tgtg/model/remote/item/response/ItemType;", "setItemType", "(Lcom/app/tgtg/model/remote/item/response/ItemType;)V", "itemType", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "getStoreInfoOrNull", "()Lcom/app/tgtg/model/remote/item/StoreInformation;", "setStoreInfoOrNull", "(Lcom/app/tgtg/model/remote/item/StoreInformation;)V", "storeInfoOrNull", "getItemIsNew", "setItemIsNew", "itemIsNew", "", "Lcom/app/tgtg/model/remote/item/ItemTagInfo;", "getItemTags", "()Ljava/util/List;", "itemTags", "Lcom/app/tgtg/model/remote/item/ItemCardType;", "getItemCardType", "()Lcom/app/tgtg/model/remote/item/ItemCardType;", "itemCardType", "Lcom/app/tgtg/model/remote/item/Ingredients;", "getIngredients", "()Lcom/app/tgtg/model/remote/item/Ingredients;", "ingredients", "getMatchesFilters", "()Ljava/lang/Boolean;", "matchesFilters", "Companion", "Lcom/app/tgtg/model/remote/item/response/CateringItem;", "Lcom/app/tgtg/model/remote/item/response/CharityItem;", "Lcom/app/tgtg/model/remote/item/response/FlashSalesItem;", "Lcom/app/tgtg/model/remote/item/response/Item;", "Lcom/app/tgtg/model/remote/item/response/ManufacturerItem;", "Lcom/app/tgtg/model/remote/item/response/TableReservationItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BasicItem implements Parcelable, mq.a {

    @NotNull
    private static final j $cachedSerializer$delegate;

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private Function1<? super Boolean, Unit> onFavoriteChangedListener;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new e(12))};
        $cachedSerializer$delegate = l.a(mVar, new e(13));
    }

    public /* synthetic */ BasicItem(int i11, Function1 function1, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.onFavoriteChangedListener = null;
        } else {
            this.onFavoriteChangedListener = function1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Reflection.getOrCreateKotlinClass(Function1.class), new Annotation[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("com.app.tgtg.model.remote.item.response.BasicItem", Reflection.getOrCreateKotlinClass(BasicItem.class), new KClass[]{Reflection.getOrCreateKotlinClass(CateringItem.class), Reflection.getOrCreateKotlinClass(CharityItem.class), Reflection.getOrCreateKotlinClass(FlashSalesItem.class), Reflection.getOrCreateKotlinClass(Item.class), Reflection.getOrCreateKotlinClass(ManufacturerItem.class), Reflection.getOrCreateKotlinClass(TableReservationItem.class)}, new KSerializer[]{CateringItem$$serializer.INSTANCE, CharityItem$$serializer.INSTANCE, FlashSalesItem$$serializer.INSTANCE, Item$$serializer.INSTANCE, ManufacturerItem$$serializer.INSTANCE, TableReservationItem$$serializer.INSTANCE}, new Annotation[]{new BasicItem$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("item_type")});
    }

    public static final /* synthetic */ void write$Self(BasicItem self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (!output.C(serialDesc) && self.onFavoriteChangedListener == null) {
            return;
        }
        output.r(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.onFavoriteChangedListener);
    }

    @Override // mq.a
    public abstract /* synthetic */ boolean displayedParametersAreEqual(@NotNull Object obj);

    @NotNull
    public abstract String getDisplayName();

    public abstract double getDistance();

    public abstract boolean getFavorite();

    @NotNull
    public abstract BasicItemInformation getInformation();

    @Nullable
    public abstract Ingredients getIngredients();

    @Nullable
    public abstract ItemCardType getItemCardType();

    public abstract boolean getItemIsNew();

    @Nullable
    public abstract List<ItemTagInfo> getItemTags();

    @NotNull
    public abstract ItemType getItemType();

    public abstract int getItemsAvailable();

    @Nullable
    public abstract Boolean getMatchesFilters();

    @Nullable
    public abstract String getNextSalesWindowPurchaseStart();

    @Nullable
    public final Function1<Boolean, Unit> getOnFavoriteChangedListener() {
        return this.onFavoriteChangedListener;
    }

    @Nullable
    public abstract PickupInterval getPickupIntervalOrNull();

    @NotNull
    public abstract PickupLocation getPickupLocation();

    @Nullable
    public abstract String getPurchaseEnd();

    @Nullable
    public abstract String getSharingUrl();

    @Nullable
    public abstract String getSoldOutAt();

    @Nullable
    public abstract StoreInformation getStoreInfoOrNull();

    public abstract boolean getSubscribedForNotification();

    public abstract int getUserPurchaseLimit();

    public abstract void setDistance(double d3);

    public abstract void setFavorite(boolean z11);

    public abstract void setItemIsNew(boolean z11);

    public abstract void setItemType(@NotNull ItemType itemType);

    public abstract void setItemsAvailable(int i11);

    public abstract void setNextSalesWindowPurchaseStart(@Nullable String str);

    public final void setOnFavoriteChangedListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onFavoriteChangedListener = function1;
    }

    public abstract void setPickupIntervalOrNull(@Nullable PickupInterval pickupInterval);

    public abstract void setPurchaseEnd(@Nullable String str);

    public abstract void setSharingUrl(@Nullable String str);

    public abstract void setSoldOutAt(@Nullable String str);

    public abstract void setStoreInfoOrNull(@Nullable StoreInformation storeInformation);

    public abstract void setSubscribedForNotification(boolean z11);

    public abstract void setUserPurchaseLimit(int i11);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/BasicItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) BasicItem.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private BasicItem() {
    }

    public /* synthetic */ BasicItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getOnFavoriteChangedListener$annotations() {
    }
}
