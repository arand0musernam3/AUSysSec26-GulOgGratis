package g9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f20118c = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f20120b;

    public g0(Context context, u0 u0Var) {
        context.getClass();
        u0Var.getClass();
        this.f20119a = context;
        this.f20120b = u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g9.j c(android.content.res.TypedArray r12, android.content.res.Resources r13, int r14) throws org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.g0.c(android.content.res.TypedArray, android.content.res.Resources, int):g9.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021a, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g9.z a(android.content.res.Resources r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, int r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.g0.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):g9.z");
    }

    public final b0 b(int i11) {
        int next;
        Resources resources = this.f20119a.getResources();
        XmlResourceParser xml = resources.getXml(i11);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e5) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i11) + " line " + xml.getLineNumber(), e5);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        attributeSetAsAttributeSet.getClass();
        z zVarA = a(resources, xml, attributeSetAsAttributeSet, i11);
        if (zVarA instanceof b0) {
            return (b0) zVarA;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
