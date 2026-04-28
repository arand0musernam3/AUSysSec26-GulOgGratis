package zendesk.ui.android.conversation.item;

import b3.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u0014\u0010\fJ4\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001d"}, d2 = {"Lzendesk/ui/android/conversation/item/ItemState;", "", "item", "Lzendesk/ui/android/conversation/item/Item;", "titleColor", "", "pressedColor", "<init>", "(Lzendesk/ui/android/conversation/item/Item;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getItem$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/item/Item;", "getTitleColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPressedColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "copy", "(Lzendesk/ui/android/conversation/item/Item;Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/ui/android/conversation/item/ItemState;", "equals", "", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ItemState {
    public static final int $stable = 8;

    @NotNull
    private final Item<?> item;

    @Nullable
    private final Integer pressedColor;

    @Nullable
    private final Integer titleColor;

    public /* synthetic */ ItemState(Item item, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Item(null, null, null, null, null, 31, null) : item, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemState copy$default(ItemState itemState, Item item, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            item = itemState.item;
        }
        if ((i11 & 2) != 0) {
            num = itemState.titleColor;
        }
        if ((i11 & 4) != 0) {
            num2 = itemState.pressedColor;
        }
        return itemState.copy(item, num, num2);
    }

    @NotNull
    public final Item<?> component1$zendesk_ui_ui_android() {
        return this.item;
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
    public final ItemState copy(@NotNull Item<?> item, @Nullable Integer titleColor, @Nullable Integer pressedColor) {
        item.getClass();
        return new ItemState(item, titleColor, pressedColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemState)) {
            return false;
        }
        ItemState itemState = (ItemState) other;
        return Intrinsics.areEqual(this.item, itemState.item) && Intrinsics.areEqual(this.titleColor, itemState.titleColor) && Intrinsics.areEqual(this.pressedColor, itemState.pressedColor);
    }

    @NotNull
    public final Item<?> getItem$zendesk_ui_ui_android() {
        return this.item;
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
        int iHashCode = this.item.hashCode() * 31;
        Integer num = this.titleColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pressedColor;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Item<?> item = this.item;
        Integer num = this.titleColor;
        Integer num2 = this.pressedColor;
        StringBuilder sb2 = new StringBuilder("ItemState(item=");
        sb2.append(item);
        sb2.append(", titleColor=");
        sb2.append(num);
        sb2.append(", pressedColor=");
        return i.m(sb2, num2, ")");
    }

    public ItemState(@NotNull Item<?> item, @Nullable Integer num, @Nullable Integer num2) {
        item.getClass();
        this.item = item;
        this.titleColor = num;
        this.pressedColor = num2;
    }

    public ItemState() {
        this(null, null, null, 7, null);
    }
}
