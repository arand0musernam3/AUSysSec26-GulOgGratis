package zendesk.core.ui.android.internal.xml.richtext.lists;

import android.text.Editable;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/lists/ListTag;", "", "openItem", "", TextBundle.TEXT_ENTRY, "Landroid/text/Editable;", "closeItem", "indentation", "", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ListTag {
    void closeItem(@NotNull Editable text, int indentation);

    void openItem(@NotNull Editable text);
}
