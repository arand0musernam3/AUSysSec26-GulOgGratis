package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends u2 {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.flashSalesLogo, 2);
        sparseIntArray.put(R.id.tvPendingCollection, 3);
        sparseIntArray.put(R.id.cvOrder, 4);
        sparseIntArray.put(R.id.storeImageLayout, 5);
        sparseIntArray.put(R.id.ivStoreLogo, 6);
        sparseIntArray.put(R.id.orderStatus, 7);
        sparseIntArray.put(R.id.storeName, 8);
        sparseIntArray.put(R.id.tvInfo, 9);
        sparseIntArray.put(R.id.tvTimeToCollectContainer, 10);
        sparseIntArray.put(R.id.tvTimeToCollect, 11);
        sparseIntArray.put(R.id.tvTimer, 12);
        sparseIntArray.put(R.id.overallRating, 13);
        sparseIntArray.put(R.id.starOne, 14);
        sparseIntArray.put(R.id.starTwo, 15);
        sparseIntArray.put(R.id.starThree, 16);
        sparseIntArray.put(R.id.starFour, 17);
        sparseIntArray.put(R.id.starFive, 18);
        sparseIntArray.put(R.id.btnArrow, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v2(View view) {
        Object[] objArrB0 = a8.k.b0(view, 20, null, L);
        ImageView imageView = (ImageView) objArrB0[19];
        CardView cardView = (CardView) objArrB0[4];
        Object obj = objArrB0[2];
        j1 j1VarA = obj != null ? j1.a((View) obj) : null;
        ImageView imageView2 = (ImageView) objArrB0[6];
        ImageView imageView3 = (ImageView) objArrB0[7];
        LinearLayout linearLayout = (LinearLayout) objArrB0[13];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrB0[0];
        ImageView imageView4 = (ImageView) objArrB0[18];
        ImageView imageView5 = (ImageView) objArrB0[17];
        ImageView imageView6 = (ImageView) objArrB0[14];
        ImageView imageView7 = (ImageView) objArrB0[16];
        ImageView imageView8 = (ImageView) objArrB0[15];
        RelativeLayout relativeLayout = (RelativeLayout) objArrB0[5];
        TextView textView = (TextView) objArrB0[8];
        TextView textView2 = (TextView) objArrB0[9];
        TextView textView3 = (TextView) objArrB0[3];
        super(null, view, imageView, cardView, j1VarA, imageView2, imageView3, linearLayout, constraintLayout, imageView4, imageView5, imageView6, imageView7, imageView8, relativeLayout, textView, textView2, textView3, (LinearLayout) objArrB0[10], (TextView) objArrB0[12]);
        this.K = -1L;
        ((RelativeLayout) objArrB0[1]).setTag(null);
        this.f35197x.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.K = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.K != 0;
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
