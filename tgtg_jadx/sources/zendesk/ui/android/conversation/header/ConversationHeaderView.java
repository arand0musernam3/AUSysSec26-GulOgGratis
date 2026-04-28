package zendesk.ui.android.conversation.header;

import ad.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import bd.b;
import cd.c;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pc.d;
import zc.e;
import zc.i;
import zendesk.core.ui.android.internal.xml.InsetType;
import zendesk.core.ui.android.internal.xml.SystemWindowInsetsKt;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.bottomsheet.a;
import zendesk.ui.android.internal.ImageLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00132\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lzendesk/ui/android/conversation/header/ConversationHeaderView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/header/ConversationHeaderRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "Landroid/app/Activity;", "getActivity", "(Landroid/view/View;)Landroid/app/Activity;", "Lzendesk/ui/android/conversation/header/ConversationHeaderState;", "state", "", "configureToolbarAccessibility", "(Lzendesk/ui/android/conversation/header/ConversationHeaderState;)V", "Landroid/widget/ImageButton;", "button", "addAccessibilityFocusStateForNavigationButton", "(Landroid/widget/ImageButton;)V", "Landroid/widget/TextView;", "headerTitle", "addContentDescriptionToHeader", "(Landroid/widget/TextView;Lzendesk/ui/android/conversation/header/ConversationHeaderState;)V", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "onDetachedFromWindow", "()V", "Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "Lzc/e;", "imageLoaderDisposable", "Lzc/e;", "rendering", "Lzendesk/ui/android/conversation/header/ConversationHeaderRendering;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationHeaderView.kt\nzendesk/ui/android/conversation/header/ConversationHeaderView\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,187:1\n845#2,9:188\n*S KotlinDebug\n*F\n+ 1 ConversationHeaderView.kt\nzendesk/ui/android/conversation/header/ConversationHeaderView\n*L\n114#1:188,9\n*E\n"})
public final class ConversationHeaderView extends FrameLayout implements Renderer<ConversationHeaderRendering> {
    public static final int $stable = 8;

    @Nullable
    private e imageLoaderDisposable;

    @NotNull
    private ConversationHeaderRendering rendering;

    @NotNull
    private final MaterialToolbar toolbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ConversationHeaderRendering();
        View.inflate(context, R.layout.zuia_view_conversation_header, this);
        View viewFindViewById = findViewById(R.id.zuia_conversation_header_toolbar);
        viewFindViewById.getClass();
        this.toolbar = (MaterialToolbar) viewFindViewById;
        render(new zendesk.ui.android.conversation.form.e(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationHeaderRendering _init_$lambda$0(ConversationHeaderRendering conversationHeaderRendering) {
        conversationHeaderRendering.getClass();
        return conversationHeaderRendering;
    }

    private final void addAccessibilityFocusStateForNavigationButton(final ImageButton button) {
        button.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: zendesk.ui.android.conversation.header.ConversationHeaderView.addAccessibilityFocusStateForNavigationButton.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setEnabled(host.isEnabled());
                if (!info.isAccessibilityFocused()) {
                    ImageButton imageButton = button;
                    Integer backgroundColor$zendesk_ui_ui_android = ConversationHeaderView.this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android();
                    imageButton.setBackground(backgroundColor$zendesk_ui_ui_android != null ? new ColorDrawable(backgroundColor$zendesk_ui_ui_android.intValue()) : null);
                    return;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
                shapeDrawable.getPaint().setStrokeWidth(ConversationHeaderView.this.getResources().getDimensionPixelSize(R.dimen.zuia_ic_back_arrow_focus_highlight_width));
                Integer titleColor$zendesk_ui_ui_android = ConversationHeaderView.this.rendering.getState().getTitleColor$zendesk_ui_ui_android();
                if (titleColor$zendesk_ui_ui_android != null) {
                    shapeDrawable.getPaint().setColor(titleColor$zendesk_ui_ui_android.intValue());
                }
                button.setBackground(shapeDrawable);
            }
        });
    }

