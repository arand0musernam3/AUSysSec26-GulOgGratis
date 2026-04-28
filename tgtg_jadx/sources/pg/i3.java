package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends h3 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f34916x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f34917w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34916x = sparseIntArray;
        sparseIntArray.put(R.id.webViewContainer, 1);
        sparseIntArray.put(R.id.webView, 2);
        sparseIntArray.put(R.id.progressBar, 3);
        sparseIntArray.put(R.id.okBtn, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i3(View view) {
        Object[] objArrB0 = a8.k.b0(view, 5, null, f34916x);
        Button button = (Button) objArrB0[4];
        TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) objArrB0[3];
        WebView webView = (WebView) objArrB0[2];
        super(null, view, button, tGTGLoadingView, webView);
        this.f34917w = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34917w = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34917w = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34917w != 0;
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
