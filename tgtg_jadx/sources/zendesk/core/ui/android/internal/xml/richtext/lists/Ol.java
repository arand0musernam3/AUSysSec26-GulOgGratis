package zendesk.core.ui.android.internal.xml.richtext.lists;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/lists/Ol;", "Lzendesk/core/ui/android/internal/xml/richtext/lists/ListTag;", "<init>", "()V", "index", "", "openItem", "", TextBundle.TEXT_ENTRY, "Landroid/text/Editable;", "closeItem", "indentation", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTag.kt\nzendesk/core/ui/android/internal/xml/richtext/lists/Ol\n+ 2 TextSpanUtils.kt\nzendesk/core/ui/android/internal/xml/richtext/lists/TextSpanUtils\n*L\n1#1,79:1\n35#2:80\n*S KotlinDebug\n*F\n+ 1 ListTag.kt\nzendesk/core/ui/android/internal/xml/richtext/lists/Ol\n*L\n74#1:80\n*E\n"})
public final class Ol implements ListTag {
    public static final int $stable = 8;
    private int index = 1;

    @Override // zendesk.core.ui.android.internal.xml.richtext.lists.ListTag
    public void closeItem(@NotNull Editable text, int indentation) {
        text.getClass();
        TextSpanUtils textSpanUtils = TextSpanUtils.INSTANCE;
        textSpanUtils.appendNewLine(text);
        Object[] spans = text.getSpans(0, text.length(), NumberListItem.class);
        spans.getClass();
        NumberListItem numberListItem = (NumberListItem) ((Mark) y.K(spans));
        if (numberListItem != null) {
            textSpanUtils.setSpanFromMark(text, numberListItem, new TextLeadingMarginSpan(50, indentation, numberListItem.getNumber() + "."));
        }
    }

    @Override // zendesk.core.ui.android.internal.xml.richtext.lists.ListTag
    public void openItem(@NotNull Editable text) {
        text.getClass();
        TextSpanUtils textSpanUtils = TextSpanUtils.INSTANCE;
        textSpanUtils.appendNewLine(text);
        textSpanUtils.start(text, new NumberListItem(this.index));
        this.index++;
    }
}
