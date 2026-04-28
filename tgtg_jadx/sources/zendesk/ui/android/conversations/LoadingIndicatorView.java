package zendesk.ui.android.conversations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013H\u0016R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversations/LoadingIndicatorView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversations/LoadingIndicatorRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "rendering", "loadingIndicator", "Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "render", "", "renderingUpdate", "Lkotlin/Function1;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoadingIndicatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingIndicatorView.kt\nzendesk/ui/android/conversations/LoadingIndicatorView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,47:1\n257#2,2:48\n*S KotlinDebug\n*F\n+ 1 LoadingIndicatorView.kt\nzendesk/ui/android/conversations/LoadingIndicatorView\n*L\n43#1:48,2\n*E\n"})
public final class LoadingIndicatorView extends FrameLayout implements Renderer<LoadingIndicatorRendering> {
    public static final int $stable = 8;

    @NotNull
    private CircularProgressIndicator loadingIndicator;

    @NotNull
    private LoadingIndicatorRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new LoadingIndicatorRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_LoadingIndicatorStyle, false);
        View.inflate(context, R.layout.zuia_view_loading_indicator, this);
        View viewFindViewById = findViewById(R.id.zuia_progress_indicator);
        viewFindViewById.getClass();
        this.loadingIndicator = (CircularProgressIndicator) viewFindViewById;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super LoadingIndicatorRendering, ? extends LoadingIndicatorRendering> renderingUpdate) {
        renderingUpdate.getClass();
        LoadingIndicatorRendering loadingIndicatorRendering = (LoadingIndicatorRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = loadingIndicatorRendering;
        int indicatorColor = loadingIndicatorRendering.getState().getIndicatorColor();
        this.loadingIndicator.setVisibility(this.rendering.getState().getShowLoadingIndicator() ? 0 : 8);
        this.loadingIndicator.setIndicatorColor(indicatorColor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ LoadingIndicatorView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
