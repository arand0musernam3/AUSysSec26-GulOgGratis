package pg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.app.tgtg.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends f2 {
    public static final SparseIntArray A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f34878z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.aboutViewPager, 1);
        sparseIntArray.put(R.id.ivSkip, 2);
        sparseIntArray.put(R.id.aboutTabLayout, 3);
        sparseIntArray.put(R.id.btnNext, 4);
        sparseIntArray.put(R.id.btnBack, 5);
        sparseIntArray.put(R.id.btnGotIt, 6);
        sparseIntArray.put(R.id.barrier, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g2(View view) {
        Object[] objArrB0 = a8.k.b0(view, 8, null, A);
        TabLayout tabLayout = (TabLayout) objArrB0[3];
        ViewPager2 viewPager2 = (ViewPager2) objArrB0[1];
        super(null, view, tabLayout, viewPager2, (AppCompatButton) objArrB0[5], (AppCompatButton) objArrB0[6], (AppCompatButton) objArrB0[4], (AppCompatImageView) objArrB0[2]);
        this.f34878z = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34878z = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34878z = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34878z != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }
}
