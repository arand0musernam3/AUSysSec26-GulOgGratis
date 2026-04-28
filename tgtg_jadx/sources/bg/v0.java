package bg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.tgtg.R;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, cq.e eVar) {
        super(context);
        context.getClass();
        eVar.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.store_badge_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i11 = R.id.imBadgeIcon;
        ImageView imageView = (ImageView) pd.g.t(R.id.imBadgeIcon, viewInflate);
        if (imageView != null) {
            i11 = R.id.tvBadgeLabel;
            TextView textView = (TextView) pd.g.t(R.id.tvBadgeLabel, viewInflate);
            if (textView != null) {
                i11 = R.id.tvCategoryTitle;
                TextView textView2 = (TextView) pd.g.t(R.id.tvCategoryTitle, viewInflate);
                if (textView2 != null) {
                    imageView.setImageResource(eVar.c());
                    textView.setText(eVar.a(context));
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string = getResources().getString(eVar.getTitle());
                    string.getClass();
                    textView2.setText(String.format(string, Arrays.copyOf(new Object[]{r8.k.l(NumberFormat.getInstance().format(Integer.valueOf(eVar.getValue())), "+")}, 1)));
                    return;
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        throw null;
    }
}
