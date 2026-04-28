package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.tgtg.R;
import com.app.tgtg.customview.NoChangingBackgroundTextInputLayout;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f34870y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f34871x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34870y = sparseIntArray;
        sparseIntArray.put(R.id.etLabelTv, 1);
        sparseIntArray.put(R.id.etTextInputLayout, 2);
        sparseIntArray.put(R.id.etTextInputEditText, 3);
        sparseIntArray.put(R.id.helperTv, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(View view) {
        Object[] objArrB0 = a8.k.b0(view, 5, null, f34870y);
        super(null, view, (TextView) objArrB0[1], (TextInputEditText) objArrB0[3], (NoChangingBackgroundTextInputLayout) objArrB0[2], (TextView) objArrB0[4]);
        this.f34871x = -1L;
        ((LinearLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34871x = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34871x = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34871x != 0;
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
