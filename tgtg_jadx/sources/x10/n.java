package x10;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCalendarGridView f43708b;

    public n(LinearLayout linearLayout, boolean z11) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f43707a = textView;
        ViewCompat.c0(textView, true);
        this.f43708b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z11) {
            return;
        }
        textView.setVisibility(8);
    }
}
