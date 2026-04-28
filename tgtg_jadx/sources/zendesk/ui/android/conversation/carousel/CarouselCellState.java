package zendesk.ui.android.conversation.carousel;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.conversation.avatar.AvatarImageState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselCellState;", "", "cellData", "", "Lzendesk/ui/android/conversation/carousel/CarouselCellData;", "avatarImageState", "Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "rendering", "Lzendesk/ui/android/conversation/carousel/CarouselRendering;", "<init>", "(Ljava/util/List;Lzendesk/ui/android/conversation/avatar/AvatarImageState;Lzendesk/ui/android/conversation/carousel/CarouselRendering;)V", "getCellData", "()Ljava/util/List;", "getAvatarImageState", "()Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "getRendering", "()Lzendesk/ui/android/conversation/carousel/CarouselRendering;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CarouselCellState {
    public static final int $stable = 8;

    @Nullable
    private final AvatarImageState avatarImageState;

    @NotNull
    private final List<CarouselCellData> cellData;

    @NotNull
    private final CarouselRendering rendering;

    public CarouselCellState(List list, AvatarImageState avatarImageState, CarouselRendering carouselRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? null : avatarImageState, (i11 & 4) != 0 ? new CarouselRendering(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 4095, null) : carouselRendering);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarouselCellState copy$default(CarouselCellState carouselCellState, List list, AvatarImageState avatarImageState, CarouselRendering carouselRendering, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = carouselCellState.cellData;
        }
        if ((i11 & 2) != 0) {
            avatarImageState = carouselCellState.avatarImageState;
        }
        if ((i11 & 4) != 0) {
            carouselRendering = carouselCellState.rendering;
        }
        return carouselCellState.copy(list, avatarImageState, carouselRendering);
    }

    @NotNull
    public final List<CarouselCellData> component1() {
        return this.cellData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AvatarImageState getAvatarImageState() {
        return this.avatarImageState;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CarouselRendering getRendering() {
        return this.rendering;
    }

    @NotNull
    public final CarouselCellState copy(@NotNull List<? extends CarouselCellData> cellData, @Nullable AvatarImageState avatarImageState, @NotNull CarouselRendering rendering) {
        cellData.getClass();
        rendering.getClass();
        return new CarouselCellState(cellData, avatarImageState, rendering);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselCellState)) {
            return false;
        }
        CarouselCellState carouselCellState = (CarouselCellState) other;
        return Intrinsics.areEqual(this.cellData, carouselCellState.cellData) && Intrinsics.areEqual(this.avatarImageState, carouselCellState.avatarImageState) && Intrinsics.areEqual(this.rendering, carouselCellState.rendering);
    }

    @Nullable
    public final AvatarImageState getAvatarImageState() {
        return this.avatarImageState;
    }

    @NotNull
    public final List<CarouselCellData> getCellData() {
        return this.cellData;
    }

    @NotNull
    public final CarouselRendering getRendering() {
        return this.rendering;
    }

    public int hashCode() {
        int iHashCode = this.cellData.hashCode() * 31;
        AvatarImageState avatarImageState = this.avatarImageState;
        return this.rendering.hashCode() + ((iHashCode + (avatarImageState == null ? 0 : avatarImageState.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "CarouselCellState(cellData=" + this.cellData + ", avatarImageState=" + this.avatarImageState + ", rendering=" + this.rendering + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselCellState(@NotNull List<? extends CarouselCellData> list, @Nullable AvatarImageState avatarImageState, @NotNull CarouselRendering carouselRendering) {
        list.getClass();
        carouselRendering.getClass();
        this.cellData = list;
        this.avatarImageState = avatarImageState;
        this.rendering = carouselRendering;
    }

    public CarouselCellState() {
        this(null, null, null, 7, null);
    }
}
