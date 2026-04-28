package org.bouncycastle.asn1.x509;

import i4.a;
import j4.d;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public class Extensions extends ASN1Object {
    private Hashtable extensions;
    private Vector ordering;

    private Extensions(ASN1Sequence aSN1Sequence) {
        this.extensions = new Hashtable();
        this.ordering = new Vector();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            Extension extension = Extension.getInstance(objects.nextElement());
            if (this.extensions.containsKey(extension.getExtnId()) && !Properties.isOverrideSet("org.bouncycastle.x509.ignore_repeated_extensions")) {
                d.t(extension.getExtnId(), "repeated extension found: ");
                throw null;
            }
            this.extensions.put(extension.getExtnId(), extension);
            this.ordering.addElement(extension.getExtnId());
        }
    }

    private ASN1ObjectIdentifier[] getExtensionOIDs(boolean z11) {
        Vector vector = new Vector();
        for (int i11 = 0; i11 != this.ordering.size(); i11++) {
            Object objElementAt = this.ordering.elementAt(i11);
            if (((Extension) this.extensions.get(objElementAt)).isCritical() == z11) {
                vector.addElement(objElementAt);
            }
        }
        return toOidArray(vector);
    }

    public static Extensions getInstance(Object obj) {
        if (obj instanceof Extensions) {
            return (Extensions) obj;
        }
        if (obj != null) {
            return new Extensions(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ASN1ObjectIdentifier[] toOidArray(Vector vector) {
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i11 = 0; i11 != size; i11++) {
            aSN1ObjectIdentifierArr[i11] = (ASN1ObjectIdentifier) vector.elementAt(i11);
        }
        return aSN1ObjectIdentifierArr;
    }

    public boolean equivalent(Extensions extensions) {
        if (this.extensions.size() != extensions.extensions.size()) {
            return false;
        }
        Enumeration enumerationKeys = this.extensions.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            if (!this.extensions.get(objNextElement).equals(extensions.extensions.get(objNextElement))) {
                return false;
            }
        }
        return true;
    }

    public ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (Extension) this.extensions.get(aSN1ObjectIdentifier);
    }

    public ASN1Encodable getExtensionParsedValue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extension extension = getExtension(aSN1ObjectIdentifier);
        if (extension == null) {
            return null;
        }
        return extension.getParsedValue();
    }

    public ASN1OctetString getExtensionValue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extension extension = getExtension(aSN1ObjectIdentifier);
        if (extension == null) {
            return null;
        }
        return extension.getExtnValue();
    }

    public ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    public boolean hasAnyCriticalExtensions() {
        for (int i11 = 0; i11 != this.ordering.size(); i11++) {
            if (((Extension) this.extensions.get(this.ordering.elementAt(i11))).isCritical()) {
                return true;
            }
        }
        return false;
    }

    public Enumeration oids() {
        return this.ordering.elements();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.ordering.size());
        Enumeration enumerationElements = this.ordering.elements();
        while (enumerationElements.hasMoreElements()) {
            aSN1EncodableVector.add((Extension) this.extensions.get((ASN1ObjectIdentifier) enumerationElements.nextElement()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static Extension getExtension(Extensions extensions, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (extensions == null) {
            return null;
        }
        return extensions.getExtension(aSN1ObjectIdentifier);
    }

    public static ASN1Encodable getExtensionParsedValue(Extensions extensions, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (extensions == null) {
            return null;
        }
        return extensions.getExtensionParsedValue(aSN1ObjectIdentifier);
    }

    public static ASN1OctetString getExtensionValue(Extensions extensions, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (extensions == null) {
            return null;
        }
        return extensions.getExtensionValue(aSN1ObjectIdentifier);
    }

    public static Extensions getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs() {
        return toOidArray(this.ordering);
    }

    public Extensions(Extension extension) {
        this.extensions = new Hashtable();
        Vector vector = new Vector();
        this.ordering = vector;
        vector.addElement(extension.getExtnId());
        this.extensions.put(extension.getExtnId(), extension);
    }

    public Extensions(Extension[] extensionArr) {
        this.extensions = new Hashtable();
        this.ordering = new Vector();
        if (extensionArr == null || extensionArr.length == 0) {
            a.f("extension array cannot be null or empty");
            throw null;
        }
        for (int i11 = 0; i11 != extensionArr.length; i11++) {
            Extension extension = extensionArr[i11];
            this.ordering.addElement(extension.getExtnId());
            this.extensions.put(extension.getExtnId(), extension);
        }
    }
}
