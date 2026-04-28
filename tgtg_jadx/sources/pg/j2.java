package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends i2 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.questionLayout, 1);
        sparseIntArray.put(R.id.faqQuestionTvMnu, 2);
        sparseIntArray.put(R.id.faqArrowIv, 3);
        sparseIntArray.put(R.id.answerLayout, 4);
        sparseIntArray.put(R.id.faqAnswerTvMnu, 5);
        sparseIntArray.put(R.id.linkLayout, 6);
        sparseIntArray.put(R.id.faqLinkTvMnu, 7);
        sparseIntArray.put(R.id.horizontalLine, 8);
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.C != 0;
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
            this.C = 1L;
        }
        e0();
    }
}
