package org.bouncycastle.asn1.x509;

import i4.a;
import j4.s;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;
import m0.i1;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class ExtensionsGenerator {
    private static final Set dupsAllowed;
    private Hashtable extensions = new Hashtable();
    private Vector extOrdering = new Vector();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(Extension.subjectAlternativeName);
        hashSet.add(Extension.issuerAlternativeName);
        hashSet.add(Extension.subjectDirectoryAttributes);
        hashSet.add(Extension.certificateIssuer);
        dupsAllowed = Collections.unmodifiableSet(hashSet);
    }

    private void implAddExtension(Extension extension) {
        this.extOrdering.addElement(extension.getExtnId());
        this.extensions.put(extension.getExtnId(), extension);
    }

    private void implAddExtensionDup(Extension extension, boolean z11, byte[] bArr) {
        ASN1ObjectIdentifier extnId = extension.getExtnId();
        if (!dupsAllowed.contains(extnId)) {
            a.f(s.m("extension ", extnId, " already added"));
            return;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1OctetString.getInstance(extension.getExtnValue()).getOctets());
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(bArr);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(aSN1Sequence2.size() + aSN1Sequence.size());
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
        }
        Enumeration objects2 = aSN1Sequence2.getObjects();
        while (objects2.hasMoreElements()) {
            aSN1EncodableVector.add((ASN1Encodable) objects2.nextElement());
        }
        try {
            this.extensions.put(extnId, new Extension(extnId, z11, new DEROctetString(new DERSequence(aSN1EncodableVector))));
        } catch (IOException e5) {
            throw new ASN1ParsingException(e5.getMessage(), e5);
        }
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, ASN1Encodable aSN1Encodable) throws IOException {
        Extension extension = (Extension) this.extensions.get(aSN1ObjectIdentifier);
        if (extension != null) {
            implAddExtensionDup(extension, z11, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        } else {
            implAddExtension(new Extension(aSN1ObjectIdentifier, z11, new DEROctetString(aSN1Encodable)));
        }
    }

    public void addExtensions(Extensions extensions) {
        ASN1ObjectIdentifier[] extensionOIDs = extensions.getExtensionOIDs();
        for (int i11 = 0; i11 != extensionOIDs.length; i11++) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = extensionOIDs[i11];
            Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
            addExtension(ASN1ObjectIdentifier.getInstance(aSN1ObjectIdentifier), extension.isCritical(), extension.getExtnValue().getOctets());
        }
    }

    public Extensions generate() {
        Extension[] extensionArr = new Extension[this.extOrdering.size()];
        for (int i11 = 0; i11 != this.extOrdering.size(); i11++) {
            extensionArr[i11] = (Extension) this.extensions.get(this.extOrdering.elementAt(i11));
        }
        return new Extensions(extensionArr);
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (Extension) this.extensions.get(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.extensions.containsKey(aSN1ObjectIdentifier);
    }

    public boolean isEmpty() {
        return this.extOrdering.isEmpty();
    }

    public void removeExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (!hasExtension(aSN1ObjectIdentifier)) {
            a.f(s.m("extension ", aSN1ObjectIdentifier, " not present"));
        } else {
            this.extOrdering.removeElement(aSN1ObjectIdentifier);
            this.extensions.remove(aSN1ObjectIdentifier);
        }
    }

    public void replaceExtension(Extension extension) {
        if (hasExtension(extension.getExtnId())) {
            this.extensions.put(extension.getExtnId(), extension);
        } else {
            i1.j("extension ", extension.getExtnId(), " not present");
        }
    }

    public void reset() {
        this.extensions = new Hashtable();
        this.extOrdering = new Vector();
    }

    public void replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, byte[] bArr) {
        replaceExtension(new Extension(aSN1ObjectIdentifier, z11, bArr));
    }

    public void replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, ASN1Encodable aSN1Encodable) throws IOException {
        replaceExtension(new Extension(aSN1ObjectIdentifier, z11, new DEROctetString(aSN1Encodable)));
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, byte[] bArr) {
        Extension extension = (Extension) this.extensions.get(aSN1ObjectIdentifier);
        if (extension != null) {
            implAddExtensionDup(extension, z11, bArr);
        } else {
            implAddExtension(new Extension(aSN1ObjectIdentifier, z11, bArr));
        }
    }

    public void addExtension(Extension extension) {
        if (hasExtension(extension.getExtnId())) {
            i1.j("extension ", extension.getExtnId(), " already added");
        } else {
            implAddExtension(extension);
        }
    }

    public void addExtension(Extensions extensions) {
        addExtensions(extensions);
    }
}
