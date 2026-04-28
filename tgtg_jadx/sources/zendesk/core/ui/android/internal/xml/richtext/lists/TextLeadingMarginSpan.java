package zendesk.core.ui.android.internal.xml.richtext.lists;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.braze.Constants;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJh\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/lists/TextLeadingMarginSpan;", "Landroid/text/style/LeadingMarginSpan;", "marginWidth", "", "indentation", "string", "", "<init>", "(IILjava/lang/String;)V", "drawLeadingMargin", "", "c", "Landroid/graphics/Canvas;", Constants.BRAZE_PUSH_PRIORITY_KEY, "Landroid/graphics/Paint;", "x", "dir", "top", "baseline", "bottom", TextBundle.TEXT_ENTRY, "", "start", "end", "first", "", "l", "Landroid/text/Layout;", "getLeadingMargin", "calculateTrueX", "", "isRtl", "layoutWidth", "stringWidth", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextLeadingMarginSpan implements LeadingMarginSpan {
    public static final int $stable = 0;
    private final int indentation;
    private final int marginWidth;

    @NotNull
    private final String string;

    public TextLeadingMarginSpan(int i11, int i12, @NotNull String str) {
        str.getClass();
        this.marginWidth = i11;
        this.indentation = i12;
        this.string = str;
    }

    private final float calculateTrueX(boolean isRtl, int layoutWidth, float stringWidth) {
        int i11 = this.marginWidth;
        return isRtl ? (layoutWidth - (i11 * this.indentation)) - stringWidth : i11 * this.indentation;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@NotNull Canvas c3, @NotNull Paint p7, int x11, int dir, int top, int baseline, int bottom, @NotNull CharSequence text, int start, int end, boolean first, @NotNull Layout l) {
        c3.getClass();
        p7.getClass();
        text.getClass();
        l.getClass();
        boolean z11 = ((Spanned) text).getSpanStart(this) == start;
        float fMeasureText = p7.measureText(this.string);
        boolean z12 = dir == -1;
        if (z11) {
            c3.drawText(this.string, calculateTrueX(z12, l.getWidth(), fMeasureText), baseline, p7);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        return this.marginWidth;
    }
}
