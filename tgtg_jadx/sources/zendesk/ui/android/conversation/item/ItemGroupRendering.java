package zendesk.ui.android.conversation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0003R0\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\b\u0012\u0002\b\u0003\u0018\u0001`\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversation/item/ItemGroupRendering;", "", "builder", "Lzendesk/ui/android/conversation/item/ItemGroupRendering$Builder;", "<init>", "(Lzendesk/ui/android/conversation/item/ItemGroupRendering$Builder;)V", "()V", "onItemClicked", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/item/Item;", "", "Lzendesk/ui/android/conversation/item/OnClickLambda;", "getOnItemClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "state", "Lzendesk/ui/android/conversation/item/ItemGroupState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/item/ItemGroupState;", "toBuilder", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ItemGroupRendering {
    public static final int $stable = 8;

    @Nullable
    private final Function1<Item<?>, Unit> onItemClicked;

    @NotNull
    private final ItemGroupState state;

    public ItemGroupRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onItemClicked = builder.getOnItemClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @Nullable
    public final Function1<Item<?>, Unit> getOnItemClicked$zendesk_ui_ui_android() {
        return this.onItemClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ItemGroupState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J4\u0010\u0007\u001a\u00020\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00012\"\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\t\u0012\u0004\u0012\u00020\n0\bj\b\u0012\u0004\u0012\u0002H\u0016`\u000bJ\u001a\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\bJ\u0006\u0010\u0018\u001a\u00020\u0005R6\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\b\u0012\u0002\b\u0003\u0018\u0001`\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lzendesk/ui/android/conversation/item/ItemGroupRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/conversation/item/ItemGroupRendering;", "(Lzendesk/ui/android/conversation/item/ItemGroupRendering;)V", "onItemClicked", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/item/Item;", "", "Lzendesk/ui/android/conversation/item/OnClickLambda;", "getOnItemClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setOnItemClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "state", "Lzendesk/ui/android/conversation/item/ItemGroupState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/item/ItemGroupState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/item/ItemGroupState;)V", "T", "stateUpdate", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private Function1<? super Item<?>, Unit> onItemClicked;

        @NotNull
        private ItemGroupState state;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ItemGroupRendering itemGroupRendering) {
            this();
            itemGroupRendering.getClass();
            this.onItemClicked = itemGroupRendering.getOnItemClicked$zendesk_ui_ui_android();
            this.state = itemGroupRendering.getState();
        }

        @NotNull
        public final ItemGroupRendering build() {
            return new ItemGroupRendering(this);
        }

        @Nullable
        public final Function1<Item<?>, Unit> getOnItemClicked$zendesk_ui_ui_android() {
            return this.onItemClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ItemGroupState getState() {
            return this.state;
        }

        @NotNull
        public final <T> Builder onItemClicked(@NotNull Function1<? super Item<T>, Unit> onItemClicked) {
            onItemClicked.getClass();
            this.onItemClicked = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onItemClicked, 1);
            return this;
        }

        public final void setOnItemClicked$zendesk_ui_ui_android(@Nullable Function1<? super Item<?>, Unit> function1) {
            this.onItemClicked = function1;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ItemGroupState itemGroupState) {
            itemGroupState.getClass();
            this.state = itemGroupState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ItemGroupState, ItemGroupState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ItemGroupState) stateUpdate.invoke(this.state);
            return this;
        }

        public Builder() {
            this.state = new ItemGroupState(null, null, null, 7, null);
        }

        public /* synthetic */ Builder(ItemGroupRendering itemGroupRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ItemGroupRendering() : itemGroupRendering);
        }
    }

    public ItemGroupRendering() {
        this(new Builder());
    }
}
