package zendesk.core.ui.android.internal.xml.richtext.codeblock;

import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;
import kotlin.text.y;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003J \u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u001c\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0018"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/codeblock/CodeBlockHandler;", "", "codeBlockTextColor", "", "codeBlockBackgroundColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "handle", "", "opening", "", "output", "Landroid/text/Editable;", "currentLength", "applyStyleForCodeBlock", "start", "end", "getLastSpan", TextBundle.TEXT_ENTRY, "kind", "Ljava/lang/Class;", "Companion", "CodeBlockMarker", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CodeBlockHandler {
    public static final int $stable = 0;

    @NotNull
    public static final String BR_TAG = "<br>";

    @NotNull
    public static final String MONOSPACE_FONT = "monospace";

    @NotNull
    public static final String NEWLINE_REGEX = "\\n";

    @Nullable
    private final Integer codeBlockBackgroundColor;

    @Nullable
    private final Integer codeBlockTextColor;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/codeblock/CodeBlockHandler$CodeBlockMarker;", "", "<init>", "()V", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CodeBlockMarker {

        @NotNull
        public static final CodeBlockMarker INSTANCE = new CodeBlockMarker();

        private CodeBlockMarker() {
        }
    }

    public CodeBlockHandler(@Nullable Integer num, @Nullable Integer num2) {
        this.codeBlockTextColor = num;
        this.codeBlockBackgroundColor = num2;
    }

    private final void applyStyleForCodeBlock(Editable output, int start, int end) {
        output.setSpan(new TypefaceSpan(MONOSPACE_FONT), start, end, 33);
        Integer num = this.codeBlockTextColor;
        if (num != null) {
            output.setSpan(new ForegroundColorSpan(num.intValue()), start, end, 33);
        }
        Integer num2 = this.codeBlockBackgroundColor;
        if (num2 != null) {
            output.setSpan(new BackgroundColorSpan(num2.intValue()), start, end, 33);
        }
    }

    private final int getLastSpan(Editable text, Class<?> kind) {
        Object[] spans = text.getSpans(0, text.length(), kind);
        spans.getClass();
        if (spans.length == 0) {
            return -1;
        }
        return text.getSpanStart(spans[spans.length - 1]);
    }

    public final void handle(boolean opening, @NotNull Editable output, int currentLength) {
        output.getClass();
        if (opening) {
            output.setSpan(CodeBlockMarker.INSTANCE, currentLength, currentLength, 0);
            return;
        }
        int lastSpan = getLastSpan(output, CodeBlockMarker.class);
        if (lastSpan == -1) {
            return;
        }
        output.removeSpan(CodeBlockMarker.INSTANCE);
        if (lastSpan != currentLength) {
            String strHtmlEncode = TextUtils.htmlEncode(output.subSequence(lastSpan, currentLength).toString());
            strHtmlEncode.getClass();
            Spanned spannedFromHtml = Html.fromHtml(y.n(strHtmlEncode, NEWLINE_REGEX, BR_TAG, false), 0);
            spannedFromHtml.getClass();
            output.replace(lastSpan, currentLength, spannedFromHtml);
            applyStyleForCodeBlock(output, lastSpan, spannedFromHtml.length() + lastSpan);
        }
    }
}
