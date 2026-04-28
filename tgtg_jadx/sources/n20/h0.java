package n20;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.app.tgtg.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f30336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[][] f30337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f30338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f30339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f30340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f30341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f30342h;

    public h0(g0 g0Var) {
        this.f30335a = g0Var.f30310a;
        this.f30336b = g0Var.f30311b;
        this.f30337c = g0Var.f30312c;
        this.f30338d = g0Var.f30313d;
        this.f30339e = g0Var.f30314e;
        this.f30340f = g0Var.f30315f;
        this.f30341g = g0Var.f30316g;
        this.f30342h = g0Var.f30317h;
    }

    public static void a(g0 g0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = j10.a.F;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                o oVarA = o.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i11 = 0;
                for (int i12 = 0; i12 < attributeCount; i12++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i13 = i11 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i11] = attributeNameResource;
                        i11 = i13;
                    }
                }
                g0Var.a(StateSet.trimStateSet(iArr2, i11), oVarA);
            }
        }
    }

    public static h0 b(Context context, TypedArray typedArray, int i11) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i11, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        g0 g0Var = new g0();
        g0Var.b();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            g0Var.b();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                a(g0Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            if (g0Var.f30310a == 0) {
                return null;
            }
            return new h0(g0Var);
        } catch (Throwable th2) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final o c() {
        o oVar = this.f30336b;
        f0 f0Var = this.f30342h;
        f0 f0Var2 = this.f30341g;
        f0 f0Var3 = this.f30340f;
        f0 f0Var4 = this.f30339e;
        if (f0Var4 == null && f0Var3 == null && f0Var2 == null && f0Var == null) {
            return oVar;
        }
        n nVarH = oVar.h();
        if (f0Var4 != null) {
            nVarH.f30380e = f0Var4.f30306b;
        }
        if (f0Var3 != null) {
            nVarH.f30381f = f0Var3.f30306b;
        }
        if (f0Var2 != null) {
            nVarH.f30383h = f0Var2.f30306b;
        }
        if (f0Var != null) {
            nVarH.f30382g = f0Var.f30306b;
        }
        return nVarH.a();
    }

    public final boolean d() {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        return this.f30335a > 1 || ((f0Var = this.f30339e) != null && f0Var.f30305a > 1) || (((f0Var2 = this.f30340f) != null && f0Var2.f30305a > 1) || (((f0Var3 = this.f30341g) != null && f0Var3.f30305a > 1) || ((f0Var4 = this.f30342h) != null && f0Var4.f30305a > 1)));
    }
}
