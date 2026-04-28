package zendesk.core.ui.android.internal.xml.richtext.lists;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzendesk/core/ui/android/internal/xml/richtext/lists/NumberListItem;", "Lzendesk/core/ui/android/internal/xml/richtext/lists/Mark;", "number", "", "<init>", "(I)V", "getNumber", "()I", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NumberListItem implements Mark {
    public static final int $stable = 0;
    private final int number;

    public NumberListItem(int i11) {
        this.number = i11;
    }

    public final int getNumber() {
        return this.number;
    }
}
