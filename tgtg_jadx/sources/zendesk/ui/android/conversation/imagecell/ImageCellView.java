package zendesk.ui.android.conversation.imagecell;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.vectordrawable.graphics.drawable.h;
import ax.g0;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lx.u;
import n20.f;
import n20.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pc.d;
import u70.j;
import u70.l;
import zc.e;
import zc.i;
import zc.k;
import zc.r;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.actionbutton.ActionButton;
import zendesk.ui.android.conversation.imagecell.ImageRoundedCorner;
import zendesk.ui.android.conversation.textcell.TextCellRendering;
import zendesk.ui.android.conversation.textcell.TextCellState;
import zendesk.ui.android.conversation.textcell.TextCellView;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.DimensionExtKt;
import zendesk.ui.android.internal.ImageLoaderFactory;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 B2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001BB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0014¢\u0006\u0004\b!\u0010\u000eR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010<\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001d\u0010?\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R\u0018\u0010@\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/imagecell/ImageCellRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setupAccessibilityAnnouncement", "()V", "", "isMessageTextViewVisible", "Ln20/o;", "buildShapeAppearanceModel", "(Z)Ln20/o;", "getTextCellViewBackgroundResource", "()I", "onStart", "Lzendesk/ui/android/conversation/imagecell/ImageCellState;", "state", "shapeAppearance", "Ln20/j;", "getImageBackground", "(ZLzendesk/ui/android/conversation/imagecell/ImageCellState;Ln20/o;)Ln20/j;", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "onDetachedFromWindow", "Lzendesk/ui/android/conversation/textcell/TextCellView;", "textCellView", "Lzendesk/ui/android/conversation/textcell/TextCellView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "imageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "imageViewOverlay", "Landroid/widget/TextView;", "errorTextView", "Landroid/widget/TextView;", "rendering", "Lzendesk/ui/android/conversation/imagecell/ImageCellRendering;", "Lzc/e;", "imageLoaderDisposable", "Lzc/e;", "", "cellRadius", "F", "smallCellRadius", "isLayoutDirectionLtr", "Z", "Landroidx/vectordrawable/graphics/drawable/h;", "skeletonLoaderInboundAnimation$delegate", "Lu70/j;", "getSkeletonLoaderInboundAnimation", "()Landroidx/vectordrawable/graphics/drawable/h;", "skeletonLoaderInboundAnimation", "skeletonLoaderOutboundAnimation$delegate", "getSkeletonLoaderOutboundAnimation", "skeletonLoaderOutboundAnimation", "skeletonLoaderDrawable", "Landroidx/vectordrawable/graphics/drawable/h;", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageCellView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageCellView.kt\nzendesk/ui/android/conversation/imagecell/ImageCellView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,359:1\n257#2,2:360\n255#2:362\n255#2:364\n257#2,2:366\n257#2,2:368\n257#2,2:376\n28#3:363\n28#3:365\n495#4,6:370\n*S KotlinDebug\n*F\n+ 1 ImageCellView.kt\nzendesk/ui/android/conversation/imagecell/ImageCellView\n*L\n105#1:360,2\n107#1:362\n138#1:364\n178#1:366,2\n181#1:368,2\n231#1:376,2\n135#1:363\n153#1:365\n197#1:370,6\n*E\n"})
public final class ImageCellView extends ConstraintLayout implements Renderer<ImageCellRendering> {
    private static final float DEFAULT_ALPHA = 1.0f;
    private static final float PENDING_ALPHA = 0.5f;
    private static final int ROUNDED_CORNER = 0;
    private final float cellRadius;

    @NotNull
    private final TextView errorTextView;

    @Nullable
    private e imageLoaderDisposable;

    @NotNull
    private final ShapeableImageView imageView;

    @NotNull
    private final ShapeableImageView imageViewOverlay;
    private final boolean isLayoutDirectionLtr;

    @NotNull
    private ImageCellRendering rendering;

    @Nullable
    private h skeletonLoaderDrawable;

