package j20;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import h0.g;
import jb.u;
import w6.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f24456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f24462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f24465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f24466k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f24467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24468n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24469o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Typeface f24470p;

    public d(Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, j.a.f24276y);
        this.l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f24466k = g.p(context, typedArrayObtainStyledAttributes, 3);
        g.p(context, typedArrayObtainStyledAttributes, 4);
        g.p(context, typedArrayObtainStyledAttributes, 5);
        this.f24459d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f24460e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i12 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f24467m = typedArrayObtainStyledAttributes.getResourceId(i12, 0);
        this.f24457b = typedArrayObtainStyledAttributes.getString(i12);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f24456a = g.p(context, typedArrayObtainStyledAttributes, 6);
        this.f24461f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f24462g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f24463h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i11, j10.a.H);
        this.f24464i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f24465j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.f24458c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f24470p;
        int i11 = this.f24459d;
        if (typeface == null && (str = this.f24457b) != null) {
            this.f24470p = Typeface.create(str, i11);
        }
        if (this.f24470p == null) {
            int i12 = this.f24460e;
            if (i12 == 1) {
                this.f24470p = Typeface.SANS_SERIF;
            } else if (i12 == 2) {
                this.f24470p = Typeface.SERIF;
            } else if (i12 != 3) {
                this.f24470p = Typeface.DEFAULT;
            } else {
                this.f24470p = Typeface.MONOSPACE;
            }
            this.f24470p = Typeface.create(this.f24470p, i11);
        }
    }

    public final void b(Context context, u uVar) {
        if (!c(context)) {
            a();
        }
        int i11 = this.f24467m;
        if (i11 == 0) {
            this.f24468n = true;
        }
        if (this.f24468n) {
            uVar.K(this.f24470p, true);
            return;
        }
        try {
            b bVar = new b(this, uVar);
            ThreadLocal threadLocal = j.f43256a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                j.c(context, i11, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f24468n = true;
            uVar.J(1);
        } catch (Exception e5) {
            Log.d("TextAppearance", "Error loading font " + this.f24457b, e5);
            this.f24468n = true;
            uVar.J(-3);
        }
    }

    public final boolean c(Context context) throws Exception {
        Context context2;
        Typeface typefaceC;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.f24468n) {
            return true;
        }
        int i11 = this.f24467m;
        if (i11 != 0) {
            ThreadLocal threadLocal = j.f43256a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceC = null;
            } else {
                context2 = context;
                typefaceC = j.c(context2, i11, new TypedValue(), 0, null, false, true);
            }
            if (typefaceC != null) {
                this.f24470p = typefaceC;
                this.f24468n = true;
                return true;
            }
            if (!this.f24469o) {
                this.f24469o = true;
                Resources resources = context2.getResources();
                int i12 = this.f24467m;
                if (i12 == 0 || !resources.getResourceTypeName(i12).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f24459d);
                    }
                } else {
                    try {
                        xml = resources.getXml(i12);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), t6.a.f39821b);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f24459d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f24470p = typefaceCreate2;
                this.f24468n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, u uVar) {
        e(context, textPaint, uVar);
        ColorStateList colorStateList = this.f24466k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : RoundCornerImageView.DEFAULT_STROKE_COLOR);
        ColorStateList colorStateList2 = this.f24456a;
        textPaint.setShadowLayer(this.f24463h, this.f24461f, this.f24462g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, u uVar) {
        Typeface typeface;
        if (c(context) && this.f24468n && (typeface = this.f24470p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f24470p);
        b(context, new c(this, context, textPaint, uVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM = b7.a.m(context.getResources().getConfiguration(), typeface);
        if (typefaceM != null) {
            typeface = typefaceM;
        }
        textPaint.setTypeface(typeface);
        int i11 = (~typeface.getStyle()) & this.f24459d;
        textPaint.setFakeBoldText((i11 & 1) != 0);
        textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(this.f24458c);
        if (this.f24464i) {
            textPaint.setLetterSpacing(this.f24465j);
        }
    }
}