    private final void addContentDescriptionToHeader(TextView headerTitle, ConversationHeaderState state) {
        headerTitle.setContentDescription(state.getAccessibilityTitle$zendesk_ui_ui_android());
        ViewCompat.c0(headerTitle, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void configureToolbarAccessibility(zendesk.ui.android.conversation.header.ConversationHeaderState r7) {
        /*
            r6 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r6.toolbar
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L49
            com.google.android.material.appbar.MaterialToolbar r2 = r6.toolbar
            android.view.View r2 = r2.getChildAt(r1)
            r2.getClass()
            boolean r3 = r2 instanceof android.widget.ImageButton
            if (r3 == 0) goto L2d
            r3 = r2
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            android.graphics.drawable.Drawable r4 = r3.getDrawable()
            com.google.android.material.appbar.MaterialToolbar r5 = r6.toolbar
            android.graphics.drawable.Drawable r5 = r5.getNavigationIcon()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L2d
            r6.addAccessibilityFocusStateForNavigationButton(r3)
            goto L46
        L2d:
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L46
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r3 = r2.getText()
            com.google.android.material.appbar.MaterialToolbar r4 = r6.toolbar
            java.lang.CharSequence r4 = r4.getTitle()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L46
            r6.addContentDescriptionToHeader(r2, r7)
        L46:
            int r1 = r1 + 1
            goto L7
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.conversation.header.ConversationHeaderView.configureToolbarAccessibility(zendesk.ui.android.conversation.header.ConversationHeaderState):void");
    }

    private final Activity getActivity(View view) {
        Context context = view.getContext();
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.imageLoaderDisposable;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ConversationHeaderRendering, ? extends ConversationHeaderRendering> renderingUpdate) {
        Window window;
        renderingUpdate.getClass();
        this.rendering = (ConversationHeaderRendering) renderingUpdate.invoke(this.rendering);
        final MaterialToolbar materialToolbar = this.toolbar;
        SystemWindowInsetsKt.applyWindowInsets(materialToolbar, InsetType.TOP, InsetType.HORIZONTAL);
        Function0<Unit> onBackButtonClicked$zendesk_ui_ui_android = this.rendering.getOnBackButtonClicked$zendesk_ui_ui_android();
        int i11 = 1;
        if (onBackButtonClicked$zendesk_ui_ui_android != null) {
            materialToolbar.setTitleMarginStart(materialToolbar.getResources().getDimensionPixelSize(R.dimen.zuia_header_logo_content_insert));
            materialToolbar.setNavigationIcon(R.drawable.zuia_ic_arrow_back);
            Integer backButtonColor$zendesk_ui_ui_android = this.rendering.getState().getBackButtonColor$zendesk_ui_ui_android();
            if (backButtonColor$zendesk_ui_ui_android != null) {
                int iIntValue = backButtonColor$zendesk_ui_ui_android.intValue();
                Drawable navigationIcon = materialToolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    navigationIcon.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_ATOP));
                }
            }
            materialToolbar.setNavigationContentDescription(materialToolbar.getResources().getString(R.string.zuia_back_button_accessibility_label));
            materialToolbar.setNavigationOnClickListener(new a(onBackButtonClicked$zendesk_ui_ui_android, i11));
        } else {
            materialToolbar.setTitleMarginStart(materialToolbar.getResources().getDimensionPixelSize(R.dimen.zuia_header_logo_margin));
            materialToolbar.setNavigationOnClickListener(null);
        }
        Integer backgroundColor$zendesk_ui_ui_android = this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android();
        if (backgroundColor$zendesk_ui_ui_android != null) {
            materialToolbar.setBackground(new ColorDrawable(backgroundColor$zendesk_ui_ui_android.intValue()));
        }
        Integer statusBarColor$zendesk_ui_ui_android = this.rendering.getState().getStatusBarColor$zendesk_ui_ui_android();
        if (statusBarColor$zendesk_ui_ui_android != null) {
            int iIntValue2 = statusBarColor$zendesk_ui_ui_android.intValue();
            Activity activity = getActivity(materialToolbar);
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setStatusBarColor(iIntValue2);
            }
        }
        Integer titleColor$zendesk_ui_ui_android = this.rendering.getState().getTitleColor$zendesk_ui_ui_android();
        if (titleColor$zendesk_ui_ui_android != null) {
            int iIntValue3 = titleColor$zendesk_ui_ui_android.intValue();
            materialToolbar.setTitleTextColor(iIntValue3);
            materialToolbar.setSubtitleTextColor(iIntValue3);
        }
        materialToolbar.setTitle(this.rendering.getState().getTitle$zendesk_ui_ui_android());
        materialToolbar.setSubtitle(this.rendering.getState().getDescription$zendesk_ui_ui_android());
        configureToolbarAccessibility(this.rendering.getState());
        Uri imageUrl$zendesk_ui_ui_android = this.rendering.getState().getImageUrl$zendesk_ui_ui_android();
        if (imageUrl$zendesk_ui_ui_android == null) {
            materialToolbar.setLogo((Drawable) null);
            return;
        }
        int dimensionPixelSize = materialToolbar.getResources().getDimensionPixelSize(R.dimen.zuia_avatar_image_size);
        ImageLoaderFactory imageLoaderFactory = ImageLoaderFactory.INSTANCE;
        Context context = materialToolbar.getContext();
        context.getClass();
        d imageLoader = imageLoaderFactory.getImageLoader(context);
        Context context2 = materialToolbar.getContext();
        context2.getClass();
        i iVar = new i(context2);
        iVar.f47443c = imageUrl$zendesk_ui_ui_android;
        iVar.f47460u = new ad.e(new h(new ad.a(dimensionPixelSize), new ad.a(dimensionPixelSize)));
        iVar.f47461v = null;
        iVar.f47462w = null;
        iVar.f47463x = null;
        iVar.f47447g = a.a.O(y.T(new c[]{new cd.a()}));
        iVar.f47444d = new b() { // from class: zendesk.ui.android.conversation.header.ConversationHeaderView$render$lambda$11$lambda$9$$inlined$target$default$1
            @Override // bd.b
            public void onSuccess(Drawable result) {
                materialToolbar.setLogo(result);
            }

            @Override // bd.b
            public void onError(Drawable error) {
            }

            @Override // bd.b
            public void onStart(Drawable placeholder) {
            }
        };
        iVar.f47461v = null;
        iVar.f47462w = null;
        iVar.f47463x = null;
        this.imageLoaderDisposable = ((pc.h) imageLoader).b(iVar.a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ConversationHeaderView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationHeaderView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
