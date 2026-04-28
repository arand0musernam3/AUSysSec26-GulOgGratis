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
@h(with = AdapterItemTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "", "<init>", "(Ljava/lang/String;I)V", "BASKET_INTRO_BANNER", "GROUP_HEADER", "HEADER", "HERO_CAROUSEL", "HIGHLIGHTED_ITEM", "HIGHLIGHTED_ITEM_CARDS_CAROUSEL", "ITEM", "ITEM_V2", "ITEM_CARDS_CAROUSEL", "ITEM_CARDS_CAROUSEL_V2", "MANUFACTURER_STORY_CARD", "NPS", "PARCEL_TEXT", "SEPARATOR", "SMALL_CARDS_CAROUSEL", "TEXT", "TYPED_ITEM_CARDS_CAROUSEL", "INTRO_BANNER", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdapterItemType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdapterItemType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AdapterItemType BASKET_INTRO_BANNER = new AdapterItemType("BASKET_INTRO_BANNER", 0);
    public static final AdapterItemType GROUP_HEADER = new AdapterItemType("GROUP_HEADER", 1);
    public static final AdapterItemType HEADER = new AdapterItemType("HEADER", 2);
    public static final AdapterItemType HERO_CAROUSEL = new AdapterItemType("HERO_CAROUSEL", 3);
    public static final AdapterItemType HIGHLIGHTED_ITEM = new AdapterItemType("HIGHLIGHTED_ITEM", 4);
    public static final AdapterItemType HIGHLIGHTED_ITEM_CARDS_CAROUSEL = new AdapterItemType("HIGHLIGHTED_ITEM_CARDS_CAROUSEL", 5);
    public static final AdapterItemType ITEM = new AdapterItemType("ITEM", 6);
    public static final AdapterItemType ITEM_V2 = new AdapterItemType("ITEM_V2", 7);
    public static final AdapterItemType ITEM_CARDS_CAROUSEL = new AdapterItemType("ITEM_CARDS_CAROUSEL", 8);
    public static final AdapterItemType ITEM_CARDS_CAROUSEL_V2 = new AdapterItemType("ITEM_CARDS_CAROUSEL_V2", 9);
    public static final AdapterItemType MANUFACTURER_STORY_CARD = new AdapterItemType("MANUFACTURER_STORY_CARD", 10);
    public static final AdapterItemType NPS = new AdapterItemType("NPS", 11);
    public static final AdapterItemType PARCEL_TEXT = new AdapterItemType("PARCEL_TEXT", 12);
    public static final AdapterItemType SEPARATOR = new AdapterItemType("SEPARATOR", 13);
    public static final AdapterItemType SMALL_CARDS_CAROUSEL = new AdapterItemType("SMALL_CARDS_CAROUSEL", 14);
    public static final AdapterItemType TEXT = new AdapterItemType("TEXT", 15);
    public static final AdapterItemType TYPED_ITEM_CARDS_CAROUSEL = new AdapterItemType("TYPED_ITEM_CARDS_CAROUSEL", 16);
    public static final AdapterItemType INTRO_BANNER = new AdapterItemType("INTRO_BANNER", 17);
    public static final AdapterItemType UNKNOWN = new AdapterItemType("UNKNOWN", 18);

    private static final /* synthetic */ AdapterItemType[] $values() {
        return new AdapterItemType[]{BASKET_INTRO_BANNER, GROUP_HEADER, HEADER, HERO_CAROUSEL, HIGHLIGHTED_ITEM, HIGHLIGHTED_ITEM_CARDS_CAROUSEL, ITEM, ITEM_V2, ITEM_CARDS_CAROUSEL, ITEM_CARDS_CAROUSEL_V2, MANUFACTURER_STORY_CARD, NPS, PARCEL_TEXT, SEPARATOR, SMALL_CARDS_CAROUSEL, TEXT, TYPED_ITEM_CARDS_CAROUSEL, INTRO_BANNER, UNKNOWN};
    }

    static {
        AdapterItemType[] adapterItemTypeArr$values = $values();
        $VALUES = adapterItemTypeArr$values;
        $ENTRIES = n.w(adapterItemTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private AdapterItemType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AdapterItemType valueOf(String str) {
        return (AdapterItemType) Enum.valueOf(AdapterItemType.class, str);
    }

    public static AdapterItemType[] values() {
        return (AdapterItemType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AdapterItemTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
