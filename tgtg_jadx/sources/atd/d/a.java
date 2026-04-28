package atd.d;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.braze.images.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4824a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f4825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f4826c;

    public /* synthetic */ a(Bitmap bitmap, ImageView imageView) {
        this.f4825b = bitmap;
        this.f4826c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4824a) {
            case 0:
                BuildConfig.AuthenticationRequestParameters(this.f4826c, this.f4825b);
                break;
            default:
                f.a(this.f4825b, this.f4826c);
                break;
        }
    }

    public /* synthetic */ a(ImageView imageView, Bitmap bitmap) {
        this.f4826c = imageView;
        this.f4825b = bitmap;
    }
}
