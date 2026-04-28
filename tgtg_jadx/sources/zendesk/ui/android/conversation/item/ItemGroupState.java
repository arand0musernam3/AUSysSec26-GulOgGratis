package zendesk.ui.android.conversation.item;

import b3.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÀ\u0003¢\u0006\u0002\b\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b\u0015\u0010\rJ:\u0010\u0016\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001e\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversation/item/ItemGroupState;", "", "items", "", "Lzendesk/ui/android/conversation/item/Item;", "titleColor", "", "pressedColor", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getItems$zendesk_ui_ui_android", "()Ljava/util/List;", "getTitleColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPressedColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/ui/android/conversation/item/ItemGroupState;", "equals", "", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ItemGroupState {
    public static final int $stable = 8;

    @NotNull
    private final List<Item<?>> items;

    @Nullable
    private final Integer pressedColor;

    @Nullable
    private final Integer titleColor;

    public ItemGroupState(List list, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemGroupState copy$default(ItemGroupState itemGroupState, List list, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = itemGroupState.items;
        }
        if ((i11 & 2) != 0) {
            num = itemGroupState.titleColor;
        }
        if ((i11 & 4) != 0) {
            num2 = itemGroupState.pressedColor;
        }
        return itemGroupState.copy(list, num, num2);
    }

    @NotNull
    public final List<Item<?>> component1$zendesk_ui_ui_android() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final Integer getPressedColor() {
        return this.pressedColor;
    }

    @NotNull
    public final ItemGroupState copy(@NotNull List<? extends Item<?>> items, @Nullable Integer titleColor, @Nullable Integer pressedColor) {
        items.getClass();
        return new ItemGroupState(items, titleColor, pressedColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemGroupState)) {
            return false;
        }
        ItemGroupState itemGroupState = (ItemGroupState) other;
        return Intrinsics.areEqual(this.items, itemGroupState.items) && Intrinsics.areEqual(this.titleColor, itemGroupState.titleColor) && Intrinsics.areEqual(this.pressedColor, itemGroupState.pressedColor);
    }

    @NotNull
    public final List<Item<?>> getItems$zendesk_ui_ui_android() {
        return this.items;
    }

    @Nullable
    public final Integer getPressedColor$zendesk_ui_ui_android() {
        return this.pressedColor;
    }

    @Nullable
    public final Integer getTitleColor$zendesk_ui_ui_android() {
        return this.titleColor;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        Integer num = this.titleColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pressedColor;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Item<?>> list = this.items;
        Integer num = this.titleColor;
        Integer num2 = this.pressedColor;
        StringBuilder sb2 = new StringBuilder("ItemGroupState(items=");
        sb2.append(list);
        sb2.append(", titleColor=");
        sb2.append(num);
        sb2.append(", pressedColor=");
        return i.m(sb2, num2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemGroupState(@NotNull List<? extends Item<?>> list, @Nullable Integer num, @Nullable Integer num2) {
        list.getClass();
        this.items = list;
        this.titleColor = num;
        this.pressedColor = num2;
    }

    public ItemGroupState() {
        this(null, null, null, 7, null);
    }
}
