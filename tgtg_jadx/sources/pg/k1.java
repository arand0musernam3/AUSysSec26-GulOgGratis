package pg;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a8.k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f34935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f34936t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(int i11, View view) {
        super(0, view, null);
        this.f34935s = i11;
        switch (i11) {
            case 1:
                Object[] objArrB0 = a8.k.b0(view, 1, null, null);
                super(0, view, null);
                this.f34936t = -1L;
                ((ConstraintLayout) objArrB0[0]).setTag(null);
                view.setTag(R.id.dataBinding, this);
                synchronized (this) {
                    this.f34936t = 1L;
                    break;
                }
                e0();
                return;
            case 2:
                FrameLayout frameLayout = (FrameLayout) a8.k.b0(view, 1, null, null)[0];
                super(0, view, null);
                this.f34936t = -1L;
                frameLayout.setTag(null);
                view.setTag(R.id.dataBinding, this);
                synchronized (this) {
                    this.f34936t = 1L;
                    break;
                }
                e0();
                return;
            default:
                Object[] objArrB02 = a8.k.b0(view, 1, null, null);
                this.f34936t = -1L;
                ((ConstraintLayout) objArrB02[0]).setTag(null);
                view.setTag(R.id.dataBinding, this);
                synchronized (this) {
                    this.f34936t = 1L;
                    break;
                }
                e0();
                return;
        }
    }

    @Override // a8.k
    public final void V() {
        switch (this.f34935s) {
            case 0:
                synchronized (this) {
                    this.f34936t = 0L;
                    break;
                }
                return;
            case 1:
                synchronized (this) {
                    this.f34936t = 0L;
                    break;
                }
                return;
            default:
                synchronized (this) {
                    this.f34936t = 0L;
                    break;
                }
                return;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        switch (this.f34935s) {
            case 0:
                synchronized (this) {
                    try {
                        return this.f34936t != 0;
                    } finally {
                    }
                }
            case 1:
                synchronized (this) {
                    try {
                        return this.f34936t != 0;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        return this.f34936t != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        switch (this.f34935s) {
        }
        return false;
    }
}
