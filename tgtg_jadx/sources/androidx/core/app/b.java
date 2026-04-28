package androidx.core.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends android.app.SharedElementCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedElementCallback f2576a;

    public b(SharedElementCallback sharedElementCallback) {
        this.f2576a = sharedElementCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    @Override // android.app.SharedElementCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View r19, android.graphics.Matrix r20, android.graphics.RectF r21) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.b.onCaptureSharedElementSnapshot(android.view.View, android.graphics.Matrix, android.graphics.RectF):android.os.Parcelable");
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        this.f2576a.getClass();
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
        if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
            float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView2.setImageMatrix(matrix);
        }
        return imageView2;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List list, Map map) {
        this.f2576a.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List list) {
        this.f2576a.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List list, List list2, List list3) {
        this.f2576a.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List list, List list2, List list3) {
        this.f2576a.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        Objects.requireNonNull(onSharedElementsReadyListener);
        this.f2576a.getClass();
        onSharedElementsReadyListener.onSharedElementsReady();
    }
}
