package zm;

import androidx.fragment.app.Fragment;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.about.ManufacturerAboutActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends va.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f47997j;

    public g(ManufacturerAboutActivity manufacturerAboutActivity) {
        super(manufacturerAboutActivity.getSupportFragmentManager(), manufacturerAboutActivity.getLifecycle());
        this.f47997j = new ArrayList();
    }

    @Override // va.d
    public final Fragment c(int i11) {
        return (Fragment) this.f47997j.get(i11);
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f47997j.size();
    }
}
