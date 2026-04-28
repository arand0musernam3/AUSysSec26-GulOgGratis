package p;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f34024c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbsSeekBar f34025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f34026b;

    public u(AbsSeekBar absSeekBar) {
        this.f34025a = absSeekBar;
    }

    public void a(AttributeSet attributeSet, int i11) {
        AbsSeekBar absSeekBar = this.f34025a;
        j30.g gVarT = j30.g.t(absSeekBar.getContext(), attributeSet, f34024c, i11);
        Drawable drawableL = gVarT.l(0);
        if (drawableL != null) {
            if (drawableL instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableL;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i12 = 0; i12 < numberOfFrames; i12++) {
                    Drawable drawableB = b(animationDrawable.getFrame(i12), true);
                    drawableB.setLevel(10000);
                    animationDrawable2.addFrame(drawableB, animationDrawable.getDuration(i12));
                }
                animationDrawable2.setLevel(10000);
                drawableL = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableL);
        }
        Drawable drawableL2 = gVarT.l(1);
        if (drawableL2 != null) {
            absSeekBar.setProgressDrawable(b(drawableL2, false));
        }
        gVarT.v();
    }

    public final Drawable b(Drawable drawable, boolean z11) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f34026b == null) {
                this.f34026b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z11 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i11 = 0; i11 < numberOfLayers; i11++) {
            int id2 = layerDrawable.getId(i11);
            drawableArr[i11] = b(layerDrawable.getDrawable(i11), id2 == 16908301 || id2 == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i12 = 0; i12 < numberOfLayers; i12++) {
            layerDrawable2.setId(i12, layerDrawable.getId(i12));
            layerDrawable2.setLayerGravity(i12, layerDrawable.getLayerGravity(i12));
            layerDrawable2.setLayerWidth(i12, layerDrawable.getLayerWidth(i12));
            layerDrawable2.setLayerHeight(i12, layerDrawable.getLayerHeight(i12));
            layerDrawable2.setLayerInsetLeft(i12, layerDrawable.getLayerInsetLeft(i12));
            layerDrawable2.setLayerInsetRight(i12, layerDrawable.getLayerInsetRight(i12));
            layerDrawable2.setLayerInsetTop(i12, layerDrawable.getLayerInsetTop(i12));
            layerDrawable2.setLayerInsetBottom(i12, layerDrawable.getLayerInsetBottom(i12));
            layerDrawable2.setLayerInsetStart(i12, layerDrawable.getLayerInsetStart(i12));
            layerDrawable2.setLayerInsetEnd(i12, layerDrawable.getLayerInsetEnd(i12));
        }
        return layerDrawable2;
    }
}
