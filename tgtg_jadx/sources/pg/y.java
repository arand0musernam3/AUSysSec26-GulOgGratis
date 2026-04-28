package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends x {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f35274x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f35275w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35274x = sparseIntArray;
        sparseIntArray.put(R.id.btnBack, 1);
        sparseIntArray.put(R.id.toolbarTitle, 2);
        sparseIntArray.put(R.id.scrollView, 3);
        sparseIntArray.put(R.id.llDescription, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(View view) {
        Object[] objArrB0 = a8.k.b0(view, 5, null, f35274x);
        ImageButton imageButton = (ImageButton) objArrB0[1];
        LinearLayout linearLayout = (LinearLayout) objArrB0[4];
        super(null, view, imageButton, linearLayout, (TextView) objArrB0[2]);
        this.f35275w = -1L;
        ((CardView) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f35275w = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35275w = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35275w != 0;
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