    /* JADX INFO: renamed from: skeletonLoaderInboundAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final j skeletonLoaderInboundAnimation;

    /* JADX INFO: renamed from: skeletonLoaderOutboundAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final j skeletonLoaderOutboundAnimation;
    private final float smallCellRadius;

    @NotNull
    private final TextCellView textCellView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCellDirection.values().length];
            try {
                iArr[ImageCellDirection.INBOUND_SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCellDirection.INBOUND_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCellDirection.INBOUND_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageCellDirection.INBOUND_MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageCellDirection.OUTBOUND_SINGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageCellDirection.OUTBOUND_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageCellDirection.OUTBOUND_TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ImageCellDirection.OUTBOUND_MIDDLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.rendering = new ImageCellRendering();
        this.isLayoutDirectionLtr = getResources().getConfiguration().getLayoutDirection() == 0;
        this.skeletonLoaderInboundAnimation = l.b(new bo.a(context, 17));
        this.skeletonLoaderOutboundAnimation = l.b(new bo.a(context, 18));
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_TextCellStyle, false);
        View.inflate(context, R.layout.zuia_view_image_cell, this);
        View viewFindViewById = findViewById(R.id.zuia_text_cell_view);
        viewFindViewById.getClass();
        this.textCellView = (TextCellView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_image_view);
        viewFindViewById2.getClass();
        this.imageView = (ShapeableImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_image_view_overlay);
        viewFindViewById3.getClass();
        this.imageViewOverlay = (ShapeableImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zuia_error_text);
        viewFindViewById4.getClass();
        this.errorTextView = (TextView) viewFindViewById4;
        this.cellRadius = DimensionExtKt.resolveDimensionAttr(context, new int[]{R.attr.messageCellRadiusSize});
        this.smallCellRadius = DimensionExtKt.resolveDimensionAttr(context, new int[]{R.attr.messageCellSmallRadiusSize});
        setupAccessibilityAnnouncement();
        render(new zendesk.ui.android.conversation.form.e(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageCellRendering _init_$lambda$2(ImageCellRendering imageCellRendering) {
        imageCellRendering.getClass();
        return imageCellRendering;
    }

    private final o buildShapeAppearanceModel(boolean isMessageTextViewVisible) {
        jf.e eVarX;
        n20.a aVar;
        n20.a aVar2;
        jf.e eVarX2;
        ImageRoundedCorner imageRoundedCornerBuild = new ImageRoundedCorner.Builder(this.cellRadius, this.smallCellRadius, this.rendering.getState().getImageCellDirection$zendesk_ui_ui_android(), this.isLayoutDirectionLtr).build();
        f fVar = new f(0);
        f fVar2 = new f(0);
        f fVar3 = new f(0);
        f fVar4 = new f(0);
        float topLeft = imageRoundedCornerBuild.getTopLeft();
        jf.e eVarX3 = u.x(0);
        n20.a aVar3 = new n20.a(topLeft);
        float topRight = imageRoundedCornerBuild.getTopRight();
        jf.e eVarX4 = u.x(0);
        n20.a aVar4 = new n20.a(topRight);
        if (isMessageTextViewVisible) {
            eVarX2 = u.x(0);
            aVar2 = new n20.a(0.0f);
            eVarX = u.x(0);
            aVar = new n20.a(0.0f);
        } else {
            float bottomRight = imageRoundedCornerBuild.getBottomRight();
            jf.e eVarX5 = u.x(0);
            n20.a aVar5 = new n20.a(bottomRight);
            float bottomLeft = imageRoundedCornerBuild.getBottomLeft();
            eVarX = u.x(0);
            aVar = new n20.a(bottomLeft);
            aVar2 = aVar5;
            eVarX2 = eVarX5;
        }
        o oVar = new o();
        oVar.f30388a = eVarX3;
        oVar.f30389b = eVarX4;
        oVar.f30390c = eVarX2;
        oVar.f30391d = eVarX;
        oVar.f30392e = aVar3;
        oVar.f30393f = aVar4;
        oVar.f30394g = aVar2;
        oVar.f30395h = aVar;
        oVar.f30396i = fVar;
        oVar.f30397j = fVar2;
        oVar.f30398k = fVar3;
        oVar.l = fVar4;
        return oVar;
    }

    private final n20.j getImageBackground(boolean onStart, ImageCellState state, o shapeAppearance) {
        int backgroundColor$zendesk_ui_ui_android = state.getBackgroundColor$zendesk_ui_ui_android();
        int color = onStart ? backgroundColor$zendesk_ui_ui_android : getContext().getColor(R.color.zuia_color_transparent);
        n20.j jVar = new n20.j(shapeAppearance);
        jVar.t(ColorStateList.valueOf(color));
        if (!onStart) {
            jVar.A(getResources().getDimension(R.dimen.zuia_inner_stroke_width));
            jVar.z(ColorStateList.valueOf(backgroundColor$zendesk_ui_ui_android));
        }
        return jVar;
    }

    private final h getSkeletonLoaderInboundAnimation() {
        return (h) this.skeletonLoaderInboundAnimation.getValue();
    }

    private final h getSkeletonLoaderOutboundAnimation() {
        return (h) this.skeletonLoaderOutboundAnimation.getValue();
    }

    private final int getTextCellViewBackgroundResource() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.rendering.getState().getImageCellDirection$zendesk_ui_ui_android().ordinal()]) {
            case 1:
            case 2:
                return R.drawable.zuia_image_cell_message_inbound_shape_single;
            case 3:
            case 4:
                return R.drawable.zuia_image_cell_message_inbound_shape_middle;
            case 5:
            case 6:
                return R.drawable.zuia_image_cell_message_outbound_shape_single;
            case 7:
            case 8:
                return R.drawable.zuia_image_cell_message_outbound_shape_middle;
            default:
                e40.a.f();
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextCellRendering render$lambda$13$lambda$4(ImageCellView imageCellView, ImageCellState imageCellState, TextCellRendering textCellRendering) {
        textCellRendering.getClass();
        return textCellRendering.toBuilder().state(new a(imageCellState, imageCellView)).onActionButtonClicked(imageCellView.rendering.getOnActionButtonClicked()).onPostbackButtonClicked(imageCellView.rendering.getOnPostbackButtonClicked$zendesk_ui_ui_android()).onWebViewActionButtonClicked(imageCellView.rendering.getOnWebViewActionButtonClicked()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextCellState render$lambda$13$lambda$4$lambda$3(ImageCellState imageCellState, ImageCellView imageCellView, TextCellState textCellState) {
        textCellState.getClass();
        String messageText$zendesk_ui_ui_android = imageCellState.getMessageText$zendesk_ui_ui_android();
        if (messageText$zendesk_ui_ui_android == null) {
            messageText$zendesk_ui_ui_android = "";
        }
        String str = messageText$zendesk_ui_ui_android;
        String richTextMessage$zendesk_ui_ui_android = imageCellState.getRichTextMessage$zendesk_ui_ui_android();
        int textColor$zendesk_ui_ui_android = imageCellState.getTextColor$zendesk_ui_ui_android();
        int backgroundColor$zendesk_ui_ui_android = imageCellState.getBackgroundColor$zendesk_ui_ui_android();
        int textCellViewBackgroundResource = imageCellView.getTextCellViewBackgroundResource();
        return TextCellState.copy$default(textCellState, str, richTextMessage$zendesk_ui_ui_android, imageCellState.getActions$zendesk_ui_ui_android(), null, false, null, null, null, Integer.valueOf(textColor$zendesk_ui_ui_android), Integer.valueOf(backgroundColor$zendesk_ui_ui_android), Integer.valueOf(textCellViewBackgroundResource), Integer.valueOf(imageCellState.getActionColor$zendesk_ui_ui_android()), Integer.valueOf(imageCellState.getActionTextColor$zendesk_ui_ui_android()), null, null, Integer.valueOf(imageCellState.getHtmlCodeBlockTextColorInt$zendesk_ui_ui_android()), Integer.valueOf(imageCellState.getHtmlCodeBlockBackgroundColorInt$zendesk_ui_ui_android()), 24824, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$13$lambda$7(ImageCellState imageCellState, ImageCellView imageCellView) {
        Function1<String, Unit> onImageCellClicked$zendesk_ui_ui_android;
        Uri localUri$zendesk_ui_ui_android = imageCellState.getLocalUri$zendesk_ui_ui_android();
        if (localUri$zendesk_ui_ui_android == null) {
            localUri$zendesk_ui_ui_android = imageCellState.getUri$zendesk_ui_ui_android();
        }
        if (localUri$zendesk_ui_ui_android != null && (onImageCellClicked$zendesk_ui_ui_android = imageCellView.rendering.getOnImageCellClicked$zendesk_ui_ui_android()) != null) {
            onImageCellClicked$zendesk_ui_ui_android.invoke(String.valueOf(imageCellState.getUri$zendesk_ui_ui_android()));
        }
        return Unit.f26487a;
    }

    private final void setupAccessibilityAnnouncement() {
        String string = getResources().getString(R.string.zuia_image_thumbnail_accessibility_label);
        string.getClass();
        this.imageView.setContentDescription(getResources().getString(R.string.zuia_accessibility_image_announcement, string));
        AccessibilityExtKt.overrideAccessibilityNodeClassNameInfo(this.imageView, Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h skeletonLoaderInboundAnimation_delegate$lambda$0(Context context) {
        return h.a(context, R.drawable.zuia_skeleton_loader_inbound);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h skeletonLoaderOutboundAnimation_delegate$lambda$1(Context context) {
        return h.a(context, R.drawable.zuia_skeleton_loader_outbound);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.imageLoaderDisposable;
        if (eVar != null) {
            eVar.a();
        }
        h hVar = this.skeletonLoaderDrawable;
        if (hVar != null) {
            hVar.stop();
        }
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ImageCellRendering, ? extends ImageCellRendering> renderingUpdate) {
        List<ActionButton> actions$zendesk_ui_ui_android;
        renderingUpdate.getClass();
        ImageCellState state = this.rendering.getState();
        ImageCellRendering imageCellRendering = (ImageCellRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = imageCellRendering;
        if (Intrinsics.areEqual(state, imageCellRendering.getState())) {
            return;
        }
        ImageCellState state2 = this.rendering.getState();
        TextCellView textCellView = this.textCellView;
        String messageText$zendesk_ui_ui_android = state2.getMessageText$zendesk_ui_ui_android();
        textCellView.setVisibility(((messageText$zendesk_ui_ui_android == null || messageText$zendesk_ui_ui_android.length() == 0) && ((actions$zendesk_ui_ui_android = state2.getActions$zendesk_ui_ui_android()) == null || actions$zendesk_ui_ui_android.isEmpty())) ? 8 : 0);
        if (this.textCellView.getVisibility() == 0) {
            this.textCellView.render(new a(this, state2));
            this.textCellView.setMessageTextGravity$zendesk_ui_ui_android(8388611);
        }
        this.errorTextView.setText(state2.getErrorText$zendesk_ui_ui_android());
        this.errorTextView.setTextColor(state2.getErrorTextColor$zendesk_ui_ui_android());
        final ColorDrawable colorDrawable = new ColorDrawable(state2.getErrorBackgroundColor$zendesk_ui_ui_android());
        o oVarBuildShapeAppearanceModel = buildShapeAppearanceModel(this.textCellView.getVisibility() == 0);
        this.imageView.setShapeAppearanceModel(oVarBuildShapeAppearanceModel);
        this.imageViewOverlay.setShapeAppearanceModel(oVarBuildShapeAppearanceModel);
        final n20.j jVar = new n20.j(oVarBuildShapeAppearanceModel);
        jVar.t(ColorStateList.valueOf(getContext().getColor(R.color.zuia_color_transparent)));
        jVar.A(getResources().getDimension(R.dimen.zuia_inner_stroke_width));
        jVar.z(ColorStateList.valueOf(state2.getBackgroundColor$zendesk_ui_ui_android()));
        ColorDrawable colorDrawable2 = new ColorDrawable(ColorExtKt.adjustAlpha(state2.getErrorColorOverlay$zendesk_ui_ui_android(), 0.3f));
        this.skeletonLoaderDrawable = ImageCellDirection.INSTANCE.isInbound(state2.getImageCellDirection$zendesk_ui_ui_android()) ? getSkeletonLoaderInboundAnimation() : getSkeletonLoaderOutboundAnimation();
        this.imageView.setBackground(getImageBackground(true, state2, oVarBuildShapeAppearanceModel));
        this.imageView.setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener(600L, new yl.e(10, state2, this)));
        boolean zIsError$zendesk_ui_ui_android = state2.isError$zendesk_ui_ui_android();
        ShapeableImageView shapeableImageView = this.imageViewOverlay;
        if (zIsError$zendesk_ui_ui_android) {
            shapeableImageView.setVisibility(0);
            this.imageViewOverlay.setImageDrawable(colorDrawable2);
        } else {
            shapeableImageView.setVisibility(8);
            this.imageViewOverlay.setImageDrawable(null);
        }
        boolean zIsPending$zendesk_ui_ui_android = state2.isPending$zendesk_ui_ui_android();
        ShapeableImageView shapeableImageView2 = this.imageView;
        if (zIsPending$zendesk_ui_ui_android) {
            shapeableImageView2.setAlpha(PENDING_ALPHA);
        } else {
            shapeableImageView2.setAlpha(DEFAULT_ALPHA);
        }
        ImageLoaderFactory imageLoaderFactory = ImageLoaderFactory.INSTANCE;
        Context context = getContext();
        context.getClass();
        d imageLoader = imageLoaderFactory.getImageLoader(context);
        Uri localUri$zendesk_ui_ui_android = state2.getLocalUri$zendesk_ui_ui_android();
        if (localUri$zendesk_ui_ui_android == null) {
            localUri$zendesk_ui_ui_android = state2.getUri$zendesk_ui_ui_android();
        }
        if (!ImageType.INSTANCE.isSupported(state2.getImageType$zendesk_ui_ui_android())) {
            this.imageView.setBackground(jVar);
            this.imageView.setImageDrawable(colorDrawable);
            this.errorTextView.setVisibility(0);
            return;
        }
        Context context2 = getContext();
        context2.getClass();
        i iVar = new i(context2);
        iVar.f47445e = new zc.j(jVar, this, this, colorDrawable, this) { // from class: zendesk.ui.android.conversation.imagecell.ImageCellView$render$lambda$13$$inlined$listener$1
            final /* synthetic */ n20.j $backgroundDrawable$inlined;
            final /* synthetic */ ColorDrawable $errorDrawable$inlined;

