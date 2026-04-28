package com.app.tgtg.model.remote.item;

import android.os.Parcelable;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import com.app.tgtg.model.remote.payment.Price;
import com.braze.ui.inappmessage.views.a;
import i90.f;
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
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 U2\u00020\u0001:\u0001UB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010&\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0014\u0010(\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000bR\u0016\u0010*\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000bR\u0016\u0010,\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001cR\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001e018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u0001018&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u00103R\u0016\u0010>\u001a\u0004\u0018\u00010;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010F\u001a\u0004\u0018\u00010C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u000bR\u0016\u0010J\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010 R\u0016\u0010L\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010 R\u0016\u0010N\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010 R\u0014\u0010O\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010R\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bQ\u0010\u001cR\u0011\u0010T\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bS\u0010\u001c\u0082\u0001\u0005VWXYZ¨\u0006["}, d2 = {"Lcom/app/tgtg/model/remote/item/BasicItemInformation;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILm90/m1;)V", "Lcom/app/tgtg/model/remote/payment/Price;", "getDisplayPrice", "()Lcom/app/tgtg/model/remote/payment/Price;", "getDisplayValue", "", "o", "", "displayedParametersAreEqual", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/app/tgtg/model/remote/item/BasicItemInformation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/app/tgtg/model/remote/item/Picture;", "getCoverPicture_", "()Lcom/app/tgtg/model/remote/item/Picture;", "coverPicture_", "", "getName", "()Ljava/lang/String;", "name", "getDescription", "description", "Lcom/app/tgtg/model/remote/ItemId;", "getItemId-FvU5WIY", "itemId", "getItemPrice", "itemPrice", "getItemValue", "itemValue", "getLogoPicture_", "logoPicture_", "Lcom/app/tgtg/model/remote/item/ItemCategory;", "getItemCategory", "()Lcom/app/tgtg/model/remote/item/ItemCategory;", "itemCategory", "", "getDietCategories", "()Ljava/util/List;", "dietCategories", "Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "getPackagingOption", "()Lcom/app/tgtg/model/remote/item/response/PackagingOptions;", "packagingOption", "getPositiveRatingReasons", "positiveRatingReasons", "Lcom/app/tgtg/model/remote/item/AverageItemRating;", "getAverageItemRating", "()Lcom/app/tgtg/model/remote/item/AverageItemRating;", "averageItemRating", "Lcom/app/tgtg/model/remote/item/response/AllergensInfo;", "getAllergensInfo", "()Lcom/app/tgtg/model/remote/item/response/AllergensInfo;", "allergensInfo", "Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;", "getDynamicPriceInfo", "()Lcom/app/tgtg/model/remote/item/DynamicPriceInfo;", "dynamicPriceInfo", "getSoldOutAtDynamicItemPrice", "soldOutAtDynamicItemPrice", "getDescriptionTranslated", "descriptionTranslated", "getCollectionInfo", "collectionInfo", "getSmileyReportLink", "smileyReportLink", "isEdible", "()Z", "getCoverPicture", "coverPicture", "getLogoPicture", "logoPicture", "Companion", "Lcom/app/tgtg/model/remote/item/CateringItemInformation;", "Lcom/app/tgtg/model/remote/item/CharityItemInformation;", "Lcom/app/tgtg/model/remote/item/FlashSalesItemInformation;", "Lcom/app/tgtg/model/remote/item/MagicBagItemInformation;", "Lcom/app/tgtg/model/remote/item/ManufacturerItemInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BasicItemInformation implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j $cachedSerializer$delegate = l.a(m.PUBLICATION, new a(19));

    public /* synthetic */ BasicItemInformation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("com.app.tgtg.model.remote.item.BasicItemInformation", Reflection.getOrCreateKotlinClass(BasicItemInformation.class), new KClass[]{Reflection.getOrCreateKotlinClass(CateringItemInformation.class), Reflection.getOrCreateKotlinClass(CharityItemInformation.class), Reflection.getOrCreateKotlinClass(FlashSalesItemInformation.class), Reflection.getOrCreateKotlinClass(MagicBagItemInformation.class), Reflection.getOrCreateKotlinClass(ManufacturerItemInformation.class)}, new KSerializer[]{CateringItemInformation$$serializer.INSTANCE, CharityItemInformation$$serializer.INSTANCE, FlashSalesItemInformation$$serializer.INSTANCE, MagicBagItemInformation$$serializer.INSTANCE, ManufacturerItemInformation$$serializer.INSTANCE}, new Annotation[0]);
    }

    public final boolean displayedParametersAreEqual(@NotNull Object o11) {
        o11.getClass();
        if (this == o11) {
            return true;
        }
        if (!(o11 instanceof BasicItemInformation)) {
            return false;
        }
        BasicItemInformation basicItemInformation = (BasicItemInformation) o11;
        return getCoverPicture().displayedParametersAreEqual(basicItemInformation.getCoverPicture()) && Intrinsics.areEqual(getDisplayPrice(), basicItemInformation.getDisplayPrice());
    }

    @Nullable
    public abstract AllergensInfo getAllergensInfo();

    @Nullable
    public abstract AverageItemRating getAverageItemRating();

    @Nullable
    public abstract String getCollectionInfo();

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Picture getCoverPicture() {
        Picture coverPicture_ = getCoverPicture_();
        if (coverPicture_ != null) {
            return coverPicture_;
        }
        return new Picture((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @Nullable
    public abstract Picture getCoverPicture_();

    @Nullable
    public abstract String getDescription();

    @Nullable
    public abstract String getDescriptionTranslated();

    @NotNull
    public abstract List<String> getDietCategories();

    @NotNull
    public final Price getDisplayPrice() {
        Price soldOutAtDynamicItemPrice = getSoldOutAtDynamicItemPrice();
        return soldOutAtDynamicItemPrice == null ? getItemPrice() : soldOutAtDynamicItemPrice;
    }

    @Nullable
    public final Price getDisplayValue() {
        return getItemValue();
    }

    @Nullable
    public abstract DynamicPriceInfo getDynamicPriceInfo();

    @NotNull
    public abstract ItemCategory getItemCategory();

    @NotNull
    /* JADX INFO: renamed from: getItemId-FvU5WIY, reason: not valid java name */
    public abstract String mo340getItemIdFvU5WIY();

    @NotNull
    public abstract Price getItemPrice();

    @Nullable
    public abstract Price getItemValue();

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Picture getLogoPicture() {
        Picture logoPicture_ = getLogoPicture_();
        if (logoPicture_ != null) {
            return logoPicture_;
        }
        return new Picture((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @Nullable
    public abstract Picture getLogoPicture_();

    @Nullable
    public abstract String getName();

    @NotNull
    public abstract PackagingOptions getPackagingOption();

    @Nullable
    public abstract List<String> getPositiveRatingReasons();

    @Nullable
    public abstract String getSmileyReportLink();

    @Nullable
    public abstract Price getSoldOutAtDynamicItemPrice();

    public abstract boolean isEdible();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/BasicItemInformation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/BasicItemInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) BasicItemInformation.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private BasicItemInformation() {
    }

    public /* synthetic */ BasicItemInformation(int i11, m1 m1Var) {
    }

    public static final /* synthetic */ void write$Self(BasicItemInformation self, b output, SerialDescriptor serialDesc) {
    }
}
