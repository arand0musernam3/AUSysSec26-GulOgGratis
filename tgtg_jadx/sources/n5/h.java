package n5;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f30525a;

    public final Canvas a() {
        Canvas canvas = this.f30525a;
        if (canvas != null) {
            return canvas;
        }
        s5.a.d("Text drawing wrapper is missing a Canvas!");
        y.m();
        return null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return a().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return a().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op2) {
        return a().clipPath(path, op2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f11, float f12, float f13, float f14, Region.Op op2) {
        return a().clipRect(f11, f12, f13, f14, op2);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        b6.a.c(a());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i11, int i12, int i13, int i14) {
        a().drawARGB(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, Paint paint) {
        a().drawArc(f11, f12, f13, f14, f15, f16, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i11, int i12, float f11, float f12, int i13, int i14, boolean z11, Paint paint) {
        a().drawBitmap(iArr, i11, i12, f11, f12, i13, i14, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i11, int i12, float[] fArr, int i13, int[] iArr, int i14, Paint paint) {
        a().drawBitmapMesh(bitmap, i11, i12, fArr, i13, iArr, i14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f11, float f12, float f13, Paint paint) {
        a().drawCircle(f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11) {
        a().drawColor(i11);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f11, float f12, RectF rectF2, float f13, float f14, Paint paint) {
        b6.a.g(a(), rectF, f11, f12, rectF2, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i11, float[] fArr, int i12, int i13, Font font, Paint paint) {
        b7.a.b(a(), iArr, i11, fArr, i12, i13, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f11, float f12, float f13, float f14, Paint paint) {
        a().drawLine(f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i11, int i12, Paint paint) {
        a().drawLines(fArr, i11, i12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f11, float f12, float f13, float f14, Paint paint) {
        a().drawOval(f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        b7.a.c(a(), ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f11, float f12, Paint paint) {
        a().drawPoint(f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i11, int i12, Paint paint) {
        a().drawPoints(fArr, i11, i12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i11, int i12, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i11, i12, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i11, int i12, int i13) {
        a().drawRGB(i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f11, float f12, float f13, float f14, Paint paint) {
        a().drawRect(f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        b6.a.i(a(), renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f11, float f12, float f13, float f14, float f15, float f16, Paint paint) {
        a().drawRoundRect(f11, f12, f13, f14, f15, f16, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i11, int i12, float f11, float f12, Paint paint) {
        a().drawText(cArr, i11, i12, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i11, int i12, Path path, float f11, float f12, Paint paint) {
        a().drawTextOnPath(cArr, i11, i12, path, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, Paint paint) {
        a().drawTextRun(cArr, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i11, float[] fArr, int i12, float[] fArr2, int i13, int[] iArr, int i14, short[] sArr, int i15, int i16, Paint paint) {
        a().drawVertices(vertexMode, i11, fArr, i12, fArr2, i13, iArr, i14, sArr, i15, i16, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        b6.a.k(a());
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f11, float f12, float f13, float f14, Canvas.EdgeType edgeType) {
        return a().quickReject(f11, f12, f13, f14, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i11) {
        a().restoreToCount(i11);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f11) {
        a().rotate(f11);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f11, float f12, float f13, float f14, Paint paint, int i11) {
        return a().saveLayer(f11, f12, f13, f14, paint, i11);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f11, float f12, float f13, float f14, int i11, int i12) {
        return a().saveLayerAlpha(f11, f12, f13, f14, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f11, float f12) {
        a().scale(f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i11) {
        a().setDensity(i11);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f11, float f12) {
        a().skew(f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f11, float f12) {
        a().translate(f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j9) {
        b6.a.e(a(), j9);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        b7.a.d(a(), ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return a().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11, PorterDuff.Mode mode) {
        a().drawColor(i11, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11, BlendMode blendMode) {
        b6.a.d(a(), i11, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f11, float f12, float f13, float f14) {
        return a().clipOutRect(f11, f12, f13, f14);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j9, BlendMode blendMode) {
        b6.a.f(a(), j9, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i11, int i12, int i13, int i14) {
        return a().clipOutRect(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op2) {
        return a().clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f11, float f12, Paint paint) {
        a().drawText(str, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        return f5.b.l(a(), rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        b6.a.h(a(), rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f11, float f12, Paint paint) {
        a().drawRoundRect(rectF, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i11, int i12, float f11, float f12, Paint paint) {
        a().drawText(str, i11, i12, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f11, float f12, Paint paint) {
        a().drawTextOnPath(str, path, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i11) {
        return a().saveLayerAlpha(rectF, i11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i11, int i12, float f11, float f12, Paint paint) {
        a().drawText(charSequence, i11, i12, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        return f5.b.k(a(), path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i11) {
        return a().saveLayer(rectF, paint, i11);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i11, int i12) {
        return a().saveLayerAlpha(rectF, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op2) {
        return a().clipRect(rectF, op2);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f11, float f12, float f13, float f14, Paint paint) {
        return a().saveLayer(f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f11, float f12, float f13, float f14, int i11) {
        return a().saveLayerAlpha(f11, f12, f13, f14, i11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f11, float f12, float f13, float f14) {
        return a().clipRect(f11, f12, f13, f14);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f11, float f12, boolean z11, Paint paint) {
        a().drawArc(rectF, f11, f12, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f11, float f12, float f13, float f14) {
        return f5.b.j(a(), f11, f12, f13, f14);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i11, int i12, int i13, int i14) {
        return a().clipRect(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, Paint paint) {
        a().drawTextRun(charSequence, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f11, float f12, Paint paint) {
        a().drawBitmap(bitmap, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, Paint paint) {
        b6.a.j(a(), measuredText, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, Paint paint) {
        a().drawBitmap(iArr, i11, i12, i13, i14, i15, i16, z11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }
}
