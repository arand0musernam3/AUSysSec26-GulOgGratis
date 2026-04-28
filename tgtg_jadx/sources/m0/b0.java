package m0;

import android.view.Surface;
import androidx.core.util.Consumer;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements x0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f28469d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28472c;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        f28469d = new b0(0, new g7.a(fValueOf2, fValueOf2), new g7.a(fValueOf, fValueOf));
    }

    public b0(File file) {
        this.f28470a = 1;
        this.f28471b = file;
        this.f28472c = new ky.p(3);
    }

    @Override // x0.c
    public void onFailure(Throwable th2) {
        switch (this.f28470a) {
            case 2:
                if (!(th2 instanceof f1)) {
                    pd.g.n(null, ((e6.i) this.f28471b).b(null));
                } else {
                    pd.g.n(null, ((e6.l) this.f28472c).cancel(false));
                }
                break;
            default:
                pd.g.n("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2, th2 instanceof f1);
                ((Consumer) this.f28471b).accept(new i(1, (Surface) this.f28472c));
                break;
        }
    }

    @Override // x0.c
    public void onSuccess(Object obj) {
        switch (this.f28470a) {
            case 2:
                pd.g.n(null, ((e6.i) this.f28471b).b(null));
                break;
            default:
                ((Consumer) this.f28471b).accept(new i(0, (Surface) this.f28472c));
                break;
        }
    }

    public String toString() {
        switch (this.f28470a) {
            case 1:
                return "OutputFileOptions{mFile=" + ((File) this.f28471b) + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + ((ky.p) this.f28472c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b0(int i11, Object obj, Object obj2) {
        this.f28470a = i11;
        this.f28471b = obj;
        this.f28472c = obj2;
    }
}
