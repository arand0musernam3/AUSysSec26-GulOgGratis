package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends a8.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f34853t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f34854s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34853t = sparseIntArray;
        sparseIntArray.put(R.id.carouselV2InnerLayout, 1);
        sparseIntArray.put(R.id.carouselV2TextLayout, 2);
        sparseIntArray.put(R.id.titleTv, 3);
        sparseIntArray.put(R.id.subTitleTv, 4);
        sparseIntArray.put(R.id.heroCarouselTextLayout, 5);
        sparseIntArray.put(R.id.heroTitleTv, 6);
        sparseIntArray.put(R.id.heroSubTitleTv, 7);
        sparseIntArray.put(R.id.itemsRV, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(View view) {
        super(0, view, null);
        Object[] objArrB0 = a8.k.b0(view, 9, null, f34853t);
        LinearLayout linearLayout = (LinearLayout) objArrB0[0];
        this.f34854s = -1L;
        linearLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34854s = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34854s = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34854s != 0;
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
