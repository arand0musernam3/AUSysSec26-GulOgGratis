package zendesk.ui.android.conversation.avatar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.vectordrawable.graphics.drawable.h;
import bo.a;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.d0;
import n20.f;
import n20.m;
import n20.n;
import n20.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pc.d;
import u70.j;
import u70.l;
import y8.c;
import zc.e;
import zc.i;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ImageLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/avatar/AvatarImageRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/Function1;", "renderingUpdate", "", "render", "(Lkotlin/jvm/functions/Function1;)V", "onDetachedFromWindow", "()V", "container", "Landroid/widget/FrameLayout;", "Lcom/google/android/material/imageview/ShapeableImageView;", "imageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lzc/e;", "imageLoaderDisposable", "Lzc/e;", "rendering", "Lzendesk/ui/android/conversation/avatar/AvatarImageRendering;", "Landroidx/vectordrawable/graphics/drawable/h;", "skeletonLoaderDrawable$delegate", "Lu70/j;", "getSkeletonLoaderDrawable", "()Landroidx/vectordrawable/graphics/drawable/h;", "skeletonLoaderDrawable", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAvatarImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarImageView.kt\nzendesk/ui/android/conversation/avatar/AvatarImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class AvatarImageView extends FrameLayout implements Renderer<AvatarImageRendering> {
    public static final int $stable = 8;

    @NotNull
    private final FrameLayout container;

    @Nullable
    private e imageLoaderDisposable;

    @NotNull
    private final ShapeableImageView imageView;

    @NotNull
    private AvatarImageRendering rendering;

    /* JADX INFO: renamed from: skeletonLoaderDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final j skeletonLoaderDrawable;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarMask.values().length];
            try {
                iArr[AvatarMask.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarMask.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new AvatarImageRendering();
        this.skeletonLoaderDrawable = l.b(new a(context, 14));
        View.inflate(context, R.layout.zuia_view_avatar_image, this);
        View viewFindViewById = findViewById(R.id.zuia_avatar_container);
        viewFindViewById.getClass();
        this.container = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_avatar_image_view);
        viewFindViewById2.getClass();
        this.imageView = (ShapeableImageView) viewFindViewById2;
        render(new d0(21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvatarImageRendering _init_$lambda$1(AvatarImageRendering avatarImageRendering) {
        avatarImageRendering.getClass();
        return avatarImageRendering;
    }

    private final h getSkeletonLoaderDrawable() {
        return (h) this.skeletonLoaderDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h skeletonLoaderDrawable_delegate$lambda$0(Context context) {
        return h.a(context, R.drawable.zuia_skeleton_loader_inbound);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.imageLoaderDisposable;
        if (eVar != null) {
            eVar.a();
        }
        h skeletonLoaderDrawable = getSkeletonLoaderDrawable();
        if (skeletonLoaderDrawable != null) {
            skeletonLoaderDrawable.stop();
        }
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super AvatarImageRendering, ? extends AvatarImageRendering> renderingUpdate) {
        Integer num;
        o oVarA;
        int i11 = 0;
        renderingUpdate.getClass();
        this.rendering = (AvatarImageRendering) renderingUpdate.invoke(this.rendering);
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.rendering.getState().getAvatarSize());
        ShapeableImageView shapeableImageView = this.imageView;
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.rendering.getState().getMask().ordinal()];
        if (i12 == 1) {
            num = 0;
            m mVar = new m();
            m mVar2 = new m();
            m mVar3 = new m();
            m mVar4 = new m();
            n20.a aVar = new n20.a(0.0f);
            n20.a aVar2 = new n20.a(0.0f);
            n20.a aVar3 = new n20.a(0.0f);
            n20.a aVar4 = new n20.a(0.0f);
            f fVar = new f(i11);
            f fVar2 = new f(i11);
            f fVar3 = new f(i11);
            f fVar4 = new f(i11);
            n nVar = new n();
            nVar.f30376a = mVar;
            nVar.f30377b = mVar2;
            nVar.f30378c = mVar3;
            nVar.f30379d = mVar4;
            nVar.f30380e = aVar;
            nVar.f30381f = aVar2;
            nVar.f30382g = aVar3;
            nVar.f30383h = aVar4;
            nVar.f30384i = fVar;
            nVar.f30385j = fVar2;
            nVar.f30386k = fVar3;
            nVar.l = fVar4;
            nVar.c(0.0f);
            oVarA = nVar.a();
        } else {
            if (i12 != 2) {
                e40.a.f();
                return;
            }
            m mVar5 = new m();
            m mVar6 = new m();
            m mVar7 = new m();
            m mVar8 = new m();
            n20.a aVar5 = new n20.a(0.0f);
            n20.a aVar6 = new n20.a(0.0f);
            n20.a aVar7 = new n20.a(0.0f);
            n20.a aVar8 = new n20.a(0.0f);
            f fVar5 = new f(i11);
            f fVar6 = new f(i11);
            f fVar7 = new f(i11);
            num = 0;
            f fVar8 = new f(i11);
            n nVar2 = new n();
            nVar2.f30376a = mVar5;
            nVar2.f30377b = mVar6;
            nVar2.f30378c = mVar7;
            nVar2.f30379d = mVar8;
            nVar2.f30380e = aVar5;
            nVar2.f30381f = aVar6;
            nVar2.f30382g = aVar7;
            nVar2.f30383h = aVar8;
            nVar2.f30384i = fVar5;
            nVar2.f30385j = fVar6;
            nVar2.f30386k = fVar7;
            nVar2.l = fVar8;
            nVar2.c(dimensionPixelSize / 2);
            oVarA = nVar2.a();
        }
        shapeableImageView.setShapeAppearanceModel(oVarA);
        n20.j jVar = new n20.j(oVarA);
        Integer backgroundColor = this.rendering.getState().getBackgroundColor();
        jVar.t(backgroundColor != null ? ColorStateList.valueOf(backgroundColor.intValue()) : null);
        shapeableImageView.setBackground(jVar);
        shapeableImageView.setImageDrawable(getSkeletonLoaderDrawable());
        h skeletonLoaderDrawable = getSkeletonLoaderDrawable();
        if (skeletonLoaderDrawable != null) {
            skeletonLoaderDrawable.start();
        }
        FrameLayout frameLayout = this.container;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        frameLayout.setClipChildren(true);
        frameLayout.setClipToOutline(true);
        ShapeableImageView shapeableImageView2 = this.imageView;
        ViewGroup.LayoutParams layoutParams2 = shapeableImageView2.getLayoutParams();
        layoutParams2.height = dimensionPixelSize;
        layoutParams2.width = dimensionPixelSize;
        e eVar = this.imageLoaderDisposable;
        if (eVar != null) {
            eVar.a();
        }
        Uri uri = this.rendering.getState().getUri();
        if (uri == null) {
            shapeableImageView2.setBackground(null);
            return;
        }
        ImageLoaderFactory imageLoaderFactory = ImageLoaderFactory.INSTANCE;
        Context context = shapeableImageView2.getContext();
        context.getClass();
        d imageLoader = imageLoaderFactory.getImageLoader(context);
        Context context2 = shapeableImageView2.getContext();
        context2.getClass();
        i iVar = new i(context2);
        iVar.f47443c = uri;
        Resources resources = shapeableImageView2.getContext().getResources();
        int i13 = R.drawable.zuia_avatar_default;
        Resources.Theme theme = shapeableImageView2.getContext().getTheme();
        ThreadLocal threadLocal = w6.j.f43256a;
        iVar.f47457r = resources.getDrawable(i13, theme);
        Integer num2 = num;
        iVar.f47456q = num2;
        iVar.f47459t = getSkeletonLoaderDrawable();
        iVar.f47458s = num2;
        iVar.f47455p = getSkeletonLoaderDrawable();
        iVar.f47454o = num2;
        if (!this.rendering.getState().getShouldAnimate()) {
            String string = num2.toString();
            c cVar = iVar.f47453n;
            if (cVar == null) {
                cVar = new c(1);
                iVar.f47453n = cVar;
            }
            cVar.f45424a.put("coil#repeat_count", new zc.o(num2, string));
        }
        iVar.b(shapeableImageView2);
        this.imageLoaderDisposable = ((pc.h) imageLoader).b(iVar.a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ AvatarImageView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarImageView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
