package org.bouncycastle.asn1;

import c50.w;
import com.braze.h2;
import i4.a;
import j4.s;
import java.io.IOException;
import r8.k;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1Util {
    public static ASN1TaggedObject checkContextTag(ASN1TaggedObject aSN1TaggedObject, int i11) {
        return checkTag(aSN1TaggedObject, 128, i11);
    }

    public static ASN1TaggedObject checkContextTagClass(ASN1TaggedObject aSN1TaggedObject) {
        return checkTagClass(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject checkTag(ASN1TaggedObject aSN1TaggedObject, int i11, int i12) {
        if (aSN1TaggedObject.hasTag(i11, i12)) {
            return aSN1TaggedObject;
        }
        h2.b(s.k("Expected ", getTagText(i11, i12), " tag but found ", getTagText(aSN1TaggedObject)));
        return null;
    }

    public static ASN1TaggedObject checkTagClass(ASN1TaggedObject aSN1TaggedObject, int i11) {
        if (aSN1TaggedObject.hasTagClass(i11)) {
            return aSN1TaggedObject;
        }
        h2.b(s.k("Expected ", getTagClassText(i11), " tag but found ", getTagClassText(aSN1TaggedObject)));
        return null;
    }

    public static ASN1Primitive getBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i11, int i12, boolean z11, int i13) {
        return checkTag(aSN1TaggedObject, i11, i12).getBaseUniversal(z11, i13);
    }

    public static ASN1Primitive getContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i11, boolean z11, int i12) {
        return getBaseUniversal(aSN1TaggedObject, 128, i11, z11, i12);
    }

    public static ASN1Object getExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i11) {
        return checkTagClass(aSN1TaggedObject, i11).getExplicitBaseObject();
    }

    public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11) {
        return checkTagClass(aSN1TaggedObject, i11).getExplicitBaseTagged();
    }

    public static ASN1Object getExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject) {
        return getExplicitBaseObject(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject) {
        return getExplicitBaseTagged(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject getImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11, int i12, int i13, int i14) {
        return checkTag(aSN1TaggedObject, i11, i12).getImplicitBaseTagged(i13, i14);
    }

    public static ASN1TaggedObject getImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11, int i12, int i13) {
        return getImplicitBaseTagged(aSN1TaggedObject, 128, i11, i12, i13);
    }

    public static Object getInstanceChoiceBaseObject(ASN1TaggedObject aSN1TaggedObject, boolean z11, String str) {
        if (!z11) {
            a.f(a0.p("Implicit tagging cannot be used with untagged choice type ", str, " (X.680 30.6, 30.8)."));
            return null;
        }
        if (aSN1TaggedObject != null) {
            return getExplicitContextBaseObject(aSN1TaggedObject);
        }
        w.l("'taggedObject' cannot be null");
        return null;
    }

    public static String getTagClassText(int i11) {
        return i11 != 64 ? i11 != 128 ? i11 != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION";
    }

    public static String getTagText(int i11, int i12) {
        return k.h(i12, i11 != 64 ? i11 != 128 ? i11 != 192 ? "[UNIVERSAL " : "[PRIVATE " : "[CONTEXT " : "[APPLICATION ", "]");
    }

    public static Object getTaggedChoiceBaseObject(ASN1TaggedObject aSN1TaggedObject, boolean z11, String str) {
        if (!z11) {
            a.f(a0.p("Implicit tagging cannot be used with untagged choice type ", str, " (X.680 30.6, 30.8)."));
            return null;
        }
        if (aSN1TaggedObject != null) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        w.l("'taggedObject' cannot be null");
        return null;
    }

    public static ASN1Encodable parseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12, boolean z11, int i13) throws IOException {
        return checkTag(aSN1TaggedObjectParser, i11, i12).parseBaseUniversal(z11, i13);
    }

    public static ASN1Encodable parseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, boolean z11, int i12) throws IOException {
        return parseBaseUniversal(aSN1TaggedObjectParser, 128, i11, z11, i12);
    }

    public static ASN1Encodable parseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12) throws IOException {
        return checkTag(aSN1TaggedObjectParser, i11, i12).parseExplicitBaseObject();
    }

    public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11) throws IOException {
        return checkTagClass(aSN1TaggedObjectParser, i11).parseExplicitBaseTagged();
    }

    public static ASN1Encodable parseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11) throws IOException {
        return parseExplicitBaseObject(aSN1TaggedObjectParser, 128, i11);
    }

    public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser) throws IOException {
        return parseExplicitBaseTagged(aSN1TaggedObjectParser, 128);
    }

    public static ASN1TaggedObjectParser parseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12, int i13, int i14) throws IOException {
        return checkTag(aSN1TaggedObjectParser, i11, i12).parseImplicitBaseTagged(i13, i14);
    }

    public static ASN1TaggedObjectParser parseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12, int i13) throws IOException {
        return parseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i11, i12, i13);
    }

    public static ASN1Primitive tryGetBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i11, int i12, boolean z11, int i13) {
        if (aSN1TaggedObject.hasTag(i11, i12)) {
            return aSN1TaggedObject.getBaseUniversal(z11, i13);
        }
        return null;
    }

    public static ASN1Primitive tryGetContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i11, boolean z11, int i12) {
        return tryGetBaseUniversal(aSN1TaggedObject, 128, i11, z11, i12);
    }

    public static ASN1Object tryGetExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i11) {
        if (aSN1TaggedObject.hasTagClass(i11)) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11) {
        if (aSN1TaggedObject.hasTagClass(i11)) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Object tryGetExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject) {
        return tryGetExplicitBaseObject(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject) {
        return tryGetExplicitBaseTagged(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject tryGetImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11, int i12, int i13, int i14) {
        if (aSN1TaggedObject.hasTag(i11, i12)) {
            return aSN1TaggedObject.getImplicitBaseTagged(i13, i14);
        }
        return null;
    }

    public static ASN1TaggedObject tryGetImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11, int i12, int i13) {
        return tryGetImplicitBaseTagged(aSN1TaggedObject, 128, i11, i12, i13);
    }

    public static ASN1Encodable tryParseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12, boolean z11, int i13) throws IOException {
        if (aSN1TaggedObjectParser.hasTag(i11, i12)) {
            return aSN1TaggedObjectParser.parseBaseUniversal(z11, i13);
        }
        return null;
    }

    public static ASN1Encodable tryParseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, boolean z11, int i12) throws IOException {
        return tryParseBaseUniversal(aSN1TaggedObjectParser, 128, i11, z11, i12);
    }

    public static ASN1Encodable tryParseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12) throws IOException {
        if (aSN1TaggedObjectParser.hasTag(i11, i12)) {
            return aSN1TaggedObjectParser.parseExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11) throws IOException {
        if (aSN1TaggedObjectParser.hasTagClass(i11)) {
            return aSN1TaggedObjectParser.parseExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Encodable tryParseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11) throws IOException {
        return tryParseExplicitBaseObject(aSN1TaggedObjectParser, 128, i11);
    }

    public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser) throws IOException {
        return tryParseExplicitBaseTagged(aSN1TaggedObjectParser, 128);
    }

    public static ASN1TaggedObjectParser tryParseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12, int i13, int i14) throws IOException {
        if (aSN1TaggedObjectParser.hasTag(i11, i12)) {
            return aSN1TaggedObjectParser.parseImplicitBaseTagged(i13, i14);
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12, int i13) throws IOException {
        return tryParseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i11, i12, i13);
    }

    public static ASN1TaggedObjectParser checkContextTag(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11) {
        return checkTag(aSN1TaggedObjectParser, 128, i11);
    }

    public static ASN1TaggedObjectParser checkContextTagClass(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return checkTagClass(aSN1TaggedObjectParser, 128);
    }

    public static ASN1Object getExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i11) {
        return getExplicitBaseObject(aSN1TaggedObject, 128, i11);
    }

    public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11) {
        return getExplicitBaseTagged(aSN1TaggedObject, 128, i11);
    }

    public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11) throws IOException {
        return parseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i11);
    }

    public static ASN1Object tryGetExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i11) {
        return tryGetExplicitBaseObject(aSN1TaggedObject, 128, i11);
    }

    public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11) {
        return tryGetExplicitBaseTagged(aSN1TaggedObject, 128, i11);
    }

    public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11) throws IOException {
        return tryParseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i11);
    }

    public static ASN1Object getExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i11, int i12) {
        return checkTag(aSN1TaggedObject, i11, i12).getExplicitBaseObject();
    }

    public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11, int i12) {
        return checkTag(aSN1TaggedObject, i11, i12).getExplicitBaseTagged();
    }

    public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12) throws IOException {
        return checkTag(aSN1TaggedObjectParser, i11, i12).parseExplicitBaseTagged();
    }

    public static ASN1Object tryGetExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i11, int i12) {
        if (aSN1TaggedObject.hasTag(i11, i12)) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i11, int i12) {
        if (aSN1TaggedObject.hasTag(i11, i12)) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12) throws IOException {
        if (aSN1TaggedObjectParser.hasTag(i11, i12)) {
            return aSN1TaggedObjectParser.parseExplicitBaseTagged();
        }
        return null;
    }

    public static String getTagClassText(ASN1Tag aSN1Tag) {
        return getTagClassText(aSN1Tag.getTagClass());
    }

    public static String getTagClassText(ASN1TaggedObject aSN1TaggedObject) {
        return getTagClassText(aSN1TaggedObject.getTagClass());
    }

    public static String getTagClassText(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return getTagClassText(aSN1TaggedObjectParser.getTagClass());
    }

    public static ASN1TaggedObjectParser checkTag(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11, int i12) {
        if (aSN1TaggedObjectParser.hasTag(i11, i12)) {
            return aSN1TaggedObjectParser;
        }
        h2.b(s.k("Expected ", getTagText(i11, i12), " tag but found ", getTagText(aSN1TaggedObjectParser)));
        return null;
    }

    public static ASN1TaggedObjectParser checkTagClass(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i11) {
        if (aSN1TaggedObjectParser.hasTagClass(i11)) {
            return aSN1TaggedObjectParser;
        }
        h2.b(s.k("Expected ", getTagClassText(i11), " tag but found ", getTagClassText(aSN1TaggedObjectParser)));
        return null;
    }

    public static String getTagText(ASN1Tag aSN1Tag) {
        return getTagText(aSN1Tag.getTagClass(), aSN1Tag.getTagNumber());
    }

    public static String getTagText(ASN1TaggedObject aSN1TaggedObject) {
        return getTagText(aSN1TaggedObject.getTagClass(), aSN1TaggedObject.getTagNo());
    }

    public static String getTagText(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return getTagText(aSN1TaggedObjectParser.getTagClass(), aSN1TaggedObjectParser.getTagNo());
    }
}
