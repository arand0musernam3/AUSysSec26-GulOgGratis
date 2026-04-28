package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.tgtg.R;
import com.app.tgtg.customview.MenuItemView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.svMenuItems, 2);
        sparseIntArray.put(R.id.miMyProfile, 3);
        sparseIntArray.put(R.id.miPaymentCards, 4);
        sparseIntArray.put(R.id.miVouchers, 5);
        sparseIntArray.put(R.id.miNotificationSettings, 6);
        sparseIntArray.put(R.id.miUnlockedStores, 7);
        sparseIntArray.put(R.id.miLogout, 8);
        sparseIntArray.put(R.id.tvVersion, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(View view) {
        Object[] objArrB0 = a8.k.b0(view, 10, null, C);
        MenuItemView menuItemView = (MenuItemView) objArrB0[8];
        MenuItemView menuItemView2 = (MenuItemView) objArrB0[3];
        MenuItemView menuItemView3 = (MenuItemView) objArrB0[6];
        MenuItemView menuItemView4 = (MenuItemView) objArrB0[4];
        MenuItemView menuItemView5 = (MenuItemView) objArrB0[7];
        MenuItemView menuItemView6 = (MenuItemView) objArrB0[5];
        Object obj = objArrB0[1];
        super(null, view, menuItemView, menuItemView2, menuItemView3, menuItemView4, menuItemView5, menuItemView6, obj != null ? b1.b((View) obj) : null, (TextView) objArrB0[9]);
        this.B = -1L;
        ((LinearLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.B = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.B = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.B != 0;
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
