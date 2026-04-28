package zendesk.ui.android.internal;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import j80.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0001H\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, d2 = {"resolveColorAttr", "", "Landroid/content/Context;", "colorAttr", "getColorCompat", "colorRes", "adjustAlpha", "factor", "", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ColorExtKt {
    public static final int adjustAlpha(int i11, float f11) {
        return Color.argb(c.b(Color.alpha(i11) * f11), Color.red(i11), Color.green(i11), Color.blue(i11));
    }

    public static final int getColorCompat(@NotNull Context context, int i11) {
        context.getClass();
        return context.getColor(i11);
    }

    public static final int resolveColorAttr(@NotNull Context context, int i11) {
        context.getClass();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.data;
    }
}
