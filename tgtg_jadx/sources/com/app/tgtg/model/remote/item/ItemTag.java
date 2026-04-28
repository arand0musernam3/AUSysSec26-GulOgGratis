package com.app.tgtg.model.remote.item;

import a80.a;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import lv.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b%\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B3\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemTag;", "", "Li4/v;", "textColor", "bgColor", "borderColor", "", "drawable", "<init>", "(Ljava/lang/String;IJJJLjava/lang/Integer;)V", "getTextColor-WaAFU9c", "(Lm3/n;I)J", "getTextColor", "getBgColor-WaAFU9c", "getBgColor", "J", "getTextColor-0d7_KjU", "()J", "getBgColor-0d7_KjU", "getBorderColor-0d7_KjU", "Ljava/lang/Integer;", "getDrawable", "()Ljava/lang/Integer;", "Companion", "NEW", "POPULAR", "GENERIC", "ENDING_SOON", "X_ITEMS_LEFT", "SOLD_OUT", "X_ITEMS_SOLD", "CHECK_AGAIN_LATER", "NOTHING_TO_SAVE_TODAY", "COLLECT_IN_X_DAYS", "SPECIAL_OFFER", "SPECIAL_OFFER_ICON", "FREE_DELIVERY", "VEGETARIAN", "VEGAN", "LOCAL_HERO", "DINE_IN", "BESTSELLER", "UNKNOWN", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h(with = ItemTagSerializer.class)
@SourceDebugExtension({"SMAP\nItemTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemTag.kt\ncom/app/tgtg/model/remote/item/ItemTag\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,104:1\n75#2:105\n75#2:106\n75#2:107\n75#2:108\n*S KotlinDebug\n*F\n+ 1 ItemTag.kt\ncom/app/tgtg/model/remote/item/ItemTag\n*L\n88#1:105\n89#1:106\n95#1:107\n96#1:108\n*E\n"})
public final class ItemTag {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ItemTag[] $VALUES;
    public static final ItemTag BESTSELLER;
    public static final ItemTag CHECK_AGAIN_LATER;
    public static final ItemTag COLLECT_IN_X_DAYS;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ItemTag DINE_IN;
    public static final ItemTag FREE_DELIVERY;
    public static final ItemTag LOCAL_HERO;
    public static final ItemTag NOTHING_TO_SAVE_TODAY;
    public static final ItemTag SOLD_OUT;
    public static final ItemTag SPECIAL_OFFER;
    public static final ItemTag SPECIAL_OFFER_ICON;
    public static final ItemTag UNKNOWN;
    public static final ItemTag VEGAN;
    public static final ItemTag VEGETARIAN;
    public static final ItemTag X_ITEMS_SOLD;
    private final long bgColor;
    private final long borderColor;

