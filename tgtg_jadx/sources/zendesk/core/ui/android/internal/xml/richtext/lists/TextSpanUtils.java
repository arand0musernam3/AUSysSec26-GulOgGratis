package zendesk.core.ui.android.internal.xml.richtext.lists;

import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b0;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ$\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f2\u0006\u0010\b\u001a\u00020\rH\u0086\b¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0001J\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/lists/TextSpanUtils;", "", "<init>", "()V", "GAP_WIDTH", "", "appendNewLine", "", TextBundle.TEXT_ENTRY, "Landroid/text/Editable;", "getLast", "T", "Lzendesk/core/ui/android/internal/xml/richtext/lists/Mark;", "Landroid/text/Spanned;", "(Landroid/text/Spanned;)Lzendesk/core/ui/android/internal/xml/richtext/lists/Mark;", "setSpanFromMark", "Landroid/text/Spannable;", "mark", "styleSpan", "start", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextSpanUtils {
    public static final int $stable = 0;
    public static final int GAP_WIDTH = 50;

    @NotNull
    public static final TextSpanUtils INSTANCE = new TextSpanUtils();

    private TextSpanUtils() {
    }

    public final void appendNewLine(@NotNull Editable text) {
        text.getClass();
        if (text.length() <= 0 || b0.w(text) == '\n') {
            return;
        }
        text.append("\n");
    }

    public final /* synthetic */ <T extends Mark> T getLast(Spanned text) {
        text.getClass();
        int length = text.length();
        Intrinsics.reifiedOperationMarker(4, "T");
        Object[] spans = text.getSpans(0, length, Mark.class);
        spans.getClass();
        return (T) y.K(spans);
    }

    public final void setSpanFromMark(@NotNull Spannable text, @NotNull Mark mark, @NotNull Object styleSpan) {
        text.getClass();
        mark.getClass();
        styleSpan.getClass();
        int spanStart = text.getSpanStart(mark);
        text.removeSpan(mark);
        int length = text.length();
        if (spanStart != length) {
            text.setSpan(styleSpan, spanStart, length, 33);
        }
    }

    public final void start(@NotNull Spannable text, @NotNull Mark mark) {
        text.getClass();
        mark.getClass();
        int length = text.length();
        text.setSpan(mark, length, length, 17);
    }
}
