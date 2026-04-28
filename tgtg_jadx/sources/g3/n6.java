package g3;

import android.widget.ImageView;
import com.braze.support.BrazeImageUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f19175c;

    public /* synthetic */ n6(float f11, ImageView imageView) {
        this.f19173a = 2;
        this.f19175c = f11;
        this.f19174b = imageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19173a) {
            case 0:
                return Float.valueOf(((z5.c) this.f19174b).c0(this.f19175c));
            case 1:
                return Float.valueOf(((z5.c) this.f19174b).c0(this.f19175c));
            default:
                return BrazeImageUtils.resizeToBitmapDimensions$lambda$3(this.f19175c, (ImageView) this.f19174b);
        }
    }

    public /* synthetic */ n6(z5.c cVar, float f11, int i11) {
        this.f19173a = i11;
        this.f19174b = cVar;
        this.f19175c = f11;
    }
}
