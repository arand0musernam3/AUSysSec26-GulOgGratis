package com.app.tgtg.model.remote.manufacturer.request;

import a80.a;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = ElementTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/ElementType;", "", "<init>", "(Ljava/lang/String;I)V", "BASKET_INTRO_BANNER", "ITEM", "HEADER", "HERO_CAROUSEL", "HIGHLIGHTED_ITEM", "HIGHLIGHTED_ITEM_CARDS_CAROUSEL", "ITEM_CARDS_CAROUSEL", "ITEM_CARDS_CAROUSEL_V2", "ITEM_V2", "MANUFACTURER_STORY_CARD", "NPS", "PARCEL_TEXT", "SEPARATOR", "SMALL_CARDS_CAROUSEL", "TEXT", "UNKNOWN", "TYPED_ITEM_CARDS_CAROUSEL", "INTRO_BANNER", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ElementType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ElementType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ElementType BASKET_INTRO_BANNER = new ElementType("BASKET_INTRO_BANNER", 0);
    public static final ElementType ITEM = new ElementType("ITEM", 1);
    public static final ElementType HEADER = new ElementType("HEADER", 2);
    public static final ElementType HERO_CAROUSEL = new ElementType("HERO_CAROUSEL", 3);
    public static final ElementType HIGHLIGHTED_ITEM = new ElementType("HIGHLIGHTED_ITEM", 4);
    public static final ElementType HIGHLIGHTED_ITEM_CARDS_CAROUSEL = new ElementType("HIGHLIGHTED_ITEM_CARDS_CAROUSEL", 5);
    public static final ElementType ITEM_CARDS_CAROUSEL = new ElementType("ITEM_CARDS_CAROUSEL", 6);
    public static final ElementType ITEM_CARDS_CAROUSEL_V2 = new ElementType("ITEM_CARDS_CAROUSEL_V2", 7);
    public static final ElementType ITEM_V2 = new ElementType("ITEM_V2", 8);
    public static final ElementType MANUFACTURER_STORY_CARD = new ElementType("MANUFACTURER_STORY_CARD", 9);
    public static final ElementType NPS = new ElementType("NPS", 10);
    public static final ElementType PARCEL_TEXT = new ElementType("PARCEL_TEXT", 11);
    public static final ElementType SEPARATOR = new ElementType("SEPARATOR", 12);
    public static final ElementType SMALL_CARDS_CAROUSEL = new ElementType("SMALL_CARDS_CAROUSEL", 13);
    public static final ElementType TEXT = new ElementType("TEXT", 14);
    public static final ElementType UNKNOWN = new ElementType("UNKNOWN", 15);
    public static final ElementType TYPED_ITEM_CARDS_CAROUSEL = new ElementType("TYPED_ITEM_CARDS_CAROUSEL", 16);
    public static final ElementType INTRO_BANNER = new ElementType("INTRO_BANNER", 17);

    private static final /* synthetic */ ElementType[] $values() {
        return new ElementType[]{BASKET_INTRO_BANNER, ITEM, HEADER, HERO_CAROUSEL, HIGHLIGHTED_ITEM, HIGHLIGHTED_ITEM_CARDS_CAROUSEL, ITEM_CARDS_CAROUSEL, ITEM_CARDS_CAROUSEL_V2, ITEM_V2, MANUFACTURER_STORY_CARD, NPS, PARCEL_TEXT, SEPARATOR, SMALL_CARDS_CAROUSEL, TEXT, UNKNOWN, TYPED_ITEM_CARDS_CAROUSEL, INTRO_BANNER};
    }

    static {
        ElementType[] elementTypeArr$values = $values();
        $VALUES = elementTypeArr$values;
        $ENTRIES = n.w(elementTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ElementType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ElementType valueOf(String str) {
        return (ElementType) Enum.valueOf(ElementType.class, str);
    }

    public static ElementType[] values() {
        return (ElementType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/ElementType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/ElementType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ElementTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
