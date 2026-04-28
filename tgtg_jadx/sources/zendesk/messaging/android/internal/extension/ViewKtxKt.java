package zendesk.messaging.android.internal.extension;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import j80.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Landroid/widget/LinearLayout$LayoutParams;", "", "block", "edgeToEdge", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "(Landroid/view/View;)V", "wrap", "", "", "factor", "adjustAlpha", "(IF)I", "DEFAULT_ALPHA_FACTOR", "F", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ViewKtxKt {
    private static final float DEFAULT_ALPHA_FACTOR = 0.5f;

    public static final int adjustAlpha(int i11, float f11) {
        return Color.argb(c.b(Color.alpha(i11) * f11), Color.red(i11), Color.green(i11), Color.blue(i11));
    }

    public static /* synthetic */ int adjustAlpha$default(int i11, float f11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f11 = DEFAULT_ALPHA_FACTOR;
        }
        return adjustAlpha(i11, f11);
    }

    public static final void edgeToEdge(@NotNull View view, @NotNull Function1<? super LinearLayout.LayoutParams, Unit> function1) {
        view.getClass();
        function1.getClass();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void wrap(@NotNull View view, @NotNull Function1<? super LinearLayout.LayoutParams, Unit> function1) {
        view.getClass();
        function1.getClass();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void edgeToEdge(@NotNull View view) {
        view.getClass();
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}