            {
                this.$errorDrawable$inlined = colorDrawable;
            }

            @Override // zc.j
            public void onCancel(k request) {
                this.this$0.errorTextView.setVisibility(0);
            }

            @Override // zc.j
            public void onError(k request, zc.f result) {
                h hVar = this.this$0.skeletonLoaderDrawable;
                if (hVar != null) {
                    hVar.stop();
                }
                this.this$0.imageView.setImageDrawable(this.$errorDrawable$inlined);
                this.this$0.errorTextView.setVisibility(0);
            }

            @Override // zc.j
            public void onStart(k request) {
                h hVar = this.this$0.skeletonLoaderDrawable;
                if (hVar != null) {
                    hVar.start();
                }
                this.this$0.imageView.setBackground(this.$backgroundDrawable$inlined);
                this.this$0.errorTextView.setVisibility(8);
            }

            @Override // zc.j
            public void onSuccess(k request, r result) {
                h hVar = this.this$0.skeletonLoaderDrawable;
                if (hVar != null) {
                    hVar.stop();
                }
                this.this$0.imageView.setBackground(null);
                this.this$0.errorTextView.setVisibility(8);
            }
        };
        iVar.f47459t = colorDrawable;
        iVar.f47458s = 0;
        iVar.f47455p = this.skeletonLoaderDrawable;
        iVar.f47454o = 0;
        iVar.f47448h = new dd.a(100);
        iVar.f47443c = localUri$zendesk_ui_ui_android;
        iVar.b(this.imageView);
        String authorizationToken$zendesk_ui_ui_android = state2.getAuthorizationToken$zendesk_ui_ui_android();
        if (authorizationToken$zendesk_ui_ui_android != null) {
            g0 g0Var = iVar.f47449i;
            if (g0Var == null) {
                g0Var = new g0(3);
                iVar.f47449i = g0Var;
            }
            g0Var.c("Authorization", authorizationToken$zendesk_ui_ui_android);
        }
        this.imageLoaderDisposable = ((pc.h) imageLoader).b(iVar.a());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageCellView$Companion;", "", "<init>", "()V", "ROUNDED_CORNER", "", "PENDING_ALPHA", "", "DEFAULT_ALPHA", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageCellView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ImageCellView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageCellView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
