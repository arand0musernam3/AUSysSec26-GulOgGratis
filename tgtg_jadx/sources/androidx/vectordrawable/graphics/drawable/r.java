package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f4104j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f4105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f4106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f4107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f4110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f4111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f4112i;

    public r() {
        this.f4109f = true;
        this.f4110g = new float[9];
        this.f4111h = new Matrix();
        this.f4112i = new Rect();
        p pVar = new p();
        pVar.f4094c = null;
        pVar.f4095d = f4104j;
        pVar.f4093b = new o();
        this.f4105b = pVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4052a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f4112i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4107d;
        if (colorFilter == null) {
            colorFilter = this.f4106c;
        }
        Matrix matrix = this.f4111h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f4110g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(NewHope.SENDB_BYTES, iWidth);
        int iMin2 = Math.min(NewHope.SENDB_BYTES, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        p pVar = this.f4105b;
        Bitmap bitmap = pVar.f4097f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != pVar.f4097f.getHeight()) {
            pVar.f4097f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            pVar.f4102k = true;
        }
        boolean z11 = this.f4109f;
        p pVar2 = this.f4105b;
        if (!z11) {
            pVar2.f4097f.eraseColor(0);
            Canvas canvas2 = new Canvas(pVar2.f4097f);
            o oVar = pVar2.f4093b;
            oVar.a(oVar.f4084g, o.f4077p, canvas2, iMin, iMin2);
        } else if (pVar2.f4102k || pVar2.f4098g != pVar2.f4094c || pVar2.f4099h != pVar2.f4095d || pVar2.f4101j != pVar2.f4096e || pVar2.f4100i != pVar2.f4093b.getRootAlpha()) {
            p pVar3 = this.f4105b;
            pVar3.f4097f.eraseColor(0);
            Canvas canvas3 = new Canvas(pVar3.f4097f);
            o oVar2 = pVar3.f4093b;
            oVar2.a(oVar2.f4084g, o.f4077p, canvas3, iMin, iMin2);
            p pVar4 = this.f4105b;
            pVar4.f4098g = pVar4.f4094c;
            pVar4.f4099h = pVar4.f4095d;
            pVar4.f4100i = pVar4.f4093b.getRootAlpha();
            pVar4.f4101j = pVar4.f4096e;
            pVar4.f4102k = false;
        }
        p pVar5 = this.f4105b;
        if (pVar5.f4093b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (pVar5.l == null) {
                Paint paint2 = new Paint();
                pVar5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            pVar5.l.setAlpha(pVar5.f4093b.getRootAlpha());
            pVar5.l.setColorFilter(colorFilter);
            paint = pVar5.l;
        }
        canvas.drawBitmap(pVar5.f4097f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getAlpha() : this.f4105b.f4093b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4105b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getColorFilter() : this.f4107d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4052a != null) {
            return new q(this.f4052a.getConstantState());
        }
        this.f4105b.f4092a = getChangingConfigurations();
        return this.f4105b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4105b.f4093b.f4086i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4105b.f4093b.f4085h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        p pVar = this.f4105b;
        pVar.f4093b = new o();
        TypedArray typedArrayH = w6.a.h(resources, theme, attributeSet, a.f4030a);
        p pVar2 = this.f4105b;
        o oVar = pVar2.f4093b;
        int iD = w6.a.d(typedArrayH, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i15 = 3;
        if (iD == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iD != 5) {
            if (iD != 9) {
                switch (iD) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        pVar2.f4095d = mode;
        ColorStateList colorStateListB = w6.a.b(typedArrayH, xmlPullParser, theme);
        if (colorStateListB != null) {
            pVar2.f4094c = colorStateListB;
        }
        boolean z11 = pVar2.f4096e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z11 = typedArrayH.getBoolean(5, z11);
        }
        pVar2.f4096e = z11;
        float f11 = oVar.f4087j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f11 = typedArrayH.getFloat(7, f11);
        }
        oVar.f4087j = f11;
        float f12 = oVar.f4088k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f12 = typedArrayH.getFloat(8, f12);
        }
        oVar.f4088k = f12;
        if (oVar.f4087j <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f12 <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        oVar.f4085h = typedArrayH.getDimension(3, oVar.f4085h);
        int i16 = 2;
        float dimension = typedArrayH.getDimension(2, oVar.f4086i);
        oVar.f4086i = dimension;
        if (oVar.f4085h <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = oVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayH.getFloat(4, alpha);
        }
        oVar.setAlpha(alpha);
        String string = typedArrayH.getString(0);
        if (string != null) {
            oVar.f4089m = string;
            oVar.f4091o.put(string, oVar);
        }
        typedArrayH.recycle();
        pVar.f4092a = getChangingConfigurations();
        int i17 = 1;
        pVar.f4102k = true;
        p pVar3 = this.f4105b;
        o oVar2 = pVar3.f4093b;
        ArrayDeque arrayDeque = new ArrayDeque();
        l lVar = oVar2.f4084g;
        q1.e eVar = oVar2.f4091o;
        arrayDeque.push(lVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z12 = true;
        while (eventType != i17 && (xmlPullParser.getDepth() >= depth || eventType != i15)) {
            if (eventType == i16) {
                String name = xmlPullParser.getName();
                l lVar2 = (l) arrayDeque.peek();
                i11 = depth;
                if ("path".equals(name)) {
                    k kVar = new k();
                    kVar.f4054e = 0.0f;
                    kVar.f4056g = 1.0f;
                    kVar.f4057h = 1.0f;
                    kVar.f4058i = 0.0f;
                    kVar.f4059j = 1.0f;
                    kVar.f4060k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    kVar.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    kVar.f4061m = join;
                    kVar.f4062n = 4.0f;
                    TypedArray typedArrayH2 = w6.a.h(resources, theme, attributeSet, a.f4032c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayH2.getString(0);
                        if (string2 != null) {
                            kVar.f4075b = string2;
                        }
                        String string3 = typedArrayH2.getString(2);
                        if (string3 != null) {
                            kVar.f4074a = m0.c.Y(string3);
                        }
                        kVar.f4055f = w6.a.c(typedArrayH2, xmlPullParser, theme, "fillColor", 1);
                        float f13 = kVar.f4057h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f13 = typedArrayH2.getFloat(12, f13);
                        }
                        kVar.f4057h = f13;
                        int i18 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayH2.getInt(8, -1) : -1;
                        kVar.l = i18 != 0 ? i18 != 1 ? i18 != 2 ? kVar.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i19 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayH2.getInt(9, -1) : -1;
                        kVar.f4061m = i19 != 0 ? i19 != 1 ? i19 != 2 ? kVar.f4061m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f14 = kVar.f4062n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f14 = typedArrayH2.getFloat(10, f14);
                        }
                        kVar.f4062n = f14;
                        kVar.f4053d = w6.a.c(typedArrayH2, xmlPullParser, theme, "strokeColor", 3);
                        float f15 = kVar.f4056g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f15 = typedArrayH2.getFloat(11, f15);
                        }
                        kVar.f4056g = f15;
                        float f16 = kVar.f4054e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f16 = typedArrayH2.getFloat(4, f16);
                        }
                        kVar.f4054e = f16;
                        float f17 = kVar.f4059j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f17 = typedArrayH2.getFloat(6, f17);
                        }
                        kVar.f4059j = f17;
                        float f18 = kVar.f4060k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f18 = typedArrayH2.getFloat(7, f18);
                        }
                        kVar.f4060k = f18;
                        float f19 = kVar.f4058i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f19 = typedArrayH2.getFloat(5, f19);
                        }
                        kVar.f4058i = f19;
                        int i21 = kVar.f4076c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i21 = typedArrayH2.getInt(13, i21);
                        }
                        kVar.f4076c = i21;
                    }
                    typedArrayH2.recycle();
                    lVar2.f4064b.add(kVar);
                    if (kVar.getPathName() != null) {
                        eVar.put(kVar.getPathName(), kVar);
                    }
                    pVar3.f4092a = pVar3.f4092a;
                    i14 = 1;
                    z12 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        j jVar = new j();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayH3 = w6.a.h(resources, theme, attributeSet, a.f4033d);
                            String string4 = typedArrayH3.getString(0);
                            if (string4 != null) {
                                jVar.f4075b = string4;
                            }
                            String string5 = typedArrayH3.getString(1);
                            if (string5 != null) {
                                jVar.f4074a = m0.c.Y(string5);
                            }
                            jVar.f4076c = !w6.a.e(xmlPullParser, "fillType") ? 0 : typedArrayH3.getInt(2, 0);
                            typedArrayH3.recycle();
                        }
                        lVar2.f4064b.add(jVar);
                        if (jVar.getPathName() != null) {
                            eVar.put(jVar.getPathName(), jVar);
                        }
                        pVar3.f4092a = pVar3.f4092a;
                    } else if ("group".equals(name)) {
                        l lVar3 = new l();
                        TypedArray typedArrayH4 = w6.a.h(resources, theme, attributeSet, a.f4031b);
                        float f20 = lVar3.f4065c;
                        if (w6.a.e(xmlPullParser, "rotation")) {
                            f20 = typedArrayH4.getFloat(5, f20);
                        }
                        lVar3.f4065c = f20;
                        i14 = 1;
                        lVar3.f4066d = typedArrayH4.getFloat(1, lVar3.f4066d);
                        lVar3.f4067e = typedArrayH4.getFloat(2, lVar3.f4067e);
                        float f21 = lVar3.f4068f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f21 = typedArrayH4.getFloat(3, f21);
                        }
                        lVar3.f4068f = f21;
                        float f22 = lVar3.f4069g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f22 = typedArrayH4.getFloat(4, f22);
                        }
                        lVar3.f4069g = f22;
                        float f23 = lVar3.f4070h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f23 = typedArrayH4.getFloat(6, f23);
                        }
                        lVar3.f4070h = f23;
                        float f24 = lVar3.f4071i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f24 = typedArrayH4.getFloat(7, f24);
                        }
                        lVar3.f4071i = f24;
                        String string6 = typedArrayH4.getString(0);
                        if (string6 != null) {
                            lVar3.f4073k = string6;
                        }
                        lVar3.c();
                        typedArrayH4.recycle();
                        lVar2.f4064b.add(lVar3);
                        arrayDeque.push(lVar3);
                        if (lVar3.getGroupName() != null) {
                            eVar.put(lVar3.getGroupName(), lVar3);
                        }
                        pVar3.f4092a = pVar3.f4092a;
                    }
                    i14 = 1;
                }
                i13 = i14;
                i12 = 3;
            } else {
                i11 = depth;
                i12 = i15;
                i13 = 1;
                if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i15 = i12;
            i17 = i13;
            depth = i11;
            i16 = 2;
        }
        if (z12) {
            throw new XmlPullParserException("no path defined");
        }
        this.f4106c = a(pVar.f4094c, pVar.f4095d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.isAutoMirrored() : this.f4105b.f4096e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        p pVar = this.f4105b;
        if (pVar == null) {
            return false;
        }
        o oVar = pVar.f4093b;
        if (oVar.f4090n == null) {
            oVar.f4090n = Boolean.valueOf(oVar.f4084g.a());
        }
        if (oVar.f4090n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f4105b.f4094c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4108e && super.mutate() == this) {
            p pVar = this.f4105b;
            p pVar2 = new p();
            pVar2.f4094c = null;
            pVar2.f4095d = f4104j;
            if (pVar != null) {
                pVar2.f4092a = pVar.f4092a;
                o oVar = new o(pVar.f4093b);
                pVar2.f4093b = oVar;
                if (pVar.f4093b.f4082e != null) {
                    oVar.f4082e = new Paint(pVar.f4093b.f4082e);
                }
                if (pVar.f4093b.f4081d != null) {
                    pVar2.f4093b.f4081d = new Paint(pVar.f4093b.f4081d);
                }
                pVar2.f4094c = pVar.f4094c;
                pVar2.f4095d = pVar.f4095d;
                pVar2.f4096e = pVar.f4096e;
            }
            this.f4105b = pVar2;
            this.f4108e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z11;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        p pVar = this.f4105b;
        ColorStateList colorStateList = pVar.f4094c;
        if (colorStateList == null || (mode = pVar.f4095d) == null) {
            z11 = false;
        } else {
            this.f4106c = a(colorStateList, mode);
            invalidateSelf();
            z11 = true;
        }
        o oVar = pVar.f4093b;
        if (oVar.f4090n == null) {
            oVar.f4090n = Boolean.valueOf(oVar.f4084g.a());
        }
        if (oVar.f4090n.booleanValue()) {
            boolean zB = pVar.f4093b.f4084g.b(iArr);
            pVar.f4102k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j9) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j9);
        } else {
            super.scheduleSelf(runnable, j9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else if (this.f4105b.f4093b.getRootAlpha() != i11) {
            this.f4105b.f4093b.setRootAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setAutoMirrored(z11);
        } else {
            this.f4105b.f4096e = z11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4107d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setTint(i11);
        } else {
            setTintList(ColorStateList.valueOf(i11));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        p pVar = this.f4105b;
        if (pVar.f4094c != colorStateList) {
            pVar.f4094c = colorStateList;
            this.f4106c = a(colorStateList, pVar.f4095d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        p pVar = this.f4105b;
        if (pVar.f4095d != mode) {
            pVar.f4095d = mode;
            this.f4106c = a(pVar.f4094c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f4052a;
        return drawable != null ? drawable.setVisible(z11, z12) : super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public r(p pVar) {
        this.f4109f = true;
        this.f4110g = new float[9];
        this.f4111h = new Matrix();
        this.f4112i = new Rect();
        this.f4105b = pVar;
        this.f4106c = a(pVar.f4094c, pVar.f4095d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4052a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
