package zw;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z2 implements Attributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XmlPullParser f48406a;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.f48406a.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i11) {
        return this.f48406a.getAttributeName(i11);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i11) {
        XmlPullParser xmlPullParser = this.f48406a;
        String attributeName = xmlPullParser.getAttributeName(i11);
        if (xmlPullParser.getAttributePrefix(i11) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i11) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i11) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i11) {
        return this.f48406a.getAttributeNamespace(i11);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i11) {
        return this.f48406a.getAttributeValue(i11);
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }
}
