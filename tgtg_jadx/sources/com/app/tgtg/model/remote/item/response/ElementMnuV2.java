package com.app.tgtg.model.remote.item.response;

import android.os.Parcelable;
import cg.e;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import i90.f;
import i90.h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getElementType", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "elementType", "Companion", "Lcom/app/tgtg/model/remote/item/response/BasketIntroBannerMnu;", "Lcom/app/tgtg/model/remote/item/response/CategoryCarouselMnuV2;", "Lcom/app/tgtg/model/remote/item/response/GroupHeaderMnuV2;", "Lcom/app/tgtg/model/remote/item/response/HeaderItem;", "Lcom/app/tgtg/model/remote/item/response/HeroCarouselMnu;", "Lcom/app/tgtg/model/remote/item/response/HighlightedItemCardsCarouselMnuV2;", "Lcom/app/tgtg/model/remote/item/response/HighlightedItemMnuV2;", "Lcom/app/tgtg/model/remote/item/response/InfoMnuV2;", "Lcom/app/tgtg/model/remote/item/response/IntroBanner;", "Lcom/app/tgtg/model/remote/item/response/ItemCarouselMnu;", "Lcom/app/tgtg/model/remote/item/response/ItemCarouselMnuV2;", "Lcom/app/tgtg/model/remote/item/response/ItemMnu;", "Lcom/app/tgtg/model/remote/item/response/ItemMnuV2;", "Lcom/app/tgtg/model/remote/item/response/NpsMnuV2;", "Lcom/app/tgtg/model/remote/item/response/SeparatorItem;", "Lcom/app/tgtg/model/remote/item/response/TextMnu;", "Lcom/app/tgtg/model/remote/item/response/TextMnuV2;", "Lcom/app/tgtg/model/remote/item/response/TypedItemCardsCarouselMnu;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class ElementMnuV2 implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j $cachedSerializer$delegate = l.a(m.PUBLICATION, new e(19));

    public /* synthetic */ ElementMnuV2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new f("com.app.tgtg.model.remote.item.response.ElementMnuV2", Reflection.getOrCreateKotlinClass(ElementMnuV2.class), new KClass[]{Reflection.getOrCreateKotlinClass(BasketIntroBannerMnu.class), Reflection.getOrCreateKotlinClass(CategoryCarouselMnuV2.class), Reflection.getOrCreateKotlinClass(HeaderItem.class), Reflection.getOrCreateKotlinClass(HeroCarouselMnu.class), Reflection.getOrCreateKotlinClass(HighlightedItemCardsCarouselMnuV2.class), Reflection.getOrCreateKotlinClass(HighlightedItemMnuV2.class), Reflection.getOrCreateKotlinClass(InfoMnuV2.class), Reflection.getOrCreateKotlinClass(IntroBanner.class), Reflection.getOrCreateKotlinClass(ItemCarouselMnu.class), Reflection.getOrCreateKotlinClass(ItemCarouselMnuV2.class), Reflection.getOrCreateKotlinClass(ItemMnu.class), Reflection.getOrCreateKotlinClass(ItemMnuV2.class), Reflection.getOrCreateKotlinClass(NpsMnuV2.class), Reflection.getOrCreateKotlinClass(SeparatorItem.class), Reflection.getOrCreateKotlinClass(TextMnu.class), Reflection.getOrCreateKotlinClass(TextMnuV2.class), Reflection.getOrCreateKotlinClass(TypedItemCardsCarouselMnu.class)}, new KSerializer[]{BasketIntroBannerMnu$$serializer.INSTANCE, CategoryCarouselMnuV2$$serializer.INSTANCE, HeaderItem$$serializer.INSTANCE, HeroCarouselMnu$$serializer.INSTANCE, HighlightedItemCardsCarouselMnuV2$$serializer.INSTANCE, HighlightedItemMnuV2$$serializer.INSTANCE, InfoMnuV2$$serializer.INSTANCE, IntroBanner$$serializer.INSTANCE, ItemCarouselMnu$$serializer.INSTANCE, ItemCarouselMnuV2$$serializer.INSTANCE, ItemMnu$$serializer.INSTANCE, ItemMnuV2$$serializer.INSTANCE, NpsMnuV2$$serializer.INSTANCE, SeparatorItem$$serializer.INSTANCE, TextMnu$$serializer.INSTANCE, TextMnuV2$$serializer.INSTANCE, TypedItemCardsCarouselMnu$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Nullable
    public abstract AdapterItemType getElementType();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/ElementMnuV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ElementMnuV2.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private ElementMnuV2() {
    }

    public /* synthetic */ ElementMnuV2(int i11, m1 m1Var) {
    }

    public static final /* synthetic */ void write$Self(ElementMnuV2 self, b output, SerialDescriptor serialDesc) {
    }
}
