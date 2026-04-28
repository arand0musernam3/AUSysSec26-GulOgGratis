package mm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import java.util.HashMap;
import lm.i;
import nm.e;
import om.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends va.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Activity f29989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f29990k;
    public final HashMap l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, MainActivity mainActivity) {
        super(iVar.getChildFragmentManager(), iVar.getLifecycle());
        mainActivity.getClass();
        this.f29989j = mainActivity;
        this.f29990k = 2;
        this.l = new HashMap();
    }

    @Override // va.d
    public final Fragment c(int i11) {
        Fragment eVar = (i11 == 0 || i11 != 1) ? new e() : new l();
        HashMap map = this.l;
        if (map != null) {
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f29990k;
    }

    public final String h(int i11) {
        Activity activity = this.f29989j;
        if (i11 == 0) {
            String string = activity.getString(R.string.browse_tab_list);
            string.getClass();
            return string;
        }
        String string2 = activity.getString(R.string.browse_tab_map);
        string2.getClass();
        return string2;
    }

    public final Fragment i(int i11) {
        HashMap map = this.l;
        if (map != null) {
            return (Fragment) map.get(Integer.valueOf(i11));
        }
        return null;
    }

    public final View j(int i11) {
        Activity activity = this.f29989j;
        if (i11 == 0) {
            View viewInflate = LayoutInflater.from(activity).inflate(R.layout.browse_viewpager_left_tab, (ViewGroup) null);
            viewInflate.getClass();
            TextView textView = (TextView) viewInflate.findViewById(R.id.tabTitle);
            textView.setTextColor(activity.getColor(R.color.neutral_10));
            textView.setText(h(i11));
            textView.setBackground(activity.getDrawable(R.drawable.browse_viewpager_left_tab_selected));
            return viewInflate;
        }
        View viewInflate2 = LayoutInflater.from(activity).inflate(R.layout.browse_viewpager_right_tab, (ViewGroup) null);
        viewInflate2.getClass();
        TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tabTitle);
        textView2.setTextColor(activity.getColor(R.color.primary_30));
        textView2.setText(h(i11));
        textView2.setBackground(null);
        return viewInflate2;
    }

    public final void k(int i11, View view) {
        view.getClass();
        Activity activity = this.f29989j;
        if (i11 == 0) {
            TextView textView = (TextView) view.findViewById(R.id.tabTitle);
            textView.setTextColor(activity.getColor(R.color.neutral_10));
            textView.setText(h(i11));
            textView.setBackground(activity.getDrawable(R.drawable.browse_viewpager_left_tab_selected));
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tabTitle);
        textView2.setTextColor(activity.getColor(R.color.neutral_10));
        textView2.setText(h(i11));
        textView2.setBackground(activity.getDrawable(R.drawable.browse_viewpager_right_tab_selected));
    }

    public final void l(int i11, View view) {
        view.getClass();
        TextView textView = (TextView) view.findViewById(R.id.tabTitle);
        textView.setTextColor(this.f29989j.getColor(R.color.primary_30));
        textView.setText(h(i11));
        textView.setBackground(null);
    }
}
