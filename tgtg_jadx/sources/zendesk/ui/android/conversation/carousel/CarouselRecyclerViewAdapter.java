package zendesk.ui.android.conversation.carousel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.l1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import pc.d;
import zendesk.faye.internal.Bayeux;
import zendesk.ui.android.conversation.carousel.ArticleCarouselViewHolder;
import zendesk.ui.android.conversation.carousel.AvatarCarouselViewHolder;
import zendesk.ui.android.conversation.carousel.CarouselCellData;
import zendesk.ui.android.internal.ImageLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselRecyclerViewAdapter;", "Landroidx/recyclerview/widget/l1;", "Lzendesk/ui/android/conversation/carousel/CarouselViewHolder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lzendesk/ui/android/conversation/carousel/CarouselViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lzendesk/ui/android/conversation/carousel/CarouselViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "Lzendesk/ui/android/conversation/carousel/CarouselCellState;", "state", "swapData", "(Lzendesk/ui/android/conversation/carousel/CarouselCellState;)V", "", "hasAvatar", "()Z", "Ljava/util/ArrayList;", "Lzendesk/ui/android/conversation/carousel/CarouselCellData;", "Lkotlin/collections/ArrayList;", Bayeux.KEY_DATA, "Ljava/util/ArrayList;", "Lzendesk/ui/android/conversation/carousel/CarouselRendering;", "rendering", "Lzendesk/ui/android/conversation/carousel/CarouselRendering;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "layoutInflater", "Landroid/view/LayoutInflater;", "Lpc/d;", "imageLoader", "Lpc/d;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CarouselRecyclerViewAdapter extends l1 {
    public static final int $stable = 8;

    @NotNull
    private final ArrayList<CarouselCellData> data;

    @NotNull
    private final d imageLoader;
    private final LayoutInflater layoutInflater;

    @NotNull
    private CarouselRendering rendering;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CarouselViewType.values().length];
            try {
                iArr[CarouselViewType.ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CarouselViewType.AVATAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CarouselRecyclerViewAdapter(@NotNull Context context) {
        context.getClass();
        this.data = new ArrayList<>();
        this.rendering = new CarouselRendering(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 4095, null);
        this.layoutInflater = LayoutInflater.from(context);
        this.imageLoader = ImageLoaderFactory.INSTANCE.getImageLoader(context);
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemViewType(int position) {
        if (position == -1) {
            return -1;
        }
        return this.data.get(position).getCarouselViewType().ordinal();
    }

    public final boolean hasAvatar() {
        return CollectionsKt.firstOrNull(this.data) instanceof CarouselCellData.Avatar;
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull CarouselViewHolder holder, int position) {
        holder.getClass();
        if (holder instanceof ArticleCarouselViewHolder) {
            CarouselRendering carouselRendering = this.rendering;
            CarouselCellData carouselCellData = this.data.get(position);
            carouselCellData.getClass();
            ((ArticleCarouselViewHolder) holder).bind(carouselRendering, (CarouselCellData.Item) carouselCellData);
            return;
        }
        if (holder instanceof AvatarCarouselViewHolder) {
            CarouselRendering carouselRendering2 = this.rendering;
            CarouselCellData carouselCellData2 = this.data.get(position);
            carouselCellData2.getClass();
            ((AvatarCarouselViewHolder) holder).bind(carouselRendering2, (CarouselCellData.Avatar) carouselCellData2);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public CarouselViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[CarouselViewType.values()[viewType].ordinal()];
        if (i11 == 1) {
            ArticleCarouselViewHolder.Companion companion = ArticleCarouselViewHolder.INSTANCE;
            LayoutInflater layoutInflater = this.layoutInflater;
            layoutInflater.getClass();
            return companion.create(layoutInflater, parent, this.imageLoader);
        }
        if (i11 != 2) {
            e40.a.f();
            return null;
        }
        AvatarCarouselViewHolder.Companion companion2 = AvatarCarouselViewHolder.INSTANCE;
        LayoutInflater layoutInflater2 = this.layoutInflater;
        layoutInflater2.getClass();
        return companion2.create(layoutInflater2, parent);
    }

    public final void swapData(@NotNull CarouselCellState state) {
        state.getClass();
        this.data.clear();
        this.data.addAll(state.getCellData());
        this.rendering = state.getRendering();
        notifyItemRangeChanged(0, this.data.size());
    }
}
