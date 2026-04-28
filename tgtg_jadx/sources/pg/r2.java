package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends a8.k {
    public static final SparseIntArray F;
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public long E;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f35129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f35130t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f35131u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f35132v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f35133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f35134x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f35135y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f35136z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.ratingQuestionTv, 1);
        sparseIntArray.put(R.id.upperRowButtonLL, 2);
        sparseIntArray.put(R.id.buttonRate0, 3);
        sparseIntArray.put(R.id.buttonRate1, 4);
        sparseIntArray.put(R.id.buttonRate2, 5);
        sparseIntArray.put(R.id.buttonRate3, 6);
        sparseIntArray.put(R.id.buttonRate4, 7);
        sparseIntArray.put(R.id.buttonRate5, 8);
        sparseIntArray.put(R.id.lowerRowButtonLL, 9);
        sparseIntArray.put(R.id.buttonRate6, 10);
        sparseIntArray.put(R.id.buttonRate7, 11);
        sparseIntArray.put(R.id.buttonRate8, 12);
        sparseIntArray.put(R.id.buttonRate9, 13);
        sparseIntArray.put(R.id.buttonRate10, 14);
        sparseIntArray.put(R.id.buttonHintLeftTv, 15);
        sparseIntArray.put(R.id.buttonHintRightTv, 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(View view) {
        super(0, view, null);
        Object[] objArrB0 = a8.k.b0(view, 17, null, F);
        TextView textView = (TextView) objArrB0[3];
        TextView textView2 = (TextView) objArrB0[4];
        TextView textView3 = (TextView) objArrB0[14];
        TextView textView4 = (TextView) objArrB0[5];
        TextView textView5 = (TextView) objArrB0[6];
        TextView textView6 = (TextView) objArrB0[7];
        TextView textView7 = (TextView) objArrB0[8];
        TextView textView8 = (TextView) objArrB0[10];
        TextView textView9 = (TextView) objArrB0[11];
        TextView textView10 = (TextView) objArrB0[12];
        TextView textView11 = (TextView) objArrB0[13];
        TextView textView12 = (TextView) objArrB0[1];
        this.f35129s = textView;
        this.f35130t = textView2;
        this.f35131u = textView3;
        this.f35132v = textView4;
        this.f35133w = textView5;
        this.f35134x = textView6;
        this.f35135y = textView7;
        this.f35136z = textView8;
        this.A = textView9;
        this.B = textView10;
        this.C = textView11;
        this.D = textView12;
        this.E = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        f0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.E = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }

    public final void f0() {
        synchronized (this) {
            this.E = 1L;
        }
        e0();
    }
}
