package androidx.appcompat.view;

import a40.d0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import o.o;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f1887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f1888f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1892d;

    static {
        Class[] clsArr = {Context.class};
        f1887e = clsArr;
        f1888f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f1891c = context;
        Object[] objArr = {context};
        this.f1889a = objArr;
        this.f1890b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i11;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        h hVar = new h(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i11 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    d0.k("Expecting menu, got ".concat(name));
                    return;
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType == 1) {
                d0.k("Unexpected end of document");
                return;
            }
            Menu menu2 = hVar.f1862a;
            if (eventType != i11) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z11 = z11;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z12 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z12 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            hVar.f1863b = 0;
                            hVar.f1864c = 0;
                            hVar.f1865d = 0;
                            hVar.f1866e = 0;
                            hVar.f1867f = true;
                            hVar.f1868g = true;
                        } else if (name2.equals("item")) {
                            if (!hVar.f1869h) {
                                o oVar = hVar.f1886z;
                                if (oVar == null || !oVar.f31596b.hasSubMenu()) {
                                    hVar.f1869h = true;
                                    hVar.b(menu2.add(hVar.f1863b, hVar.f1870i, hVar.f1871j, hVar.f1872k));
                                } else {
                                    hVar.f1869h = true;
                                    hVar.b(menu2.addSubMenu(hVar.f1863b, hVar.f1870i, hVar.f1871j, hVar.f1872k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z11 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z11 = z11;
                    }
                }
                eventType = xmlPullParser2.next();
                i11 = 2;
                z11 = z11;
                z12 = z12;
            } else {
                if (!z12) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f1891c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f24268q);
                        hVar.f1863b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        hVar.f1864c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        hVar.f1865d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        hVar.f1866e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        hVar.f1867f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        hVar.f1868g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            j30.g gVarS = j30.g.s(context, attributeSet, j.a.f24269r);
                            TypedArray typedArray = (TypedArray) gVarS.f24503c;
                            hVar.f1870i = typedArray.getResourceId(2, 0);
                            hVar.f1871j = (typedArray.getInt(6, hVar.f1865d) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) | (typedArray.getInt(5, hVar.f1864c) & (-65536));
                            hVar.f1872k = typedArray.getText(7);
                            hVar.l = typedArray.getText(8);
                            hVar.f1873m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            hVar.f1874n = string == null ? (char) 0 : string.charAt(0);
                            hVar.f1875o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            hVar.f1876p = string2 == null ? (char) 0 : string2.charAt(0);
                            hVar.f1877q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                hVar.f1878r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                hVar.f1878r = hVar.f1866e;
                            }
                            hVar.f1879s = typedArray.getBoolean(3, false);
                            hVar.f1880t = typedArray.getBoolean(4, hVar.f1867f);
                            hVar.f1881u = typedArray.getBoolean(1, hVar.f1868g);
                            hVar.f1882v = typedArray.getInt(21, -1);
                            hVar.f1885y = typedArray.getString(12);
                            hVar.f1883w = typedArray.getResourceId(13, 0);
                            hVar.f1884x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z13 = string3 != null;
                            if (z13 && hVar.f1883w == 0 && hVar.f1884x == null) {
                                hVar.f1886z = (o) hVar.a(string3, f1888f, this.f1890b);
                            } else {
                                if (z13) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                hVar.f1886z = null;
                            }
                            hVar.A = typedArray.getText(17);
                            hVar.B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                hVar.D = e1.c(typedArray.getInt(19, -1), hVar.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                hVar.D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                hVar.C = gVarS.j(18);
                            } else {
                                hVar.C = colorStateList;
                            }
                            gVarS.v();
                            hVar.f1869h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            hVar.f1869h = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(hVar.f1863b, hVar.f1870i, hVar.f1871j, hVar.f1872k);
                            hVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z12 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i11 = 2;
                        z11 = z11;
                        z12 = z12;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z11 = z11;
            }
            eventType = xmlPullParser2.next();
            i11 = 2;
            z11 = z11;
            z12 = z12;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i11, Menu menu) {
        if (!(menu instanceof o.l)) {
            super.inflate(i11, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z11 = false;
        try {
            try {
                layout = this.f1891c.getResources().getLayout(i11);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof o.l) {
                    o.l lVar = (o.l) menu;
                    if (!lVar.f31558p) {
                        lVar.y();
                        z11 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z11) {
                    ((o.l) menu).x();
                }
                layout.close();
            } catch (IOException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z11) {
                ((o.l) menu).x();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
