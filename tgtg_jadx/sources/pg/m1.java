package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends l1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f34988y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f34989x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34988y = sparseIntArray;
        sparseIntArray.put(R.id.provinceTextLL, 1);
        sparseIntArray.put(R.id.provinceNameTv, 2);
        sparseIntArray.put(R.id.provinceAbbreviationTv, 3);
        sparseIntArray.put(R.id.selectedIndicatorIv, 4);
        sparseIntArray.put(R.id.horizontalLine, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m1(View view) {
        Object[] objArrB0 = a8.k.b0(view, 6, null, f34988y);
        super(null, view, (TextView) objArrB0[3], (TextView) objArrB0[2], (LinearLayout) objArrB0[1], (ImageView) objArrB0[4]);
        this.f34989x = -1L;
        ((LinearLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34989x = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34989x = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34989x != 0;
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