    @Nullable
    private final Integer drawable;
    private final long textColor;
    public static final ItemTag NEW = new ItemTag("NEW", 0, 0, 0, 0, Integer.valueOf(R.drawable.tag_new), 7, null);
    public static final ItemTag POPULAR = new ItemTag("POPULAR", 1, 0, 0, 0, Integer.valueOf(R.drawable.tag_popular), 7, null);
    public static final ItemTag GENERIC = new ItemTag("GENERIC", 2, 0, 0, 0, null, 15, null);
    public static final ItemTag ENDING_SOON = new ItemTag("ENDING_SOON", 3, 0, s.f28233n, s.f28232m, Integer.valueOf(R.drawable.tag_ending_soon), 1, null);
    public static final ItemTag X_ITEMS_LEFT = new ItemTag("X_ITEMS_LEFT", 4, 0, 0, 0, null, 15, null);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemTag.values().length];
            try {
                iArr[ItemTag.BESTSELLER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemTag.X_ITEMS_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ ItemTag[] $values() {
        return new ItemTag[]{NEW, POPULAR, GENERIC, ENDING_SOON, X_ITEMS_LEFT, SOLD_OUT, X_ITEMS_SOLD, CHECK_AGAIN_LATER, NOTHING_TO_SAVE_TODAY, COLLECT_IN_X_DAYS, SPECIAL_OFFER, SPECIAL_OFFER_ICON, FREE_DELIVERY, VEGETARIAN, VEGAN, LOCAL_HERO, DINE_IN, BESTSELLER, UNKNOWN};
    }

    static {
        long j9 = s.D;
        long j11 = s.I;
        Integer numValueOf = Integer.valueOf(R.drawable.tag_sold_out);
        SOLD_OUT = new ItemTag("SOLD_OUT", 5, j9, j11, 0L, numValueOf, 4, null);
        long j12 = s.C;
        X_ITEMS_SOLD = new ItemTag("X_ITEMS_SOLD", 6, j12, s.f28236q, 0L, null, 12, null);
        CHECK_AGAIN_LATER = new ItemTag("CHECK_AGAIN_LATER", 7, j9, j11, 0L, null, 12, null);
        NOTHING_TO_SAVE_TODAY = new ItemTag("NOTHING_TO_SAVE_TODAY", 8, j9, j11, 0L, numValueOf, 4, null);
        long j13 = s.f28215a;
        COLLECT_IN_X_DAYS = new ItemTag("COLLECT_IN_X_DAYS", 9, j13, j11, 0L, Integer.valueOf(R.drawable.tag_plan_ahead), 4, null);
        long j14 = s.f28228h;
        SPECIAL_OFFER = new ItemTag("SPECIAL_OFFER", 10, j12, j14, j14, null, 8, null);
        long j15 = s.J;
        SPECIAL_OFFER_ICON = new ItemTag("SPECIAL_OFFER_ICON", 11, j15, s.f28225f, 0L, null, 12, null);
        FREE_DELIVERY = new ItemTag("FREE_DELIVERY", 12, j15, j13, j13, null, 8, null);
        VEGETARIAN = new ItemTag("VEGETARIAN", 13, 0L, 0L, 0L, Integer.valueOf(R.drawable.tag_vegetarian), 7, null);
        VEGAN = new ItemTag("VEGAN", 14, 0L, 0L, 0L, Integer.valueOf(R.drawable.tag_vegan), 7, null);
        LOCAL_HERO = new ItemTag("LOCAL_HERO", 15, j12, s.f28229i, j14, Integer.valueOf(R.drawable.local_hero_blob_full));
        DINE_IN = new ItemTag("DINE_IN", 16, 0L, 0L, 0L, Integer.valueOf(R.drawable.blob_doodle_meal), 7, null);
        BESTSELLER = new ItemTag("BESTSELLER", 17, 0L, 0L, 0L, null, 15, null);
        UNKNOWN = new ItemTag("UNKNOWN", 18, 0L, 0L, 0L, null, 15, null);
        ItemTag[] itemTagArr$values = $values();
        $VALUES = itemTagArr$values;
        $ENTRIES = n.w(itemTagArr$values);
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemTag(String str, int i11, long j9, long j11, long j12, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        long j13;
        long j14;
        long j15;
        if ((i12 & 1) != 0) {
            int i13 = s.f28226f0;
            j13 = s.C;
        } else {
            j13 = j9;
        }
        if ((i12 & 2) != 0) {
            int i14 = s.f28226f0;
            j14 = s.I;
        } else {
            j14 = j11;
        }
        if ((i12 & 4) != 0) {
            int i15 = s.f28226f0;
            j15 = s.H;
        } else {
            j15 = j12;
        }
        this(str, i11, j13, j14, j15, (i12 & 8) != 0 ? null : num);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ItemTag valueOf(String str) {
        return (ItemTag) Enum.valueOf(ItemTag.class, str);
    }

    public static ItemTag[] values() {
        return (ItemTag[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getBgColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: getBgColor-WaAFU9c, reason: not valid java name */
    public final long m354getBgColorWaAFU9c(@Nullable m3.n nVar, int i11) {
        long j9;
        int i12 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i12 == 1) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(-2110702642);
            j9 = ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).f43913e;
            sVar.q(false);
        } else {
            if (i12 != 2) {
                m3.s sVar2 = (m3.s) nVar;
                sVar2.a0(-2110699198);
                sVar2.q(false);
                return this.bgColor;
            }
            m3.s sVar3 = (m3.s) nVar;
            sVar3.a0(-2110700431);
            j9 = ((x60.h) sVar3.j(PantryThemeKt.getLocalPantryColor())).f43949z;
            sVar3.q(false);
        }
        return j9;
    }

    /* JADX INFO: renamed from: getBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    @Nullable
    public final Integer getDrawable() {
        return this.drawable;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: getTextColor-WaAFU9c, reason: not valid java name */
    public final long m357getTextColorWaAFU9c(@Nullable m3.n nVar, int i11) {
        long j9;
        int i12 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i12 == 1) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(154009636);
            j9 = ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).U;
            sVar.q(false);
        } else {
            if (i12 != 2) {
                m3.s sVar2 = (m3.s) nVar;
                sVar2.a0(154012892);
                sVar2.q(false);
                return this.textColor;
            }
            m3.s sVar3 = (m3.s) nVar;
            sVar3.a0(154011781);
            j9 = ((x60.h) sVar3.j(PantryThemeKt.getLocalPantryColor())).X;
            sVar3.q(false);
        }
        return j9;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemTag$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/ItemTag;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemTagSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private ItemTag(String str, int i11, long j9, long j11, long j12, Integer num) {
        this.textColor = j9;
        this.bgColor = j11;
        this.borderColor = j12;
        this.drawable = num;
    }
}
