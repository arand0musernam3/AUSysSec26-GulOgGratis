package zendesk.ui.android.conversation.imagerviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pb0.a;
import zc.e;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.header.ConversationHeaderRendering;
import zendesk.ui.android.conversation.header.ConversationHeaderState;
import zendesk.ui.android.conversation.header.ConversationHeaderView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\rj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lzendesk/ui/android/conversation/imagerviewer/ImageViewerView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/imagerviewer/ImageViewerRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/Function1;", "renderingUpdate", "", "render", "(Lkotlin/jvm/functions/Function1;)V", "onDetachedFromWindow", "()V", "Lzendesk/ui/android/conversation/header/ConversationHeaderView;", "headerView", "Lzendesk/ui/android/conversation/header/ConversationHeaderView;", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "rendering", "Lzendesk/ui/android/conversation/imagerviewer/ImageViewerRendering;", "Lzendesk/ui/android/conversation/header/ConversationHeaderRendering;", "Lzendesk/ui/android/conversation/imagerviewer/RenderingUpdate;", "headerViewRenderingUpdate", "Lkotlin/jvm/functions/Function1;", "Lzc/e;", "imageLoaderDisposable", "Lzc/e;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageViewerView extends FrameLayout implements Renderer<ImageViewerRendering> {
    public static final int $stable = 8;

    @NotNull
    private final ConversationHeaderView headerView;

    @NotNull
    private final Function1<ConversationHeaderRendering, ConversationHeaderRendering> headerViewRenderingUpdate;

    @Nullable
    private e imageLoaderDisposable;

    @NotNull
    private final ImageView imageView;

    @NotNull
    private ImageViewerRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ImageViewerRendering();
        this.headerViewRenderingUpdate = new a(this, 1);
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_ConversationHeader, false);
        View.inflate(context, R.layout.zuia_view_image_viewer, this);
        View viewFindViewById = findViewById(R.id.zuia_header_view);
        viewFindViewById.getClass();
        this.headerView = (ConversationHeaderView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_image_view);
        viewFindViewById2.getClass();
        this.imageView = (ImageView) viewFindViewById2;
        render(new nv.a(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewerRendering _init_$lambda$3(ImageViewerRendering imageViewerRendering) {
        imageViewerRendering.getClass();
        return imageViewerRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationHeaderRendering headerViewRenderingUpdate$lambda$2(ImageViewerView imageViewerView, ConversationHeaderRendering conversationHeaderRendering) {
        conversationHeaderRendering.getClass();
        return conversationHeaderRendering.toBuilder().state(new a(imageViewerView, 0)).onBackButtonClicked(new b2(imageViewerView, 10)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationHeaderState headerViewRenderingUpdate$lambda$2$lambda$0(ImageViewerView imageViewerView, ConversationHeaderState conversationHeaderState) {
        conversationHeaderState.getClass();
        return ConversationHeaderState.copy$default(conversationHeaderState, null, null, null, null, imageViewerView.rendering.getState().getToolbarColor$zendesk_ui_ui_android(), imageViewerView.rendering.getState().getStatusBarColor$zendesk_ui_ui_android(), null, null, 207, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit headerViewRenderingUpdate$lambda$2$lambda$1(ImageViewerView imageViewerView) {
        imageViewerView.rendering.getOnBackButtonClicked$zendesk_ui_ui_android().invoke();
        return Unit.f26487a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.imageLoaderDisposable;
        if (eVar != null) {
            eVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    @Override // zendesk.ui.android.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void render(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering, ? extends zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering> r5) {
        /*
            r4 = this;
            r5.getClass()
            zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering r0 = r4.rendering
            java.lang.Object r5 = r5.invoke(r0)
            zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering r5 = (zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering) r5
            r4.rendering = r5
            zendesk.core.ui.android.internal.xml.InsetType r5 = zendesk.core.ui.android.internal.xml.InsetType.BOTTOM
            zendesk.core.ui.android.internal.xml.InsetType r0 = zendesk.core.ui.android.internal.xml.InsetType.HORIZONTAL
            zendesk.core.ui.android.internal.xml.InsetType[] r5 = new zendesk.core.ui.android.internal.xml.InsetType[]{r5, r0}
            zendesk.core.ui.android.internal.xml.SystemWindowInsetsKt.applyWindowInsets(r4, r5)
            zendesk.ui.android.conversation.header.ConversationHeaderView r5 = r4.headerView
            kotlin.jvm.functions.Function1<zendesk.ui.android.conversation.header.ConversationHeaderRendering, zendesk.ui.android.conversation.header.ConversationHeaderRendering> r0 = r4.headerViewRenderingUpdate
            r5.render(r0)
            zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering r5 = r4.rendering
            zendesk.ui.android.conversation.imagerviewer.ImageViewerState r5 = r5.getState()
            java.lang.String r5 = r5.getUri$zendesk_ui_ui_android()
            if (r5 == 0) goto La8
            zendesk.ui.android.internal.ImageLoaderFactory r0 = zendesk.ui.android.internal.ImageLoaderFactory.INSTANCE
            android.content.Context r1 = r4.getContext()
            r1.getClass()
            pc.d r0 = r0.getImageLoader(r1)
            pc.h r0 = (pc.h) r0
            u70.t r1 = r0.f34657c
            java.lang.Object r1 = r1.getValue()
            xc.d r1 = (xc.d) r1
            if (r1 == 0) goto L5e
            xc.b r2 = new xc.b
            r2.<init>(r5)
            xc.e r1 = (xc.e) r1
            xc.h r3 = r1.f44225a
            xc.c r3 = r3.b(r2)
            if (r3 != 0) goto L59
            xc.i r1 = r1.f44226b
            xc.c r3 = r1.b(r2)
        L59:
            if (r3 == 0) goto L5e
            android.graphics.Bitmap r1 = r3.f44223a
            goto L5f
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L67
            android.widget.ImageView r5 = r4.imageView
            r5.setImageBitmap(r1)
            return
        L67:
            zc.i r1 = new zc.i
            android.content.Context r2 = r4.getContext()
            r2.getClass()
            r1.<init>(r2)
            r1.f47443c = r5
            xc.b r2 = new xc.b
            r2.<init>(r5)
            r1.f47446f = r2
            android.widget.ImageView r5 = r4.imageView
            r1.b(r5)
            zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering r5 = r4.rendering
            zendesk.ui.android.conversation.imagerviewer.ImageViewerState r5 = r5.getState()
            java.lang.String r5 = r5.getAuthorizationToken$zendesk_ui_ui_android()
            if (r5 == 0) goto L9e
            ax.g0 r2 = r1.f47449i
            if (r2 != 0) goto L99
            ax.g0 r2 = new ax.g0
            r3 = 3
            r2.<init>(r3)
            r1.f47449i = r2
        L99:
            java.lang.String r3 = "Authorization"
            r2.c(r3, r5)
        L9e:
            zc.k r5 = r1.a()
            zc.e r5 = r0.b(r5)
            r4.imageLoaderDisposable = r5
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.conversation.imagerviewer.ImageViewerView.render(kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageViewerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageViewerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ImageViewerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageViewerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
