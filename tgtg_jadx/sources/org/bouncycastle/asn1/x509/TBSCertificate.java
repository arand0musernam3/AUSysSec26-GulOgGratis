package org.bouncycastle.asn1.x509;

import c50.w;
import i4.a;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Properties;
import wy.o;

/* JADX INFO: loaded from: classes3.dex */
public class TBSCertificate extends ASN1Object {
    Extensions extensions;
    X500Name issuer;
    ASN1BitString issuerUniqueId;
    ASN1Sequence seq;
    ASN1Integer serialNumber;
    AlgorithmIdentifier signature;
    X500Name subject;
    SubjectPublicKeyInfo subjectPublicKeyInfo;
    ASN1BitString subjectUniqueId;
    Validity validity;
    ASN1Integer version;

    private TBSCertificate(ASN1Sequence aSN1Sequence) {
        int i11;
        boolean z11;
        boolean z12;
        this.seq = aSN1Sequence;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            this.version = ASN1Integer.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i11 = 0;
        } else {
            this.version = new ASN1Integer(0L);
            i11 = -1;
        }
        if (this.version.hasValue(0)) {
            z12 = false;
            z11 = true;
        } else if (this.version.hasValue(1)) {
            z11 = false;
            z12 = true;
        } else {
            if (!this.version.hasValue(2)) {
                a.f("version number not recognised");
                throw null;
            }
            z11 = false;
            z12 = false;
        }
        this.serialNumber = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i11 + 1));
        this.signature = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i11 + 2));
        this.issuer = X500Name.getInstance(aSN1Sequence.getObjectAt(i11 + 3));
        this.validity = Validity.getInstance(aSN1Sequence.getObjectAt(i11 + 4));
        this.subject = X500Name.getInstance(aSN1Sequence.getObjectAt(i11 + 5));
        int i12 = i11 + 6;
        this.subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i12));
        int size = (aSN1Sequence.size() - i12) - 1;
        if (size != 0 && z11) {
            a.f("version 1 certificate contains extra data");
            throw null;
        }
        while (size > 0) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i12 + size);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                this.issuerUniqueId = ASN1BitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                this.subjectUniqueId = ASN1BitString.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 3) {
                    o.l(aSN1TaggedObject.getTagNo(), "Unknown tag encountered in structure: ");
                    throw null;
                }
                if (z12) {
                    a.f("version 2 certificate cannot contain extensions");
                    throw null;
                }
                this.extensions = Extensions.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
            }
            size--;
        }
    }

    public static TBSCertificate getInstance(Object obj) {
        if (obj instanceof TBSCertificate) {
            return (TBSCertificate) obj;
        }
        if (obj != null) {
            return new TBSCertificate(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Time getEndDate() {
        return this.validity.getNotAfter();
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public X500Name getIssuer() {
        return this.issuer;
    }

    public ASN1BitString getIssuerUniqueId() {
        return this.issuerUniqueId;
    }

    public ASN1Integer getSerialNumber() {
        return this.serialNumber;
    }

    public AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    public Time getStartDate() {
        return this.validity.getNotBefore();
    }

    public X500Name getSubject() {
        return this.subject;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.subjectPublicKeyInfo;
    }

    public ASN1BitString getSubjectUniqueId() {
        return this.subjectUniqueId;
    }

    public Validity getValidity() {
        return this.validity;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    public int getVersionNumber() {
        return this.version.intValueExact() + 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        if (this.seq != null) {
            if (Properties.getPropertyValue("org.bouncycastle.x509.allow_non-der_tbscert") == null) {
                return this.seq;
            }
            if (Properties.isOverrideSet("org.bouncycastle.x509.allow_non-der_tbscert")) {
                return this.seq;
            }
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        if (!this.version.hasValue(0)) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) this.version));
        }
        aSN1EncodableVector.add(this.serialNumber);
        aSN1EncodableVector.add(this.signature);
        aSN1EncodableVector.add(this.issuer);
        aSN1EncodableVector.add(this.validity);
        aSN1EncodableVector.add(this.subject);
        aSN1EncodableVector.add(this.subjectPublicKeyInfo);
        ASN1BitString aSN1BitString = this.issuerUniqueId;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) aSN1BitString));
        }
        ASN1BitString aSN1BitString2 = this.subjectUniqueId;
        if (aSN1BitString2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) aSN1BitString2));
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 3, (ASN1Encodable) extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static TBSCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public TBSCertificate(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, AlgorithmIdentifier algorithmIdentifier, X500Name x500Name, Validity validity, X500Name x500Name2, SubjectPublicKeyInfo subjectPublicKeyInfo, ASN1BitString aSN1BitString, ASN1BitString aSN1BitString2, Extensions extensions) {
        if (aSN1Integer2 == null) {
            w.l("'serialNumber' cannot be null");
            throw null;
        }
        if (algorithmIdentifier == null) {
            w.l("'signature' cannot be null");
            throw null;
        }
        if (x500Name == null) {
            w.l("'issuer' cannot be null");
            throw null;
        }
        if (validity == null) {
            w.l("'validity' cannot be null");
            throw null;
        }
        if (x500Name2 == null) {
            w.l("'subject' cannot be null");
            throw null;
        }
        if (subjectPublicKeyInfo == null) {
            w.l("'subjectPublicKeyInfo' cannot be null");
            throw null;
        }
        this.version = aSN1Integer == null ? new ASN1Integer(0L) : aSN1Integer;
        this.serialNumber = aSN1Integer2;
        this.signature = algorithmIdentifier;
        this.issuer = x500Name;
        this.validity = validity;
        this.subject = x500Name2;
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
        this.issuerUniqueId = aSN1BitString;
        this.subjectUniqueId = aSN1BitString2;
        this.extensions = extensions;
        this.seq = null;
    }
}
