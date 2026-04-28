package wa;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z1;
import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements z1 {
    @Override // androidx.recyclerview.widget.z1
    public final void c(View view) {
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) aVar).width == -1 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
            return;
        }
        h2.b("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // androidx.recyclerview.widget.z1
    public final void b(View view) {
    }
}
