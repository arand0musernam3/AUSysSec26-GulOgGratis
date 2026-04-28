package zendesk.ui.android.conversation.composer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007J\u0012\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\u000bJ\u0010\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\u000bJ\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\u0018\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lzendesk/ui/android/conversation/composer/MessageComposerAttachmentMenu;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "gallerySupported", "", "cameraSupported", "itemClickListener", "Lkotlin/Function1;", "", "", "cameraTextView", "Landroid/widget/TextView;", "galleryTextView", "updateAccessibilityNodeInfo", "view", "Landroid/view/View;", "setOnItemClickListener", "listener", "setGallerySupported", "setCameraSupported", "setMenuItemTextColor", "color", "setMenuBackgroundColor", "setMenuTextAndIconColor", "applyIconTintToTextView", "textView", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageComposerAttachmentMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComposerAttachmentMenu.kt\nzendesk/ui/android/conversation/composer/MessageComposerAttachmentMenu\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,121:1\n28#2:122\n*S KotlinDebug\n*F\n+ 1 MessageComposerAttachmentMenu.kt\nzendesk/ui/android/conversation/composer/MessageComposerAttachmentMenu\n*L\n91#1:122\n*E\n"})
public final class MessageComposerAttachmentMenu extends FrameLayout {
    public static final int $stable = 8;
    private boolean cameraSupported;

    @NotNull
    private final TextView cameraTextView;
    private boolean gallerySupported;

    @NotNull
    private final TextView galleryTextView;

    @Nullable
    private Function1<? super Integer, Unit> itemClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComposerAttachmentMenu(@NotNull Context context) {
        super(context);
        context.getClass();
        this.gallerySupported = true;
        this.cameraSupported = true;
        View.inflate(context, R.layout.zuia_view_attachment_menu, this);
        View viewFindViewById = findViewById(R.id.menu_item_camera);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.cameraTextView = textView;
        View viewFindViewById2 = findViewById(R.id.menu_item_gallery);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.galleryTextView = textView2;
        updateAccessibilityNodeInfo(textView);
        updateAccessibilityNodeInfo(textView2);
        final int i11 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.composer.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageComposerAttachmentMenu f47822b;

            {
                this.f47822b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        MessageComposerAttachmentMenu._init_$lambda$0(this.f47822b, view);
                        break;
                    default:
                        MessageComposerAttachmentMenu._init_$lambda$1(this.f47822b, view);
                        break;
                }
            }
        });
        final int i12 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.composer.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageComposerAttachmentMenu f47822b;

            {
                this.f47822b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        MessageComposerAttachmentMenu._init_$lambda$0(this.f47822b, view);
                        break;
                    default:
                        MessageComposerAttachmentMenu._init_$lambda$1(this.f47822b, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MessageComposerAttachmentMenu messageComposerAttachmentMenu, View view) {
        Function1<? super Integer, Unit> function1 = messageComposerAttachmentMenu.itemClickListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(R.id.menu_item_camera));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(MessageComposerAttachmentMenu messageComposerAttachmentMenu, View view) {
        Function1<? super Integer, Unit> function1 = messageComposerAttachmentMenu.itemClickListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(R.id.menu_item_gallery));
        }
    }

    private final void applyIconTintToTextView(TextView textView, int color) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        textView.getClass();
        textView.setCompoundDrawableTintList(colorStateListValueOf);
        textView.setCompoundDrawableTintMode(PorterDuff.Mode.SRC_ATOP);
    }

    private final void setMenuItemTextColor(int color) {
        this.cameraTextView.setTextColor(color);
        this.galleryTextView.setTextColor(color);
    }

    private final void updateAccessibilityNodeInfo(View view) {
        view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: zendesk.ui.android.conversation.composer.MessageComposerAttachmentMenu.updateAccessibilityNodeInfo.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setClassName("android.widget.Button");
            }
        });
    }

    public final void setCameraSupported(boolean cameraSupported) {
        this.cameraSupported = cameraSupported;
        this.cameraTextView.setVisibility(cameraSupported ? 0 : 8);
    }

    public final void setGallerySupported(boolean gallerySupported) {
        this.gallerySupported = gallerySupported;
        this.galleryTextView.setVisibility(gallerySupported ? 0 : 8);
    }

    public final void setMenuBackgroundColor(int color) {
        setBackground(new ColorDrawable(color));
    }

    public final void setMenuTextAndIconColor(int color) {
        setMenuItemTextColor(color);
        applyIconTintToTextView(this.cameraTextView, color);
        applyIconTintToTextView(this.galleryTextView, color);
    }

    public final void setOnItemClickListener(@NotNull Function1<? super Integer, Unit> listener) {
        listener.getClass();
        this.itemClickListener = listener;
    }
}
