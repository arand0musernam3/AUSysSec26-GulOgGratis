package zendesk.core.ui.android.internal.xml.richtext.lists;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/lists/Ul;", "Lzendesk/core/ui/android/internal/xml/richtext/lists/ListTag;", "<init>", "()V", "openItem", "", TextBundle.TEXT_ENTRY, "Landroid/text/Editable;", "closeItem", "indentation", "", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTag.kt\nzendesk/core/ui/android/internal/xml/richtext/lists/Ul\n+ 2 TextSpanUtils.kt\nzendesk/core/ui/android/internal/xml/richtext/lists/TextSpanUtils\n*L\n1#1,79:1\n35#2:80\n*S KotlinDebug\n*F\n+ 1 ListTag.kt\nzendesk/core/ui/android/internal/xml/richtext/lists/Ul\n*L\n52#1:80\n*E\n"})
public final class Ul implements ListTag {
    public static final int $stable = 0;

    @Override // zendesk.core.ui.android.internal.xml.richtext.lists.ListTag
    public void closeItem(@NotNull Editable text, int indentation) {
        text.getClass();
        TextSpanUtils textSpanUtils = TextSpanUtils.INSTANCE;
        textSpanUtils.appendNewLine(text);
        Object[] spans = text.getSpans(0, text.length(), BulletListItem.class);
        spans.getClass();
        BulletListItem bulletListItem = (BulletListItem) ((Mark) y.K(spans));
        if (bulletListItem != null) {
            textSpanUtils.setSpanFromMark(text, bulletListItem, new TextLeadingMarginSpan(50, indentation, "•"));
        }
    }

    @Override // zendesk.core.ui.android.internal.xml.richtext.lists.ListTag
    public void openItem(@NotNull Editable text) {
        text.getClass();
        TextSpanUtils textSpanUtils = TextSpanUtils.INSTANCE;
        textSpanUtils.appendNewLine(text);
        textSpanUtils.start(text, new BulletListItem());
    }
}
