package zendesk.ui.android.conversation.file;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.format.Formatter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m2.b2;
import nv.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u001aH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lzendesk/ui/android/conversation/file/FileView;", "Landroid/widget/RelativeLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/file/FileRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "fileIcon", "Landroid/widget/ImageView;", "fileName", "Landroid/widget/TextView;", "fileSize", "rendering", "render", "", "renderingUpdate", "Lkotlin/Function1;", "setupAccessibilityAnnouncement", "getFormattedFileSize", "", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileView.kt\nzendesk/ui/android/conversation/file/FileView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class FileView extends RelativeLayout implements Renderer<FileRendering> {
    public static final int $stable = 8;

    @NotNull
    private final ImageView fileIcon;

    @NotNull
    private final TextView fileName;

    @NotNull
    private final TextView fileSize;

    @NotNull
    private FileRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new FileRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_TextCellStyle, false);
        View.inflate(context, R.layout.zuia_view_file_cell, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.zuia_horizontal_message_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.zuia_vertical_message_padding);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setClickable(true);
        setFocusable(true);
        View viewFindViewById = findViewById(R.id.zuia_file_icon);
        viewFindViewById.getClass();
        this.fileIcon = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_file_name);
        viewFindViewById2.getClass();
        this.fileName = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_file_size);
        viewFindViewById3.getClass();
        this.fileSize = (TextView) viewFindViewById3;
        render(new a(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileRendering _init_$lambda$0(FileRendering fileRendering) {
        fileRendering.getClass();
        return fileRendering;
    }

    private final String getFormattedFileSize(long fileSize) {
        long j9 = 1000;
        long j11 = fileSize * j9 * j9;
        long j12 = 1024;
        String fileSize2 = Formatter.formatFileSize(getContext(), (j11 / j12) / j12);
        fileSize2.getClass();
        return fileSize2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(FileView fileView) {
        fileView.rendering.getOnCellClicked$zendesk_ui_ui_android().invoke();
        return Unit.f26487a;
    }

    private final void setupAccessibilityAnnouncement() {
        setContentDescription(getContext().getString(R.string.zuia_accessibility_file_name_announcement, this.fileName.getText(), this.fileSize.getText()));
        AccessibilityExtKt.overrideAccessibilityNodeClassNameInfo(this, Button.class.getName());
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super FileRendering, ? extends FileRendering> renderingUpdate) {
        renderingUpdate.getClass();
        FileState state$zendesk_ui_ui_android = this.rendering.getState();
        FileRendering fileRendering = (FileRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = fileRendering;
        if (Intrinsics.areEqual(state$zendesk_ui_ui_android, fileRendering.getState())) {
            return;
        }
        this.fileName.setText(this.rendering.getState().getFileName$zendesk_ui_ui_android());
        this.fileSize.setText(getFormattedFileSize(this.rendering.getState().getFileSize$zendesk_ui_ui_android()));
        Integer backgroundDrawable$zendesk_ui_ui_android = this.rendering.getState().getBackgroundDrawable$zendesk_ui_ui_android();
        if (backgroundDrawable$zendesk_ui_ui_android != null) {
            setBackgroundResource(backgroundDrawable$zendesk_ui_ui_android.intValue());
        }
        if (getBackground() != null) {
            getBackground().setTint(this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android());
        }
        int textColor$zendesk_ui_ui_android = this.rendering.getState().getTextColor$zendesk_ui_ui_android();
        this.fileName.setTextColor(textColor$zendesk_ui_ui_android);
        this.fileSize.setTextColor(textColor$zendesk_ui_ui_android);
        this.fileIcon.setColorFilter(this.rendering.getState().getIconColor$zendesk_ui_ui_android(), PorterDuff.Mode.SRC_IN);
        setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new b2(this, 7), 1, null));
        setupAccessibilityAnnouncement();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ FileView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
